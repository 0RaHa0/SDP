package Task_49;

abstract class Game {
    public final void play() {
        startGame();
        playGame();
        endGame();
    }

    abstract void startGame();
    abstract void playGame();
    abstract void endGame();
}
