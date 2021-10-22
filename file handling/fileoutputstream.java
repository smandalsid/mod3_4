
// FileOutputStream example
import java.io.*;
public class fileoutputstream {
public static void main(String args[]) throws Exception
{
try{ File f = new File("D:\\File\\data.txt");
FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
String s="FileOutputStream";
byte b[]=s.getBytes();
fout.write(b);
fout.close();
}
catch(Exception e)
{
System.out.println(e);
}

}
}