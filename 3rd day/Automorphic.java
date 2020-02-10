public class Automorphic{

public static void main(String args[]){
int n=25,sq=n*n,temp=n,no=0,tens=1;
while(n>0){
n=n/10;   //gives no.of digit.and final value of n become 0.
no++;
}
for(int i=1;i<=no;i++){
tens=tens*10;       // it gives no.of power of digit.
}
int rim=sq%tens;
if(rim==temp)
System.out.println("Automorphic");
else
System.out.println("Not Automorphic");
 

}

}