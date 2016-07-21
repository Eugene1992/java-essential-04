package Lesson1_OOP;

/**
 * Describes music track
 */
public class Track {
    private String title = "unknown";
    private String singer = "unknown";  //TODO: change to the list of the Singer classes in the future
    private String album = "unknown";   //TODO: change to the list of the Album classes in the future
    private int length = 0;             //length of the track in seconds

    public Track(){}

    public Track(String title, String singer, String album, int length){
        setTitle(title);
        setSinger(singer);
        setAlbum(album);
        setLength(length);
    }

    public void setTitle(String title) {
        if(!title.isEmpty()) {
            this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setSinger(String singer) {
        if(!singer.isEmpty()) {
            this.singer = singer;
        }
    }

    public String getSinger() {
        return singer;
    }

    public void setAlbum(String album) {
        if(!album.isEmpty()){
            this.album = album;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setLength(int length) {
        if(length > 0) {
            this.length = length;
        }
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nSinger: " + singer + "\nAlbum: " + album + "\nLength: " + length + "s";
    }
}
