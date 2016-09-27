/**
 * Created by zacharytamas on 9/26/16.
 */
public class Maze {
    public static final int WALL = 0;
    public static final int OPEN = 1;
    public static final int MOUSE = 5;

    private int[][] maze;

    public Maze(int[][] mazeArray) {
        this.maze = mazeArray;
    }

    public void displayMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                String cellOutput;

                switch (maze[i][j]) {
                    case Maze.WALL:
                        cellOutput = "# ";
                        break;
                    case Maze.OPEN:
                        cellOutput = "  ";
                        break;
                    case Maze.MOUSE:
                        cellOutput = "@ ";
                        break;
                }
                if (maze[i][j] == 0) {
                    System.out.print("# ");
                } else if (maze[i][j] == 1) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void takeStep() {

    }

    public void findExit() {

    }

    public void displayPath() {

    }
}
