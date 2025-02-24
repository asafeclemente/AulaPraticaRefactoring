public class Rental {

   private Movie _movie;
   private int _daysRented;
  private int frequentRenterPoints = 0;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }

  public int getFrequentRenterPoints() { 
    return _movie.getFrequentRenterPoints(_daysRented);

  }

  public double getCharge(){
    return _movie.getCharge(_daysRented);
   }
}