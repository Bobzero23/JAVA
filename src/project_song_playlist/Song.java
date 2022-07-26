package project_song_playlist;

public class Song {

	/*song properties*/
	String title; 
	double duration;
	
	/*constructor and initializing fields*/
	public Song(String title, double duration) {	
		this.title = title; 
		this.duration = duration;
	}
	
	/*good practise to have empty constructor*/
	public Song() {		
	}

	/*good practies to have getters*/
	public String getTitle() {
		return title;
	}
	public double getDuration() {
		return duration;
	}

	/*to string method*/
	@Override
	public String toString() {
		return "Song [title=" + title + ", duration=" + duration + "]";
	}
	
}
