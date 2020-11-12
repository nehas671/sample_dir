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
			
			
			public Node insert(int data,int index) {
				
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
				return current;
				  
			}
			
			 public Node deleteAtIndex(int index){
				  
				    Node current = head;
				    //remove at the start
				  
				    // remove at last
				   
				      for(int j = 0; j < index && current.next != null; j++){
				        current = current.next;
				      }
				      current.previous.next = current.next;
				      current.next.previous = current.previous;
				     
				   
				    return current;
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
						
						
					}
					
				}
				
			}
			
				public void count() {
				
				Node current=head;
				
				if(head==null)
				{
					System.out.println("list is empty");
					return;
				}
				
				else {
					while(current!=null) {
						
						current=current.next;
						count++;
						
					}
					System.out.println("Number of nodes in list:"+count);
					
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
	        System.out.println("elements in list");
	        d.display();  
	        System.out.println();
	        System.out.println("element inserted");
	        d.insert(25, 3);
	        d.display();  
	        System.out.println();
	        System.out.println("element deleted");
	        d.deleteAtIndex(4);
	        d.display(); 
	        System.out.println();
	        d.count();
	        //Displays the nodes present in the list  
	      // d.display(); 
	        
	      
	    }  

	}


