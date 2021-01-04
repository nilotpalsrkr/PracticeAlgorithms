package leetcode.design.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Your SnakeGame object will be instantiated and called as such:
 * SnakeGame obj = new SnakeGame(width, height, food);
 * int param_1 = obj.move(direction);
 */
public class Q353_Design_Snake_Game {
    /** Initialize your data structure here.
     @param width - screen width
     @param height - screen height
     @param food - A list of food positions
     E.g food = [[1,1], [1,0]] means the first food is positioned at [1,1], the second is at [1,0]. */

    Dashboard dashboard;
    public Q353_Design_Snake_Game(int width, int height, int[][] food) {
        Snake snake = new Snake(new Position(0,0));
        dashboard = new Dashboard(snake, width, height, food);
    }

    /** Moves the snake.
     @param direction - 'U' = Up, 'L' = Left, 'R' = Right, 'D' = Down
     @return The game's score after the move. Return -1 if game over.
     Game over when snake crosses the screen boundary or bites its body. */
    public int move(String direction) {
        Position position = null;
        Position currentPosition = dashboard.getSnake().getHeadSnakePart().getPosition();
        switch (direction) {
            case "U": position = new Position(currentPosition.getI(), currentPosition.getJ() - 1);
                break;
            case "L": position = new Position(currentPosition.getI() -1, currentPosition.getJ());
                break;
            case "R": position = new Position(currentPosition.getI() + 1, currentPosition.getJ() );
                break;
            case "D": position = new Position(currentPosition.getI(), currentPosition.getJ() + 1);
                break;
            default:
                break;
        }
        if(position != null) {
            boolean isCrashed = dashboard.isCrashed(position);
            if(!isCrashed) {
                dashboard.getSnake().moveTo(position);
            }
            else return -1;
        }
        return -1;
    }


}
class Dashboard {
    private Snake snake;
    private List<Position> boundaries;
    private Integer score;
    private int[][] food;
    private final Integer height;
    private final Integer width;

    public Dashboard(Snake snake, int width, int height, int[][] food) {
        this.snake = snake;
        boundaries = new ArrayList<>();
        this.food = food;
        this.height = height;
        this.width = width;

        Position positionUpperLeft = new Position(0,0);
        Position positionUpperRight = new Position(width, 0);
        Position positionLowerLeft = new Position(0, height);
        Position positionLowerRight = new Position(width, height);

        boundaries.add(positionLowerLeft);
        boundaries.add(positionLowerRight);
        boundaries.add(positionUpperLeft);
        boundaries.add(positionUpperRight);

    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    private List<Position> getAllCrashPositions() {
        List<Position> crashedPosition = new ArrayList<>();

        crashedPosition.addAll(boundaries);
        crashedPosition.addAll(getSnake().getAllPosition());

        return crashedPosition;
    }

    public boolean isCrashed(Position position) {
        return getAllCrashPositions().contains(position);
    }
    public void eatFood(Position position) {
        if (canEatFood(position)) {
            SnakePart snakePart = new SnakePart(position);
            snake.attachHeadSnakePart(snakePart);
        }
    }
    public boolean canEatFood(Position snakeHeadPosition) {
        for(int i = 0 ; i < width; i++) {
            for(int j = 0; j < height; j++) {
                if(i == snakeHeadPosition.getI() && j == snakeHeadPosition.getJ()){
                    return true;
                }
            }
        }
        return false;
    }
}
interface Movable {
    Optional<Position> moveTo(Position position) ;
}
class Snake implements Movable{
    private SnakePart headSnakePart;

    public SnakePart getHeadSnakePart() {
        return headSnakePart;
    }

    public void setHeadSnakePart(SnakePart headSnakePart) {
        this.headSnakePart = headSnakePart;
    }

    public Snake(Position position) {
        this.headSnakePart = new SnakePart(position);
    }
    public SnakePart attachHeadSnakePart(SnakePart snakePart) {
        SnakePart tempSnakePart = headSnakePart.getNextSnakePart();
        snakePart.setNextSnakePart(tempSnakePart);
        this.headSnakePart = snakePart;
        return snakePart;
    }
    @Override
    public Optional<Position> moveTo(Position position) {
            headSnakePart.moveTo(position);
            return Optional.of(position);
    }

    public List<Position> getAllPosition() {
        List<Position>  positionList = new ArrayList<>();
        SnakePart scroller = new SnakePart(headSnakePart.getPosition(), headSnakePart.getNextSnakePart());
        while(scroller != null) {

            positionList.add(scroller.getPosition());
            scroller = scroller.getNextSnakePart();
        }

        return positionList;
    }
}
class SnakePart implements Movable{
    private Position position; /*Position is this snake part in the entire board*/
    private SnakePart nextSnakePart;

    public SnakePart(Position position, SnakePart nextSnakePart) {
        this.position = position;
        this.nextSnakePart = nextSnakePart;
    }

    public SnakePart(Position position) {
        this.position = position;
        this.nextSnakePart = null;
    }

    public Position getPosition() {
        return this.position;
    }
    public void setPosition(Position p) {
        this.position = p;
    }

    public SnakePart getNextSnakePart() {
        return nextSnakePart;
    }

    public void setNextSnakePart(SnakePart nextSnakePart) {
        this.nextSnakePart = nextSnakePart;
    }

    @Override
    public Optional<Position> moveTo(Position position) {

         nextSnakePart.moveTo(this.position);
         this.position = position;
         return Optional.of(position);
    }

}
class Position {
    int i;
    int j;

    public Position(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
