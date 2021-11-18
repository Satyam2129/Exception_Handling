package Q_1;

import java.util.InputMismatchException;
import java.util.Scanner;
class negative_value extends RuntimeException{
    negative_value(String s){
        super(s);
    }
}
class val_out_of_bound extends RuntimeException{
    val_out_of_bound(String s){
        super(s);
    }
}

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of two students: ");
        try {
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.print(a + " " + b);
            System.out.println();
            System.out.println("Enter the marks obtained by " + a + " and " + b + " in 3 subjects: ");

            int arr1[] = new int[3];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
                if (arr1[i]<0){
                    throw new negative_value("negative value exception");
                }
                if (arr1[i]>100){
                    throw new val_out_of_bound("range out of bound.");
                }
            }
            int sum =0;
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("Marks obtained by " + a + " = " + arr1[i]);
                sum = sum+arr1[i];
            }
                System.out.println("Avg marks of "+a+" = "+sum/ arr1.length);
            int arr2[] = new int[3];
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextInt();
                if (arr2[i]<0){
                    throw new negative_value("negative value exception.");
                }
                if (arr2[i]>100){
                    throw new val_out_of_bound("range out of bound.");
                }
            }
            int num=0;
            for (int i = 0; i < arr2.length; i++) {
                System.out.println("Marks obtained by " + b + " = " + arr2[i]);
                num = num+arr2[i];
            }
                System.out.println("Avg marks of "+b+" = "+num/ arr2.length);
        }catch (InputMismatchException obj){
            System.out.println(obj);
        }catch (negative_value obj){
            System.out.println(obj);
        }catch (val_out_of_bound obj){
            System.out.println(obj);
        }catch (Exception obj){
            System.out.println(obj);
        }

        }
    }

