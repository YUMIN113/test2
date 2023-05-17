package practice19;

public class SongApp {

	public static void main(String[] args) {
		
		System.out.println("===== Singer Info =====");
		String name = "아이유";
		char sex = 'F';
		String birthDate = "1993.05.16";
		String company = "이담 엔터테인먼트";
		Singer singer = new Singer(name, sex, birthDate, company);
		singer.printInfo();
		
		System.out.println("\n===== Song Info =====");
		String title = "밤편지";
		String album = "밤편지";
		String composer = "김제회,김희원";
		String lyricist = "아이유";
		String releaseDate = "2019.03.24";
		Song song = new Song(title, album, composer, lyricist, releaseDate, singer);
		song.printInfo();
		

	}

}
