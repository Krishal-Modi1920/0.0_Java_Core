public class unchecked_exception {
    public static void main(String[] args) {
        int[] numerators = {10, 200, 30, 40};
        int[] denominators = {1, 2, 0, 4};
        for(int i = 0;i< 10; i++){
            try{
                System.out.println(divide(numerators[i], denominators[i]));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Good Job");
    }


    public static int divide(int a, int b)
    {
        try{
            return a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
            return -1;
        }
        catch(Exception e){
            System.out.println(e);
            return -1;
        }
    }
}
