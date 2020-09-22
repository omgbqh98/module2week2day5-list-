public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();

        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(6);

        System.out.println("phan tu 1: "+listInteger.get(1));
        System.out.println("phan tu 3: "+listInteger.get(3));
        System.out.println("phan tu 0: "+listInteger.get(0));
        System.out.println("phan tu 2: " + listInteger.get(2));

        listInteger.get(4);
        System.out.println("phan tu 6: " + listInteger.get(4));
//        listInteger.get(-1);
//        System.out.println("phan tu -1 :" + listInteger.get(-1));
    }
}
