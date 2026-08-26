public class CandyJarMain {
    public static void main(String[] args) {
        CandyJar c = new CandyJar();
         CandyJar c1  = new CandyJar( 20);

        c.eat(2);
        c1.eat(5);
        
        c.refill(12);
        c1.refill(6);

        System.out.println("c:");
         c.printState();
         c1.printState();
    }

}
