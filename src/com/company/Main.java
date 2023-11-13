package com.company;
import java.sql.Array;
import java.util.ArrayList;
import java.util.*;

class studenti{
    private String nume;
    private int nota1;
    private int nota2;
    private int nota3;
    public String getNume(){
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
}
public class Main {
    public static void p1(){
        ArrayList<String> Studenti= new ArrayList<String>();
        Studenti.add("Florina");
        Studenti.add("Ervin");
        Studenti.add("Harry Potter");
        Studenti.set(1,"Ron Weasley");
        Studenti.remove(0);
        System.out.print("Marime array=");
        System.out.print(Studenti.size());
        for(int i=0;i<Studenti.size();i++){
            System.out.println("\nElementul din array de pe pozitia "+ i+ " "+ Studenti.get(i));
        }
    }
    public static void p2(){
        HashSet<String> carti = new HashSet<String>();
        carti.add("Harry Potter");
        carti.add("Lightining Thief");
        carti.add("Ultima noapte de iubire, prima noapte de razboi");
        System.out.println(carti.contains("mancare"));
        System.out.println(carti);
        carti.remove("Ultima noapte de iubire, prima noapte de razboi");
        System.out.println(carti);
        if(carti.contains("Harry Potter")){
            System.out.println("DA");
        }
        else{
            System.out.println("NU");
        }
        System.out.println("Marimea este:"+carti.size());
        carti.clear();
        System.out.println("Marimea este:"+carti.size());
    }
    public static void p3(){
        HashMap<String, Integer> studenti = new HashMap<>();
        studenti.put("florina", 9);
        studenti.put("matias", 8);
        studenti.put("ervin", 7);
        for (String nume : studenti.keySet()) {
            int nota = studenti.get(nume);
            System.out.println(nume+" are nota:" + nota);
        }
    }
    public static  void p4(){
        int optiune;
        String compara;
        HashMap<String, Integer> student = new HashMap<String, Integer>();
        Scanner s=new Scanner(System.in);
        do{
            System.out.println("=========MENIU=========");
            System.out.println("1.Adaugare Student");
            System.out.println("2.Afisare detalii Student");
            System.out.println("3.Iesire\n");
            optiune = s.nextInt();
            s.nextLine();
            switch(optiune){
                case 1:
                    System.out.println("=Adaugati un student=");
                    System.out.println("Introduceti numele studentului:");
                    String  nume = s.nextLine();
                    System.out.println("Introduceti varsta studentului:");
                    Integer varsta = s.nextInt();
                    student.put(nume, varsta);
                    break;
                case 2:
                    System.out.println("Varsta carui student doriti sa o aflati?:");
                    compara=s.nextLine();
                    if(student.containsKey(compara)){
                        System.out.println(student.get(compara));
                    }
                    else{
                        System.out.println("Studentul nu exista.");
                    }
                    break;
                case 3:
                    break;
            }
        }while(optiune!=3);
    }
    public static void main(String[] args) {
        p1();
        System.out.println("*****************************");
        p2();
        System.out.println("*****************************");
        p3();
        System.out.println("*****************************");
        p4();
    }
}
