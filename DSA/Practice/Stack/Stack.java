class Stack{
	//Defining the size of the stack
	int top;
	int current;
	final static int MAX= 5;
	int arr[] = new int[MAX];
	
	Stack(){
		top = -1;
	}

	boolean isEmpty(){
		return(top < 0);
	}
	
	boolean isFull(){
		return(top > (MAX-1));
	}

	void push(int x){
		if(isFull() == true){
			System.out.println("OverFlow");
		}
		else{
			arr[++top] = x;
			System.out.println(x);
			current++;
		}
	}

	void pop(){
		if(isEmpty() == true){
			System.out.println("UnderFlow");
		}
		else{
			int x = arr[top--];
			current--;
			System.out.println(arr[top]);
		}
	}

	public static void main(String[] args){
		
		Stack s1 = new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.pop();
		System.out.println("Total Number Of Elements in Stack: "+s1.current);		
	}
}