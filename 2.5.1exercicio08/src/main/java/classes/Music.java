package classes;

import java.util.Objects;

public class Music {
    private String title;
    private double duration;

    public Music() {
        this.title = "";
        this.duration = 0.0;
    }

    public Music(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Music { title='" + title + "', duration=" + duration + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Music)) return false;
        Music other = (Music) obj;
        return Objects.equals(this.title, other.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}