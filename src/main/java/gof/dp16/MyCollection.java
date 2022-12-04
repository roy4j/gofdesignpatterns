package gof.dp16;

public interface MyCollection<E> {
	public int size();
	public void add(E e);
	public void remove(int i);
	public E get(int i);
	MyIterator<E> iterator();
}