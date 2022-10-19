package HandlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args)  {
          createNewFile();
       numberExceptionHanding();

        try {
            createNewFileThrow();

        }catch (IOException e){
            System.out.println("Cant find file");
            e.printStackTrace();
        }

    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("directory does not exist");
            e.printStackTrace();
        }
    }


    public static void createNewFileThrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
file.createNewFile();

        }


    public static void numberExceptionHanding() {
        //This is called a try with resource Java automatically classes the scanner by itself so three is no need for a finally block
        //Only works for the class such as scanner as the close interface
        File file = new File("resources/numbers.txt");
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }




        //Finally will excutute no matter what

        // System.out.println("numbers are not all double");
           // e.printStackTrace();

        }




        /* We can just use Exception because it is a parent class of
        the IO exception this is used for when
        you don't know what type exception is going to be
         or for when there is more than one exception
         */


        //Biggest exceptions smallest to least
        //1. Exception
        //2. RunTime Exception
        //3.Index out of bounds exception
        //4. Array index out of bounds exception


