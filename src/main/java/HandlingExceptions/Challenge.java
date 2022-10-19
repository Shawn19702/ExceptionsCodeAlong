package HandlingExceptions;

public class Challenge {


    public static void main(String[] args) {
        //Arithmetic exceptions are used for exceptions in math like trying to divide a number by zero.
        try {
            int c = 30/0;
        }catch (ArithmeticException e){
            System.out.println("cant Divide by zero");
            e.printStackTrace();
        }finally {
            System.out.println("Division is fun");
        }
    }
}
