package practice10;

public class ReportCard {
	
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public ReportCard(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	public int sum() {
		return korean + english + math;
	}
	
	public int average() {
		return (korean + english + math) / 3;
	}
	
	public char hakjum() {
		
		int average = this.average();
	    char value = ' ';
		
		switch(average / 10) {
		case 9, 10:
			value = 'A';
		    break;
		    
		case 8:
			value = 'B';
		    break;
		    
		case 7:
			value = 'C';
		    break;
		    
		default :
			value = 'D';
		    break;
		}
		return value;
	}
	
	public void printInfo() {
		System.out.println();
		System.out.println("===== 성적 =====");
		System.out.println("이름=" + this.name);
		System.out.println("국어=" + this.korean);
		System.out.println("영어=" + this.english);
		System.out.println("수학=" + this.math);
		System.out.println("합계=" + this.sum());
		System.out.println("평균=" + this.average());
		System.out.println("학점=" + this.hakjum());
	}

}
