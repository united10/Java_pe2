import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {


    public static void main(String[] fileName) throws IOException
    {
        int ch;
        FileReader fr=null;
        try
        {
            fr = new FileReader("/home/anshul/javatest/Java_training_stackroute/PE2/src/text.txt");
            int count=0;
            String fileData = "";
            ch=fr.read();
            while (ch!=-1) {
                char a =  Character.toUpperCase((char) ch);
                fileData = fileData + a;
                System.out.print(a);
                count++;
                ch=fr.read();
            }
            fr.close();
            FileWriter fw=null;

            fw = new FileWriter("text.txt");
            fw.write(fileData);
            fw.close();
            System.out.println("\n" + count);

        }catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
           }


}

