package Tasks.Task2;

public class ATM {
    int note20;
    int note50;
    int note100;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.note20 = banknote20;
        this.note50 = banknote50;
        this.note100 = banknote100;
    }

    public ATM() {}

    void addBanknotes(int banknote20, int banknote50, int banknote100) {
        this.note20 += banknote20;
        this.note50 += banknote50;
        this.note100 += banknote100;
    }
    //IF the number of biggest notes is sufficient WHILE number of notes
    //is above 0 AND the number of needed money can be replenished by the
    //note value, the number of respected notes is added to result and
    //the needed money is decreased by needed value
    boolean getMoney(int money) {
        boolean isComplete = false;
        int n20 = 0, n50 = 0, n100 = 0;
        while (note100 > 0 && money >= 100) {
            n100++;
            money -= 100;
            note100--;
            isComplete = true;
        }
        while (note50 > 0 && money >= 50) {
            n50++;
            money -= 50;
            note50--;
            isComplete = true;
        }
        while (note20 > 0 && money >= 20) {
            n20++;
            money -= 20;
            note20--;
            isComplete = true;
        }
        System.out.println("100: "+n100+" 50: "+n50+" 20: "+n20);
        System.out.println("Money left: "+money);
        return isComplete;
    }

    public static void main(String[] args) {
        ATM atm = new ATM(20, 14, 11);
        atm.addBanknotes(5, 2, 1);
        System.out.println(atm.getMoney(910));

    }
}
