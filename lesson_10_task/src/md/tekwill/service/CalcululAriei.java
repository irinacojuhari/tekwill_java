package md.tekwill.service;
import md.tekwill.dao.Dreptunghi;


public class CalcululAriei {

    private float calculAriei(float latime, float inaltime){

        return latime*inaltime;
    }
    private float calculPerimetru(float latime, float inaltime){

        return  2*(latime+inaltime);
    }

    public void afisareDate(Dreptunghi o1){
        System.out.println("Aria dreptunghiului: " + calculAriei(o1.getInaltime(),o1.getLatime()));
        System.out.println("Perimetru dreptunghiului: " + calculPerimetru(o1.getInaltime(),o1.getLatime()));
    }

}