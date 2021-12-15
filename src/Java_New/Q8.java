package Java_New;


import java.util.Scanner;



/*
8.	Create two threads, one thread to display all even numbers between 1 and 20, another to display odd numbers between 1 and 20.
Note: Display all even numbers followed by odd numbers.
 */

import java.util.Scanner;

class Q8_1 extends Thread{
    public void run(){
        Thread obj = Thread.currentThread();
        obj.notify();
        try {
            for (int i = 1; i <=20; i++) {
                Thread.sleep(1000);
                if(i%2==0)
                    System.out.println(i);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
class Q8_a extends Thread{
    public synchronized void run(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <=20 ; i++) {
            try {
                Thread.sleep(1000);
                if(i%2==1)
                    System.out.println(i);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class Q8 {
    public static void main(String[] args) {
        Q8_1 o = new Q8_1();
        Q8_a o1 = new Q8_a();

//        o.run();
        o.setPriority(Thread.MAX_PRIORITY);
        o1.setPriority(Thread.MIN_PRIORITY);
        o.start();
        o1.start();
    }}
//    6.	Write the following code:
//            A class named Arithmetic with a method named add that takes integers as parameters and returns an integer denoting their sum.
//        A class named Adder that inherits from a superclass named Arithmetic.


class Arithmetic
{
    Scanner sc = new Scanner(System.in);
    public int add(int...args)
    {
        int sum=0;
        sum = sum + args[sc.nextInt()];
        System.out.println(sum);
        return(sum);
    }
}
class adder extends Arithmetic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmetic obj = new Arithmetic();
        obj.add(sc.nextInt(),sc.nextInt(), sc.nextInt());
    }
}


class main{}

class main1{
    public static void main(String[] args) {
        Integer i = 150;
        Integer i1 = 150;
        System.out.println(i1.equals(i));
        main1 obj1 = new main1();
        main1 obj2 = new main1();
        System.out.println(obj1==obj2);

    }
}

interface AdvancedArithematic{
      int divi_sum(int n);
}
class Mycalculator implements AdvancedArithematic{
    @Override
    public int divi_sum(int n) {
        int sum=1;
        for (int i = 2; i <= (n/2) ; i++) {
            if(n%i==0)
                sum = sum +i;
        }
        if(n!=1) return (sum+n);
        else return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mycalculator obj = new Mycalculator();
        int n = sc.nextInt();
        int sum = obj.divi_sum(n);
        System.out.println(sum);

    }
}
/*
2.	Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager'
 classes have data members 'specialization' and 'department' respectively.
 Now, assign name, age, phone number, address and salary to an employee and a
 manager by making an object of both of these classes and print the same.

 */

class Member{
   public String name;
    public int age;
    int phone_no;
    String address;
    int salary;
    public void printsalary(){
        System.out.println(salary);
    }
}

class employee extends Member{
    String specialization;
}
class manager extends Member{
}
class main2{
    public static void main(String[] args) {
        Member obj = new Member();

    }
}