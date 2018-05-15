package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*java BufferedReader class is used to read the text from a character-based input stream.
        It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class.*/
public class BufferreaderClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please give your Name here ");
        String name = br.readLine();
        System.out.println(" I Am  " + name);
    }
}
