

// FileWriter with appending content in a file

import java.io.*;

public class filewriter {
    public static void main(String args[]) throws Exception {
        File f = new File("data.txt");
        FileWriter fw = new FileWriter(f, true); // or FileWriter("E:\\VIT\\Courses\\Fall 2021-2022\\Java
                                                 // Programming\\A2\\Code\\data.txt");
        fw.write('A'); // write a single char
        fw.write(65); // -->65
        fw.write("This is the example for FileWriter"); // Writing a string
        char[] a = { 'a', 'b', 'c', 'd' };
        fw.write(a);
        fw.close();
    }
}