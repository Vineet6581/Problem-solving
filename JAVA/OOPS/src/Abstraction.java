class Account{
    //Data security
    private double balance;

    // methods :: public
    public double getBalance(double balance){
        // Authentication
        boolean result = validation("vineet","vineet123");
        if(result){
            // withdraw the money
            this.balance = this.balance - balance;
            System.out.println(balance+" withdraw successfully");
        } else{
            System.out.println("authentication failed please enter correct username and password");
        }
        return 0.0f;
    }

    //methods :: public
    public void setBalance(double balance){
        // perform authentication
        boolean result = validation("vineet","vineet123");
        if(result == true){
            // Deposit the money
            this.balance = this.balance + balance;
            System.out.println(balance+" Credited Successfully to the account");

        }else{
            System.out.println("authentication failed please enter correct username and password");
        }
    }
    public void display(){
        // perform authentication
        boolean result = validation("vineet","vineet123");
        if(result == true){
            // Displaying the balance
           this.balance = balance;
            System.out.println("Available balance::"+balance);
        }else {
            System.out.println("authentication failed please enter correct username and password");
        }
    }
    private <string> boolean validation(string username , string password){
        return username.equals("vineet") && password.equals("vineet123");
    }
}



public class Abstraction {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000.0);
        acc.getBalance(500);
        acc.display();
    }
}
