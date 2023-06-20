package stream.practice22;

public class Dish {

	private String food;
	private boolean vegetarian;
	private int kcal;
	private Type type;
	
	
	public Dish(String food, boolean vegetarian, int kcal, Type type) {
		this.food = food;
		this.vegetarian = vegetarian;
		this.kcal = kcal;
		this.type = type;
	}
	
	public String getFood() {
		return food;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public int getKcal() {
		return kcal;
	}
	public Type getType() {
		return type;
	}
	
	public void printInfo() {
		String checkVegetarian = checkVegetarian(vegetarian);
		String koreanName = toKorean(type);
		System.out.println("음식=" + food + " | " + "채식" + checkVegetarian + "| " + "열량=" + kcal + "(kcal)" + " | " + koreanName);
	}
	
	public String checkVegetarian(boolean vegetarian) {
		if(vegetarian) {
			return " ";
		} else {
			return "(X) ";
		}
	}
	
	public String toKorean(Type type) {
		String str = " ";
		
		switch(type) {
		case MEAT:
			str = "고기";
			break;
			
		case OTHER:
			str = "기타";
			break;
			
		case FISH:
			str = "생선";
			break;
		}
		return str;
	}
}
