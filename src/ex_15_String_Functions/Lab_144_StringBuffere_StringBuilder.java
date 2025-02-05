package ex_15_String_Functions;

public class Lab_144_StringBuffere_StringBuilder
{
    public static void main(String [] args)
    {
        //String buffer
        StringBuffer str1=new StringBuffer("supriya");
        str1.append("Kawale");
        System.out.println(str1);
        str1.reverse();
        System.out.println(str1);
        System.out.println("-------------------------------");

        //StrimngBuilder
        StringBuilder str2=new StringBuilder("supriya");
        str2.append("gomase");
        System.out.println(str2);
        str2.reverse();
        System.out.println(str2);
        System.out.println("----------------------");

    }
}
