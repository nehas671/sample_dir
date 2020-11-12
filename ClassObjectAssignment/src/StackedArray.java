
public class StackedArray {

	int arr[] = new int[10];
	int top=0;
	
	public void push(int ele) {
		
		arr[top]=ele;
		top++;
		System.out.println("pushed:"+ele);
		//return arr;
		
	}
	
	public int pop() {
		
		top--;
		System.out.println("poped:"+arr[top]);
		return arr[top];
		
	}
	
	@Override
	public String toString() {
		
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<top;i++)
			{
				sb.append(arr[i]);
				
				if(i<top-1)
				{
					sb.append(",");
				}
			}
		return sb.toString();
	}
	
	

	
}
