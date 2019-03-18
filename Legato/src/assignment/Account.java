package assignment;

public class Account{
	private long accNum;
	private double balance;
	private Person accHolder;
	private static int counter=1000;
	
	@Override
	public String toString() {
		return "AccNumber:"+this.accNum+"Balance"+this.balance;
	}
	
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Account.counter = counter;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	Account(){
		counter++;
	}
	
	public void deposit() {
		this.balance=this.balance+2000;
	}
	
	public void withDraw(){
		this.balance=this.balance-2000;
	}
	
	//public double get_Balance() {
		
	//}
}
