package Section6.VipCustomer;

public class Main {
    public static void main(String[] args) {
VipCustomer first = new VipCustomer();
VipCustomer second = new VipCustomer("Ronie Walker", 999);
VipCustomer third = new VipCustomer("Juliet Baar", 850, "jul@123.com");

        System.out.println("name: " +first.getName()+ "\n"+
                "creditlimit: "+ first.getCreditLimit()+"\n"+
                "email: " + first.getEmail());
        System.out.println("name: " +second.getName()+ "\n"+
                "creditlimit: "+ second.getCreditLimit()+"\n"+
                "email: " + second.getEmail());
        System.out.println("name: " +third.getName()+ "\n"+
                "creditlimit: "+ third.getCreditLimit()+"\n"+
                "email: " + third.getEmail());

    }
}
