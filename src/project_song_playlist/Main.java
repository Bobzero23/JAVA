package project_song_playlist;

/*needed imports*/
import java.util.ArrayList;
import java.util.LinkedList;

/*main class*/
public class Main {
	
	/*creating the arraylist here coz main method wont allow
	 * a static declaration inside it */
	private static ArrayList<Album> albums = new ArrayList<>();
	
	/*main method*/
	public static void main(String[] args) {

		/*creating album*/
		/*creating object for album*/
		Album object = new Album("Clouds", "NF");
	
		/*adding songs to the album*/ 
		object.addSong("Clouds", 4.5);
		object.addSong("That's  a joke", 4.0);
		object.addSong("Turst", 3.5);
		object.addSong("Clouds", 3.9);
		
		/*adding the Clouds album to our album*/
		albums.add(object);
	
		/*creating a second album*/
		object = new Album("The search", "NF");
		
		/*adding songs the album*/
		object.addSong("The search", 3.0);
		object.addSong("Change", 5.0);
		object.addSong("Nate", 4.5);
		
		/*adding the The search album to our album*/
		albums.add(object);
		
		
		/*creating a LinkedList*/ /*refers a playlist*/
		LinkedList <Song> playList1 = new LinkedList<>();
		
		/*adding some songs to the playlist*/
		albums.get(0).addToPlaylist("Clouds", playList1);
		albums.get(0).addToPlaylist("Trust", playList1);
		albums.get(1).addToPlaylist("Nate", playList1);
		albums.get(1).addToPlaylist("Change", playList1);
		
	}
}
