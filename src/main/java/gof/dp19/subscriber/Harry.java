package gof.dp19.subscriber;

import gof.dp19.publisher.Job;

public class Harry implements Observer<Job> {

	@Override
	public void update(Job job) {
		if (job.getSalary() > 9999)
			System.out
					.println("Harry applies for: " + job.getJobTitle());
	}

	@Override
	public String toString() {
		return "Harry";
	}
}