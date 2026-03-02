package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(40,10,30,50,75,90);
		
//		Stream<Integer> s = l.stream().filter(n -> n>50);
		Stream<Integer> s = l.stream().filter(n -> n%2==0).sorted();
		
//		s.forEach(System.out::println);
//		s.forEach(System.out::println); // we cannot consume 2 or more times
//		l.forEach(System.out::println);
//		l.forEach(System.out::println);
		
		System.out.println(l.stream().filter(n -> n%2==0).count());
		
		Stream<String> s1 = l.stream().map(n -> "Number "+n);
		List<String> list = l.stream().map(n -> "Number "+n).collect(Collectors.toList());
//		s1.forEach(System.out::println);
		list.forEach(System.out::println);
	}

}
