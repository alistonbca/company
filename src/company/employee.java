package company;

public class employee {
	String name;
	String dept;
	employee (String name, String dept)
	{
	this.name = name;
	this.dept = dept;
	}
	void display()
	{
	System.out.println(“Name is ” + name);
	System.out.println(“Dept is ” +dept);
	}
}
