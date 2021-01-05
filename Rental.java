import java.time.LocalDate;

public class Rental {
    Book book;
    String id;
    Date rentStart;
    Date rentEnd;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRentStart() {
        return rentStart;
    }

    public void setRentStart(Date rentStart) {
        this.rentStart = rentStart;
    }

    public Date getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(Date rentEnd) {
        this.rentEnd = rentEnd;
    }

    public Rental(Book book, String id, Date rentStart) {
        this.book = book;
        this.id = id;
        this.rentStart = rentStart;
    }
    public  void  endRent(Date d){
        d = new Date(01,03,2021);
    }


    public int daysOfRent(){
        int leapyear = 0;
        int daysofStart = rentStart.day + rentStart.year * 365;
        int daysofEnd = rentEnd.day + rentEnd.year * 365;
        int months [] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for (int i = rentStart.year; i < rentEnd.year; i++) {
            if (i % 4 == 0 && i % 100 != 0){
                leapyear++;
            }
            else if(i % 4 == 0 && i % 100 == 0 && i % 400 == 0){
                leapyear ++;
            }
            if (rentEnd == null){
                return -1;
            }
            else {
                for (int j = rentStart.month - 1; j > 0; j--){
                    daysofStart += months[i];
                }
                for (int j = rentEnd.month - 1; j > 0; j--){
                    daysofEnd += months[i];
                }
            }

        }
        return daysofEnd - (daysofStart + leapyear);
    }
    public int costOf(){
        return daysOfRent() * book.getPrice();
    }


    }

