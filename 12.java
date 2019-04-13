public class palindrome{
public static void main(String args[]){
int num=121,reversednum=0,originalnum,remainder;
originalnum=num;
while(num!=0){
remainder=num%10;
reversednum=reversednum*10+remainder;
num/=10;
}
if(originalnum==reversednum)
System.out.println("number is palindrome");
else
System.out.println("number is not palindrome");
}
}
