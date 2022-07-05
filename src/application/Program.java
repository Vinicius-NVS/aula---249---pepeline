package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2 , 3, 6, 7, 10);
		System.out.println(Arrays.toString(list.toArray())); 
		
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("sum = " + sum);
		
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
	}

}
