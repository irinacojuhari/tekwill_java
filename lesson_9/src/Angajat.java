public class Angajat {
    String name;
     long virsta;
    final int salariu;
    int damiVirsta(){
        return (int) virsta;
    }
    void printNume()
    {
        System.out.println(name);
    }
    void seteazaVirsta(long virsta){
        this.virsta=virsta;

    }
    public Angajat(){
        salariu=10_000;
    }
    public Angajat(int k){
        salariu=10;
    }

    public static void main(String [] str){
        Angajat o1=new Angajat();
        Angajat o2=new Angajat();
        System.out.println("Numele  " +o1.name);
        System.out.println("Salariu  "+o1.salariu);
        o2.seteazaVirsta(18);
        System.out.println("Virsta  "+o1.virsta);
        System.out.println("Virsta  "+o2.virsta);
        o1.seteazaVirsta(Long.parseLong("21"));
        o1.seteazaVirsta(Long.valueOf("21"));
        System.out.println("Virsta  "+o1.virsta);
        System.out.println("Virsta  "+o2.virsta);

        o2=o1;
        System.out.println("Virsta  "+o1.virsta);
        System.out.println("Virsta  "+o2.virsta);

        o1.seteazaVirsta(Long.valueOf("30"));

        System.out.println("Virsta  "+o1.virsta);
        System.out.println("Virsta  "+o2.virsta);



        o2.seteazaVirsta(Long.valueOf("40"));

        System.out.println("Virsta  "+o1.virsta);
        System.out.println("Virsta  "+o2.virsta);
    }
}
