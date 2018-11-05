
import java.util.*;
public class Collections {
    public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		ArrayList<String> array = new ArrayList<>();
		Set<String> treeSet = new TreeSet<>();
		long time = System.nanoTime();
		
		//LinkedList Add
		for(int i = 0; i < 100; i++)
		{
			list.add("lol" + i);
		}
		System.out.print("Add LinkedList: ");
		time = System.nanoTime() - time;
		System.out.println(time);
		time = System.nanoTime();

		//LinkedList Remove
		for(int i = 0; i < 100; i++)
		{
			list.remove("lol" + i);
		}
		System.out.print("Remove LinkedList: ");
		time = System.nanoTime() - time;
		System.out.println(time);
		time = System.nanoTime();

		//ArrayList Add
		for(int i = 0; i < 100; i++)
		{
			array.add("lol" + i);
		}
		System.out.print("Add ArrayList: ");
		time = System.nanoTime() - time;
		System.out.println(time);
		time = System.nanoTime();

		//ArrayList Remove
		for(int i = 0; i < 1000; i++)
		{
			array.remove("lol" + i);
		}
		System.out.print("Remove ArrayList: ");
		time = System.nanoTime() - time;
		System.out.println(time);
		time = System.nanoTime();

		//TReeSet Add
		for(int i = 0; i < 100; i++)
		{
			treeSet.add("lol" + i);
		}
		System.out.print("Add TReeSet: ");
		time = System.nanoTime() - time;
		System.out.println(time);
		time = System.nanoTime();
		
		//TReeSet Remove
		for(int i = 0; i < 100; i++)
		{
			treeSet.remove("lol" + i);
		}
		System.out.print("Remove TReeSet: ");
		time = System.nanoTime() - time;
		System.out.println(time);

    }
}
