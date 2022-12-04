package gof.dp09;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file 1");
        File file2 = new File("file 2");
        File file3 = new File("file 3");
        File file4 = new File("file 4");

        Folder folder1 = new Folder("Root");
        Folder folder2 = new Folder("First");
        Folder folder3 = new Folder("Second");
        Folder folder4 = new Folder("Third");

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);
        folder1.add(file1);

        folder2.add(file2);
        folder2.add(file4);

        folder3.add(file3);

        System.out.println(folder1);
    }
}