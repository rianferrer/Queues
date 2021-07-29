import java.util.Scanner;

public class TestFerrerQueues {
	
	public static void main(String args[]) {
		
	
		Scanner s = new Scanner(System.in); 
        System.out.println("Welcome to Rian's Queue Operation Program!\n");
        System.out.print("Enter your preferred queue size: ");
        int a = s.nextInt();
        
        //FERRER, MARION CARYL R.
        //2ITF
       
        FerrerQueues<Integer> que = new FerrerQueues<Integer>(a);       
              
        char ch;
        do {
        	System.out.println("\nQueue Operations: \n"
            		+ "A. Queue size \n" 
            		+ "B. clear \n"
            		+ "C. isEmpty \n"
            		+ "D. isFull \n"
            		+ "E. enqueue \n"
            		+ "F. dequeue \n"
            		+ "G. peek \n"
            		+ "H. display \n");
            System.out.print("Pick a letter of your chosen operation: ");
            char x = s.next().charAt(0);
            
            switch(x)
            {
            case 'A':
    		case 'a': System.out.println("Queue size: " + que.size());
    			break;
    			
    		case 'B':
            case 'b'://clear
                que.clear();
                break;
    		
            case 'C':
    		case 'c': System.out.println("Queue: " + que.isEmpty());
                break;
                
    		case 'D':
    		case 'd': System.out.println("Queue: " + que.isFull());
                break;
                
            case 'E':
    		case 'e': System.out.println("Enter a number to enqueue: ");
                try
                {
                	que.enqueue(s.nextInt());
                }
                catch(Exception e)
                {
                    System.out.println("Error: " + e.getMessage());
                }                         
                break;      
                
    		case 'F':
            case 'f':  
                try
                {
                    System.out.println(que.dequeue());
                }
                catch(Exception e)
                {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
                
            case 'G':
            case 'g': 
                try
                {
                    System.out.println("Front var: " + que.peek());
                }
                catch(Exception e)
                {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
                
              //FERRER, MARION CARYL R.
              //2ITF
                
            }
            
            que.display();            
            System.out.println("\nAnother operation to perform? (Y/N)");
            ch = s.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');
    s.close();
    }
}