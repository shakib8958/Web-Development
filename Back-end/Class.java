import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
class Main0
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
Map<IntegerString>student=new HashMap<>();
for(int i=0;i<3;i++)
{
System.out.println("Roll No");
int Roll=sc.nextInt();
sc.nextLine();
System.out.println("enter name");
String name=sc.nextLine();
student.put(Roll,name);
}
System.out.println(student.entrySet());
}
}

