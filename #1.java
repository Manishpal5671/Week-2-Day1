
#1.In springdi_objectsi_2 application make source code changes to create Salary class, and add salary as data member to Employee class? 

------------------------Salary.java-------------------------
package com.eg;

public class Salary {
	private double monthlySalary;
	private double tax;
	
	public Salary() {
		System.out.println("Inside Salary default constructor");
	}
	
	public Salary(double monthlySalary, double tax) {
		super();
		this.monthlySalary = monthlySalary;
		this.tax = tax;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Salary [monthlySalary=" + monthlySalary + ", tax=" + tax + "]";
	}
	
	
	
}

----------------------------Employee.java---------------------------------
import com.eg.Salary;

public class Employee {  
private int id;  
private String name;  
private Address address;//Aggregation  
private Salary sal;
  
public Employee() {System.out.println("Employee def cons");}  
  
public Employee(int id, String name, Address address, Salary sal) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.address = address; 
    this.sal = sal;
    System.out.println("Employee(int id, String name, Address address)");
}  

public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
    System.out.println("setting id");
}
  
public Address getAddress() {  
    return address;  
}  
public void setAddress(Address address) {  
    this.address = address;  
    System.out.println("setting address");
}

public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
    System.out.println("setting name");
}


public Salary getSal() {
	return sal;
}

public void setSal(Salary sal) {
	this.sal = sal;
}

void show(){  
    System.out.println(id+" "+name);  
    System.out.println(address.toString()); 
    System.out.println(sal.toString());
}  

void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println(address);
    System.out.println(sal);
} 
  
}

-------------------------------------applicationContext1.xml---------------------------------------------
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-4.0.xsd
">
<bean id="address1" class="Address">  
<property name="addressLine1" value="Ring Rd,BTM"></property>  
<property name="city" value="Bangalore"></property>  
<property name="state" value="KA"></property>  
<property name="country" value="India"></property>  
</bean>  
  
<bean id="obj" class="Employee">  
<property name="id" value="1"></property>  
<property name="name" value="Kumar"></property>  
<property name="address" ref="address1"></property>
<property name="sal" ref="salary"></property> 
</bean> 

<bean id="salary" class="com.eg.Salary">
	<property name="monthlySalary" value="40000"></property>
	<property name="tax" value="0.8"></property>
</bean> 

</beans>
