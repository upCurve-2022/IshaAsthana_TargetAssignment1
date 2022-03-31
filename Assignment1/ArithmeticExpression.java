package Assignment1;

import java.util.Scanner;
import java.util.Stack;

public class ArithmeticExpression {
    public static void main(String[] args) {
        Stack<Character> operator = new Stack<Character>();
        Stack<Character> operand = new Stack<Character>();
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any arithmetic expression(with brackets) : ");
        a = sc.nextLine();
        for(int i=0;i<a.length()+1;i++){
            if(a.charAt(i) == '('){
                if((int)a.charAt(i+1) >= 48 && (int)a.charAt(i+1) <= 57)
                    operand.add(a.charAt(i+1));
                else if(a.charAt(i+1) == '+' || a.charAt(i+1) == '-' || a.charAt(i+1) == '*' ||
                        a.charAt(i+1) == '/' || a.charAt(i+1) == '^')
                    operator.add(a.charAt(i+1));
                else if(a.charAt(i+1) == ')'){

                }

            }
        }
    }
    public static int calculator(int a,int b, String c){
        if(c == "+")
            return a+b;
        else if(c=="-")
            return a-b;
        else if(c=="*")
            return a*b;
        else if(c=="/")
            return a/b;
        else if(c=="^")
            return (int) Math.pow((double)a,(double)b);
        else
            return -1;
    }
}
