package static1;

public class DataCountMain {
    public static void main(String[] args) {
        Data data1 = new Data("A");
        System.out.println("A count=" + Data.count);
        Data data2 = new Data("B");
        System.out.println("B count=" + Data.count);
        Data data3 = new Data("C");
        System.out.println("C count=" + Data.count);
    }
}
