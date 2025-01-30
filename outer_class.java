class outer{
    int x = 10;
    class inner{
        int y = 20;
    }
}


public class outer_class{
    public static void main(String[] args) {
        outer obj = new outer();
        outer.inner obj1 = obj.new inner();
        System.out.println(obj.x + obj1.y);
    }
}