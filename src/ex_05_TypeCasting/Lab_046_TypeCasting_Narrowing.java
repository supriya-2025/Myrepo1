package ex_05_TypeCasting;

public class Lab_046_TypeCasting_Narrowing
{
    public static void main(String[] args)
    {
        int value= 100;
        //byte b = value; //implicit casting narrowing is not allowed

        byte b=(byte)value;
        System.out.println(b);

        //data loss
    }
}
