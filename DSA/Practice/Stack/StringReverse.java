class Stack1 {
    static final int MAX = 100;
    int top;
    char arr[] = new char[MAX];

    Stack1() {
        top = -1;
    }

    boolean isEmpty() {
        if (top < 0)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if (top >= MAX - 1) {
            return true;
        } else {
            return false;
        }
    }

    void push(char c) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        } else {
            arr[++top] = c;
            System.out.println("Pushed : " + c);
        }
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return ' ';
        } else {
            char c = arr[top--];
            System.out.println("poped : " + c);
            return c;
        }
    }

    char peek() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return ' ';
        } else {
            char x = arr[top];
            return x;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.println(" " + arr[i]);
        }
    }
}

class StringReverse {
    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push('a');
        s.push('b');
        s.push('c');
        s.pop();
    }
}