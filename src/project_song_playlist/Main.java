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
		LinkedList <Song> playList_1 = new LinkedList<>();
		
		
		/*adding some songs to the playlist*//*for the second playlist*/
		albums.get(0).addToPlaylist("Clouds", playList_1);
		albums.get(0).addToPlaylist("Trust", playList_1);
		
		/*adding some songs to the playlist*//*for the second playlist*/
		albums.get(1).addToPlaylist("Nate", playList_1);
		albums.get(1).addToPlaylist("Change", playList_1);
		
		/*playing the song*/
		play(playList_1);
		
	}

	/*a method to play a song*/
	private static void play(LinkedList<Song> playList) {
		
	}

	/*method to display the menu*/
	private static void printMenu() {
		System.out.println("AVAILABLE OPTIONS: \n press");
		System.out.println("0 - to quit \n"
				+ "1 - to play the next song \n"
				+ "2 - to play the previous song\n"
				+ "3 - to replay the current song\n"
				+ "4 - list of all available songs\n"
				+ "5 - to print all available song\n"
				+ "6 - to delete the song ");
	}
	
	/*method to display the song list to the user*/
	private static void printList(LinkedList<Song> playList) {
		
		/*we use iterator to loop through the linkedlist*/
		
	}
	

}
