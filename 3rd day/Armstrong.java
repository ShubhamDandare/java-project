public class Armstrong{

public static void main(String args[]){

int n=313,temp=n,sum=0;
while(n>0){
int r=n%10;
n=n/10;
sum=sum+r*r*r;

}
if(temp==sum)
System.out.println("Armstrong");
else

System.out.println("not armstrong");
}
}









