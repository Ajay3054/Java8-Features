package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "world", "java", "stream");
		List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println(wordLengths);

		Consumer<String> consumer = (t) -> System.out.println(t);
		for (String s1 : words) {
			consumer.accept(s1);
		}

		List<String> filteredWords = words.stream().filter(s -> s.startsWith("h")).collect(Collectors.toList());
		System.out.println(filteredWords);

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");

		map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));

		List<String> matchData = Arrays.asList("Match_1", "Match_2", "Match_3", "Match_4", "Match_5");
		List<Integer> numbers = Arrays.asList(254, 54, 8, 96, 7, 52, 69, 4, 202, 6, 5, 4, 62, 54, 69, 9, 30);

		String filterList = matchData.stream().filter(m -> m.contains("3")).findFirst().orElse("Data not Found..!");

		// Sum of number
		Optional<Integer> sum = numbers.stream()
								.reduce((a, b) -> a + b);

		// Avg of number
		double avarage = numbers.stream().mapToInt(avg -> avg)
						.average().getAsDouble();

		// Number Square Avg
		double numSqureAvg = numbers.stream().map(e -> e * e).filter(e -> e > 100)
							.filter(e -> e >= 9000)
							.mapToInt(e -> e).average().getAsDouble();

		// Odd Numbers
		List<Integer> evenNumbers = numbers.stream().filter(e -> e % 2 == 0)
									.collect(Collectors.toList());

		// Even Numbers
		List<Integer> oddNumbers = numbers.stream().filter(e -> e % 2 != 0)
								  .collect(Collectors.toList());

		// Number start With
		List<Integer> numberStartWith = numbers.stream().map(e -> String.valueOf(e))
										.filter(e -> e.startsWith("2"))
										.map(Integer::valueOf).collect(Collectors.toList());

		// find the duplicate number
		Set<Integer> duplicateNumbers_1 = numbers.stream().filter(e -> Collections.frequency(numbers, e) > 1)
										 .collect(Collectors.toSet());

		// find the duplicate number
		Set<Integer> dupNum = new HashSet<Integer>();
		Set<Integer> duplicateNumbers_2 = numbers.stream().filter(e -> !dupNum.add(e))
									   	 .collect(Collectors.toSet());

		System.out.println(filterList);
		System.out.println("Sum of all these Numbers : " + sum.get());
		System.out.println("Avg of all these Numbers : " + avarage);
		System.out.println("Avg of all these Numbers Squre : " + numSqureAvg);
		System.out.println("Even Numbers : " + evenNumbers + "\n" + "Odd Numbers : " + oddNumbers);
		System.out.println("Number Start With 2 : " + numberStartWith);
		System.out.println("First Way To Find Duplicate Numbers : " + duplicateNumbers_1);
		System.out.println("Second Way To Find Duplicate Numbers : " + duplicateNumbers_2);

	}

}
