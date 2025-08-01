package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 7));
        System.out.println("Hello world!");
        System.out.println(hasTeen(19,12,15));
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(5.0));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock < 0 || clock >23){
            return false;
        }
        return isBarking && (clock < 8 || clock >= 20) {
            return true;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if((firstAge>=13 && firstAge<=19)||(secondAge>=13 && secondAge<=19)||(thirdAge>=13 && thirdAge<=19))
        {
            return true;
        }

        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer && temp > 25 && temp <=45){
            return true;
        } else if (!isSummer && temp >25 && temp<=35) {
            return false;
        }else  return false;
    }

    public static double area(double width, double height) {
        if(width < 0 || height < 0){
            return -1;
        }else {
            return width*height;
        }
    }

    public static double area(double radius) {
        if(radius<0){
            return -1;
        }else {
            return radius*radius*Math.PI;
        }
    }
}
