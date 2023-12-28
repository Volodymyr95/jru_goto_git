package ua.javarush.l20;

import java.util.Random;

public class SwitchMain {

    public static void main(String[] args) {
        int number = new Random().nextInt(6);

        switch (number) {
            case 1://if(obj.equals(obj2);
                System.out.println("Jan");
                break;
            case 2:// else if
                System.out.println("Feb");
                break;
            case 3:// else if
                System.out.println("March");
                break;
            case 4:// else if
                System.out.println("April");
                break;
            default: //else
                System.out.println("Wrong input!");
        }
        System.out.println("Number was: " + number);
    }
}
