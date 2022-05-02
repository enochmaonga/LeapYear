package LeapYear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which year were you born?");
        int birthYear = scanner.nextInt();
//        String stringBirthYear = console.readLine();
//        Integer birthYear = Integer.parseInt(stringBirthYear);
        System.out.println("Leap years in your life are:");
        for (int year = birthYear; year < 2022; year++){
            if(year % 4 == 0){
                System.out.println(year);
            }
        }
        System.out.println("When do you think the next leap year will be?");

    }
}
