package JavaTask7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Enter the name of the file to read: ");
        String fileName = userInputScanner.nextLine();

        try {
           
            File file = new File(fileName);
            
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            
            fileScanner.close();
        } catch (FileNotFoundException e) {
            
            System.out.println("Error: The file '" + fileName + "' was not found. Please check the file name and path.");
        } 
}

}
