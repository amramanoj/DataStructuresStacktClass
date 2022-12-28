public class Stack1 {
     int sizeStack[];
     int top=0;
     int size=0;
    public  Stack1(int size)
    {

        sizeStack=new int[size];
        this.size=size;
    }
    public void push(int value)
    {


        if(top<size){

        sizeStack[top]=value;
            top+=1;
        }
        else {
            System.out.println("stack overflow : all value");
            for(int i:sizeStack){
                System.out.print("   "+i+"  ");
            }
        }

    }
    public void pop()
    {

        if(top>0) {
            System.out.println("pop working last index  delete "+top);
            sizeStack[top - 1] = 0;
            top--;
        }else {
            System.out.println("empty stack");
        }
    }
}
