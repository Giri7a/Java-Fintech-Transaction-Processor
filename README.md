# Java-Fintech-Transaction-Processor

> To run this Java code in IntelliJ Community Edition, follow these steps:
### 1. Open IntelliJ IDEA:
* Launch IntelliJ IDEA Community Edition on your computer.
### 2. Create a New Project:
* Click on "Create New Project" or open an existing project if you have one.
### 3. Create Classes:
* In your project, create two new Java classes: TransactionProcessor and TestTransactionProcessor.
* Copy the provided code for each class into their respective files.
### 4. Run the Test Class:
* Right-click on the TestTransactionProcessor class in the project explorer.
* Choose "Run 'TestTransactionProcessor.main()'".
### 5. View Output:
* Observe the output in the "Run" or "Console" tab at the bottom of the IntelliJ window.
### 6. Adjust Sample Data (Optional):
* If you want to test with different data, modify the sampleData list in the TestTransactionProcessor class.
> * Note: Ensure that you have the correct Java SDK configured in your IntelliJ IDEA. If not, set up the JDK by going to "File" > "Project Structure" > "Project" > "Project SDK".
* This should execute the sample test and display the results in the console. Adjust the code as needed for your specific use case.

  ## Here's a breakdown of how values are passed and returned:

### 1. Transaction Class:
* Represents a single transaction log entry.
* Values (id, timestamp, status) are passed to the constructor when creating a new Transaction object.
### 2. TransactionProcessor Class:
* Represents the main processing and analysis class for transaction logs.
* The constructor takes a List<Transaction> as an argument, initializing the list of transaction logs.
### 3. countTransactionsByStatus Method:
* Counts transactions for each status category and returns a Map<String, Integer> where keys are status categories and values are transaction counts.
### 4. identifyPeakTime Method:
* Determines the time interval with the highest number of transactions and returns a formatted string representing the peak time interval.
### 5. getFailedTransactionIds Method:
* Lists the transaction IDs of failed transactions and returns a List<String> containing these IDs.
### 6. TestTransactionProcessor Class:
* Provides a sample dataset and tests the functionality of the TransactionProcessor class.
* Displays the results of the transaction analysis in the console.
> * Values are passed as arguments to methods, and results are returned accordingly. The main method in TestTransactionProcessor creates an instance of TransactionProcessor with sample data and calls the methods to display the results.
