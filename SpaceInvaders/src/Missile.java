
public class Missile extends Sprite {
	private final int dy = 2;
	private final int boardWidth = 600;

	public Missile(int x, int y) {
		super(x, y);
		display();
	}

	private void display() {
		loadImage("SpaceInvaders/src/resources/missile.png");
		getImageDimensions();
	}

	public void move() {
		y -= dy;
		if (y > boardWidth) {
			visible = false;
		}
	}

}
