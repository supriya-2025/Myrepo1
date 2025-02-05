package ex_05_TypeCasting;

public class Lab_048_TypeCasting_Used
{
    public static void main(String []args)
    {
        int course=100;
        float GST= 18.45f;
        // int total_GST= course+GST;  implicit casting not allowing
        int total_GST=course+(int)GST;
        System.out.println(total_GST);

        //float total=course+GST; //Widening Implicit
        float total=(float)course+GST;


    }
}
