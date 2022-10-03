import java.util.ArrayList;
class Array{
public static void main(String[]args)
{
ArrayList<Integer> sc=new ArrayList<>();

sc.add(1);
sc.add(78);
sc.set(0,4);
System.out.println(sc);
sc.set(0,4);//we should use for the object name 
}
}
//now you want change the value together
//output
[4,78]