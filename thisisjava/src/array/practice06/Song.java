package array.practice06;

public class Song {

	private String title;
	private String singer;
	private String album;
	private String composer;
	private String lyricist;
	private String releaseDate;
	
	public Song(String title, String singer, String album, String composer, String lyricist, String releaseDate) {

		this.title = title;
		this.singer = singer;
		this.album = album;
		this.composer = composer;
		this.lyricist = lyricist;
		this.releaseDate = releaseDate;
	}


	public String getTitle() {
		return title;
	}





	public void setTitle(String title) {
		this.title = title;
	}





	public String getSinger() {
		return singer;
	}





	public void setSinger(String singer) {
		this.singer = singer;
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

	
}
