package classes;

import java.util.ArrayList;
import java.util.List;

public class AlbumManager {

    private List<Album> albums;

    public AlbumManager() {
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public Album albumWithMostMusics() {
        Album most = null;
        int max = -1;
        for (Album a : albums) {
            if (a.getMusics().size() > max) {
                max = a.getMusics().size();
                most = a;
            }
        }
        return most;
    }

    public List<Album> getAlbums() {
        return albums;
    }
}
