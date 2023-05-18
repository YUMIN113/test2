package array.practice06;

public class MusicChart {

	private Song[] songArray;

	public MusicChart(Song[] songArray) {
		super();
		this.songArray = songArray;
	}
	
	public void printInfo() {
		System.out.println("===== Music Chart =====");
		for(int i = 0; i < songArray.length; i++) {
			System.out.println((i + 1) + ".");
			System.out.println("제목=" + songArray[i].getTitle());
			System.out.println("가수=" + songArray[i].getSinger());
			System.out.println("앨범=" + songArray[i].getAlbum());
			System.out.println("작곡자=" + songArray[i].getComposer());
			System.out.println("작사가=" + songArray[i].getLyricist());
			System.out.println("발매일=" + songArray[i].getReleaseDate().substring(0, 4) + "." + songArray[i].getReleaseDate().substring(4, 6) + "." + songArray[i].getReleaseDate().substring(6, 8) );
			System.out.println();
		}
		
	}
}
