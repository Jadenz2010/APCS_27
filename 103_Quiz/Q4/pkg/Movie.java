package pkg;
public class Movie{
        //Global Vaiables
        private String movieName;
        private double rating;
         private int numRatings;
         private int revenue;
    
    //Constructors
    public Movie(){
        movieName="unknown";
        rating=0.0;
        numRatings=0;
        revenue=0;
    }

     public Movie(String mN, int r,double rt, int num){
        movieName=mN;
        revenue=r;
        rating=rt;
        numRatings=num;
    }
    //Methods
    public double addRating(double rating){
        rating=((numrating*rating)+this.rating)/(numratings+1);
        return rating;
    }
    public void movieToString(){
        System.out.println(movieName );
        System.out.println(rating );
        System.out.println(numRatings );
        System.out.println(revenue );

    }
    public void getMovieName(){
        System.out.println(movieName);
    }
    public boolean compareRatings(String rating){
        rating.equals(this.rating);
        return false;
    }
    public void revenueToString(){
        int x=9;
        int y=100000000;
        while (x>0){
            revenue=revenue/y;
            x--;
            y=y/10;
            if(y==100000000){
                num 0=y;
            
            if(y==100000){
                int num1=y;
                if(y==100){
                    int num2=y;
                }
            }
        }
        System.out.println(num0+","+num1+","+num2);
    }
    public void pirateMovie(){

    }
    }
}