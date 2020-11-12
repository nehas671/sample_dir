
public class QueueArray {

	int arr[] = new int[10];
	int front=-1,rear=-1;
	
	public void push(int ele) {
		rear++;
		arr[rear]=ele;
		System.out.println("pushed:"+ele);
		//return arr;
		
	}
	
	public int pop() {
		
		front=front+1;
		System.out.println("poped:"+arr[front]);
		return arr[front];
		
	}
	
	@Override
	public String toString() {
		
			StringBuilder sb = new StringBuilder();
			for(int i=front+1;i<=rear;i++)
			{
				sb.append(arr[i]);
				
				if(i<rear)
				{
					sb.append(",");
				}
			}
		return sb.toString();
	}
	
	

}
