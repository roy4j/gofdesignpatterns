package gof.dp16;

import java.util.Arrays;

public class MyList implements MyCollection<Person> {
    Object[] personList;
    private int size = 0;

    public MyList() {
        personList = new Object[0];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Person p) {
        personList = Arrays.copyOf(personList, personList.length + 1);
        personList[size++] = p;
    }

    @Override
    public void remove(int i) {
        int numMoved = personList.length - i - 1;
        if (numMoved > 0)
            System.arraycopy(personList, i + 1, personList, i, numMoved);
        personList[--size] = null;
    }

    @Override
    public Person get(int i) {
        return (Person) personList[i];
    }

    @Override
    public MyIterator<Person> iterator() {
        return new MyIterator<Person>() {
            int cursor = 0;

            @Override
            public boolean hasNext() {
                if (personList[cursor] != null)
                    return true;
                return false;
            }

            @Override
            public Person next() {
                if (personList[cursor] != null)
                    return (Person) personList[cursor++];
                return null;
            }
        };
    }

    @Override
    public String toString() {
        String s = "[";
        for (Object o : personList) {
            if (o != null)
                s += o + ", ";
        }
        s = s.substring(0, s.length() - 2) + "]";
        return s;
    }
}