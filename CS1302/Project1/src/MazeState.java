import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * An immutable object representing the state of a Maze.
 */
public class MazeState {

  enum MoveDirection {
    Up, Right, Down, Left;
  }

  private int[][] map;

  /**
   * A cached version of where the mouse is so we can access it in constant time.
   */
  private int[] mouseLocation;

  public MazeState(int[][] map) {
    this.map = deepCopy(map);
    this.mouseLocation = new int[]{map.length - 1, 0};
    this.markCell(this.mouseLocation, Maze.MOUSE);
  }

  private MazeState(int[][] map, int[] mouseLocation) {
    this.map = deepCopy(map);
    this.mouseLocation = mouseLocation;
    this.markCell(this.mouseLocation, Maze.MOUSE);
  }

  private int[][] deepCopy(int[][] original) {
    if (original == null) return null;

    int[][] result = new int[original.length][];
    for (int i = 0; i < original.length; i++) {
      result[i] = Arrays.copyOf(original[i], original[i].length);
    }
    return result;
  }

  public int[] getMouseLocation() {
    return mouseLocation;
  }

  public Boolean isGoal() {
    int[] mouse = this.mouseLocation;

    // If the mouse is in the starting position, it's not the goal.
    if ((mouse[0] == (this.map.length - 1)) && (mouse[1] == 0)) {
      return false;
    }

    // The problem also defines that the first move is always Up and
    // the since the starting point is the bottom left, that means
    // that one above the bottom left will always be open. We should
    // ignore it as a completion state.
    if (mouse[0] == (this.map.length - 2) && mouse[1] == 0) {
      return false;
    }

    // Now let's check if the mouse is on one of the border cells,
    // no matter where it is. If so, it has found the way out.
    if (mouse[0] == (this.map.length - 1) || mouse[0] == 0) return true;
    if (mouse[1] == (this.map[0].length - 1) || mouse[1] == 0) return true;

    return false;
  }

  public String hashKey() {
    return String.format("%d,%d", this.mouseLocation[0], this.mouseLocation[1]);
  }

  private void markCell(int[] cell, int id) {
    this.map[cell[0]][cell[1]] = id;
  }

  public int[][] getMap() {
    return map;
  }

  private Boolean isTraversable(int[] cellCoords) {
    try {
      int cellValue = this.map[cellCoords[0]][cellCoords[1]];
      return cellValue != Maze.WALL;
    } catch (ArrayIndexOutOfBoundsException e) {
      return false;
    }
  }

  private int[] nextCellForDirection(MoveDirection direction) {
    int[] deltas = new int[2];

    switch (direction) {
      case Up:
        deltas[0] = -1;
        break;
      case Right:
        deltas[1] = 1;
        break;
      case Down:
        deltas[0] = 1;
        break;
      case Left:
        deltas[1] = -1;
        break;
    }

    return new int[]{this.mouseLocation[0] + deltas[0], this.mouseLocation[1] + deltas[1]};
  }

  /**
   * Returns a new MazeState which is the resulting state of
   * moving in a given direction.
   */
  public MazeState stateForMove(MoveDirection direction) {
    int[] destinationCell = nextCellForDirection(direction);

    MazeState newState = new MazeState(this.map, this.mouseLocation);

    if (newState.isTraversable(destinationCell)) {
      newState.markCell(this.mouseLocation, Maze.VISITED); // mark where the mouse was as visited
      newState.markCell(destinationCell, Maze.MOUSE);  // mark new mouse location
      newState.mouseLocation = destinationCell;  // cache mouse location for quick movement calculations
    } else {
      // `null` means it's an impossible move and thus the state would not change.
      return null;
    }

    return newState;
  }

  /**
   * Returns a list of possible resulting states from this one. This can be up to four states long.
   */
  ArrayList<MazeState> possibleNextSteps() {
    ArrayList<MazeState> states = new ArrayList<>();

    for (MoveDirection direction : MoveDirection.values()) {
      MazeState newState = this.stateForMove(direction);

      if (newState != null) {
        states.add(newState);
      }
    }

    return states;
  }

}
