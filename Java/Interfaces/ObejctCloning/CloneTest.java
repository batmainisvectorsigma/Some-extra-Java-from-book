public class CloneTest {
    public static void main(String args[]){
        try{
            Employee original=new Employee("John Q. Public",5000);
            original.setHireDay(2000,1,1);
            Employee copy=original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002,12,31);
            System.out.println("original="+original);
            System.out.println("copy="+copy);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
/*
original=Employee[name= John Q. Public,salary=5000.0,hireDay=Sat Jan 01 00:00:00 PST 2000]
copy=Employee[name= John Q. Public,salary=5500.0,hireDay=Tue Dec 31 00:00:00 PST 2002]
*/
