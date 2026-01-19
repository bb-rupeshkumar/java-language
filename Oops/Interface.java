interface Service {
    void execute();
}

class EmailService implements Service {
    @Override
    public void execute() {
        System.out.println("Email service executed");
    }
}

public class Interface {
    public static void main(String[] args) {
        Service s = new EmailService();
        s.execute();
    }
}