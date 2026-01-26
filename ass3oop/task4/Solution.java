package task4;

import task4.creature.Cow;
import task4.move.Fly;
import task4.sound.Meow;


public class Solution {

    public static void main(String[] args) {

        Cow cow = new Cow(new Fly(), new Meow());

        cow.howDoIMove();
        cow.howDoISound();
        cow.giveMilk();
    }
}
