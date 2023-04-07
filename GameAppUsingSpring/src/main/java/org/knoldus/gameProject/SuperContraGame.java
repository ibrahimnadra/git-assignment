package org.knoldus.gameProject;

import org.knoldus.gameProject.GameRunner;

public class SuperContraGame implements GameRunner.GamingConsole {

    public void up(){
        System.out.println("Jump down");
    }

    public void down(){
        System.out.println("sleep");
    }

    public void right(){
        System.out.println("Accelerate");
    }

    public void left(){
        System.out.println("Go home");
    }

}
