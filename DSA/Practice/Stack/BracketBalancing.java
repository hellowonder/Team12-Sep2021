class Stack2 {
    final static int MAX = 100;
    int top;
    char arr[] = new char[MAX];

    Stack2() {
        int top = -1;
    }

    boolean isEmpty() {
        if (top < 0)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if (top > (MAX - 1))
            return true;
        else
            return false;
    }

    void push(char c) {
        if (isFull() == true) {
            System.out.println("Stack is Overflow");
        } else {
            // top = top +1;
            // arr[top] = c;
            arr[++top] = c;
            System.out.println(c + " pushed into stack");
        }
    }

    char pop() {
        if (isEmpty() == true) {
            System.out.println("UnderFlow");
            return 0;
        } else {
            char c = arr[top--];
            System.out.println(c + " Poped from stack");
            // char c = arr[top];
            // top = top-1;
            return c;
        }
    }

    char peek() {
        if (isEmpty() == true) {
            System.out.println("UnderFlow");
            return 0;
        } else {
            char c = arr[top];
            return c;
        }
    }

}

public class BracketBalancing {
    public static void main(String[] args) {
        String str = "(()[({})])";
        char arr[] = str.toCharArray();

        Stack2 s1 = new Stack2();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
                s1.push(arr[i]);
            } else {
                if (s1.isEmpty()) {
                    System.out.println("Not balanced");
                }

                if (arr[i] == ']' && s1.peek() != '[')
                    System.out.println("Not Balanced");

                if (arr[i] == ')' && s1.peek() != '(')
                    System.out.println("Not Balanced");

                if (arr[i] == '}' && s1.peek() != '{')
                    System.out.println("Not Balanced");

                s1.pop();

            }
        }
        if (s1.top == 0) {
            System.out.println("Balanced");
        }

    }
}
