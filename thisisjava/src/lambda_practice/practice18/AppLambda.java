package lambda_practice.practice18;

public class AppLambda {

	public static void main(String[] args) {
		
		System.out.println("\n===== Lambda =====");
		
		System.out.println("\n----- Type 1 -----");
		
		Drawable d1 = () -> System.out.println("원을 그리다.");
		d1.draw();
		
		System.out.println("\n----- Type 2 -----");
		
		Paint paint = new Paint();
		Drawable d2 = () -> paint.paintOrange();
		
		d2.draw();
		
		System.out.println("\n----- Type 3 : Method Reference -----");
		Drawable d3 = paint::paintOrange;
		
		d3.draw();

	}

}
