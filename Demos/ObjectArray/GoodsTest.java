package ObjectArray;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001", "aaa", 1.1, 2);
        Goods g2 = new Goods("002", "bbb", 2.2, 3);
        Goods g3 = new Goods("003", "ccc", 3.3, 4);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0;i<arr.length;i++) {
            Goods g4 = arr[i];
            System.out.println(g4.getId() + " " + g4.getName() + " " + g4.getPrice() + " " + g4.getCount());
        }

    }
}
