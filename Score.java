public class Score {
    private int score;


   public Score(){
        score = 50 ;
   }
   public Score (int s){
    score= s;
   }
   public void increaseScore (int amount){
    score += amount;
   }
   public void decreaseScore (int amount){
    score-= amount;
   }
   public int scoreCount(){
    return score;
   }
}
