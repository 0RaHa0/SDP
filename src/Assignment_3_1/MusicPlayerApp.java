package Assignment_3_1;

class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer player = new MP3Player();
        player.play("mp3", "song1.mp3");

        AudioPlayer adapter = new AudioAdapter("wav");
        adapter.play("wav", "song2.wav");

        adapter = new AudioAdapter("aac");
        adapter.play("aac", "song3.aac");
    }
}