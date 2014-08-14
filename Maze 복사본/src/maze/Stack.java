package maze;

public class Stack {

	private Coordinate[] myStack = new Coordinate[this.capacity];
	private int capacity = 64;
	private int top=0;
	
	public int push(Coordinate position){
		
		if(this.isFull()){
			System.out.println("Error : Stack overflow");
			return -1;
		}
		else{
			this.myStack[this.top]=position;
			this.top++;
			return 0;
		}
	}
	
	public Coordinate pop(){
		
		if(this.isEmpty())
		{
			System.out.println("Error : Stack underflow");
			return null;
		}
		else
		{
			Coordinate target = this.myStack[--this.top];
			return target;
		}
		
	}
	
	public boolean isFull(){
		if(this.capacity==this.top)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty(){
		if(this.top==0)
			return true;
		else
			return false;
	}

	public Coordinate[] getMyStack(){
		return myStack;
	}
	
	public int getTop(){
		return top;
	}

}
