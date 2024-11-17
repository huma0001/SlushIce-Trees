public class Tree {
    private int age;
    private double height;
    private double growPrcnt;

    public Tree(double growPrcnt){
        this.growPrcnt = growPrcnt;
        age = 1;
        height = 0.25;
    }

    public void growTreeOneYear(){
        if(age > 20){
            System.out.println("Trees cannot grow past 20 years old");
        } else {
            age++;
            height = height * (1 + growPrcnt / 100);
        }
    }


    public int getAge(){
        return age;
    }


    public String toString(){
        return "Tree age: " + age + "\nTree height: " + height + "\nTree grow percent: " + growPrcnt;
    }
}
