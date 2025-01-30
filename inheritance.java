import java.util.*;

class Cardealer {
    public void cardealer(){
        System.out.println("Car Dealer With List of BMW, Maruti Suzuki, Hyundai and Mercedes");
    }
}

// Car Dealer List

class Bmw extends Cardealer{
    public void subcar(){
        System.out.println("3 Sub cars");
    }
}

class Msuzukai extends Cardealer{
    public void subcar(){
        System.out.println("2 Sub cars");
    }
}

class Hyundai extends Cardealer{
    public void subcar(){
        System.out.println("4 Sub cars");
    }
}

class Mercedes extends Cardealer{
    public void subcar(){
        System.out.println("2 Sub cars");
    }
}

// Sub Cars List

class X7 extends Bmw{
    public void car(){
        System.out.println("X7 From BMW Brand");
    }
}

class M5 extends Bmw{
    public void car(){
        System.out.println("M5 From BMW Brand");
    }
}

class Series8 extends Bmw{
    public void car(){
        System.out.println("Series8 From BMW Brand");
    }
}

class Baleno extends Msuzukai{
    public void car(){
        System.out.println("Baleno From Maruti Suzukai Brand");
    }
}

class Ertiga extends Msuzukai{
    public void car(){
        System.out.println("Ertiga From Maruti Suzukai Brand");
    }
}

class i10 extends Hyundai{
    public void car(){
        System.out.println("i10 From Hyundai Brand");
    }
}

class i20 extends Hyundai{
    public void car(){
        System.out.println("i20 From Hyundai Brand");
    }
}

class i30 extends Hyundai{
    public void car(){
        System.out.println("i30 From Hyundai Brand");
    }
}

class Aura extends Hyundai{
    public void car(){
        System.out.println("Aura From Hyundai Brand");
    }
}

class Benz extends Mercedes{
    public void car(){
        System.out.println("Benz From Mercedes Brand");
    }
}

class Electric extends Mercedes{
    public void car(){
        System.out.println("Electric From Mercedes Brand");
    }
}



public class inheritance {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("Our List : " +
                "\n1. X7" +
                "\n2. M5" +
                "\n3. Series8" +
                "\n4. Baleno" +
                "\n5. Ertiga" +
                "\n6. i10" +
                "\n7. i20" +
                "\n8. i30" +
                "\n9. Aura" +
                "\n10. Benz" +
                "\n11. Electric");
        System.out.println("Enter Your Choice : ");
        no = sc.nextInt();
        X7 obj = new X7();
        M5 obj1 = new M5();
        Series8 obj2 = new Series8();
        Baleno obj3 = new Baleno();
        Ertiga obj4 = new Ertiga();
        i10 obj5 = new i10();
        i20 obj6 = new i20();
        i30 obj7 = new i30();
        Aura obj8 = new Aura();
        Benz obj9 = new Benz();
        Electric obj10 = new Electric();

        if(no == 1)
        {
            obj.cardealer();
            obj.subcar();
            obj.car();
        }
        else if(no == 2)
        {
            obj1.cardealer();
            obj1.subcar();
            obj1.car();
        }
        else if(no == 3)
        {
            obj2.cardealer();
            obj2.subcar();
            obj2.car();
        }
        else if(no == 4)
        {
            obj3.cardealer();
            obj3.subcar();
            obj3.car();
        }
        else if(no == 5)
        {
            obj4.cardealer();
            obj4.subcar();
            obj4.car();
        }
        else if(no == 6)
        {
            obj5.cardealer();
            obj5.subcar();
            obj5.car();
        }
        else if(no == 7)
        {
            obj6.cardealer();
            obj6.subcar();
            obj6.car();
        }else if(no == 8)
        {
            obj7.cardealer();
            obj7.subcar();
            obj7.car();
        }else if(no == 9)
        {
            obj8.cardealer();
            obj8.subcar();
            obj8.car();
        }else if(no == 10)
        {
            obj9.cardealer();
            obj9.subcar();
            obj9.car();
        }else if(no == 11)
        {
            obj10.cardealer();
            obj10.subcar();
            obj10.car();
        }
        else
        {
            System.out.println("Invalid Selection");
        }





    }
}
