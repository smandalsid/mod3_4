

// FileInputStream example

import java.io.*;
public class fileinputstream {
public static void main(String args[]) throws Exception
{
File f = new File("D:\\File\\data.txt");
FileInputStream fis=new FileInputStream("D:\\File\\data.txt");
System.out.println(fis.available());

byte[] b=new byte[10];
int total_byte=fis.read(b); //type-1 byte[]

for(byte r: b)
System.out.print((char)r);
System.out.println();

byte[] sub_b=new byte[10];
int total_sub_byte=fis.read(sub_b,3,6); //type-2 byte[],off,len

for(byte r: sub_b)
System.out.print((char)r);
System.out.println();

int v;
while((v=fis.read())!=-1) //-1-->EOF
{
System.out.print((char)v);
}
fis.close();
}
}