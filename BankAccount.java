
public class BankAccount {

    private int accountNum;
    private String name;
    private float amount = 0;

    public void insert(int accountNum, String name, float amount) {
        this.accountNum = accountNum;
        this.name = name;
        this.amount = amount;

    }

    public void deposit(float deposit) {
        this.amount += deposit;
        System.out.println(deposit + " deposited");

    }

    public void withDraw(float drawe) {
        if (this.amount > drawe) {

            this.amount -= drawe;
            System.out.println(drawe + " withdrawn ");
        }else{
            System.out.println("have no money enogh");
        }

    }

    public void checkBalance() {
        System.out.println("Balnce = " +this.amount);
    }

    public String ToString() {
        return "my account number is " + this.accountNum + " my name is " + this.name + " amount is" + this.amount;
    }

}
