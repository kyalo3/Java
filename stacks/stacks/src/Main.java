public class Main {

    //declare a variable
    int [] stackArray;
    int top;
    int maxSize;
    public static void main(String[] args) {
        //create an object of the class Main
    
        Main stack = new Main( 5);
        stack.push(23);
        stack.push(22);
        stack.push(15);

        System.out.println("Top value = " + stack.pop());
        System.out.println("Top value = " + stack.peek());
        System.out.println("Top value = " + stack.pop());
        System.out.println("Top value = " + stack.pop());
        System.out.println("Top value = " + stack.pop());
    }

        //constructor to initialize the stack
        public Main(int size)
        {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        // check if the stack is empty
        public boolean isEmpty()
        {
            return (top == -1);
        }

        //check if the stack is full
        public boolean isFull()
        {
            return (top == maxSize - 1);
        }

        //push an element to the stack
        public void push(int element)
        {
            if(isFull()){
                System.out.println("Stack is full");
            }else{
                stackArray[++top] = element;
            }
        }

        //pop an element from the stack
        public int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack is empty!!!. Cannot Pop");
                return -1;
            }
            else{
                int poppedValue = stackArray[top--];
                System.out.println("Popped element: " + poppedValue + " from the stack");
                return poppedValue;
            }
        }

        //peek method
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Stack is empty!!!. Cannot Peek");
                return -1;
            }
            else{
                return stackArray[top];
            }
        }
    }