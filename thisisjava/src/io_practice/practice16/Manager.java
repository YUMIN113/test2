package io_practice.practice16;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Manager {
	
	private final static String KOREAN_FEMALE_WORD = "여";
	
	private final static String KOREAN_MALE_WORD = "남 ";
	
    private List<Member> members = new ArrayList<>();
	
	public void printPersonList() {
		printPersonList(members);
	}

	public void addPerson(Scanner sc) {
		String sex = "";
		String id = "";
		String name = "";
		int age = -1;
		
		System.out.print("ID를 입력하세요 =>");
		id = sc.nextLine();
		System.out.print("이름을 입력하세요 =>");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 =>");
		age = Integer.parseInt(sc.nextLine());
		
		do {	
			System.out.print("성별을 입력하세요(값 : F, M) =>");
			sex = sc.nextLine();
		} while(validation(sex));
		
		if(isSameId(id)) {
			System.out.println();
			System.out.println("인원을 추가할 수 없습니다. 동일한 ID가 존재합니다.");
		} else {
			members.add(new Member(id, name, age, sex));
		}
	}
	
	private boolean validation(String sex) {
		if (sex.equals("F") || sex.equals("M")) {
			return false;
		}
		System.out.println("성별 잘못 입력하셨습니다. 다시 입력해 주세요.");
		return true;
	}
	
	private boolean isSameId(String id) {
		if (findById(id).isPresent()) {
			return true;
		}
		return false;
	}

	public void updatePerson(Scanner sc) {
		System.out.print("ID를 입력하세요 =>");
		String id = sc.nextLine();
		System.out.print("수정 이름을 입력하세요 =>");
		String name = sc.nextLine();
		System.out.print("수정 나이를 입력하세요 =>");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("수정 성별을 입력하세요(값 : F, M) =>");
		String sex = sc.nextLine();
		
		Optional<Member> opMember = findById(id);
		
		if (!opMember.isPresent()) {
			System.out.println("회원이 존재하지 않습니다.");
			return;
		}
		
		if (opMember.isPresent()) {
			Member member = opMember.get();
			member.setName(name);
			member.setAge(age);
			member.setSex(sex);
		}
	}
	
	private Optional<Member> findById(String id) {
		return members
		.stream()
		.filter(it -> it.getId().equals(id))
		.findFirst();
	}
	
	public void deletePerson(Scanner sc) {
		System.out.print("ID를 입력하세요 =>");
		String id = sc.nextLine();
		
		Optional<Member> opMember = findById(id);
		
		if (!opMember.isPresent()) {
			System.out.println("회원이 존재하지 않습니다.");
			return;
		}
		
		if (opMember.isPresent()) {
			Member member = opMember.get();
			members.remove(member);
		}
		
	}
	
	public void selectPersonBySex(Scanner sc) {
		System.out.print("성별을 입력하세요(값 : F, M) =>");
		String sex = sc.nextLine().toUpperCase();

		List<Member> targetMembers = findBySex(sex);
		printPersonList(targetMembers);
	}

	private List<Member> findBySex(String sex) {
		return members
				.stream()
				.filter(it -> it.getSex().equals(sex))
				.toList();
	}
	
	private void printPersonList(List<Member> targetMembers) {
		int num = 1;
		for(Member member : targetMembers) {
			System.out.print(num + ".");
			System.out.print("아이디=" + member.getId() + " | ");
			System.out.print("이름=" + member.getName() + " | ");
			System.out.print("나이=" + member.getAge() + " | ");
			System.out.println(toKorean(member.getSex()));
			num++;
		}	
	}
	
	private String toKorean(String sex) {
		if(sex.equals("F")) {
			return KOREAN_FEMALE_WORD;
		}
		return KOREAN_MALE_WORD;
	}
	
	public void selectPersonBetweenAge(Scanner sc) {
		System.out.print("시작 나이를 입력하세요 =>");
		int minAge = Integer.parseInt(sc.nextLine());
		System.out.print("종료 나이를 입력하세요 =>");
		int maxAge = Integer.parseInt(sc.nextLine());
		
		List<Member> targetMembers = findBetweenAge(minAge, maxAge);
		printPersonList(targetMembers);
		
	}
	
	private List<Member> findBetweenAge(int minAge, int maxAge) {
		return members
				.stream()
				.filter(it -> it.getAge() >= minAge)
				.filter(it -> it.getAge() <= maxAge)
				.toList();
	}
}
