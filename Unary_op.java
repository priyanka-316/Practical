class Unary_op{
public static void main(String args[])
{
int a= 10;
int b=10;
System.out.println(a++);   //incrementing by 1 postfix
System.out.println(++a);  //incrementing by 1 prefix
System.out.println(a--);    //decrementing by 1 postfix
System.out.println(--a);   // decrementing by 1 prefix

System.out.println("Examples");

System.out.println(a++  +  ++b); 
System.out.println(++ a +  a++); 
System.out.println(b++  +  ++a); 

System.out.println(a--  +  --b); 
System.out.println(-- a +  a--); 
System.out.println(b--  +  --a); 

}
}