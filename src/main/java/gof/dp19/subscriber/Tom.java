package gof.dp19.subscriber;

import gof.dp19.publisher.Job;

public class Tom implements Observer<Job> {

	@Override
	public void update(Job job) {
		if (job.getSalary() > 4999)
			System.out.println("Tom applies for: " + job.getJobTitle());
	}

	@Override
	public String toString() {
		return "Tom";
	}
}