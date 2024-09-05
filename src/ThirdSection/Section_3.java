package ThirdSection;

public class Section_3 {
    
    public static void main(String[] args) {
        //twoDottwentyOne();
        twoDottwentyTwo();
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
        
        int numbersList[] = new int[(int) (Math.random() * 5) + 1];

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

    
}
