package gof.dp19.publisher;

public class Job {
	private String jobTitle;
	private double salary;

	public Job(String jobTitle, double salary) {
		super();
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public double getSalary() {
		return salary;
	}
}