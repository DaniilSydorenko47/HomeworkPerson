package HW23;


public class SingleWayOneListMain {
    public static void main(String[] args) {
        SingleWayOneList<Integer> singleWayOneList = new SingleWayOneList<>();
        singleWayOneList.add(1);
        singleWayOneList.add(2);
        singleWayOneList.add(3);
        singleWayOneList.add(4);
        singleWayOneList.add(5);
        singleWayOneList.add(6);
        singleWayOneList.removeLast();
        for (Integer elem: singleWayOneList) {
            System.out.println(elem);
        }



    }
}
