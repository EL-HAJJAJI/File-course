import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class App {
    public static void main(String[] args) throws Exception {

        // ----------------Pour Cree une file : ---------------------
        /* try {
            File file = new File("hatim.txt");
            if(file.createNewFile()){
                System.out.println("The file has been created!");
            }
            else {
                System.out.println("The file already exists!");
            }
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        } */

        // ----------------Pour Ecrire dans une file : ---------------------
        /* try {
            FileWriter write = new FileWriter("hatim.txt");
            write.write("Bonjour, je m'appelle hatim el hajjaji");
            write.close();
            System.out.println("'hatim.txt' has been write!");
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        } */


        // ----------------Pour Lire dans une file : ---------------------
        /* try {
            FileWriter write = new FileWriter("hatim.txt");
            write.write("Je suis etudiant a l'ESI");
            write.close();
            File file = new File("hatim.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        } */


        
            /* File file = new File("hatim.txt");
            if(file.exists()){
                System.out.println("Name : "+ file.getName());
                System.out.println("Can read : "+ file.canRead());
                System.out.println("Can write : "+ file.canWrite());
                System.out.println("Can execute : "+ file.canExecute());
                System.out.println("Size : "+ file.length());
                System.out.println("Son chemin Absolue : " +file.getAbsolutePath());
            }
            else {
                System.out.println("The file not exists!");
            } */


        /* File file = new File("hatim.txt");
        if(file.delete()){
            System.out.println("The file has been deleted!");
        }
        else {
            System.out.println("The file not exists!");
        } */

        
            /* File file = new File("hatim");
            if(file.mkdir()) {
                System.out.println("The folder has been created!");
            }
            else {
                System.out.println("The folder not created!");
            } */
        

        File file = new File("hatim");
        if(file.delete()) {
            System.out.println("The folder has been deleted!");
        }
        else {
            System.out.println("The folder not exists!");
        }
    }
}
