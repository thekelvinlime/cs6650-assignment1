package Model;

public class Album {
//    private String albumId;
    private String artist;
    private String title;
    private String year;

    public Album(String artist, String title, String year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }
//    public Album(String albumId, String artist, String title, String year) {
//        this.albumId = albumId;
//        this.artist = artist;
//        this.title = title;
//        this.year = year;
//    }

//    public String getAlbumId() {
//        return this.albumId;
//    }

    public String getArtist() {
        return this.artist;
    }

    public String getTitle() {
        return this.title;
    }

    public String getYear() {
        return this.year;
    }

//    public void setAlbumId(String albumId) {
//        this.albumId = albumId;
//    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
