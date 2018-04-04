package Concepts;

public class Stack {
	int top = -1;
	int size = 10;
	int[] arr ;
	
		Stack(){
			this.arr = new int[size];
		}
		Stack(int size){
			this.arr = new int[size];
			this.size = size;
		}
	
		void push(int x){
			System.out.println("Top: " + top + " Size :" + size);
			if(top + 1 < size){
				top++;
				arr[top] = x;
			}else{
				System.out.println("Stack is Full");
			}
			
		}
		
		int pop(){
			if(top == -1){
				System.out.println("Stack is Empty");
				return -1;
			}
			else{
				int value = arr[top];
				top--;
				System.out.println("Pop: " + value);
				return value;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st = new Stack();
		st.push(0);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		st.push(9);
		st.push(10);
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
	}

}
