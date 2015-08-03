package Patient;

import java.util.Scanner;
import java.util.logging.SocketHandler;

/**
 * Created by Anastasia on 24.07.2015.
 */
public class Main {


    public static void main(String[] args) {
        String diagnosis;
        int number1, number2;

        int numberChoise;

        Patient a = new Patient(23456, "Ivan", "Ivanov", "Ivanovich", 101, "allergy");
        Patient b = new Patient(23145, "Petr", "Petrov", "Petrovich", 95, "allergy");
        Patient c = new Patient(20145, "Alesandr", "Suhovoi", "Ivanovich", 105, "hypertension");

        Patient[] array = new Patient[]{a, b,c};
        Scanner sc = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        Storage storege = new Storage(array);


        do {
            System.out.println("\nWhat action do you want to produce?\n" +
                    "1 - show a list of patients with the specified diagnosis;\n" +
                    "2 - show a list of patients with card number in a given range;\n" +
                    "3 - show the full list;\n" +
                    "Press 0 to out");
            numberChoise = sc.nextInt();
            switch (numberChoise) {
                case 1:
                    System.out.println("Enter the diagnosis:");
                    diagnosis = scanString.nextLine();
                    storege.thisDiagnosis(diagnosis);
                    break;
                case 2:
                    System.out.println("Set the search interval: ");
                    number1 = sc.nextInt();
                    number2 = sc.nextInt();
                    storege.numberMedicalCard(number1, number2);
                    break;
                case 3:
                    storege.showArray();
                    break;
                default:
                    break;
            }
        } while (numberChoise != 0);


    }
}




