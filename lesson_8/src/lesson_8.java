import java.sql.SQLOutput;

public class lesson_8 {

    public static void main(String[] str){

        String mesaj;
        Boolean in=new Boolean(null);
        String str1="1234";
        long m;
        m=new Long(str1);
        System.out.println("str1->m"+m);
        m=Long.parseLong(str1);
        System.out.println("str1->m"+m);
        m=Long.valueOf(str1);
        System.out.println("str1->m"+m);
        m=Long.valueOf(str1).longValue();
        System.out.println("str1->m"+m);


        System.out.println("str1->m"+m);
        System.out.println("Mesaj4"+in);


        int j=0;
        if (j>5 & ++j<20)
            System.out.println("If 1");
        else if (j<-1)
            System.out.println("If 2");
        else if (j++==2) System.out.println("Ultimul else 1");
        else if (++j==0) System.out.println("Ultimul else 2");

        System.out.println("Valoarea lui j:"+j);
         if (j>2);
        switch ("AB") {
            case "AB":
                System.out.println("a");
            case "BC":
                System.out.println("b");
                break;
            case "CC":
                System.out.println("c");
            default:
                System.out.println("end");

        }
                switch (2) {
                    case 2:
                        System.out.println("a");
                    case 3:
                        System.out.println("b");
                        break;
                    case 4:
                        System.out.println("c");
                    default:
                        System.out.println("end");

                }

        if (5>3)
            mesaj="5 este mai mare ca 3";
        else
            mesaj="3 este mai mare ca 5";
        System.out.println(mesaj);
        String mesaj2=5>3?"5 este mai mare ca 3":"3 este mai mare ca 5";
        System.out.println(mesaj2);
        int x=0;
        String mesaj3=x>3 ?x<0?"1":"2":"3";
        System.out.println(x+ " "+ mesaj3);
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);



        for(int k=0;k<10;k++)

            if(k%2==0) break;
            else System.out.println("Break k1:" +k);

        for(int k=0;k<10;k++)

            if(k%2==0) continue;
            else System.out.println("Break k2:" +k);

        for(int k1=0;k1<3;k1++)
            for(int k=0;k<10;k++)
               if(k%2==1) break;
                   else System.out.println("Break k3:" +k);

        label:
        for(int k1=0;k1<3;k1++)
            for(int k=0;k<10;k++)
                if(k%2==1) break label;
                else System.out.println("Break k4:" +k1 +"" +k);
        int jm=0;
        label_1:
        {
          jm++;
            System.out.println("Label {} " +jm);

              if(jm%2==0) break label_1;
              System.out.println("Label {} " +jm);
          }


    }
}
