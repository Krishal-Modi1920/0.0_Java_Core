class One extends Thread{
    public void tweet(){
        System.out.println("This is Thread one");
    }
}

class Two extends Thread{
    public void chat(){
        System.out.println("This is Thread two");
    }
}

public class test{
    public static void main(String[] args) {
        One first = new One();
        Two second = new Two();

        first.start();
        second.start();

    }
}