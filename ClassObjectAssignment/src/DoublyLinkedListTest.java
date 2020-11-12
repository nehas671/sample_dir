class Node{
	int data;
	Node next;
	Node previous;
	
	public Node(int data) {
		this.data = data;
		
	}
}


class DoublyLinkedList{
	
	Node head, tail = null;  
	int count;
			public  void add(int data) {
				Node Newnode = new Node(data);
				
			   if(head==null) {
				   head=tail=Newnode;
				   
				   head.next=null;
				   head.previous=null;
			   }
			   
			   else {
				   tail.next=Newnode;
				 Newnode.previous=tail;
				 tail=Newnode;
			   }
			}
			
			
			public  void insert(int data,int index) {
				
				Node Newnode = new Node(data);
				Node current = head;
				if(index == 0){
				    add(data);
				  }
				  else {
				 for(int j = 0; j < index && current.next != null; j++){
				    current = current.next;
				    
				 }
				    Newnode.next = current;
				    current.previous.next = Newnode;
				    Newnode.previous = current.previous;
				    current.previous = Newnode;
				  
				 }
				  
			}
			
			
			public void display( ) {
				
				Node current=head;
				
				if(head==null)
				{
					System.out.println("list is empty");
					return;
				}
				
				else {
					while(current!=null) {
						System.out.print(current.data+" ");
						current=current.next;
						count++;
						
					}
					 System.out.println("number of nodes :"+count);
				}
				
			}
	
}



public class DoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 DoublyLinkedList d = new DoublyLinkedList();  
	        //Add nodes to the list  
	        d.add(1);  
	        d.add(2);  
	        d.add(3);  
	        d.add(4);  
	        d.add(5);
	        
	        d.insert(25, 3);
	  
	        //Displays the nodes present in the list  
	       d.display();  
	      
	    }  

	}


