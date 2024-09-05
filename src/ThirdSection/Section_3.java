package ThirdSection;
import java.util.Scanner;

public class Section_3 {

    public static void main(String[] args) {
        //twoDottwentyOne();
        //twoDottwentyThree();
        twoDottwentyFour();

    }

    //2.21
    public static void twoDottwentyOne() {

        int numbersList[] = new int[20];
        int positiveNumbers = 0;
        int negativeNumbers = 0;

        for(int i = 0; i < 20; i++) {

            if ((int) (Math.random() * 10) >= 6){
                numbersList[i] = (int) (Math.random() * -1000);
            }
            else{
                numbersList[i] = (int) (Math.random() * 1000);
            }
        }

        for (int number : numbersList) {
            if(number >= 0) {positiveNumbers++;} else {negativeNumbers++;}
        }
    System.out.println(positiveNumbers + " positive numbers and " + negativeNumbers + " negative numbers.");
    }

    //2.22
    public static void twoDottwentyTwo() {
        
        int numbersList[] = new int[(int) (Math.random() * 10) + 1];

        for(int i = 0; i < numbersList.length; i++) {

            if ((int) (Math.random() * 10) >= 6){
                numbersList[i] = (int) (Math.random() * -1000);
            }
            else{
                numbersList[i] = (int) (Math.random() * 1000);
            }
        }

        int max = numbersList[0];
        int min = numbersList[0];

        for(int i = 0; i<numbersList.length; i++) {
            if(numbersList[i] > max) {max = numbersList[i];}
            if(numbersList[i] < min) {min = numbersList[i];}
        }
        for(int number : numbersList){System.out.println(number);}
        System.out.println("Min :" + min + ". Max:" + max);
    }

    //2.23
    public static void twoDottwentyThree() {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        int intNumber; // the number that the user will enter

        System.out.println(randomNumber);

        do{

            System.out.print("Enter a whole number: ");
            intNumber = scanner.nextInt();

            if(intNumber > randomNumber ) {
                System.out.println("The number is greater than the random number.");
            }else if(intNumber < randomNumber) {
                System.out.println("The number is less than the random number");
            }

        }while(intNumber != randomNumber); // if the number is not equal to the random number, the loop will continue

        System.out.println("¡Congratulations! You found the number: " +randomNumber);

        scanner.nextLine();
        scanner.close(); // close sccanner
    }

    //2.24
    public static void twoDottwentyFour(){
        int numbersList[] = new int[10];
        int evenNumber = 0;
        int oddNumber = 0;

        for(int i = 0; i < numbersList.length; i++) {

            if ((int) (Math.random() * 10) >= 6){
                numbersList[i] = (int) (Math.random() * -100);
            }
            else{
                numbersList[i] = (int) (Math.random() * 100);
            }
        }

        for(int number : numbersList){
            if(number % 2 == 0) {evenNumber += number;} else{oddNumber += number;}
        }

        System.out.println("Sum of even numbers: " + evenNumber + " | Sum of odd numbers: "+ oddNumber);
    }

} 
