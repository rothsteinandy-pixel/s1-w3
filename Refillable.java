public class Refillable {
    private int amount;

    public Refillable(){
        amount = 10;
        
    }
    public Refillable (int a){
        amount= a;
    }
    public void useUp (int amt){
        amt-= amt;
    }
    public void addTo (int amt){
        amt += amt;
    }
    public int refillableCount(){
        return amount;
    }

    }

