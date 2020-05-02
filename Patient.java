import java.util.ArrayList;
import java.io.*;

public class Patient 
{
    String name;
    int age;
    ArrayList<HospitolVisits> hospitolVisits;

    public Patient() 
    {
        
    }
}

public void readFile(Scanner scanner) throws BadFileFormatException 
{
 
    try 
    {
        while (scanner.hasNext()) 
        {
                
                String patientName = scanner.next();
                String id = scanner.next();
                    
                if (isNumeric(id) == false || isStringOnlyAlphabet(studentName) == false || id.isEmpty() || studentName.isEmpty()) //if id contains letters, if studetn name contains numbers and then check the key and the element if they are empty 
                {
                    throw new BadFileFormatException();

                }
                Student s = new Student(studentName,id);
                students.put(id,s);
    
        }
    }
    
    catch (NoSuchElementException e)
    {
        throw new BadFileFormatException();
    }
         
}

}

class BadFileFormatException extends IOException
{
	public BadFileFormatException() {}

}
