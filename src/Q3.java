import java.util.Scanner;

/*
3.	We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A
and in four subjects (each out of 100) by student B.
Create an abstract class 'Marks' with an abstract method 'getPercentage'.
It is inherited by two other classes 'A' and 'B' each having a method with
the same name which returns the percentage of the students. The constructor of student
A takes the marks in three subjects as its parameters and the marks in four subjects as
its parameters for student B.
Create an object for each of the two classes and print the percentage of marks for both the students.
 */
abstract class marks{
    public abstract void getpercentage();
        }

class A extends marks{
    int a,b,c;
        A(int a, int b, int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
    @Override
    public void getpercentage() {
        int per;
        per = (a+b+c)/3;
        System.out.println(per);
    }
}

class B extends marks{
   int x,y,z,q;
    B(int x,int y,int z,int q){
        this.x=x;
        this.y=y;
        this.z=z;
        this.q=q;
    }
    @Override
    public void getpercentage(){
        int per=(x+y+z+q)/4;
        System.out.println(per);
    }
}
public class Q3 {
    public static void main(String[] args) {
        A obj = new A(30,40,50);
        B obj1 = new B(50,80,89,23);
        obj.getpercentage();
        obj1.getpercentage();
    }
}
/*
4.	Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class, then the name should be "Unknown",
otherwise the name should be equal to the String value passed while creating object of Student class.
 */

class Student{
    String s;
    Student(){
        String s = "Unknown";
    }
    Student(String s){
        this.s =s;
    }
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student("ghappua");
//        System.out.println(obj.toString());
//        System.out.println(obj1);

    }
}