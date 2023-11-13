package com.company;
import java.sql.Array;
import java.util.ArrayList;
import java.util.*;

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
        HashMap<String, String> persoana = new HashMap<String, String>();
        persoana.put("Ervin","ervin.florin@yahoo.com");
        persoana.put("Matias","matiasgolan@gmail.com");
        persoana.put("Potter", "avadakadavra@hogwards.uk");
        for(String i : persoana.keySet()){
            System.out.println("Cheie: "+i);
        }
        for(String i : persoana.values()){
            System.out.println("Valoare: "+ i);
        }
    }
    public static  void p4(){
        int optiune;
        HashMap<String, Integer> student = new HashMap<String, Integer>();
        System.out.println("=========MENIU=========");
        System.out.println("1.Adaugare Student");
        System.out.println("2.Afisare detalii Student");
        System.out.println("3.Iesire\n");
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
                    System.out.println("Adaugati un student:");
                    String  nume = s.nextLine();
                    Integer varsta = s.nextInt();
                    student.put(nume, varsta);
                    break;
                case 2:
                    System.out.println("Varsta carui student doriti sa o aflati?:");
                    System.out.println(student.get(s.nextLine()));
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