import java.util.Scanner;
 
 public class Maximum{
 
 public static void main(String []args)
 {
 int a[]={1, 3, 6, 21, 4, 9, 12, 3, 16, 10};
 
 int lenght=4;
 for(int i=0;i< a.length-lenght;i++)
 {
 int max=a[i];
 for(int j=i;j<i+lenght;j++)
 {
 System.out.print(a[j]+ "\t");
 if (a[j]>max)
 {
 max=a[j];
 }
 }
 System.out.println("...-->\t"+max);
 }
 
 
 }
 }