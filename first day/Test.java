public class Test
{
    public void show()
    {
        System.out.println("welcome calculator");   
    }
    public static void main (String args[])
    {
        Test t1= new Test();
        t1.show();
        Add a1=new Add();
        a1.add();
        Sub s1= new Sub();
        s1.sub();
        Multi m1= new Multi();
        m1.multi();
        Divid d1=new Divid();
        d1.div();
        System.out.println("Thank u");
    }
}