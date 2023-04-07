package org.knoldus;

public class GameRunner {
    //should we not used new
    private GamingConsole game;
    //private MarioGame game;

    //without new
//    public GameRunner() {
//        game = new MarioGame();
//    }

    //public GameRunner(MarioGame game) {
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run(){
        System.out.println("Running game " + game);
        game.right();
        game.left();
        game.up();
        game.down();

    }
}
