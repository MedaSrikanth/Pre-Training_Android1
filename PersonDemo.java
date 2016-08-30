import java.lang.*;
class Person
{	private String name;
	private String address;
	public Person( String name, String address)
	{	this.name=name;// instance varible hiding avoided using this
		this.address=address;
	}
	public String getName()
	{ 
	return name;
	}
	public String getAddress()
	{ 
	return address;
	}
	public void setAddress(String address)
	{ 
	this.address=address;
	}
	public String toString()
	{ 
	return "Person[name="+name+",address="+address+"]";
	}
}

class Student extends Person
{	
	private String program;
	private int year;
	private double fee;
	Student(String name,String address,String program, int year, double fee)
	{ 
	super(name,address);//invoking super class constructor
	this.year=year; 
	this.program=program;
        this.fee=fee;
	}
	public String getProgram()
	{ 
	return program;
	}
	public void setProgram(String program)
	{ 
	this.program=program;
        }
	public int getYear()
	{
	 return year;
	}
	public void setYear(int year)
	{
	 this.year=year;
        }
	public double getFee()
       { 
        return fee;
       }
	public void setFee(double fee)
	{ 
        this.fee=fee;
        }
       public String toString()
	{ 
         return "Student[Person[name="+getName()+",address="+getAddress()+"],program="+program+",year="+year+",fee="+fee+"]";
	}
}

class Staff extends Person
{	
        private String school;
	private double pay;
	Staff(String name,String address,String school, double pay)
	{ 
	  super(name,address);
	  this.school=school;
	  this.pay=pay;
	}
	public String getSchool()
	{
	 return school;
	}
	public void setSchool(String school )
	{ 
	this.school=school;
	}
	
	public double getPay()
	{
	 return pay; 
	}
	public void setPay(double pay)
	{ 
	this.pay=pay;
        }
       public String toString()
	{ 
	 return "Student[Person[name="+getName()+",address="+getAddress()+"],school="+school+",pay="+pay+"]";	
	}
}
public class PersonDemo// Driver class
{
	public static void main(String a[])
	{ 
	Staff stf=new Staff("Srikanth","Guntur","CSE",90000);
	System.out.println(""+stf);
	stf.setAddress("Vijaywada");
	stf.setSchool("RVRJCCE");
	stf.setPay(80000);
	System.out.println("STAFF NAME :"+stf.getName()+" ADDRESS : "+stf.getAddress()+"  SCHOOL :"+stf.getSchool()+" PAY  :"+stf.getPay()); 
        Student std=new Student("Anusha","RVRJC","B.TECH",2016,108000);
        System.out.println(" "+std);
	std.setAddress("Guntur");
	std.setProgram("M.Tech");
	std.setFee(50000);
	System.out.println("Student NAME :"+std.getName()+" ADDRESS : "+std.getAddress()+"  PROGRAM :"+std.getProgram()+"YEAR :"+std.getYear()+" PAY  :"+std.getFee()); 
	}
}




/*     OUTPUT

C:\Users\Srikanth\Desktop\android>javac PersonDemo.java

C:\Users\Srikanth\Desktop\android>java PersonDemo

Student[Person[name=Srikanth,address=Guntur],school=CSE,pay=90000.0]
STAFF NAME :Srikanth ADDRESS : Vijaywada  SCHOOL :RVRJCCE PAY  :80000.0
 Student[Person[name=Anusha,address=RVRJC],program=B.TECH,year=2016,fee=108000.0
]
Student NAME :Anusha ADDRESS : Guntur  PROGRAM :M.TechYEAR :2016 PAY  :50000.0
*/