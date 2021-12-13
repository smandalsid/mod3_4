// buffered input stream

import java.io.*;
public class BIS {
public static void main(String[] args)
{
try
{
FileInputStream inputStream
= new FileInputStream(
"data.txt");

 BufferedInputStream buffInputStr
= new BufferedInputStream(
inputStream);
// Read and print characters one by one
System.out.println( "Char : " + (char)buffInputStr.read());
System.out.println( "Char : " + (char)buffInputStr.read());
System.out.println( "Char : " + (char)buffInputStr.read());
// Mark is set on the input stream
buffInputStr.mark(0);

 System.out.println( "Char : " + (char)buffInputStr.read());
// Reset() is invoked
buffInputStr.reset();
System.out.println( "reset() called");
System.out.println( "Char : " + (char)buffInputStr.read());
buffInputStr.mark(1);
System.out.println( "Char : " + (char)buffInputStr.read());
buffInputStr.reset();
System.out.println( "Char : " + (char)buffInputStr.read());
System.out.println( "Char : " + (char)buffInputStr.read());
}
catch(Exception e)
{
System.out.println(e);
}
}
}