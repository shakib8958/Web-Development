import java.util.Scanner;
class Arm
{
public static void main(String[]args)
{
int n,arm=0,rem,c;
System.out.print("enter the value");
Scanner r=new Scanner(System.in);
n=r.nextInt();
c=n;//temeprary variable 
while(n>0)
{
rem=n%10;
arm=(rem*rem*rem)+arm;
n=n/10;
}
if(c==arm)
System.out.print("armstrong number");
else
System.out.print("not armstrong");
}
}
