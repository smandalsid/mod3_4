import java.io.*;
class person
{
String name,address;
int age;
void get_person_info(String n,String a,int x)
{
name=n;
address=a;
age=x;
}
void show_person_info()
{
System.out.println("Person Name "+name);
System.out.println("Person Address "+address);
System.out.println("Person Age "+age);
}
}
class employee extends person
{
//String name,address;
//int age; g_p_i() & s_p_i()
String EMP_Code;
void get_emp_info(String n,String a,int x,String e)
{
get_person_info(n,a,x);
//name=n;
//address=a;
//age=x;
EMP_Code=e;
}
void show_emp_info()
{
show_person_info();
//System.out.println("Employee Name "+name);
//System.out.println("Employee Address "+address);
//System.out.println("Employee Age "+age);
System.out.println("Employee Code "+EMP_Code);
}
}
class student extends person
{
//String name,address;
//int age; g_p_i() & s_p_i()
String reg_no;
void get_student_info(String n,String a,int x,String r)
{
get_person_info(n,a,x);
//name=n;
//address=a;
//age=x;
reg_no=r;
}
void show_student_info()
{
show_person_info();
//System.out.println("Student Name "+name);
//System.out.println("Student Address "+address);
//System.out.println("Student Age "+age);
System.out.println("Student Reg_no "+reg_no);
}
public static void main(String args[])
{
student obj=new student();
obj.get_student_info("Arun","vellore",19,"19BCE0001");
obj.show_student_info();
employee emp_obj=new employee();
emp_obj.get_emp_info("Arun","vellore",19,"emp001");
emp_obj.show_emp_info();
try
{
FileOutputStream f=new FileOutputStream("Object_state.txt");
ObjectOutputStream oos=new ObjectOutputStream(f);
oos.writeObject(obj);
oos.close();
}
catch(Exception e)
{
}
try
{
FileInputStream i=new FileInputStream("Object_state.txt");
ObjectInputStream ois=new ObjectInputStream(i);
student e=(student)ois.readObject();
System.out.println(e.name);
ois.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}

}
}