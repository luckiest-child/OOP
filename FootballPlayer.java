import java.util.Scanner;

public class FootballPlayer {
    public static void main(String[] args) {
        //don't forget to comment before you are done
        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;
        double POUND = 0.45359237;
        int METER = 100;
        double weight_kg;
        double height_cm;
        int jerseyNo;
        String category;
        String eligibility;
        String finalStatus;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following details:");
        System.out.print("Player Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Height(metres): ");
        height = scanner.nextDouble(); //search how to continue with next line without it taking the next instruction
        System.out.print("Weight(pounds): ");
        weight = scanner.nextDouble();
        System.out.print("Jersey Number: ");
        jerseyNumber = scanner.nextInt();

        System.out.println("Player Name: " + name +
                "\nAge: " + age +
                "\nHeight: " + height +
                "\nWeight: " + weight +
                "\nJersey Number: " + jerseyNumber);

        //task 2
        weight_kg = weight * POUND;
        height_cm = height * METER;
        int finalWeight = (int) weight_kg;

        System.out.println("Player Name: " + name +
                "\nAge: " + age +
                "\nHeight: " + height_cm +
                "cm\nWeight: " + finalWeight +
                "kg\nJersey Number: " + jerseyNumber);

        //task 3

        System.out.println("Player's age: " + age);
        System.out.println("Player's age after a season: " + ++age);
        System.out.println("Player's jersey number: " + jerseyNumber);
        System.out.println("Player's jersey number after a penalty: " + --jerseyNumber);

        //task 4

        if (age > 18 && age < 35 && finalWeight < 90) {
            eligibility = "Eligible";
        } else {
            eligibility = "Not ELigible";
        }

        System.out.println(eligibility);

        if (age < 18 || finalWeight > 90) {
            System.out.println("Player has a problem (either too young or too heavy)");
        }

        if (!(age > 18 && age < 35 && finalWeight < 90)) {
            eligibility = "Not Eligible";
        } else {
            eligibility = "Eligible";
        }

        System.out.println(eligibility);
        //try the 3 of this question later because wth does it even mean???

        //task 5
        if (age < 20) {
            category = "Rising star";
        } else if (age <= 30) {
            category = "Prime player";
        } else {
            category = "Veteran";
        }
        System.out.println(category);

        //task 6

        System.out.print("Enter the player's jersey number: ");
        jerseyNo = scanner.nextInt();

        switch (jerseyNo) {
            case 1:
            {System.out.println("Goalkeeper");
                break;}
            case 2:
            {System.out.println("defender");
                break;}
            case 6:
            {System.out.println("midfielder");
                break;}
            case 7:
            {System.out.println("winger");
                break;}
            case 9:
            {System.out.println("striker");
                break;}
            case 10:
            {System.out.println("playmaker");
                break;}
            case 11:
            {System.out.println("winger");
                break;}
            case 5:
            {System.out.println("defender");
                break;}
            case 8:
            {System.out.println("midfielder");
                break;}
            default:
                System.out.println("Player position not known");
        }

        //task 7
        //part A

        switch (jerseyNo) {
            case 1: {
                System.out.println("Goalkeeper");
                break;
            }
            case 2: {
                System.out.println("defender");
            }
            case 6: {
                System.out.println("midfielder");
            }
            case 7: {
                System.out.println("winger");
            }
            case 9: {
                System.out.println("striker");
                break;
            }
            case 10: {
                System.out.println("playmaker");
                break;
            }
            case 11: {
                System.out.println("winger");
                break;
            }
            case 5: {
                System.out.println("defender");
                break;
            }
            case 8: {
                System.out.println("midfielder");
                break;
            }
            default:
                System.out.println("Player position not known");
        }

        //part B

        switch (jerseyNo) {
            case 1:
            {System.out.println("Goalkeeper");
                break;}
            case 2:
            case 5:
            {System.out.println("defender");
                break;}
            case 6:
            case 8:
            {System.out.println("midfielder");
                break;}
            case 7:
            case 11:
            {System.out.println("winger");
                break;}
            case 9:
            {System.out.println("striker");
                break;}
            case 10:
            {System.out.println("playmaker");
                break;}
            default:
                System.out.println("Player position not known");
        }

        //task 8
        if (category.equals("Prime player")) {
            if (finalWeight < 80) {
                System.out.println("Starting lineup");
            } else {
                System.out.println("Bench");
            }
        } else {
            System.out.println("Bench");
        }

        //task 9
        finalStatus = eligibility.equals("Eligible")? "Play" : "Rest";
        System.out.println(finalStatus);
    }
}
