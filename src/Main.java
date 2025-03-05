import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int birthmonth = 0;
        String trash = "";

        System.out.println("Enter your birth month [1-12]: ");

        if(in.hasNextInt())
        {
            birthmonth = in.nextInt();
            in.nextLine();
            if(birthmonth >= 1 && birthmonth <= 12)
            {
                System.out.println("You said your birth month is " + birthmonth);
            }
            else
            {
                System.out.println("You said your birth month is " + birthmonth);
                System.out.println("You enter the wrong birth month, it has to be between 1 to 12.");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said your birth month is " + trash);
            System.out.println("Run the program again");
        }



    }
}