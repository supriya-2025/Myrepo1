package ex_05_TypeCasting;

public class Lab_047_TypeCasting
{
    public static void main(String[] args)
    {
        long phone_no=1234567893;
        //short s=phone_no; // implicit casting is not allowed.
         short s=(short)phone_no;
        System.out.println(s); //expicit

    }
}
