class rectangle
{
int length,breadth;
void getdata(int x,int y)
{
length=x;
breadth=y;
}
int rectarea()
{
int area=length*breadth;
return(area);
}
}
class Rectanglearea
{
public static void main(String args[])
{
rectangle r1=new rectangle();
rectangle r2=new rectangle();
r1.length=10;
r1.breadth=7;
int area1=r1.length*r1.breadth;
r2.getdata(20,15);
int area2=r2.rectarea();
System.out.println("length of r1:"+r1.length);
System.out.println("breadth of r1:"+r1.breadth);
System.out.println("length of r2:"+r2.length);
System.out.println("breadth of r2:"+r2.breadth);
System.out.println("area of r1:"+area1);
System.out.println("area of r1:"+area2);

}
}
