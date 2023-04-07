package org.knoldus;


//Tightly coupling game
public class AppGamingBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        //superCOntraGame nhi lega becoz tightly coupled hai gameRunner with marioGame
        var gameRunner1 = new GameRunner(superContraGame);
        var gameRunner2 = new GameRunner(marioGame);
//        var gameRunner = new GameRunner();
        gameRunner1.run();
        gameRunner2.run();

    }

}
