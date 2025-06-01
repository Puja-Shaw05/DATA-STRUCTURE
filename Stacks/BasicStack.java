class Stacks {
   int arr[];
	int top;
	int capacity;
	
	Stacks(int capacity){
		arr = new int[capacity];
		this.capacity = capacity;
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == capacity-1);
	}
	
	public void push(int data) {
		if(isFull())
			throw new StackOverFlowexception("stack overflow");
		else {
			arr[++top] = data;
			System.out.println(data +"pushed into the stack");
		}
		
	}
	
	public void pop() {
		if(isEmpty())
			throw new StackUnderFlowException("stack underflow");
		else {
			int data = arr[top--];
			System.out.println(data + " removed from stack");
		}
	}
	
	public int peek() {
		if(isEmpty())
			throw new StackUnderFlowException("stack underflow");
		else {
			return arr[top];
		}
	}
	
	@Override
	public String toString() {
		String s = "[";
		for(int i=0; i<=top; i++) {
			if(i != top)
				s = s + arr[i] + ",";
			else
				s =s+ arr[i];
		}
		s = s+"]";
		return s;
	}
}

//This is customize axception for  checking stackoverflow
class StackOverFlowexception extends RuntimeException{
     
	StackOverFlowexception(String msg){
		super(msg);
	}
}

//This is customize axception for  checking stackunderflow
class StackUnderFlowException extends RuntimeException{
	StackUnderFlowException(String msg){
     super(msg);
	}
}

//This is the main class for execution
public class StacksMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter teh capacity");
		Stacks stack = new Stacks(sc.nextInt());
		boolean flag = true;
		
		
		while(flag) {
			System.out.println("************ Welcome to Stack ****************");
			System.out.println("1.push()\n2.pop()\n3.peek()\n4.isEmpty()\n5.isFull()\n6.display()\n7.Exit");
			System.out.println("*****************************");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: 
				System.out.println("enter the data : "); int data = sc.nextInt();
				try {
					stack.push(data);
					System.err.println(stack);
				}catch (StackOverFlowexception e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				try {
					stack.pop();
					System.out.println(stack);
				}catch(StackOverFlowexception e) {
					System.err.println(e.getMessage());
				}
				
				break;
			case 3:
				try {
					//stack.peek();
					System.out.println(stack.peek());
				}catch(StackUnderFlowException e) {
					System.err.println(e.getMessage());
				}
				
				break;
			case 4:
			     System.out.println(stack.isEmpty()? "stack empty" : "stcak not empty");
			     break;
			case 5:
				System.out.println(stack.isFull()? "stack is full": "stack is not full");
				break;
			case 6:
				System.out.println(stack);
				break;
			case 7:
				flag = false;
				break;
			default:
				System.out.println("invalid choice");
		}
	}
 }
}
