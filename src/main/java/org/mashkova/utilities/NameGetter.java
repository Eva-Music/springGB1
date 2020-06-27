package org.mashkova.utilities;

public class NameGetter {

    public String nameOfWinner;

    public NameGetter(String nameOfWinner) {
        this.nameOfWinner = nameOfWinner;
    }

    public void getWinnerName(){
        System.out.println("And the winner is " + nameOfWinner);
    }
}
