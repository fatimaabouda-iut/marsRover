package rover;

import java.util.List;

public class Grid {
	private int height;
	private int width;
	
	private List<Obstacle> obstacles;

	public Grid(int height, int width, List<Obstacle> obstacles) {
		super();
		this.height = height;
		this.width = width;
		this.obstacles = obstacles;
	}
	
	public void addObstacle(Obstacle obstacle) {
		
		obstacles.add(obstacle);
		
	}
	
	public boolean isObstacle(Position position) {
		return false;
		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public List<Obstacle> getObstacles() {
		return obstacles;
	}

	public void setObstacles(List<Obstacle> obstacles) {
		this.obstacles = obstacles;
	}
	
	
}
