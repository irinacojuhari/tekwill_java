class lucruMetode{
    int num;
    char numar;
    private String str;
    private String str1;
    int getInteger(int num){
        this.num=num;
        return num;
    }
    void setString(String str, String str1){
        this.str=str+str1;
        this.str1=str1;
    }
    String getString(){
        return this.str;
    }

    int get_setChar(char numar){
        this.numar=numar;
        return (int) this.numar;
    }

}

public class task_1 {
    public static void main(String[] str){
        int num;
        lucruMetode o1=new lucruMetode();
        num=o1.getInteger(100);
        System.out.println("Verificarea 1-ei metode ");
        System.out.println("Numar intreg: " + num);

        o1.setString("Data de astazi este:"," 22 august");
        System.out.println("Verificarea metodei a 2 si a 3-a ");
        System.out.println(o1.getString());

        System.out.println("Verificarea metodei a 4: "+ o1.get_setChar('B'));

    }


}
