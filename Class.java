public class Class {
    public static void main(String[] args) {
        Pen p1 = new Pen();  //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.name = "Rupesh";
        myAcc.setPassword("123");
        System.out.println(myAcc.getPassword());
    }
}

class BankAccount {
    public String name;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 100;
    }
}