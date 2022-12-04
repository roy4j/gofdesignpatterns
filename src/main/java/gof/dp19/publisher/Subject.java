package gof.dp19.publisher;

import gof.dp19.subscriber.Observer;

public interface Subject<E> {
	public void subscribe(Observer<E> o);
	public void unsubscribe(Observer<E> o);
}