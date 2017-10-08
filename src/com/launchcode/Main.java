package com.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world edit");
        System.out.println("dodatkowy tekst");
        System.out.println("Trzecia linia tekstu");

        String name = "John";

        System.out.println("Imie: " + name);

        Imie czlowiek = new Imie("ImieZKonstruktora");
        System.out.println("Wypisuje zawartosc klasy Imie: " + czlowiek.getImie());

        System.out.println("");
        System.out.println("Commit Tom'a");

    }
}
