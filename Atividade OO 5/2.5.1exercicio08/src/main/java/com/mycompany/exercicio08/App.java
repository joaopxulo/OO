package com.mycompany.exercicio08;

import classes.Artist;
import classes.Album;
import classes.Music;
import classes.ArtistManager;
import classes.AlbumManager;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        ArtistManager artistManager = new ArtistManager();
        AlbumManager albumManager = new AlbumManager();

        System.out.println( "Welcome to the Music Manager!" );

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println( "Choose an option :" );
            System.out.println( "1 - Add Artist" );
            System.out.println( "2 - Add Album to Artist" );
            System.out.println( "3 - Add Music to Album" );
            System.out.println( "4 - Show artist with most albums" );
            System.out.println( "5 - Show album with most musics" );
            System.out.println( "6 - Exit" );

            int option = inputScanner.nextInt();
            inputScanner.nextLine();

            switch (option) {
                case 1: 
                    System.out.print( "Enter artist name" );
                    String artistName = inputScanner.nextLine();

                    Artist newArtist = new Artist(artistName);
                    artistManager.addArtist(newArtist);
                    System.out.println( "Artist added: " + artistName);
                    break; 

                case 2: 
                    System.out.print( "Enter artist name to add album: ");
                    String artistForAlbum = inputScanner.nextLine();

                    Artist artist = artistManager.findArtistByName(artistForAlbum);
                    if (artist == null) {
                        System.out.println( "Artist not found!" );
                        break;
                    }

                    System.out.print( "Enter album name: " );
                    String albumName = inputScanner.nextLine();

                    System.out.print( "Enter album release year: " );
                    int year = inputScanner.nextInt();
                    inputScanner.nextLine();

                    Album newAlbum = new Album(albumName, year);
                    artist.addAlbum(newAlbum);
                    albumManager.addAlbum(newAlbum);

                    System.out.println( "Album added to artist " + artistForAlbum);
                    break;

                case 3:
                    System.out.print( "Enter artist name: " );
                    String artistNameForMusic = inputScanner.nextLine();

                    Artist artistForMusic = artistManager.findArtistByName(artistNameForMusic);
                    if (artistForMusic == null) {
                        System.out.println( "Artist not found!" );
                        break;
                    }

                    System.out.print( "Enter album name to add music: " );
                    String albumNameForMusic = inputScanner.nextLine();

                    Album albumForMusic = artistForMusic.findAlbumByName(albumNameForMusic);
                    if (albumForMusic == null) {
                        System.out.println( " Album not found! " );
                        break;
                    }

                    System.out.print( " Enter music title : " );
                    String musicTitle = inputScanner.nextLine();

                    System.out.print( " Enter music duration : " );
                    double duration = inputScanner.nextDouble();
                    inputScanner.nextLine();

                    Music newMusic = new Music(musicTitle, duration);
                    artistForMusic.addMusic(albumNameForMusic, newMusic);

                    System.out.println( "Music added to album " + albumNameForMusic);
                    break;

                case 4:
                    Artist artistMostAlbums = artistManager.artistWithMostAlbums();
                    if (artistMostAlbums != null) {
                        System.out.println( "Artist with most albums: " + artistMostAlbums.getName());
                    } else {
                        System.out.println( "No artists registered." );
                    }
                    break;

                case 5:
                    Album albumMostMusics = albumManager.albumWithMostMusics();
                    if (albumMostMusics != null) {
                        System.out.println( "Album with most musics: "  + albumMostMusics.getName());
                    } else {
                        System.out.println( "No albums registered." );
                    }
                    break;

                case 6:
                    keepRunning = false;
                    System.out.println( " Exiting ... " );
                    break;

                default:
                    System.out.println( "Invalid option. Try again."  );
            }
        }

        inputScanner.close();
    }
}
