import java.util.ArrayList;

public class CustomerSlushIceCart {
    ArrayList<SlushIceFlavor> userCart;


    public CustomerSlushIceCart(){
        this.userCart = new ArrayList<>();
    }





    public void addToCart(SlushIceFlavor flavor){
        userCart.add(flavor);
    }


    public void removeFromCart(SlushIceFlavor flavor){
        userCart.remove(flavor);
    }


    public String toString(){
        return "Cart has " + userCart.size() + " items ";
    }
}
