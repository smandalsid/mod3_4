
// java DataInputStream DataOuputStream

import java.io.*;
class DataOut_In_putStreamDemo
{
public static void main(String args[]) throws IOException
{
try ( DataOutputStream dout =
new DataOutputStream(new FileOutputStream("data_DOS.txt")) )
{
dout.writeDouble(1.1);
dout.writeInt(55);
dout.writeBoolean(true);
dout.writeChar('4');
}
catch(FileNotFoundException ex)
{
System.out.println("Cannot Open the Output File");
return;
}
try ( DataInputStream din =
new DataInputStream(new FileInputStream("data_DOS.txt")) )
{
//case-1
/* double a = din.readDouble();
int b = din.readInt();
boolean c = din.readBoolean();
char d=din.readChar();
System.out.println(a+ " "+b+ " "+c+ " "+d);*/
//case-2
double a = din.readDouble();
int b = din.readChar();
boolean c = din.readBoolean();
char d=din.readChar();
System.out.println(a+ " "+b+ " "+c+ " "+d);
}
catch(FileNotFoundException e)
{
System.out.println("Cannot Open the Input File");
return;
}
}
}
