import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter stack size");
       Stack1 stack1=new Stack1(sc.nextInt());
  int i=0;
       while (true) {
           i++;
           System.out.println("enter value : at index  "+stack1.top+"  Enter -8 for remove top stack");
          int val= sc.nextInt();

           if(val==-8){
          stack1.pop();
           }else {
               stack1.push(val);
           }
       }

    }
}