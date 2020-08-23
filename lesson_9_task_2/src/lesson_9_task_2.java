public class lesson_9_task_2 {
    int sum;
    int sumaNumerelor(int n){
        sum=0;
        for(int i=0;i<n;i++)
            sum+=i;

        return sum;
    }
    String numPare(int n){
        String s="";
        int num=0;
        for(int i=0;i<=n;i++){
            if (i % 2 == 0) s+=Integer.toString(i);

        }
        return s;
    }
    void Hello(){
        for(int i=0;i<10;i++)
            System.out.println("Hello");
    }
    String numImpare(int n){
        int num=0;
        String s="";
        for(int i=0;i<=n;i++){
            if (i % 2 != 0) s+=Integer.toString(i);
        }
        return s;
    }
    public static void main(String[] str){
        lesson_9_task_2 o1=new lesson_9_task_2();
        o1.sumaNumerelor(5);
        System.out.println("Suma numerelor: "+o1.sum);
        System.out.println("Numere pare: "+o1.numPare(5));
        System.out.println("Numere impare: "+o1.numImpare(5));
        o1.Hello();
    }
}
