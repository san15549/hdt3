import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author Carlo David Sanchinelli, Diego Alberto Hurtarte
 * @version 31.07.16
 */
public class Lector {
    BufferedReader br;
    String everything = "";
    
    
    public Lector() throws FileNotFoundException, IOException{
        br = new BufferedReader(new FileReader("numeros.txt"));
        try {
            String line = br.readLine();
            while (line != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(line);
                line = br.readLine();
                everything = everything + sb.toString();
            }
        } 
        finally {
            br.close();
        }
    }
    
    public int[] getText(){
        int[] array = new int[everything.length()];
        for(int i=0;i<everything.length();i++){
            array[i] = everything.charAt(i) - '0';
        }
        return array;
    }   
}
