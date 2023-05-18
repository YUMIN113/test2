package array.practice06;

public class MusicChartApp {

	public static void main(String[] args) {
		
		Song[] songArray = new Song[3];
		songArray[0] = new Song("밤편지", "아이유", "밤편지", "김제회,김희원", "아이유", "20190324");
		songArray[1] = new Song("불타오르네", "방탄소년단", "화양연화", "Pdogg,방시혁 외", "Pdogg,방시혁 외", "20160502");
		songArray[2] = new Song("첫눈처럼 너에게 가겠다", "에일리", "도깨비 OST", "로코베리", "이미나", "20190324");
				
		MusicChart mc = new MusicChart(songArray);
		mc.printInfo();
	}
}
