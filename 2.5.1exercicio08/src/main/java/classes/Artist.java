package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Artist {
    private String name;
    private List<Album> albums;

    public Artist() {
        this.name = "";
        this.albums = new ArrayList<>();
    }

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public void addMusic(String albumName, Music music) {
        for (Album album : albums) {
            if (album.getName().equals(albumName)) {
                album.addMusic(music);
                return;
            }
        }
    }
    
    public Album findAlbumByName(String albumName) {
    for (Album a : albums) {
        if (a.getName().equalsIgnoreCase(albumName)) {
            return a;
        }
    }
    return null;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "Artist { name='" + name + "', albums=" + albums + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Artist)) return false;
        Artist other = (Artist) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}


