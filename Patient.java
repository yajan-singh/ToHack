import java.util.ArrayList;
import java.io.*;

public class Patient 
{
    
    private String name;
    private int age; 
    private String condition;

    public Patient(String name,int age,String condition) 
    {
        this.name = name;
        this.age = age;
        this.condition = condition;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getCondition()
    {
        return condition;
    }
    
}




