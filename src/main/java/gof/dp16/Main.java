package gof.dp16;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(new Person("1"));
        list.add(new Person("2"));
        list.add(new Person("3"));
        list.add(new Person("4"));
        list.add(new Person("5"));
        list.add(new Person("6"));
        list.add(new Person("7"));

        System.out.println(list);
        System.out.println("list.size()=" + list.size());
        System.out.println("list.get(4).getName()=" + list.get(4).getName());

        list.remove(4);

        System.out.println(list);
        System.out.println("list.size()=" + list.size());
        System.out.println("list.get(4).getName()=" + list.get(4).getName());

        MyIterator<Person> itr = (MyIterator<Person>) list.iterator();
        while (itr.hasNext()) {
            Person p = itr.next();
            System.out.println(p.getName());
        }
    }
}