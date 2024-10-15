package Assignment_3_7;

class RealVideoLecture implements VideoLecture {
    private String title;

    public RealVideoLecture(String title) {
        this.title = title;
        load();
    }

    private void load() {
        System.out.println("Loading video lecture: " + title);
    }

    @Override
    public void getInfo() {
        System.out.println("Title: " + title);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}

