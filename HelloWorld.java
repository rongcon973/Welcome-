import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloWorld{
  public static void main(String[] args){
//<<<<<<< tdtu
    System.out.println("Hello World , This is TDTU ");
//=======
    //Scanner sc = new Scanner(System.in);
    //name typed by user
    //String XXX = sc.nextLine();
    //System.out.println("Hello World , I am " + XXX);
//>>>>>>> master
    
    String filePath = "c:/temp/data.txt";
    System.out.println("Hello I am " + usingBufferedReader( filePath ) );
  }  
    //Read file content into string with - using BufferedReader and FileReader
    private static String usingBufferedReader(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
 
            String sCurrentLine;
            Int count = 0;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilder.append(sCurrentLine).append("\n");
                count++;
            }
            System.out.println("Total" + count + "number");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

}
