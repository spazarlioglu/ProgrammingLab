import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerMethods {

    public static int [] method6(String str){
        int[] arr=new int[str.length()];
        int n=10;

        for (int i = 0; i < arr.length; i++) {
            if (n==20||n==50||n==70){
                continue;
            }
            arr[i]=n;
            n*=10;

        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(method6("mark"));
    }
}
