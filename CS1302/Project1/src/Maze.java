import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by zacharytamas on 9/26/16.
 */
public class Maze {

  public static final int WALL = 0;
  public static final int OPEN = 1;
  public static final int MOUSE = 2;
  public static final int VISITED = 4;
  private MazeState state;

  public Maze(int[][] mazeArray) {
    this.state = new MazeState(mazeArray);
  }

  public void displayMaze() {
    this.displayMaze(false);
  }

  public void displayMaze(Boolean withPath) {
    int[][] maze = this.state.getMap();

    for (int[] cells : maze) {
      for (int cell : cells) {
        String cellOutput = "  ";

        switch (cell) {
          case Maze.WALL:
            cellOutput = "# ";
            break;
          case Maze.MOUSE:
            if (withPath) cellOutput = "@ ";
            break;
          case Maze.VISITED:
            if (withPath) cellOutput = "~ ";
            break;
        }

        System.out.print(cellOutput);
      }
      System.out.println();
    }
    System.out.println();
  }

  public void takeStep(MazeState.MoveDirection direction) {
    MazeState newState = this.state.stateForMove(direction);
    if (newState != null) this.state = newState;
  }

  public void findExit() {
    ArrayList<MazeState> frontier = new ArrayList<>();
    HashSet<String> visited = new HashSet<>();
    frontier.add(this.state);

    while (frontier.size() > 0) {
      MazeState current = frontier.remove(0);

      if (visited.contains(current.hashKey())) {
        // We've already been here.
        continue;
      } else {
        // Mark this location as visited.
        visited.add(current.hashKey());
      }

      if (current.isGoal()) {
        // Found the exit!
        this.state = current;
        return;
      } else {
        // We need to keep looking. To do this we'll find out where we can go
        // from this state and queue those states to be explored. Eventually
        // (assuming there is an exit) we'll find it.
        frontier.addAll(current.possibleNextSteps());
      }
    }

  }

  void displayPath() {
    this.displayMaze(true);
  }

}
