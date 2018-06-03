package ua.lpnuai.oop.shegda10;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nazva[] = new String[300];
        String adress[] = new String[300];
        String numbers[] = new String[3000];
        String specialization[] = new String[300];
        String days[] = new String[2100];
        int num[] = new int[300];
        num[0] = 0;
        int num2[] = new int[300];
        num2[0] = 0;
        int i = 0;
        int len = 0;
        while(true){
            System.out.println("What do you want to do?");
            System.out.println("1)Create new");
            System.out.println("2)Show");
            System.out.println("3)exit");
            System.out.println("Enter 1, 2 or 3.");
            String s = in.nextLine();
            if(s.equals("3")){
                break;
            }
            else if(s.equals("1")){
                System.out.println("Enter name of your torgova tochka: ");
                String name = in.nextLine();
                System.out.println("Enter adress of your tochka: ");
                String adr = in.nextLine();
                System.out.println("Enter specialization of your torgova tochka: ");
                String spec = in.nextLine();
                nazva[i] = name;
                specialization[i] = spec;
                adress[i] = adr;
                System.out.println("How much numbers will you write?");
                int x = in.nextInt();
                num[i+1] = x + num[i];
                for(int j = num[i]; j < num[i+1]; j++){
                    System.out.println("Enter number: ");
                    String numb = in.next();
                    numbers[j] = numb;
                }
                System.out.println("How much days your torgivelna tochka will work?");
                int y = in.nextInt();
                num2[i+1] = y + num2[i];
                for(int j = num2[i]; j < num2[i+1]; j++){
                    System.out.println("Enter day: ");
                    String numb = in.next();
                    days[j] = numb;
                }
                len++;
                i++;
            }
            else if(s.equals("2")){
                System.out.println("There are " + len + " torgivelna tochkas in your dovidnyk: ");
                for(int j = 0; j < len; j++){
                    System.out.print((j + 1) + ") Name: " + nazva[j] + ".  Adress: " + adress[j] + ".  Specialization: " + specialization[j] + ".  Days: ");
                    for(int k = num2[j]; k < num2[j+1]; k++){
                        if(days[k] != null) {
                            System.out.print(days[k] + ",  ");
                        }
                    }
                    System.out.print("Number: ");
                    for(int k = num[j]; k < num[j+1]; k++){
                        if(numbers[k] != null){
                            System.out.print(numbers[k] + ",  ");
                        }
                    }
                    System.out.println(".");
                }
                System.out.println("");
            }
        }
    }
}