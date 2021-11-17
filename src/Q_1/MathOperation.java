package Q_1;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
       try
       {Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i]+sum;
        }
        System.out.println(sum);
        int avg= sum/ arr.length;
        System.out.println(avg);
    }catch (NumberFormatException obj) {
           System.out.println(obj);}
       catch (ArithmeticException obj){
           System.out.println(obj);
       }
       catch (Exception obj){
           System.out.println(obj);
       }
       }
    }

