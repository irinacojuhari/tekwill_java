package md.tekwill;

import java.sql.SQLOutput;

public class lesson_12 extends SecondClass {
    int X;
    int Y;



    void fly(){
        System.out.println("Chemarea a doua fly");
    }
    void probe(int ...x){
        System.out.println("In ...");
    }
    void probe(Integer x){
        System.out.println("In Integer");
    }
    void probe(long x){
        System.out.println("In long");
    }
    void probe(Long x){
        System.out.println("In Long");
    }
    void probe(int x){
        System.out.println("In int");
        super.fly();
        this.fly();
        fly();
        System.out.println(super.X+" X "+ X);
    }
    void probe(byte x){
        System.out.println("In byte");
    }
   void probe(Object o){
     System.out.println("In Object");
   }

   void probe2(int a, Long b){

       System.out.println("In int long");
   }

    void probe2(Long a, int b){

        System.out.println("In  long int");
    }
    public static void main(String[] args) {
        lesson_12 o1=new lesson_12();

        o1.probe((byte)10);
        o1.probe(20);

        o1.probe2(10,10l);
        char c=0;
        for (c=0;c<=5;c++) {

            System.out.println("c "+(int)c);
            switch (c++){

                case 0:
                {System.out.print("c "+(int)c); System.out.println("A"+(int) c); break;}
                case 1:  System.out.println("b");break;
                case 2:  System.out.println("c"+(int)c);break;
                case 3:  System.out.println("d");break;
                case 4:  System.out.println("e"+(int)c);break;
                case 'E':  System.out.println("f");break;

            }
        }
        System.out.println("Switch II");
        for (c=0;c<=5;c++) {


            switch (c){
                case '0':
                    System.out.println("A"); break;
                case 1:  System.out.println("b");break;
                case 2:  System.out.println("c"+(int)c);break;
                case 3:  System.out.println("d");break;
                case 4:  System.out.println("e"+(int)c);break;
                case 'E':  System.out.println("f");break;

            }
        }

        //System.out.println("X: " +new SecondClass().X);
        //System.out.println("Y: " +new SecondClass().Y);





    }


    }
   class SecondClass{
    int X=10;
    int Y=10;
    void fly(){
        System.out.println("Chemarea 1 fly");

    }
    }
