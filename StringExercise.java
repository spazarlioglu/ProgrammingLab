import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        String str1="Java";
        String str2="Java";//str and str2 same

        String str3=new String("Java");//str3 is not same with others

        System.out.println(str1.equals(str3));

        System.out.println("str4");
        String str4=input.nextLine();

        System.out.println("str5");
        String str5=input.nextLine();

        System.out.println(str4==str5);




    }
}
