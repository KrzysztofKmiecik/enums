public class Main {
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        for(Operation op: Operation.values()){
            System.out.printf("%.2f %s %.2f =%.2f%n",x,op,y,op.apply(x,y));
        }

        System.out.println(Operation.fromString("-"));
    }
}