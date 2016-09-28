import java.util.Arrays;

/**
 * Created by zacharytamas on 9/26/16.
 */
public class Maze {

    public static final int WALL = 0;
    public static final int OPEN = 1;
    public static final int MOUSE = 2;
    public static final int VISITED = 4;

    public enum MoveDirection {
        North, East, South, West;
    }

    private MazeState state;

    public class MazeState {
        public int[][] maze;
        public int[] mouseLocation;

        public MazeState(int[][] maze) {
            this.maze = maze.clone();
            this.mouseLocation = new int[]{0, maze.length - 1};
            this.markCell(this.mouseLocation, Maze.MOUSE);
        }

        public MazeState(int[][] maze, int[] mouseLocation) {
            this.maze = maze.clone();
            this.mouseLocation = mouseLocation.clone();
            this.markCell(this.mouseLocation, Maze.MOUSE);
        }

        private void markCell(int[] cell, int id) {
            this.maze[cell[0]][cell[1]] = id;
        }

        private Boolean isTraversable(int[] cell) {
            try {
                return this.maze[cell[0]][cell[1]] != Maze.WALL;
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }
        }

        public void move(MoveDirection direction) {
            int[] deltas = new int[2];

            switch (direction) {
                case North:
                    deltas[1] = -1;
                    break;
                case East:
                    deltas[0] = 1;
                    break;
                case South:
                    deltas[1] = 1;
                    break;
                case West:
                    deltas[0] = -1;
                    break;
            }

            int[] cell = new int[]{
                    this.mouseLocation[0] + deltas[0],
                    this.mouseLocation[1] + deltas[1]
            };

            if (isTraversable(cell)) {
                this.markCell(this.mouseLocation, Maze.VISITED); // unmark current mouse
                this.markCell(cell, Maze.MOUSE);  // place new mouse
            }
        }
    }

    public Maze(int[][] mazeArray) {
        this.state = new MazeState(mazeArray);
    }

    public void displayMaze() {
        this.displayMaze(false);
    }

    public void displayMaze(Boolean withPath) {
        int[][] maze = this.state.maze;

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                String cellOutput = "  ";

                switch (maze[i][j]) {
                    case Maze.WALL:
                        cellOutput = "# ";
                        break;
                    case Maze.OPEN:
                        cellOutput = "  ";
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

    public void takeStep(MoveDirection direction) {
        this.state.move(direction);
    }

    public void findExit() {

    }

    public void displayPath() {
        this.displayMaze(true);
    }
}
