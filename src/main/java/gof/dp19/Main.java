package gof.dp19;

import gof.dp19.publisher.Job;
import gof.dp19.publisher.JobAgent;
import gof.dp19.subscriber.Dick;
import gof.dp19.subscriber.Harry;
import gof.dp19.subscriber.Tom;

public class Main {
	public static void main(String[] args) {
		JobAgent jobAgent = new JobAgent();

		Tom t = new Tom();
		Dick d = new Dick();
		Harry h = new Harry();

		jobAgent.subscribe(t);
		jobAgent.subscribe(d);
		jobAgent.subscribe(h);

		jobAgent.addJob(new Job("Software Engineer", 5000));
		jobAgent.addJob(new Job("Team Lead", 7000));

		jobAgent.unsubscribe(t);

		jobAgent.addJob(new Job("Project Manager", 10000));

	}
}