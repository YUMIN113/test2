package lambda_practice.practice12;

public class AppLambda {

	public static void main(String[] args) {
		System.out.println("\n===== Lambda =====");
		System.out.println("\n----- 1. -----");
		
		Drawable d2 = (color, lineType) -> {
			return color + " " + lineType + " " + "삼각형";
		};
		
		System.out.println(d2.draw("검은색", "점선"));

		
		System.out.println("\n----- 2. -----");
		
		Drawable d3 = (color, lineType) -> {
			return color + " " + lineType + " " + "원";
		};
		
		System.out.println(d3.draw("파란색", "실선"));
	}

}
