import java.util.Scanner;

public class PlayerSelection {
    //A program to determine the status of a given football player, given the
    //name, age, height in m, weight in lbs and jersey number. This outputs the name, age
    //height in cm, weight in kg, jersey number, position played, presence of an attacker
    //jersey or not, player's eligibility, lineup decision and final decision.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declaring and initialising constants
        double POUND = 0.45359237;
        int METER = 100;

        //declaring variables
        String name;
        int age;
        double height_m;
        double weight_lbs;
        int jerseyNumber;
        double height_cm;
        int weight_kg;
        String category;
        String eligibility;
        String attackerStatus;
        String position;
        String lineup;
        String finalStatus;


        //getting the player details (name, age, height in m, weight in lbs and jersey number)
        System.out.println("Please provide the information below\n");
        System.out.print("Name of player: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Height (meters): ");
        height_m = scanner.nextDouble();
        System.out.print("Weight (pounds): ");
        weight_lbs = scanner.nextDouble();
        System.out.print("Player Jersey Number: ");
        jerseyNumber = scanner.nextInt();

        //converting the height to cm and the weight to kg
        height_cm = height_m * METER;
        weight_kg = (int) (weight_lbs * POUND);

        //determining the category of the player based on their age
        if (age < 20) {
            category = "Rising star";
        } else if (age <= 30) {
            category = "Prime player";
        } else {
            category = "Veteran";
        }

        //determining the player position based on their jersey number
        switch (jerseyNumber) {
            case 1:
            {position = "Goalkeeper";;
                break;}
            case 2:
            case 5:
            {position = "defender";
                break;}
            case 6:
            case 8:
            {position = "midfielder";
                break;}
            case 7:
            case 11:
            {position = "winger";
                break;}
            case 9:
            {position = "striker";
                break;}
            case 10:
            {position = "playmaker";
                break;}
            default:
                position = "Player position not known";
        }

        //determining if the player has an attacker jersey or not
        if (position.equals("striker") || position.equals("winger")) {
            attackerStatus = "Yes";
        } else {
            attackerStatus = "No";
        }

        //checking if the player is eligible to play based on age and weight
        if (age > 18 && age < 35 && weight_kg < 90) {
            eligibility = "Eligible";
        } else {
            eligibility = "Not Eligible";
        }

        //determining the player's lineup position
        if (category.equals("Prime player")) {
            if (weight_kg < 80) {
                lineup = "Starting lineup";
            } else {
                lineup = "Bench";
            }
        } else {
            lineup = "Bench";
        }

        //determining the final decision (whether the player plays in the game or not)
        finalStatus = eligibility.equals("Eligible")? "Play" : "Rest";


        //final format to be displayed
        System.out.println("\n\nPlayer: " + name +
                "\nAge: " + age +" [" + category + "]" +
                "\nHeight: " + height_cm + " cm" +
                "\nWeight: " + weight_kg + " kg" +
                "\nJersey: " + jerseyNumber +
                "\nPosition: " + position +
                "\nAttacker jersey: " + attackerStatus +
                "\nEligibility: " + eligibility +
                "\nLineup Decision: " + lineup +
                "\nFinal Decision: " + finalStatus
        );

        scanner.close();
    }
}
