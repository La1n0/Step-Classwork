package edu.step.math;

public class calculator {
    int val1 ;
    int val2;

 public  int addition (int num1, int num2)
 {
     return num1+num2;
 }
    public  double addition (double num1, double num2)
    {
        return num1+num2;
    }
 public int subtraction(int num1, int num2 )
 {
     return num1-num2;
 }
    public double subtraction(double num1, double num2)
    {
        return num1-num2;
    }
    public int multiplication(int num1, int num2 )
    {
        return num1*num2;
    }
    public double multiplication(double num1, double num2)
    {
        return num1*num2;
    }

 public double division (int num1, int num2 )
 {
        return (double) num1/num2;
}

    public double division(double num1, double num2)
    {
        return num1/num2;
    }

 void multiplication_table(int num)
 {
   for (int i=0;i<=10;i++) {
   System.out.ptintln(num+"*"+i+"="+ (num*i));
    }
 }

    public int sumUpTo(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

}
