class student
{
    int rno;
    String name;
    public void read(int r,String n)
    {
        rno=r;
        name=n;
    }

public void write()
{
    System.out.println("number is:"+rno);
    System.out.println("name is:"+name);
}
}
 


public class week1
{
    public static void main(String args[])
    {
     student s1=new student();
     s1.read(24,"nishu");
     s1.write();
        
           
    }
}

    
    

