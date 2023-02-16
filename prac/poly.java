import java.util.Scanner;
class patientsDetails
{
     String name;
     int age;
     int reg;
     String disease;

    public patientsDetails(String name,int age,int reg,String disease)
    {
         this.age=age;
         this.name=name;
         this.reg=reg;
         this.disease=disease;

    }
    public void details()
    {
        System.out.println("Patients details: ");
        System.out.println(name);
        System.out.println(age);
        System.out.println(reg);
        System.out.println(disease);
    }
}
public class poly
{
    public static void main(String[] args) {
        System.out.println("1.Malaria");
        System.out.println("2.Covid");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n) {
            case 1:
                 String name=sc.next();
                 int age=sc.nextInt();
                 int reg=sc.nextInt();
                 String disease="Malaria";
                 patientsDetails p1=new patientsDetails(name, age, reg, disease);
                 p1.details();
                break;
        
            case 2:
                name=sc.next();
                age=sc.nextInt();
                reg=sc.nextInt();
                disease="Covid";
                patientsDetails p2=new patientsDetails(name, age, reg, disease);
                p2.details();  
                break;
        }

    }
}