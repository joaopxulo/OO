package classes;

import java.util.ArrayList;
import java.util.List;

public class ArtistManager {

    private List<Artist> artists;

    public ArtistManager() {
        this.artists = new ArrayList<>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public Artist artistWithMostAlbums() {
        Artist most = null;
        int max = -1;
        for (Artist a : artists) {
            if (a.getAlbums().size() > max) {
                max = a.getAlbums().size();
                most = a;
            }
        }
        return most;
    }

    public Artist findArtistByName(String name) {
    for (Artist a : artists ) {
        if (a.getName().equalsIgnoreCase(name)) {
            return a;
        }
    }
    return null;
}
    
    public List<Artist> getArtists() {
        return artists;
    }
}
