package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTheList {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,9,3,4,5,6);
		List<Integer> list2 = Arrays.asList(6,8,4,5,7,9,2,10);
		
		List<Integer> mergeList = Stream.concat(list1.stream(), list2.stream())
									.collect(Collectors.toList());
		System.out.println("Merga List : " + mergeList);
		
		List<Integer> uniqueList = mergeList.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println("Unique Lsit : " + uniqueList);
		
	}
	
}
