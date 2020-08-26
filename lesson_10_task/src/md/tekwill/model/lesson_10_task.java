package md.tekwill.model;
import md.tekwill.dao.Dreptunghi;
import md.tekwill.service.CalcululAriei;
import md.tekwill.service.CalcululAriei;

public class lesson_10_task extends CalcululAriei {
    public static void main(String[] args) {
            Dreptunghi o1=new Dreptunghi();
            lesson_10_task o2=new lesson_10_task();
            o1.setValue(10,2);
            System.out.println("Inaltime: " + o1.getInaltime());
            System.out.println("Latime: " + o1.getLatime());
            o2.afisareDate(o1);

    }
}
