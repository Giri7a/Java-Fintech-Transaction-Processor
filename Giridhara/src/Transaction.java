import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


// Transaction class to represent a single transaction log entry
public class Transaction {
    String id;
    Date timestamp;
    String status;

    // Constructor to initialize a Transaction object
    Transaction(String id, String timestamp, String status) throws ParseException {
        this.id = id;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(timestamp);
        this.status = status;
    }
}
