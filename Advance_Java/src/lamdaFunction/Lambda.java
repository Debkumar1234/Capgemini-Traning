package lamdaFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

interface TriFuction<T, U, V, R> {
	R apply(T t, U u, V v);
}

interface A<T>{
	void show(T t);
}

public class Lambda {
	public static void show(String msg) {
		msg = msg.toLowerCase();
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Double> f = (n) -> Math.sqrt(n);
		System.out.println(f.apply(4));
		
		Function<Integer, Double> f2 = Math::sqrt;
		System.out.println(f.apply(64));
		
		BiFunction<Integer, Integer, Integer> mul = (n1, n2) -> Demo.multiply(n1, n2);
//		BiFunction<Integer, Integer, Integer> mul = (n1, n2) -> n1*n2;
//		BiFunction<Integer, Integer, Integer> mul = Demo::multiply;
		System.out.println(mul.apply(12, 20));
		TriFuction<Integer, Integer, Integer, Integer> mul1 = (a, b, c) -> a*b*c;
		System.out.println(mul1.apply(12, 12, 12));
		
		Demo d = new Demo();
		BiFunction<Integer, Integer, Integer> sum = (n1, n2) -> d.sum(n1, n2);
		BiFunction<Integer, Integer, Integer> sum1 = d::sum;
		System.out.println(sum.apply(12, 20));
		System.out.println(sum1.apply(12, 20));
		
//		A<String> print = (msg) -> Lambda.show(msg);
		A<String> print = Lambda::show;
		print.show("Hello");
		
		A<String> print1 = (msg) -> System.out.println(msg);
		print.show("Hello");
	}

}

class Demo {
	public static int multiply(int n1, int n2) {
		return n1*n2;
	}
	
	public int sum(int n1, int n2) {
		return n1+n2;
	}
}
