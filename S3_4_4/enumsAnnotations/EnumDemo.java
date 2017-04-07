package S3_4_4.enumsAnnotations;

public class EnumDemo {
    public static void main(String args[])
    {
        Apple ap;

        System.out.println("Get Price " + Apple.Winesap.getPrice());

        ap = Apple.Cortland;
        System.out.println("Cortland ap: " +ap);
        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("ap Winesap "+ ap);

        switch(ap){
            case Jonathan:
                System.out.println("Jonathan czerwone");
                break;
            case GldenDel:
                System.out.println("Golden Delicious jest GldenDel");
                break;
            case RedDel:
                System.out.println("Red Delicious jest czerwone");
                break;
            case Winesap:
                System.out.println("Winesap ");
                break;
            case Cortland:
                System.out.println("Cortland ");
                break;
        }
    }
}