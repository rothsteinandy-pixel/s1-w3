public class CokeCoolerMain {
    public static void main(String[] args) {
        CokeCooler c = new CokeCooler();
        CokeCooler c1 = new CokeCooler(30);

        c.drink(8);
        c.refill(7);

        c1.drink(2);
        c1.drink(3);
        
        System.out.println(c.cokeCount());
        System.out.println(c1.cokeCount());

    }
}