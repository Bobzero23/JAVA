package project_song_playlist;

/*must imports*/
import java.util.*;


/*album class*/
public class Album {
	
	/*album properties*/
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	/*constructor and initialization*/
	public Album(String name, String artist, ArrayList<Song> songs) {
	
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}

	/*empty constructor*/
	public Album() {
		
	}
	
	/*method to find the song*/
	public Song findSong(String title) {
		for(Song checkedSong : songs) {
			if(checkedSong.getTitle().equals(title)) return checkedSong;
		}
		return null;
	}
	
	/*method to check if the song is added or not*/
	public boolean addSong(String title, double duration) {
		/*if the song doesnt exist add*/
		if(findSong(title) == null) {
			songs.add(new Song(title, duration));
			System.out.println(title + " is successfully added to the Album.");
			return true;
		}else {
			System.out.println(title + " is already exist.");	
			return false;
		}
	}
	
	/*this method takes tracker number as an input*/
	/*adding a song to a plyalist */ /*checking if the song is in album or not*/
	public boolean addToplaylist(int trackNumber, LinkedList<Song> PlayList) {
		
		int index = trackNumber - 1;
		if (index > 0 && index <= this.songs.size()) {
			PlayList.add(this.songs.get(index));
			return true;
		}
		else {
			System.out.println("The album doesnt have a song with track number " + trackNumber);
			return false;
		}
	}
	
	/*this method takes title as an input and */
	/*adding a song to a plyalist */ /*checking if the song is in album or not*/
	public boolean addToPlaylist() {
		
	}
}


