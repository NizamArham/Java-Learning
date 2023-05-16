import java.io.File;

public class main {
    public static void main(String[] args) {
        
        // file = An abstract representation of file and directory pathnames

        File file = new File("SecretMessage.txt");
    
        if (file.exists()) {
            System.out.println("That File Exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete(); to delete the file after running 
        }
        else { 
            System.out.println("that file doesnt exists");
        }
    
    }
}
