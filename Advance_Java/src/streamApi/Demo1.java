package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(10,30,50,40,90);
		
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		};
		Consumer<Integer> c1 = (Integer t) -> {
				// TODO Auto-generated method stub
				System.out.println(t);
			};
		
		l.forEach(c);
		
		l.forEach(n -> System.out.println(n));
		
		l.forEach(System.out::println);
		
	}

}
