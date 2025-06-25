public class BankAccountsystem {

    static class BankAccount {
       
        static String bankName = "National Bank";

        private static int totalAccounts = 0;

        private final long accountNumber;

        private String accountHolderName;

        public BankAccount(long accountNumber, String accountHolderName) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            totalAccounts++; 
        }

        
        public static int getTotalAccounts() {
            return totalAccounts;
        }

        
        public void displayAccountDetails() {
            if (this instanceof BankAccount) {
                System.out.println("Bank Name: " + bankName);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Account Holder: " + accountHolderName);
            } else {
                System.out.println("Invalid account object.");
            }
        }
    }

   
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(10000100009525l, "Aditya");
        BankAccount acc2 = new BankAccount(10000200001595l, "Anshu");

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
