import java.util.LinkedList;
import java.util.Scanner;
class DoublyLinkedList
{
	private LinkedList<Integer> list;
	public DoublyLinkedList()
	{
		list = new LinkedList<>(); 
	}
	public void addAtBegin(int val)
	{
		list.addFirst(val);
	}
	public void addAfterNode(int key,int val)
	{
		int index = list.indexOf(key);
		if(index == -1)
		{
			System.out.println("Node is not found!");
		}
		list.add(index + 1 , val);
	}
	public void addBeforeNode(int key,int val)
	{
		int index = list.indexOf(key);
        	if (index == -1) 
        	{
            		System.out.println("Node is not found!");
            		return;
        	}
        	list.add(index, val);
	}
	public void addAtEnd(int val)
	{
		 list.addLast(val);
	}
	public void deleteAtBegin(int val)
	{
		if (!list.isEmpty()) 
        	{
            		list.removeFirst();
        	}
	}
	public void deleteAfterNode(int key,int val)
	{
		int index = list.indexOf(key);
        	if (index == -1 || index + 1 >= list.size()) 
        	{
            		System.out.println("No node to delete after the given key!");
            		return;
        	}
        	list.remove(index + 1);
    	}
	public void deleteBeforeNode(int key,int val)
	{
		int index = list.indexOf(key);
        	if (index <= 0) 
        	{
            		System.out.println("No node to delete before the given key!");
            		return;
        	}
        	list.remove(index - 1);
    	}
	public void deleteAtEnd(int val)
	{
        	if (!list.isEmpty()) 
        	{
            		list.removeLast();
        	}
	}
	public void display()
	{
	        if (list.isEmpty()) 
        	{
            		System.out.println("List is empty.");
        	} 
        	else 
        	{
            		for (int val : list) 
            		{
                		System.out.print(val + " -> ");
            		}
            		System.out.println("(head)"); 
        	}
        }
	
public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
  	    DoublyLinkedList obj = new DoublyLinkedList();
	      while (true) 
	      {
            System.out.println("\nMenu:");
            System.out.println("1. Add at begin");
            System.out.println("2. Add after node");
            System.out.println("3. Add before node");
            System.out.println("4. Add at end");
            System.out.println("5. Delete at begin");
            System.out.println("6. Delete after node");
            System.out.println("7. Delete before node");
            System.out.println("8. Delete at end");
            System.out.println("9. Display");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            int val, key;

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter value: ");
                    val = scanner.nextInt();
                    obj.addAtBegin(val);
                    break;
                case 2:
                    System.out.print("Enter key and value: ");
                    key = scanner.nextInt();
                    val = scanner.nextInt();
                    obj.addAfterNode(key, val);
                    break;
                case 3:
                    System.out.print("Enter key and value: ");
                    key = scanner.nextInt();
                    val = scanner.nextInt();
                    obj.addBeforeNode(key, val);
                    break;
                case 4:
                    System.out.print("Enter value: ");
                    val = scanner.nextInt();
                    obj.addAtEnd(val);
                    break;
                case 5:
                    System.out.print("Enter value: ");
                    val = scanner.nextInt();
                    obj.deleteAtBegin(val);
                    break;
                case 6:
                    System.out.print("Enter key and value: ");
                    key = scanner.nextInt();
                    val = scanner.nextInt();
                    obj.deleteAfterNode(key,val);
                    break;
                case 7:
                    System.out.print("Enter key and value: ");
                    key = scanner.nextInt();
                    val = scanner.nextInt();
                    obj.deleteBeforeNode(key,val);
                    break;
                case 8:
                    System.out.print("Enter value: ");
                    val = scanner.nextInt();
                    obj.deleteAtEnd(val);
                    break;
                case 9:
                    obj.display();
                    break;
                case 10:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}	
Menu:
1. Add at begin
2. Add after node
3. Add before node
4. Add at end
5. Delete at begin
6. Delete after node
7. Delete before node
8. Delete at end
9. Display
10. Exit
Enter your choice: 1
Enter value: 5

Menu:
1. Add at begin
2. Add after node
3. Add before node
4. Add at end
5. Delete at begin
6. Delete after node
7. Delete before node
8. Delete at end
9. Display
10. Exit
Enter your choice: 1
Enter value: 10

Menu:
1. Add at begin
2. Add after node
3. Add before node
4. Add at end
5. Delete at begin
6. Delete after node
7. Delete before node
8. Delete at end
9. Display
10. Exit
Enter your choice: 2
Enter key and value: 5 15

Menu:
1. Add at begin
2. Add after node
3. Add before node
4. Add at end
5. Delete at begin
6. Delete after node
7. Delete before node
8. Delete at end
9. Display
10. Exit
Enter your choice: 9
10 -> 5 -> 15 -> (head)

Menu:
1. Add at begin
2. Add after node
3. Add before node
4. Add at end
5. Delete at begin
6. Delete after node
7. Delete before node
8. Delete at end
9. Display
10. Exit
Enter your choice: 7
Enter key and value: 5 10

Menu:
1. Add at begin
2. Add after node
3. Add before node
4. Add at end
5. Delete at begin
6. Delete after node
7. Delete before node
8. Delete at end
9. Display
10. Exit
Enter your choice: 9
5 -> 15 -> (head)

Menu:
1. Add at begin
2. Add after node
3. Add before node
4. Add at end
5. Delete at begin
6. Delete after node
7. Delete before node
8. Delete at end
9. Display
10. Exit

