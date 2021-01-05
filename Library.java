import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    ArrayList<Rental> rentals;
    public Library(){
        new ArrayList<>();
        new ArrayList<>();
    }

public int available(){
        int available = 0;
    for (int i = 0; i < books.size(); i++) {
        if (rentals.getDaysOfRent() > 0){
            available++;
        }


    }
    return available;
}
public int totalEarnings(){
        return rentals.getDaysOfRent() * books.getPrice();
}
public boolean rentBook(Book book, Date date, String id){
        if (rentals.getRentEnd() != null){
            return true;
        }
        return false;
}
}

