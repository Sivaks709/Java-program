package Equals;

public class Books
{
    int ID=12;
    double Price=78;
    String Name="java";

    public int hashCode()
    {
        return ID+(int)Price+Name.hashCode();
    }
}
class Student 
{
    int SID=12;
    double Price=78;
    String Name="JAVA"; 

    public int hashCode()
    {
        return SID+(int)Price+Name.hashCode();
    }
}
class Drive
{
    public static void main(String[] args)
    {
        Books res=new Books();
        Student res1=new Student();
        if (res.hashCode()==res1.hashCode())
        {
            System.out.println("Books States and Student States Same !");
        }
        else
        {
            System.out.println("Books States and Student States Not Same !");
        }
    }
}
