import java.util.Enumeration;

public abstract class Statement {

    protected abstract String getInitialString(Rental aRental);
    protected abstract String getFiguresString(Customer aCustomer);
    protected abstract String getOwedString(Customer aCustomer);
    protected abstract String getEarnedString(Customer aCustomer);

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getFiguresString(aCustomer);

        while (rentals.hasMoreElements()) {
          Rental each = (Rental) rentals.nextElement();
          result += getInitialString(each);
        }
        result += getOwedString(aCustomer);
        result += getEarnedString(aCustomer);
        return result;
     }
}  