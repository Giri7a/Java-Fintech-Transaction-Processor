import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

// TestTransactionProcessor class to provide a sample dataset and test the implementation
public class TestTransactionProcessor {
    public static void main(String[] args) throws ParseException {

        // Sample data representing transaction logs
        List<Transaction> sampleData = Arrays.asList(
                new Transaction("TXN_1", "2023-11-22 01:00:00", "SUCCESS"),
                new Transaction("TXN_2", "2023-11-22 02:30:00", "FAILED"),
                new Transaction("TXN_3", "2023-11-22 03:45:00", "SUCCESS"),
                new Transaction("TXN_4", "2023-11-22 01:15:00", "FAILED"),
                new Transaction("TXN_5", "2023-11-22 02:30:00", "SUCCESS"),
                new Transaction("TXN_5", "2023-11-22 07:30:00", "PENDING"),
                new Transaction("TXN_5", "2023-11-22 09:30:00", "PENDING")
        );

        // Create an instance of TransactionProcessor with the sample data
        TransactionProcessor processor = new TransactionProcessor(sampleData);

        // Display results of transaction analysis
        System.out.println("Transaction Count by Status: " + processor.countTransactionsByStatus());
        System.out.println("Peak Time: " + processor.identifyPeakTime());
        System.out.println("Failed Transaction IDs: " + processor.getFailedTransactionIds());



    }
}
