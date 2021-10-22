import java.io.File;
import java.io.*;
import java.text.SimpleDateFormat;

public class FileDemo {
    static void print(String s)
    {
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1 = new File("txt2.txt");
        FileReader fr = null;
        int ch;
        File f2 = new File("txt3.txt");
        try
        {
            if (f2.createNewFile())
            {
                System.out.println("File created: "+f2.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("File could not be created");
        }
        try
        {
            fr=new FileReader("txt.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        try
        {
            while ((ch=fr.read())!=-1)
            {
                System.out.print((char)ch);
            }
        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }
        try
        {
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("File does not exist");
        }
        print("File name: "+f1.getName());
        print("File path: "+f1.getPath());
        print("File absolute path: "+f1.getAbsolutePath());
        print("File parent: "+f1.getParent());
        print("File exists?: "+f1.exists());
        print("File is writable?: "+f1.canWrite());
        print("File is readable?: "+f1.canRead());
        print("Is it a directory?: "+f1.isDirectory());
        print("Is it a normal file?: "+f1.isFile());
        print("Is it a normal file?, it might be a named pipe: "+f1.isFile());
        print("Is it absolute or not absolute? "+f1.isAbsolute());
        print("File last modified: "+f1.lastModified());
        print("File size: "+f1.lastModified()+ " bytes");

        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        print("Date in particular format"+sdf.format(f1.lastModified()));
    }
}