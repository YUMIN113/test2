package stream.practice08;

import java.util.stream.Stream;

public class StreamIntegerApp {

	public static void main(String[] args) {

		System.out.println("===== Stream.iterate() =====");

		System.out.println("\n----- iterate(a, b) -----");
		// Syntax
		// - 첫번째 인자 : 초기 값
		// - 두번째 : 값이 어떻게 변경될지를 나타내는 람다 함수

		// 초기값이 30, 값이 2씩 증가하는 숫자를 5개 생성
		Stream<Integer> stream = Stream.iterate(30, n -> n + 2).limit(5);
		stream.forEach(e -> System.out.print(e + " "));

		System.out.println("\n\n----- iterate(a, b, c) -----");
		// Syntax
		// - 첫번째 인자 : 초기 값
		// - 두번째 : 종료 조건을 나타내는 람다 함수
		// - 세번째 : 값이 어떻게 변경될지를 나타내는 람다 함수

		Stream<Integer> stream2 = Stream.iterate(0, n -> n < 10, n -> n + 1);
		stream2.forEach(e -> System.out.print(e + " "));

	}

}
