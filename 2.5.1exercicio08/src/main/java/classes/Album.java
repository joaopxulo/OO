package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Album {
    private String name;
    private int releaseYear;
    private List<Music> musics;

    public Album() {
        this.name = "";
        this.releaseYear = 0;
        this.musics = new ArrayList<>();
    }

    public Album(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.musics = new ArrayList<>();
    }

    public void addMusic(Music music) {
        this.musics.add(music);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    @Override
    public String toString() {
        return "Album { name='" + name + "', releaseYear=" + releaseYear + ", musics=" + musics + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Album)) return false;
        Album other = (Album) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}