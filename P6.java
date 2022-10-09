public class P6
{
    public static void main(String[] args) {
        int q=10;
        double r=15.55;
        Integer qObj = Integer.valueOf(q);
        Double rObj = Double.valueOf(r);

        if (qObj instanceof Integer)
        {
            System.out.println("Object Of Integer is created");
        }
        if (rObj instanceof Double)
        {
            System.out.println("Object of Double is created");
        }
    }
}
