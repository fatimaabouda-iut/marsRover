package rover;

public class Rover {
	private Position position;
	private Direction direction;
	private Grid grid;

	
	
	public Rover(Position position, Direction direction, Grid grid) {
		this.position = position;
		this.direction = direction;
		this.grid = grid;
	}
	
	public Rover(int x, int y, Direction direction, Grid grid) {
		this(new Position(x, y), direction, grid);
	}

	public Rover(Grid grid) {
		this(new Position(0, 0), Direction.NORTH, grid);
	}

	public Position getPosition() {
		return position;
	}

	public Direction getDirection() {
		return direction;
	}
	
	public String getLocation() {
        return "at position (x=" + this.position.getX() + ", y=" + this.position.getY() + ") towards the " + this.direction;
    }

    @Override
    public String toString() {
        return "Rover [position=" + this.position + ", direction=" + this.direction + "]";
    }

    public String move(int steps) {
        if (steps != 1 && steps != 2)
            throw new IllegalArgumentException("Steps must be 1 or 2");

        int newX = position.setX();
        int newY = position.setY();

        switch (direction) {
            case NORTH -> newY += steps;
            case SOUTH -> newY -= steps;
            case EAST  -> newX += steps;
            case WEST  -> newX -= steps;
        }

        this.position = new Position(newX, newY);

        if (steps == 1)
            return this.name + " is moving " + " once";
        else
            return this.name + " is moving " + " twice";
    }

    public String turnRight() {
        if (this.direction.equals(Direction.NORTH))
                this.direction = Direction.EAST;
        else if (this.direction.equals(Direction.EAST))
            this.direction = Direction.SOUTH;
        else if (this.direction.equals(Direction.SOUTH))
            this.direction = Direction.WEST;
        else if (this.direction.equals(Direction.WEST))
            this.direction = Direction.NORTH;

        return this.name + " is turning right";
    }

    public String turnLeft() {
        if (this.direction.equals(Direction.NORTH))
            this.direction = Direction.WEST;
        else if (this.direction.equals(Direction.WEST))
            this.direction = Direction.SOUTH;
        else if (this.direction.equals(Direction.SOUTH))
            this.direction = Direction.EAST;
        else if (this.direction.equals(Direction.EAST))
            this.direction = Direction.NORTH;

        return this.name + " is turning left";
    }
}
