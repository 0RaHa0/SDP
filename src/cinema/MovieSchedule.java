package cinema;

interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
    void setMovie(Movie movie);
    String getTime();
    Movie getMovie();
}

class StandardSchedule implements MovieSchedule {
    private String time;
    private Movie movie;

    public void setTime(String time) {
        this.time = time;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getTime() {
        return this.time;
    }

    public Movie getMovie() {
        return this.movie;
    }
}

