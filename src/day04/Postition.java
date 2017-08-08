package day04;
/**
 * ∑∫–Õ≤‚ ‘¿‡
 * @author tarena
 *
 * @param <T>
 */
public class Postition <Y>{
		
	private Y x;
	private Y y;
	
	
	public Postition(Y x, Y y) {
		super();
		this.x = x;
		this.y = y;
	}


	public Y getX() {
		return x;
	}


	public void setX(Y x) {
		this.x = x;
	}


	public Y getY() {
		return y;
	}


	public void setY(Y y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Postition [x=" + x + ", y=" + y + "]";
	}
	
	
}
