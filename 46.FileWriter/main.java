import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class main {
    public static void main(String[] args) {
        
        try{
            FileWriter writer = new FileWriter("poem.txt");

            writer.write("Roses are red \nViolent are blue \nBoo Boo Boo\n");
            writer.append("why this for you ???");
            writer.write("\nPoem by BRO");

            writer.close();
        }

        catch (IOException e) {
            System.out.println("Error!!");
        }
        

    }
}
