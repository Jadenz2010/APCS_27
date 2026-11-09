 package pkg;
 public class StepTracker{
    public int steps;
    public int days;
    public int active;
    public int activeDay;
    //-------------------------------
    public StepTracker(int active){
        steps=0;
        days=0;
        this.active=active;
        activeDay=0;
    }
    //-------------------------------------
    public void addDailySteps(int n){
        steps=steps+n;
        days++;
        if(n>=active){
            activeDay++;
        }
    }
    public int activeDays(){
       return activeDay;
    }
    public double averageSteps(){
        if (days==0){
            return 0.0;
        }
       return (double)(steps/days);
    
    }

















 }