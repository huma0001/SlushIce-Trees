public class ForestTreeMain {
    public static void main(String[] args) {

        Forest forest = new Forest();

        forest.addTree(1);
        forest.addTree(1.25);
        forest.addTree(2.1);
        forest.addTree(1.5);

        System.out.println(forest);

        forest.growAllTreesOneYear();
        System.out.println("\n Trees after all grew 1 year older \n");

        System.out.println(forest);

        forest.growAllTreesOneYear();
        forest.growAllTreesOneYear();
        forest.growAllTreesOneYear();
        forest.growAllTreesOneYear();
        forest.growAllTreesOneYear();
        forest.growAllTreesOneYear();
        forest.growAllTreesOneYear();
        forest.growAllTreesOneYear();
        forest.growAllTreesOneYear();


        System.out.println("\n Trees after all grew 10 years older \n");

        System.out.println(forest);



    }
}
