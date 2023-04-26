//Program to create a class named 'Member' having the following members: Name, Age, Phone number, Address, Salary. It also has a method named printSalary which prints the salary of the members. Two classes Employee and Manager inherits the Member class. The Employee and Manager' classes have data members specialization and department respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

class Member
{
	String name;
	int age;
	long ph_num;
	String address;
	double salary;
	
	Member(String n,int a,long p,String ad,double s)		// Constructor
	{
		this.name=n;
		this.age=a;
		this.ph_num=p;
		this.address=ad;
		this.salary=s;
	}

	void print_details()
	{
		System.out.print("\nEmployee Details are as:");
		System.out.print("\nName: " + name);
		System.out.print("\nAge: " + age);
        System.out.print("\nAddress: " + address);
        System.out.print("\nPhone number: " + ph_num);
    }

	void print_Salary()
	{
		System.out.print("\nSalary: " + this.salary);
	}
}

class Employee extends Member
{
	String specialization="Market Research";
	String department="Marketing and Sales";
	
	Employee()				//Constructor
	{
		super("John",32,9876767876l,"Xyz",95140.5);			//Calling Constructor of Parent Class
	}
}

class Manager extends Member
{
	String specialization="Market Research";
	String department="Marketing and Sales";

	Manager()				// Consructor
	{
		super("Johnn",31,9876447876l,"Abc",75840.5);		//Calling Constructor of Parent Class
	}
}

class EmployeeInheritence
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		Manager m = new Manager();
		
		System.out.print("\n----Employee details----\n");
		e.print_details();
		System.out.print("\nSpecialization: "+e.specialization);
		System.out.print("\nDepartment: "+e.department);
		e.print_Salary();

		System.out.print("\n----Manager details----\n");
		m.print_details();
		System.out.print("\nSpecialization: "+m.specialization);
		System.out.print("\nDepartment: "+m.department);
		m.print_Salary();
	}
}