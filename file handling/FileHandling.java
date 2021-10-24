import java.io.FileReader;

import javax.annotation.processing.FilerException;

// import java.io.*;
// import java.util.Scanner;
// import java.util.HashSet;
// import java.util.Set;
// public class FileHandling {
//     public static void main(String[] args) {
//         try
//         {
//             File f = new File("txt1.txt");
//             FileReader fin = new FileReader(f);
//             Scanner sc = new Scanner(new File("txt1.txt"));
//             String str=null;
//             FileWriter writer = new FileWriter("txt2.txt");
//             Set set=new HashSet();
//             while (sc.hasNextLine())
//             {
//                 str=sc.nextLine();
//                 if (set.add(str))
//                 {
//                     writer.append(str+"\n");
//                 }
//             }
//             writer.flush();

//         }
//         catch(Exception e)
//         {
//             System.out.println(e.getMessage());
//         }
//     }
// }


import java.io.*;
public class FileHandling {
    public static void main(String[] args) {
        try
        {
            File f = new File("txt1.txt");
            FileReader fin = new FileReader(f);
            int i=0;
            int letters=0;
            int numbers=0;
            int chars=0;
            FileWriter fout = new FileWriter("txt2.txt");
            while ((i=fin.read())!=-1)
            {
                if (Character.isDigit((char)i))
                {
                    numbers+=1;
                    chars+=1;
                }
                else if(Character.isLetter((char)i))
                {
                    letters+=1;
                    chars+=1;
                }
            }
            fout.write("Number of digits: "+numbers);
            fout.write("Number of letters: "+letters);
            fout.write("Number of chars: "+chars);
            fout.close();
        }
        catch(Exception e)
        {

        }
    }
}