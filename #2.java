2. In above example create jar out of Employee, Address, Salary class, and add jar to build path of Project.  

1 - Created a new project and added the Enployee, Address in com.emp package and Salary in com.eg package.
2 - Changed the method access of Employee class to public so that it can be accessed by springdi_objectsi_2 project.
3 - Exported the project into a non-runnable jar file.
4 - Added the jar to the external libraries in springdi_objectsi_2 and removed the above class files from that project.

5 - Changes done in applicationContext1.xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-4.0.xsd
">
<bean id="address1" class="com.emp.Address">  
<property name="addressLine1" value="Ring Rd,BTM"></property>  
<property name="city" value="Bangalore"></property>  
<property name="state" value="KA"></property>  
<property name="country" value="India"></property>  
</bean>  
  
<bean id="obj" class="com.emp.Employee">  
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

6 - Ran the Test.java and got the output. So, setup done successfully.