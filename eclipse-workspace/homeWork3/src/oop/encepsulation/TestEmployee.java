package oop.encepsulation;

public class TestEmployee {
	
       public static void main(String[] args) {
           Employee emp1 = new Employee();
           emp1.setEmpName("Rafi");
           emp1.setEmpID("3777");
           emp1.setEmpDOB("01-02-1996");
           System.out.println(emp1.getEmpName()+ " " +emp1.getEmpID()+ " " +emp1.getEmpDOB());

       
          Employee emp2 = new Employee();
          emp2.setEmpName("Fahad");
          emp2.setEmpID("3776");
          emp2.setEmpDOB("01-02-1995");
          System.out.println(emp2.getEmpName()+ " " +emp2.getEmpID()+ " " +emp2.getEmpDOB());
          
       }
}