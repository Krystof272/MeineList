public class Main {
    public static void main(String[] args) {
        MujSpojovySeznam seznam = new MujSpojovySeznam();
        seznam.addFirst(3);
        seznam.addFirst(4);
        seznam.addFirst(1);
        seznam.addFirst(1);
        seznam.addFirst(2);
        seznam.addToEnd(30);

        //System.out.println(seznam.getIndex(79));
        System.out.println(seznam);
        System.out.println(seznam.indexOf(1));
        System.out.println(seznam.contains(1));
//        System.out.println(seznam.deleteLast());
//        seznam.addToEnd(70);
//        System.out.println(seznam);
        //System.out.println(seznam.count());
//        System.out.println(seznam);
//        System.out.println(seznam.deleteFirst());
//        System.out.println(seznam);
//        System.out.println(seznam.isEmpty());
    }
}
