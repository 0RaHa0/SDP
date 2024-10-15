package Assignment_3_7;

public class LearningPlatformApp {
    public static void main(String[] args) {
        VideoLecture video1 = new ProxyVideoLecture("Design Patterns Lecture 1");
        VideoLecture video2 = new ProxyVideoLecture("Design Patterns Lecture 2");

        video1.getInfo();
        video1.play();

        video2.getInfo();
        video2.play();
    }
}

