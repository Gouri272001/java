class number
{
int i,j;
void display()
{
for(i=1;i<=9;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(i+" ");
}
System.out.println("\n");
}
}
}

class demo
{
public static void main(String args[])
{
number n=new number();
n.display();
}
}
