package gof.dp19.publisher;

import java.util.ArrayList;

import gof.dp19.subscriber.Observer;

public class JobAgent implements Subject<Job> {
	private ArrayList<Job> jobList = new ArrayList<>();
	private ArrayList<Observer<Job>> observers = new ArrayList<>();

	public void addJob(Job job) {
		jobList.add(job);
		notifyObservers(job);
	}

	public void removeJob(Job job) {
		jobList.remove(job);
		notifyObservers(job);
	}

	public void subscribe(Observer<Job> o) {
		System.out.println("New Subscriber: " + o);
		observers.add(o);
	}

	public void unsubscribe(Observer<Job> o) {
		System.out.println(o
				+ " unsubscribed, no further notification will be sent.");
		observers.remove(o);
	}

	private void notifyObservers(Job job) {
		for (Observer<Job> o : observers) {
			System.out.println("Notifying: " + o);
			o.update(job);
		}
	}
}