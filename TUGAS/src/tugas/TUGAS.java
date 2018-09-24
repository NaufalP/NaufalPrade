package tugas;

import java.util.Scanner;

public class TUGAS {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int umur;
        boolean c;

        System.out.print("Masukkan Umur = ");
        umur = keyboard.nextInt();
        System.out.println("Cantik / Tidak ? (True or False) = ");
        c = keyboard.nextBoolean();

        if (umur > 23 && c == true) {
            System.out.println("LANJUT RABI");

        } else if (umur > 23) {
            System.out.println("WICHIS SAYA PIKIR DULU YA");

        } else {
            System.out.println("ENARUPES");
        }
    }
}
