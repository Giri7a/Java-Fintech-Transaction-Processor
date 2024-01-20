import java.util.*;


// TransactionProcessor class to process and analyze transaction logs
public class TransactionProcessor {
    List<Transaction> transactionLogs;

    // Constructor to initialize TransactionProcessor with a list of transaction logs
    public TransactionProcessor(List<Transaction> transactionLogs) {
        this.transactionLogs = transactionLogs;
    }

    // Method to count transactions for each status category
    public Map<String, Integer> countTransactionsByStatus() {

        // Map to store the count of transactions for each status category
        Map<String, Integer> statusCount = new HashMap<>();

        // Iterate through transaction logs and count transactions for each status
        for (Transaction transaction : transactionLogs) {

            // Increment the count for the corresponding status
            statusCount.put(transaction.status, statusCount.getOrDefault(transaction.status, 0) + 1);
        }

        // Return the map containing status categories and their respective transaction counts
        return statusCount;
    }

    // Method to determine the time interval with the highest number of transactions
    public String identifyPeakTime() {

        // Map to store the count of transactions for each hour
        Map<Integer, Integer> hourCount = new HashMap<>();

        // Iterate through transaction logs and count transactions for each hour
        for (Transaction transaction : transactionLogs) {

            // Extract the hour from the transaction timestamp
            Calendar cal = Calendar.getInstance();
            cal.setTime(transaction.timestamp);
            int hour = cal.get(Calendar.HOUR_OF_DAY);

            // Increment the count for the corresponding hour
            hourCount.put(hour, hourCount.getOrDefault(hour, 0) + 1);

        }

        // Find the hour with the maximum transactions
        int maxHour = Collections.max(hourCount.entrySet(), Map.Entry.comparingByValue()).getKey();

        // Format and return the peak time interval
        return String.format("%02d:00:00 - %02d:59:59", maxHour, maxHour);

    }

    // Method to list the transaction IDs of failed transactions
    public List<String> getFailedTransactionIds() {

        // List to store the IDs of failed transactions
        List<String> failedTransactionIds = new ArrayList<>();

        // Iterate through transaction logs and add IDs of failed transactions to the list
        for (Transaction transaction : transactionLogs) {

            // Check if the transaction status is "FAILED"
            if ("FAILED".equals(transaction.status)) {

                // Add the ID to the list
                failedTransactionIds.add(transaction.id);
            }
        }

        // Return the list containing IDs of failed transactions
        return failedTransactionIds;
    }
}
