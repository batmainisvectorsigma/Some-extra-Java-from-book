enum Status{
    Running,Failed,Pending,Success;
}
public class Status1 {
    public static void main(String args[]){
        Status s=Status.Running;
        System.out.println(s.ordinal());      //0
        Status s1=Status.Failed;
        System.out.println(s1.ordinal());     //1
        System.out.println(Status.Pending);   //Pending

        Status s2 = Status.valueOf("Success");
        System.out.println("Status from string 'Success': " + s2);  //Status from String 'Success': Success

        int comparison = s.compareTo(s1);  
        System.out.println("Comparing " + s + " with " + s1 + ": " + comparison); //-1
        Status[] ss=Status.values();
        for(Status si:ss){
            System.out.println(si);                          //Running Failed Pending Success
        }
    }
}
