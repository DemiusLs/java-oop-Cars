package org.lesson.java.oop;

public class App {

    public static void main(String[] args) {
        
        Auto cinquecento = new Auto("Fiat", "Cinquecento", "rossa", 50, 3);
        Auto alfaGiulia = new Auto("Alfa Romeo", "Giulia", "gialla", 140, 5);


        System.out.println(cinquecento.brand);
        System.out.println(alfaGiulia.color);
    }
}
