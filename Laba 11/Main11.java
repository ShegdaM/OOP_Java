package ua.lpnuai.oop.shegda11;

import java.util.*;
import java.io.*;
import java.nio.*;

public class Main3 extends Zapys{

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int n;
        ArrayList<String> list = new ArrayList<String>();

        while (true) {

            System.out.println("1) Scan file");
            System.out.println("2) See file");
            System.out.println("3) Write to file");
            System.out.println("4) Auto fill");
            System.out.println("5) Delete file");
            System.out.println("0) Exit");

            System.out.println("Enter number from below: ");

            n = in.nextInt();


            if (n == 1) {

                String s;
                try (BufferedReader br = new BufferedReader(new FileReader("C:\\Games\\test2.txt"))) {

                    while ((s = br.readLine()) != null) {
                        if (!s.isEmpty()) {
                            list.add(s);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (n == 2) {
                String s;
                try (BufferedReader br = new BufferedReader(new FileReader("C:\\Games\\test2.txt"))) {

                    while ((s = br.readLine()) != null) {
                        if (!s.isEmpty()) {
                            System.out.print(s);
                            System.out.println(" ");
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(" ");
            } else if (n == 3) {
                Zapys write = new Zapys();
                write.execute();
            }
            else if( n == 4){
                Zapys a = new Zapys();
                a.autofill();

            }
            else if( n == 5){

                File f = new File("C2" +
                        ":\\Games\\test2.txt");
                f.delete();
            }
            else if ( n == 0){
                System.out.println("Goodbye!");
                break;
            }


        }
    }
}
