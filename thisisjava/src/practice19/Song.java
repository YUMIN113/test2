package practice19;

public class Song {

	private String title;
	private String album;
	private String composer;
	private String lyricist;
	private String releaseDate;
	private Singer singer;
	
	public Song(String title, String album, String composer, String lyricist, String releaseDate, Singer singer) {
		this.title = title;
		this.album = album;
		this.composer = composer;
		this.lyricist = lyricist;
		this.releaseDate = releaseDate;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getLyricist() {
		return lyricist;
	}

	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Singer getSinger() {
		return singer;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}
	
	public void printInfo() {
		System.out.println("제목=" + title);
		System.out.println("앨범=" + album);
		System.out.println("작곡=" + composer);
		System.out.println("작사=" + lyricist);
		System.out.println("발매일=" + releaseDate);
		System.out.println("----- Singer Info -----");
		this.singer.printInfo();
	}
	
	
}
