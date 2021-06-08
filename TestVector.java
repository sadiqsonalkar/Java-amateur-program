import java.util.*;

class Vector
{
	int i;
	int j;
	int k;


public Vector()
{
	i=0;
	j=0;
	k=0;
}

public Vector(int x)
{
	i=x;
	j=x;
	k=x;
}

public Vector(int x,int y,int z)
{
	i=x;
	j=y;
	k=z;
}

void display()
{
	System.out.println("("+i+","+j+","+k+")");
}

public Vector add(Vector v1)
{
	Vector temp=new Vector();
	temp.i=this.i+v1.i;
	temp.j=this.j+v1.j;
	temp.k=this.k+v1.k;
	return temp;
	
}

public Vector add(Vector v1,Vector v2)
{
	Vector temp= new Vector();
	temp.i=this.i+v1.i+v2.i;
	temp.j=this.j+v1.j+v2.j;
	temp.k=this.k+v1.k+v2.k;
	return temp;
}

public Vector product(Vector v1)
{
	Vector temp=new Vector();
	temp.i=this.i*v1.i;
	temp.j=this.j*v1.j;
	temp.k=this.k*v1.k;
	return temp;
}


public Vector product(Vector v1,Vector v2)
{
	Vector temp=new Vector();
	temp.i=this.i*v1.i*v2.i;
	temp.j=this.j*v1.j*v2.j;
	temp.k=this.k*v1.k*v2.k;
	return temp;
}

public static Vector sum(Vector v1,Vector v2)
{
	Vector temp = new Vector();
		
	temp.i=v1.i+v2.i;
	temp.j=v1.j+v2.j;
	temp.k=v1.k+v2.k;
	return temp;	
}
public static int mul(Vector v1,Vector v2)
{

	int temp = 0;
		
	temp = v1.i*v2.i+v1.j*v2.j+v1.k*v2.k;
	return temp;
}

}

class TestVector
{
	public static void main(String args[])
	{
		Vector v1 = new Vector(12);
		Vector v2 = new Vector(15);
		Vector v3 = new Vector(1,2,3);
		Vector v5 = v1.add(v2);	
		Vector v6 = v1.add(v3);
		v5.display();
		v1.display();
		v2.display();
		v3.display();
		v6.display();
	}
}