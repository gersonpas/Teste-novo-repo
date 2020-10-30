package application;

import entities.Operations;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos quartos serão ocupados? ");
        int n = sc.nextInt();
        sc.nextLine();                   // utilizado só p/ limpar o sc anterior
        Operations[] vect = new Operations[n];
        System.out.println("Hospede; e email:");
        for (int i=0; i<vect.length; i++) {
            String guestName = sc.nextLine();
            String emailName = sc.nextLine();
            vect[i] = new Operations(guestName, emailName);
        }

            for (int i=0; i<vect.length; i++) {
                System.out.println("Quarto:" + (i+1) + " " + vect[i].getGuestName()
                        + " - " + vect[i].getEmailName());
            }

            sc.close();
        }

}
