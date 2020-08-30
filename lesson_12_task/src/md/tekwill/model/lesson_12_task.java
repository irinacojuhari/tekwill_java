/* Calculul radacinilor polinomului de gradul 1 f=(a1x+1)
 Calculul radacinilor polinomului de gradul 2 f=(a2x+1)(b2x+1)
 Calculul radacinilor plonomului de gradul 3 f=(a3x+1)*(b3x+1)(c3x+1)
*/

package md.tekwill.model;
public class lesson_12_task {
    double a1;
    double X1;
    double a2;
    double b2;
    double Y1, Y2;
    double a3, b3, c3;
    double Z1, Z2, Z3;

    public  lesson_12_task(){
        this(4);
    }

    public  lesson_12_task(double a1){
        this(2,5);
        this.a1=a1;
    }
    public lesson_12_task(double a2, double b2){
        this(3,4,5);
        this.a2=a2;
        this.b2=b2;
    }

    public lesson_12_task(double a3, double b3, double c3){
        this.a3=a3;
        this.b3=b3;
        this.c3=c3;
    }

    public void calcul_Radacinilor(double a1){
        this.X1=-1/a1;
    }

    public void calcul_Radacinilor(double a2, double b2){
        this.Y1=-1/a2;
        this.Y2=-1/b2;
    }

    public void calcul_Radacinilor(double a3, double b3, double c3){
        this.Z1=-1/a3;
        this.Z2=-1/b3;
        this.Z3=-1/c3;
    }
    
    public void afisareGeneral(){
        this.afisareRadaciniPolinom1();
        this.afisareRadaciniPolinom2();
        this.afisareRadaciniPolinom3();
        this.afisarDate(this);
        System.out.println("Type of the current class: " + this.getTypeClass());
    }

    public void afisareRadaciniPolinom1(){
        this.calcul_Radacinilor(this.a1);
        System.out.println("Radacinile polinomului de gradul 1 sunt:  " + this.X1);
    }
    public void afisareRadaciniPolinom2(){
        this.calcul_Radacinilor(this.a2,this.b2);
        System.out.println("Radacinile polinomului de gradul 2 sunt:  "+ this.Y1+ " " +this.Y2 );
    }
    public void afisareRadaciniPolinom3(){
        this.calcul_Radacinilor(this.a3,this.b3,this.c3);
        System.out.println("Radacinile polinomului de gradul 3 sunt:  " + this.Z1 + " "+ this.Z2+ "  " + this.Z3 );
    }
    public void afisarDate(lesson_12_task ob){
        System.out.println("ax+1=0 -> " + this.a1+"x+1=0");
        System.out.println("(a2x+1)(b2x+1)=0 -> " + "("+this.a2+"x+1)(" +this.b2+"x+1)=0");
        System.out.println("(a3x+1)(b3x+1)(c3x+1)=0 -> " + "("+this.a3+"x+1)(" +this.b3+"x+1)("+this.c3+"x+1)=0");
    }

    public lesson_12_task getTypeClass(){
       return this;
    }

    public static void main(String[] args) {
        lesson_12_task o1=new lesson_12_task();
        lesson_12_task o2=new lesson_12_task(10);
        lesson_12_task o3=new lesson_12_task(2,3);
        lesson_12_task o4=new lesson_12_task(7,8,9);
        o1.afisareGeneral();
        o2.afisareGeneral();
        o3.afisareGeneral();
        o4.afisareGeneral();
    }
}
