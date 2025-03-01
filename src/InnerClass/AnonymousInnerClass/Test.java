package InnerClass.AnonymousInnerClass;

//import InnerClass.AnonymousInnerClass.CreditCard;

public class Test {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart(160);
//        CreditCard creditCard=new CreditCard("34494");
//        shoppingCart.processPayment(creditCard);


        //AnonymousInnerClass  used here   or this is used only for single time
//        A class without a name that is used for one-time use Commonly used for implementing interfaces or overriding methods on the spot
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid"+amount+"using Credit card");

            }
        });


        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid"+amount+"using patym");

            }
        });
    }

}
