import java.io.*;
import java.util.*;
public class number{
public static void main(String args[]){
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
num=sc.nextInt();
if(num>0)
{
System.out.println("(num + " is  positive");
}
elseif(num<0)
{
System.out.println("(num + " is  negative");
}
else
{
System.out.println("(num + " is zero");
}
}
}
