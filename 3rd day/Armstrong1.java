public class Armstrong1{

public static void main(String args[]){

int n=155,temp=n,sum=0,nod=0;
while(n>0)
{
n=n/10;   //give no. of digit.
nod++;
}
 while(temp>0){ 
 
int r=temp%10;//last digit of num reminder

int tens=1;
for(int i=1;i<=nod;i++){   //it gives no. of power of digit.  
tens=tens*r ;  //
}
sum=sum+tens;
temp=temp/10;
}
if (sum==temp)
System.out.println("Armstrong");
else
System.out.println("not Armstrong");
}
}