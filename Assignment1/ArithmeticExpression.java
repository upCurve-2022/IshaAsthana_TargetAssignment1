package Assignment1;

import java.util.Scanner;
import java.util.Stack;



public class ArithmeticExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.println("The value of above expression is : "+String.valueOf(evaluate(exp)));
    }

    public static int precedence(char ch){
        if(ch=='-' || ch=='+'){
            return 1;
        }else if(ch=='/' || ch=='*'){
            return 2;
        }
        return 0;
    }
    public static int  evaluate(String exp) {

        Stack<Integer> values = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i) >='0' && exp.charAt(i) <='9'){
                values.push(exp.charAt(i)-'0');
            }else if (exp.charAt(i)=='('){
                op.push(exp.charAt(i));
            }else if (exp.charAt(i)==')'){
                while(op.size()!=0 && op.peek()!='('){
                    int b= values.pop();
                    int a=values.pop();
                    char o=op.pop();
                    if(o=='+'){
                        values.push(a+b);
                    }else if(o=='-'){
                        values.push(a-b);

                    }else if(o=='*'){
                        values.push(a*b);
                    }else if(o=='/'){
                        values.push(a/b);
                    }
                }
                op.pop();
            }else{

                while (values.size()>=2 && op.size() != 0 && precedence(exp.charAt(i)) <= precedence(op.peek())) {
                    int b = values.pop();
                    int a = values.pop();
                    char o = op.pop();
                    if (o == '+') {
                        values.push(a + b);
                    } else if (o == '-') {
                        values.push(a - b);

                    } else if (o == '*') {
                        values.push(a * b);
                    } else if (o == '/') {
                        values.push(a / b);
                    }
                }

                op.push(exp.charAt(i));
            }
        }

        while( values.size()>1){
            int b = values.pop();
            int a = values.pop();
            char o = op.pop();
            if (o == '+') {
                values.push(a + b);
            } else if (o == '-') {
                values.push(a - b);

            } else if (o == '*') {
                values.push(a * b);
            } else if (o == '/') {
                values.push(a / b);
            }
        }

        return values.pop();
    }
}
