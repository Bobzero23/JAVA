package project_song_playlist;

/*needed imports*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*main class*/
public class Main {

	/*
	 * creating the arraylist here coz main method wont allow a static declaration
	 * inside it
	 */
	private static ArrayList<Album> albums = new ArrayList<>();

	/* main method */
	public static void main(String[] args) {

		/* creating album */
		/* creating object for album */
		Album object = new Album("Clouds", "NF");

		/* adding songs to the album */
		object.addSong("Clouds", 4.5);
		object.addSong("That's  a joke", 4.0);
		object.addSong("Trust", 3.5);


		/* adding the Clouds album to our album */
		albums.add(object);

		/* creating a second album */
		object = new Album("The search", "NF");

		/* adding songs the album */
		object.addSong("The search", 3.0);
		object.addSong("Change", 5.0);
		object.addSong("Nate", 4.5);

		/* adding the The search album to our album */
		albums.add(object);

		/* creating a LinkedList */ /* refers a playlist */
		LinkedList<Song> playList_1 = new LinkedList<>();

		/* adding some songs to the playlist *//* for the second playlist */
		albums.get(0).addToPlaylist("Clouds", playList_1);
		albums.get(0).addToPlaylist("Trust", playList_1);

		/* adding some songs to the playlist *//* for the second playlist */
		albums.get(1).addToPlaylist("Nate", playList_1);
		albums.get(1).addToPlaylist("Change", playList_1);

		/* playing the song */
		play(playList_1);

	}

	/* a method to play a song */
	private static void play(LinkedList<Song> playList) {
		Scanner scan = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();

		/* checking if we have song in our playlist */
		if (playList.size() == 0) {
			System.out.println("You dont have a song in your playlist..");
		} else {
			System.out.println("\nNow playing " + listIterator.next().toString());
			printMenu();
		}

		while (!quit) {
			int action = scan.nextInt();
			scan.nextLine();

			switch (action) {

			case 0:
				System.out.println("\nThanks for choosing our app..");
				quit = true;
				break;
				
				/*if user type 1, it will go to the next song */
			case 1 :
				if (!forward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("\nNow playing " + listIterator.next().toString());
				} else {
					System.out.println("\nNo next song available to paly..");
				}
				break;
				

				/*if user type 2, it will go to the next song*/
			case 2 :
				if (forward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("\nNow playing " + listIterator.previous().toString());
				}else {
					System.out.println("\nNo previous song available to play..");
					forward = false;
				}
				break;
				

				/*if user type 4, it will replay song*/
			case 3 :
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
						System.out.println("Repalying " + listIterator.previous().toString());
						forward = false;
					}else {
						System.out.println("We're at the start of the Playlist..");
					}
				}else {
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().toString());
						forward = true;
					}else {
						System.out.println("We're at the end of the Playlist..");
					}
				}
				break;

				
				/*thisif user type 4,  will call the printList method*/
			case 4 : 
				printList(playList);
				break;
			
				
				/*if user type 5, it will display the option menu*/
			case 5 : 
				printMenu();
				break;
			
				
				/*if user type 6, it will deleta and play the next song if is availalbe
				 * if not it available it will play the previous song*/
			case 6 : 
				if(playList.size() > 0) {
					if(listIterator.hasNext()) {
						System.out.println("\nNow playing \n" + listIterator.next().toString());
					}else {
						if(listIterator.hasPrevious()) {
							System.out.println("\nNow playing \n" + listIterator.previous().toString());
						}else {
							System.out.println("\nThere is no song availble in your playlist.. \n");
						}
					}
				}
			
			}
		}

		/*closig the scanner object*/
		scan.close();
	}

	/* method to display the menu */
	private static void printMenu() {
		System.out.println("\n\nAVAILABLE OPTIONS: \npress");
		System.out.println("0 - to quit \n" 
					+ "1 - to play the next song \n" 
					+ "2 - to play the previous song\n"
					+ "3 - to replay the current song\n" 
					+ "4 - list of all available songs\n"
					+ "5 - to print all available song\n" 
					+ "6 - to delete the song ");
	}	

	/* method to display the song list to the user */
	private static void printList(LinkedList<Song> playList) {

		/* we use iterator to loop through the linkedlist */
		Iterator<Song> it = playList.iterator();

		/* now looping throught the playlist */
		System.out.println("________________________________");

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("________________________________");
	}

}
