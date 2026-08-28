public class ScoreMain {
    public static void main(String[] args) {
        Score s = new Score();

        System.out.println(s.scoreCount());

        Score s1 =new Score(10);
        s1.increaseScore(50);
        s1.decreaseScore(20);
        System.out.println(s1.scoreCount());
    }
}
