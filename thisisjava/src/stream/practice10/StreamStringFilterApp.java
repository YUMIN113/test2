package stream.practice10;

import java.util.Arrays;
import java.util.List;

public class StreamStringFilterApp {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Paige", "James", "Smith", "Tom", "Victoria");


		// - "a" 가 포함되어 있는 문자열 출력

		list.stream().filter(it -> it.contains("a")).forEach(it -> System.out.print(it + " "));
		System.out.println();

		// - 시작문자 : P, 종료문자 : e, 길이 : 5이상 문자열 출력
		// - 여러 조건은 && 로 연결
		
		list.stream().filter(it -> it.startsWith("P") && it.endsWith("e") && it.length() >= 5).forEach(System.out::println);

	}

}