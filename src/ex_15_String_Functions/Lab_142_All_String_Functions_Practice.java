package ex_15_String_Functions;

public class Lab_142_All_String_Functions_Practice
{
    public static void main(String[] args)
    {
        String name="supriya";
        //1.ChartAt()
        System.out.println(name.charAt(0));

        //2.concat()
        System.out.println(name.concat("gomase"));
        System.out.println("------------------------------");

        //3.contans
        System.out.println(name.contains("y"));
        System.out.println("-------------------------------");

        //4.equals
        System.out.println(name.equals("supriya"));
        System.out.println("------------------------------");

        //5.equalsignorecase
        System.out.println(name.equalsIgnoreCase("String"));
        System.out.println("-------------------------------");

        //6.indexoff()
        System.out.println(name.indexOf("u"));
        System.out.println("---------------------------------");

        //7.length()
        System.out.println(name.length());
        System.out.println("---------------------------------");

        //8.replace()
        System.out.println(name.replace('a', 'o'));
        System.out.println("---------------------------------");

        //9.split()
        System.out.println(name.split("@"));

        //10.substring()
        System.out.println(name.substring(0, 5));
        System.out.println("---------------------------------------");

        //11.toupperCase()
        System.out.println(name.toUpperCase());
        System.out.println("---------------------------------------");

        //12.tolowercase()
        System.out.println(name.toLowerCase());
        System.out.println("----------------------------------------");

        //13.startswith()
        System.out.println(name.startsWith("s"));
        System.out.println("---------------------------------------");

        //14.endswith()
        System.out.println(name.endsWith("a"));
        System.out.println("---------------------------------------");

        //15.trim()
        String s1= "  minal  ";
        System.out.println(s1.trim());
        System.out.println("--------------------------------------");

        //16.compareto()
        System.out.println(name.compareTo("supriya"));
        System.out.println("--------------------------------------");

        //17.camparetoignorecase()
        System.out.println(name.compareToIgnoreCase("Supriya"));
        System.out.println("--------------------------------------");

        StringBuilder stringBuilder= new StringBuilder("supriya");
        stringBuilder.append("Kawale");
        System.out.println(stringBuilder);

        StringBuilder sb=new StringBuilder("HI");
        sb.append("This is my world");
        System.out.println(sb);

    }
}
