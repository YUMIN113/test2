package collection_practice.vector_practice.copy;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
//		ArrayList 로 생성할 경우, 동기화 되어 있지 않기 때문에 2000개 모두 생성되지 않거나 오류 발생
		List<Board> list = new Vector<>();
		
		Thread threadA = new Thread() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		Thread threadB = new Thread() {
			
			@Override
			public void run() {
				for(int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e){
			
		}
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
	}

}
