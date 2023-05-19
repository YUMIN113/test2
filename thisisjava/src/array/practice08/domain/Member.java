package array.practice08.domain;

public class Member {

	private String memberId;
	private String memberName;
	private String memberRating;
	private int memberPoint;
	
	public Member(String memberId, String memberName, String memberRating, int memberPoint) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberRating = memberRating;
		this.memberPoint = memberPoint;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberRating() {
		return memberRating;
	}

	public void setMemberRating(String memberRating) {
		this.memberRating = memberRating;
	}

	public int getMemberPoint() {
		return memberPoint;
	}

	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
	
}
