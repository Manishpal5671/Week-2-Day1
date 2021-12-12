//3. In springdi_collectionlist_9 example, make source code changes to add multiple string tags to the question?

//-------------------------------Question.java----------------------------------------------------
import java.util.Iterator;  
import java.util.List;  
  
public class Question{  
private int id;  
private String name;  
private List<String> answers;
private List<String> tags;
  
public Question() {}  
public Question(int id, String name, List<String> answers, List<String> tags) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.answers = answers;
    this.tags = tags;
    System.out.println("Question() constructor invoked");
}  
  
public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("answers are:");  
    for(Iterator<String> itr=answers.iterator();itr.hasNext();){  
        System.out.println(itr.next());  
    }  
    System.out.println("tags are:");
    for(Iterator<String> itr=tags.iterator();itr.hasNext();) {
    	System.out.println(itr.next());
    }
}  
  
}

------------------------------------applicationContext.xml--------------------------------------
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-4.0.xsd
">
<bean id="q" class="Question">  <!-- no code changes are required in main app-->
<constructor-arg name="answers"> 
<list>  
<value>Java is a programming language</value>  
<value>Java is a Platform</value>  
<value>Java is an Island of Indonasia</value>  
</list>  
</constructor-arg>  
<constructor-arg name="id" value="111"></constructor-arg>  
<constructor-arg name="name" value="What is java?"></constructor-arg>  
<constructor-arg name="tags"> 
<list>  
<value>Basic</value>  
<value>Intermediate</value>    
</list>  
</constructor-arg> 
</bean>
</beans>