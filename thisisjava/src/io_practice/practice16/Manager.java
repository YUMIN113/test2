package io_practice.practice16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	
	List<Member> members = new ArrayList<>();
	
	public void printPersonList() {
		int num = 1;
		for(Member member : members) {
			System.out.print(num + ".");
			System.out.print("아이디=" + member.getId() + " | ");
			System.out.print("이름=" + member.getName() + " | ");
			System.out.print("나이=" + member.getAge() + " | ");
			System.out.println(toKorean(member.getSex()));
			num++;
		}
		
	}
	
	private String toKorean(String sex) {
		String koreanStr = " ";
		
		if(sex == "F") {
			koreanStr = "여";
		} else {
			koreanStr = "남";
		}
		return koreanStr;
	}

	public void addPerson(Scanner sc) {
		Member member = createMember(sc);
		if(isSameId(member.getId())) {
			System.out.println("인원을 추가할 수 없습니다. 동일한 ID가 존재합니다.");
		} else {
			members.add(member);
		}
	}
	
	private Member createMember(Scanner sc) {
		System.out.print("ID를 입력하세요 =>");
		String id = sc.nextLine();
		System.out.print("이름을 입력하세요 =>");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 =>");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("성별을 입력하세요(값 : F, M) =>");
		String sex = sc.nextLine();
		
		Member member = new Member(id, name, age, sex);
		return member;
	}
	
	private boolean isSameId(String id) {
		boolean isSameId = false;
		for(Member member : members) {
			if(id == member.getId()) {
				isSameId = true;
			}
		}
		return isSameId;
	}

}
