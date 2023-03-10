public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        System.out.println(list.size());
        list.addLast(10);
        System.out.println(list.size());
        list.addLast(20);
        System.out.println(list.size());
        list.addLast(30);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.size());
        list.removeLast();
    }
}