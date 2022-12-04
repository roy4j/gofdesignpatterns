package gof.dp19.subscriber;

import gof.dp19.publisher.Job;

public class Dick implements Observer<Job> {

	@Override
	public void update(Job job) {
		if (job.getSalary() > 6999)
			System.out.println("Dick applies for: " + job.getJobTitle());
	}

	@Override
	public String toString() {
		return "Dick";
	}
}
