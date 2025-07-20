
import java.util.ArrayList;

public class bank {


  // initializing the ArraLists to store bank account names and balances.
  public static ArrayList<String> bankAccName = new ArrayList<>();    //{"Rhia","Johnathan","Tyler"};
  public static ArrayList<Double> bankAccBalance = new ArrayList<>();               //{12.53,2532.12,4329874.65};	
    
  public static void main(String[] args) {
    
    openNewBankAcc("Rhia", 12.53);
    openNewBankAcc("Johnathan", 2532.12);
    openNewBankAcc("Tyler", 4329874.65);
    System.out.println();
	
    getAccInfo(0);
    getAccInfo(1);
    getAccInfo(2);
    
    
    bankAccDeposit(0, 30);
    getAccInfo(0);
    
    
    bankAccWithdrawal(1, 500);
    getAccInfo(1);
    
    
    openNewBankAcc("Ravi", 1432654.31);
    getAccInfo(3);

    bankAccDeposit(3, 15324.43);
    getAccInfo(3);

    

  }
  

  
  // defining the methods.
  public static void getAccInfo(int id) {
  	
    
    if (id < 0 || id > bankAccName.size()) {
    	
        System.out.println("Invalid bank id");
        
    } else {
    	
        
        System.out.println(bankAccName.get(id) + ", Balance: $" + bankAccBalance.get(id));
        System.out.println();
        
    }
    
  }
  
  public static void openNewBankAcc(String name, double deposit) {
  	
    bankAccName.add(name);
    bankAccBalance.add(deposit);
    
    System.out.println("New bank account created: " + bankAccName.get(bankAccName.size() - 1));
    
  }
  
  public static void bankAccDeposit(int id, double amntToDep) {
  	bankAccBalance.set(id, bankAccBalance.get(id) + amntToDep);
    System.out.println("Deposited $" + amntToDep + " into " + bankAccName.get(id) + "'s account.");
    
  }
  
  public static void bankAccWithdrawal(int id, double amntToWithdraw) {
  	bankAccBalance.set(id, bankAccBalance.get(id) - amntToWithdraw); 
    System.out.println("Withdrew $" + amntToWithdraw + " from " + bankAccName.get(id) + "'s account.");
  }
  
}
