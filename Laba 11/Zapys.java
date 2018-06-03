import java.io.*;
import java.util.Scanner;

public class Zapys {
    public void execute() {
        Scanner in = new Scanner(System.in);
        File f = new File("C:\\Games\\test2.txt");
        System.out.println("Your torgova tochka name: ");
        String name = in.nextLine();
        System.out.println("Your torgova tochka day works: ");
        String month = in.nextLine();
        System.out.println("When your torgova tochka number: ");
        String date = in.nextLine();
        //System.out.println("When your event starts(hour): ");
        //int start =  in.nextInt();
        //System.out.println("Your torgova tochka numbers: ");
        //int dur = in.nextInt();
        System.out.println("Your torgova tochka specialization: ");
        String city = in.next();
        //System.out.println("Amount of members: ");
        //int mem = in.nextInt();

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));
            writer.println("Name - " + name);
            writer.println("Day - " + month);
            writer.println("Number - " + date);
            //writer.println("Hour - " + start + " : 00");
            //writer.println("Duration - " + dur + "minutes");
            writer.println("Specialization - " + city);
            //writer.println("Members - " + mem);

            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    public void autofill() {

        File f = new File("C:\\Games\\test2.txt");

        String name = "Some name";

        String month = "Some day";

        String date = "Some number";

        int start = 0;

        int dur = 0;

        String city = "Some specialization";

        int mem = 0;

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));
            writer.println("Name - " + name);
            writer.println("Day - " + month);
            writer.println("Number - " + date);
            //writer.println("Hour - " + start + " : 00");
            //writer.println("Duration - " + dur + "minutes");
            writer.println("Specialization - " + city);
            //writer.println("Members - " + mem);

            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
