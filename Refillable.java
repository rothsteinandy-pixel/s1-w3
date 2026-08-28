public class Refillable {
    private int amount;
    private int totalUse;
    private int totalTimeUsedHappens;
    public Refillable(){
        amount = 10;
        
    }
    public Refillable (int a){
        amount= a;
    }
    public void useUp (int amt){
        amt-= amt;
        totalUse += amt;
        totalTimeUsedHappens ++;
    }
    public void addTo (int amt){
        amt += amt;
    }
    public int refillableCount(){
        return amount;
    }
    public double averageUse(){
        return 1.0 * totalUse / totalTimeUsedHappens ;

    }
    }

