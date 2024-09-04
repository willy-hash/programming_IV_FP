package FirstSection;

public class Section_1 {

    //Methods(exercises)

    //2.1 - Add two numbers
    public void oneDocOne(int a) {
        int acc = 0; //Accumulator
        
        for (int i = 1; i < a; i++) {
            if (i % 2 == 0) {
        
                acc += i; //acc = acc + i
            }
        }
        System.out.println(acc);
    }

}