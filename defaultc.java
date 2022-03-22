class perimeter
{
int length;
int breadth;
perimeter()
{
length=3;
breadth=4;
}
perimeter(int x,int y)
{
length=x;
breadth=y;
}
void rectperi()
{
int peri;
peri=2*(length+breadth);
System.out.println("perimeter of rectangle is:"+peri);
}
}
class defaultc
{
public static void main(String args[])
{
perimeter p1=new perimeter();
perimeter p2=new perimeter(6,12);
p1.rectperi();
p2.rectperi();
}
}
