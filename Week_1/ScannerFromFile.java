// package Week_1;
import java.util.Scanner;
import java.io.File;

public class ScannerFromFile {

    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("test.in"));
        }catch(Exception e){
            System.out.println("File not found: " + e.getMessage());
        }
        
    }
}