package assignment1;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Assignment1 
{
    public static void main(String[] args) 
    {
        //linked list
        LinkedList<Integer> list = new LinkedList();
        list.add(10);
        list.add(20);
        list.addFirst(15);
        System.out.println(list.get(0));
        list.add(1,13);
        list.addAll(list);
        list.addLast(100);
        System.out.println(list.clone());//return shellow copy of LinkedList
        System.out.println(list.contains(100));//check number exist or not if exist return true otherwise false
        System.out.println(list.containsAll(list));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf(100));
        System.out.println(list.isEmpty());
        System.out.println(list.get(3));
        list.remove(4);//remove element on index 4
        System.out.println(list.toString());
        System.out.println("List is = "+list);
        list.clear();
        System.out.println("List is = "+list);
        
        //Priority Queue
        PriorityQueue<Integer> queue = new PriorityQueue();
        queue.add(5);
        queue.add(20);
        queue.add(10);
        queue.add(15);
        queue.add(25);
        System.out.println(queue.element());//print 1st element in the queue
        System.out.println("The queue is = "+queue);
        queue.remove();//used for delete element at 1st
        System.out.println("Size of queue is = "+queue.size());
        System.out.println("The queue is = "+queue);
        queue.clear();
        System.out.println("The queue is = "+queue);
        //LinkedHashSet
        LinkedHashSet<Integer> LHS = new LinkedHashSet();
        LHS.add(200);
        LHS.add(100);
        LHS.add(300);
        LHS.add(500);
        LHS.add(400);
        System.out.println(LHS);
        System.out.println(LHS.isEmpty());
        System.out.println(LHS.equals(1)); //not understand
        System.out.println(LHS);
        System.out.println(LHS.size());
        System.out.println(LHS.stream());//not understand
        LHS.remove(300);
        System.out.println("After deletion = "+LHS);
        System.out.println("Check 500 is present = "+LHS.contains(500));
        System.out.print("Print values = ");
        for(int value : LHS)
        {
            System.out.print(value+ ",");
        }
        System.out.println();
         LHS.clear();
        System.out.println("After clear the hash list = "+LHS);
        
        
        
        //TreeSet, store data in tree structure and sorted form 
        TreeSet<Integer> ts = new TreeSet();
        ts.add(70);
        ts.add(50);
        ts.add(55);
        ts.add(65);
        ts.add(60);
        System.out.println("Lowest element = "+ts.first());//return first or lowest element
        System.out.println("Highest element = "+ts.last());//return last or Highest value elemet
        System.out.println("Check 55 is present = "+ts.contains(55));//check elemet exist or not
        System.out.println(ts.floor(70));//not understand
        System.out.println(ts);
        ts.remove(60);//remove specific element
        System.out.println("After remove 60 = "+ts);
        ts.pollFirst();//remove first element
        System.out.println("After deleting first element = "+ts);
        ts.pollLast();//remove last element
        System.out.println("After deleting last element = "+ts);
        System.out.print("Print values = ");
        for (int value : ts)//every iteration TreeSet give next value to variable value
        {
            System.out.print(value+ ",");
        }
        System.out.println();
        ts.clear();
        System.out.println("After clear = "+ts);
    }
    
}
