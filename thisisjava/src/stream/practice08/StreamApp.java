package stream.practice08;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamApp {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("아메리카노");
		set.add("마키아또");
		set.add("카푸치노");

		System.out.println("\n===== Stream =====");

		Stream<String> stream1 = set.stream();
		stream1.forEach(a -> System.out.println(a));

		System.out.println("\n===== Exception =====");
		// - stream은 1번 사용하면 재사용 불가. 새로 생성해야 한다.

		System.out.println("\n----- Exception -----");
		// - Exception 발생
		// - java.lang.IllegalStateException: stream has already been operated upon or closed
		//stream1.forEach(a -> System.out.println(a)); // Exception

		System.out.println("\n----- Solution -----");
		// # 해결방안
		// - 스트림을 새로 생성한다.
		
		//Stream<String> stream2 = set.stream();
		//stream2.forEach(a -> System.out.println(a));

	}

}
