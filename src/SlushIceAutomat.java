import java.util.ArrayList;
import java.util.List;

public class SlushIceAutomat {
    private String shopName;
    private List<SlushIceFlavor> shopFlavors;


    public SlushIceAutomat(String shopName){
        this.shopName = shopName;
        this.shopFlavors = new ArrayList();
    }


    public String getShopName(){
        return shopName;
    }

    public List getShopFlavors(){
        return shopFlavors;
    }

    public void addFlavor(SlushIceFlavor flavor){
        shopFlavors.add(flavor);
    }


    public void removeFlavor(SlushIceFlavor flavor){
        shopFlavors.remove(flavor);
    }


    public int amountOfVariants(){
        return shopFlavors.size();
    }

    public String printFlavors(){
        return getShopName() + " has " + amountOfVariants() + " variants of flavor";
    }


}
