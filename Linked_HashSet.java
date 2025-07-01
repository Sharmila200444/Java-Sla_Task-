package Task;
import java.util.*;
public class Linked_HashSet {
	
	public static void LinkedExample(Set<String>l,Set<String> l1) {
		System.out.println(l);
		l.add("Spring Boot");
		System.out.println(l.contains("Java"));
		System.out.println(l.addAll(l1));
//		l.clear();
		System.out.println(l.isEmpty());
		System.out.println(l.equals(l1));

	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		
		Set<String> l=new LinkedHashSet<>();
		for(int i=0; i<size;i++) {
			l.add(s.next());
		}
		int size1=s.nextInt();
		Set<String> l1=new LinkedHashSet<>();
		for(int i=0; i<size1;i++) {
			l1.add(s.next());
		}
		LinkedExample(l,l1);
		
		// TODO Auto-generated method stub

	}

}
