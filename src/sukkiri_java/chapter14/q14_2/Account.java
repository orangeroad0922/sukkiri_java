package sukkiri_java.chapter14.q14_2;

public class Account {

	String accountNumber;
	int balance;

	public String toString() {
		return "\\" +this.balance +"(口座番号＝" +this.accountNumber +")";
	}

	public boolean equals(Object a) {
		if (a instanceof Account) {
			return ((Account) a).accountNumber.trim().equals(this.accountNumber.trim());
		}
		return false;
	}
}
