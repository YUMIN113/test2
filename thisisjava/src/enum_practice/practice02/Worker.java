package enum_practice.practice02;

public class Worker {

	private String name;
	private int career;
	private Job job;
	
	public Worker(String name, int career, Job job) {
		this.name = name;
		this.career = career;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
	
	public void printInfo() {
		System.out.println("이름=" + name + " | " + "커리어=" + career + "(년)" + " | " + "직업=" + job);
	}
	
}
