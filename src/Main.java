public class Main {
    public static void main(String[] args) {

        MyList<Integer> myList = new MyList<>();


        for (int i = 1; i <= 15; i++) {
            myList.add(i);
        }


        System.out.println("Dizinin eleman sayısı: " + myList.size());
        System.out.println("Dizinin kapasitesi: " + myList.getCapacity());


        System.out.print("Dizideki elemanlar: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}
