package project_song_playlist;
/*PROJECT PATH
 * 
 * Create a class called Song
 * +create two properties 
 * -title
 * -duration
 * 
 * +Create constructor with  properties int the parameters
 * 
 * Create some getters and setters
 * 
 * Create a toString method
 * +this returns whatever we have in the class
 * 
 * Create another class for Album
 * +the properties should be name, artist and arraylist for songs
 * +create a constructor then pass in everythin
 * +in the constructor body initialize arrayilst
 * 
 * Create an empty constructor is a good practise to have one
 * 
 * Create a findSong method use enhanced for loop to find out either the song 
 * you checked is equal to the title au laa then return chechkedSong
 * 
 * Create a boolean addSong method to check if the song is added or not
 * + use findSong(title) == null to see if the song exist
 *   then add it to the songs and display that name of the song is added
 *   then return true
 * + else display that the song is already exist and return false
 * 
 * Create another addToPlaylist boolean method which will check if the song
 * is already exist in our album or not so that we can add them to our playlist
 * +pass int trackNumber and a linkedlist of song type named PlayList 
 * now since track number has no index and starts at 1 as an integer we
 * gonna have to start it at zero by saying int index = trackNumber - 1;
 * +check if index is greater than zero and greater or equal to size of songs
 * we know songs is our arraylist so is our album I guess
 * 
 * if we have an arralist we can add object and its created properties togeter
 * by just adding the object to the arraylists the same way we added album to the playlist
 * 
 * albums.get(0) zero represents that is gonna be the first index of linked list
 * 
 * */


 