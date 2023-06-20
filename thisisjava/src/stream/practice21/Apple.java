package stream.practice21;

public class Apple {

	private Color color;
	private int weight;
	
	public Apple( int weight, Color color) {
		this.color = color;
		this.weight = weight;
	}

	public Color getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}
	
	public void printInfo() {
		System.out.println("컬러=" + color + " | " + "무게=" + weight);
	}
}
