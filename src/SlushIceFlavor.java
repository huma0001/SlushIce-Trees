public class SlushIceFlavor {
    private String flavorName;
    private double flavorPrice;


    public SlushIceFlavor(String flavorName, double flavorPrice){
        this.flavorName = flavorName;
        this.flavorPrice = flavorPrice;
    }


    public double getFlavorPrice(){
        return flavorPrice;
    }




    public String toString(){
        return flavorName + " price: " + flavorPrice + "DKK";
    }

}
