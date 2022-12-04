package gof.dp19.subscriber;

public interface Observer<E> {
	public void update(E e);
}