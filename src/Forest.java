import java.util.ArrayList;

public class Forest {
    private ArrayList<Tree> treeArrayList;

    public Forest(){
        this.treeArrayList = new ArrayList<>();
    }

    public void addTree(double growPrcnt){
        Tree tree = new Tree(growPrcnt);
        treeArrayList.add(tree);
    }

    public void growAllTreesOneYear(){
        for(int i = 0; i<treeArrayList.size(); i++){
            treeArrayList.get(i).growTreeOneYear();
        }
    }


    public String toString(){
        return "" + treeArrayList;
    }
}
