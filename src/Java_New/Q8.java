package Java_New;

import java.util.Scanner;

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
