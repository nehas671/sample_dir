
public class StackedArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackedArray obj = new StackedArray();
		obj.push(5);
		
		obj.push(10);
		
		obj.push(35);
		
		obj.push(20);
		obj.pop();
		
		obj.push(10);
		obj.pop();
		
		
		
//		for(int y:x)
//		{
//			System.out.println(y);
//		}
		System.out.println("Elements in stack"+obj);
		
	}

}
