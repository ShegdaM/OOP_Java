package ua.lpnuai.oop.shegda14;

import java.util.Scanner;

public class Main14 {
    public static void shit(String stri){
        StringBuffer sb = new StringBuffer(stri);
        sb.equals("Length: " + sb.length());
        String str1 = "Buffer ";
        String str2 = " Strign";
        int paws = 4;
        sb.append(str1).append(paws).append(str2);
        str1.equals(sb.toString());
    }

    public static void dfunc(String s, int index) {
        char c[] = s.toCharArray();
        int golos = 0;
        int prigolos = 0;
        for(int i = 0; i < c.length; i++) {
            if(c[i] == 'а' || c[i] == 'о' || c[i] == 'у' || c[i] == 'е' || c[i] == 'и' || c[i] == 'і') {
                golos++;
                System.out.println("Loud: " + golos);
            } else if(c[i] == 'a' || c[i] == 'o' || c[i] == 'y' || c[i] == 'e' || c[i] == 'u' || c[i] == 'i') {
                prigolos++;
                System.out.println("Consonant: " + prigolos);
            } else if(c[i] != ' ' && c[i] != '.' && c[i] != ',') {
                golos++;
                System.out.println("Loud: " + golos);
            }
        }
        System.out.print(index + 1);
        System.out.print("       " + golos);
        System.out.print("           " + prigolos);
        if(golos > prigolos)
            System.out.println("               golosni");
        else
            System.out.println("            prigolosni");
    }

    public static void func(String s, int index) {
        char c[] = s.toCharArray();
        int golos = 0;
        int prigolos = 0;
        for(int i = 0; i < c.length; i++) {
            if(c[i] == 'а' || c[i] == 'о' || c[i] == 'у' || c[i] == 'е' || c[i] == 'и' || c[i] == 'і')
                golos++;
            else if(c[i] == 'a' || c[i] == 'o' || c[i] == 'y' || c[i] == 'e' || c[i] == 'u' || c[i] == 'i')
                golos++;
            else if(c[i] != ' ' && c[i] != '.' && c[i] != ',')
                prigolos++;
        }
        System.out.print(index + 1);
        System.out.print("       " + golos);
        System.out.print("           " + prigolos);
        if(golos > prigolos)
            System.out.println("               golosni");
        else
            System.out.println("            prigolosni");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("\n№   Golosni      Prigolosni");
        String text[] = s.split("[.!?]");
        if(args.length > 0){
            if(args[0].equals("-d") || args[0].equals("-debug")) {
                for (int i = 0; i < text.length; i++)
                    System.out.println(text[i]);
                for (int i = 0; i < text.length; i++) {
                    dfunc(text[i], i);
                }
            }
            else if(args[0].equals("-h") || args[0].equals("-help")){
                for(int i = 0; i < text.length; i++)
                    func(text[i], i);
                System.out.println();
                System.out.println("Author: Shegda Mykola");
                System.out.println("Group: CS-108");
                System.out.println("Purpose: Determine whether there are more loud or consonant sounds.");
            }
        }
        else {
            for(int i = 0; i < text.length; i++)
                func(text[i], i);
        }
    }
}