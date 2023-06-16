package nestedclass.practice03;

public class Drink {

	private String category;

	// Constructor
	public Drink(String category) {
		this.category = category;
	}

	// Method
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void printInfo() {
		System.out.println("Drink.printInfo()::category=" + category);
	}

	// Inner Class
	public class Coffee {

		private String name;

		// Constructor
		public Coffee(String name) {
			this.name = name;
		}

		// Method
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void printInfo() {
			System.out.println("Drink.Coffee.printInfo()::name=" + name);
		}
		
		// Inner에서 Outer 접근
		public void printAllInfo() {
			System.out.println("Drink.Coffee.printAllInfo()::name=" + name + " | category=" + Drink.this.category);
		}
    }
}