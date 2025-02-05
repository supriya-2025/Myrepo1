package ex_03_Literals;

public class Lab_032_Literal_Char
{
    public static void main(String[] args) {

        char c1='A';
        char c2='a';
        char c3='(';
        char c4=';';
        char c5='@';
        char c6='_';
        char c7=' ';

        //Escape char
        char new_line='\n';
        char new_tab='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("Suprya Kawale");
        System.out.println("Supriya"+new_line+ "Kawale");
        System.out.println("Supriya"+new_tab+"Kawale");
        System.out.println("Supriya"+ back_space+ "Kawale");
        System.out.println("Supriya"+ carriage_return+ "Kawale");


    }
}
