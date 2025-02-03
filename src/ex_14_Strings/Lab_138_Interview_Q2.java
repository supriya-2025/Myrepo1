package ex_14_Strings;

public class Lab_138_Interview_Q2
{
    public static void main(String[] args)
    {
     String s1="Hello";  //String constant pool=1
     String s3="Hello";

     String s2= new String("Hello");
     String s4=new String("Hello");
     String s5=new String ("Hello");

     //==? comparision ->string -> THis check the location ref.
        System.out.println(s1==s3);
        System.out.println(s2==s4);
System.out.println("-----------------------------------------");
     //How can i check the equal== value.
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));

    }
}
