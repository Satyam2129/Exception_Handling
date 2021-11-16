package Q_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        try{
        int arr[]=new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
            System.out.println("Enter the index of the array element you want to access: ");
        int b= sc.nextInt();
            if (b>= arr.length){
                System.out.println("Does not Exist");
            }
            else {
                System.out.println("The array element at index "+b+" = " +arr[b]);
                System.out.println("The array element successfully accessed");
            }
        }catch (InputMismatchException obj){
            System.out.println(obj);
        }catch (ArrayIndexOutOfBoundsException obj){
            System.out.println(obj);
        }catch (NumberFormatException obj){
            System.out.println(obj);
        }
        }
    }



