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
    public void addRating(double r){
        rating=((numRating*rating)+rating)/(numRatings+1);
    }
    public void movieToString(){
        System.out.println(movieName );
        System.out.println("Rating: "+rating );
        System.out.println("Number of Ratings: "+numRatings );
        System.out.println("Revenue:" +revenue );
        System.out.println();
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie x){
        if(rating>x.getRating()){
            return true;
        }
        return false;
    }
    public String revenueToString(){
       int rev=revenue;
       String ans="";
        while(rev>=1000){
            int num0=rev%1000;
            ans=","+ num0+ans;
            rev=rev/1000;
        }
        ans=rev+ans;
        return ans;
    }
    public Movie pirateMovie(){
        Movie temp=new Movie(name,rating,numRating,revenue);
        return temp;
        return this;
    }
    }
