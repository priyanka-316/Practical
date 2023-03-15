class Datatype
{

int a;
short b;
float c;
double d;
char f;
long e;
void show(){
System.out.println("int:"+a );
System.out.println("short:"+b );
System.out.println("float:"+c );
System.out.println("double:"+d );
System.out.println("char:"+f);
System.out.println("long:"+e);
}
   public static void main(String args[])
     {
        Datatype  object = new Datatype();
             System.out.println("Default value is given below");
        object.show();
     }}
