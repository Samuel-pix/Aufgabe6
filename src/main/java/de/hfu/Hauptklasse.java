package de.hfu;

import java.util.Scanner;
public class Hauptklasse 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie ihren Text ein.");
		String eingabe=scan.nextLine();
		String ausgabe = eingabe.toUpperCase();
		System.out.println(ausgabe);
		scan.close();
    }
}
