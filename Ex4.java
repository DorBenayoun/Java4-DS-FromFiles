import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex4 {
	
	public static BinaryTree getFamilyTree(String path) {
		try {
					File file = new File(path);
					Scanner reader = new Scanner(file);
					int i = 0;
					
					while (reader.hasNextLine()) {
						String data = reader.nextLine();
						System.out.println(data);

					}
					reader.close();
				} catch (FileNotFoundException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
		return null;
		
	}
	
	public static LinkedList[] ZigZagSplit(LinkedList lst) {
		LinkedList one = new LinkedList();
		LinkedList two = new LinkedList();
		
		Node runner = lst.getHead();
		
		for (int i = 0; i < lst.getSize() && runner != null; i++) {
			one.AddLast(runner.getData());
			if(runner.getNext() == null) {
				break;
			}
			two.AddLast(runner.getNext().getData());
			runner = runner.getNext().getNext();
		}
		
		LinkedList[] arr  = {one, two};
		return arr;
	}
	
	
	public static void main(String[] args) {
	
		//System.out.println(getFamilyTree("/Users/dorbenayoun/Downloads/smurfs.txt"));
		
		LinkedList lst = new LinkedList();
		lst.AddLast("-2");
		lst.AddLast("3");
		lst.AddLast("100");
		lst.AddLast("9");
		lst.AddLast("-30");
		lst.AddLast("11");
		
		System.out.println(Arrays.toString(ZigZagSplit(lst)));
	}
	
}
