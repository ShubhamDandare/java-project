public class Palllindrom{

public static void main(String args[])
{
int n=151,rev=0,temp=n;
while(n>0)
{
int r=n%10;
rev=rev*10+r;
n=n/10;
}
if(temp==rev){
System.out.println("pallindrom");
}
else{
System.out.println("not pallindrom");
}
}
}