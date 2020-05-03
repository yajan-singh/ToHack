import java.util.*;

public class Terminal 
{
    private TreeMap<Integer, Patient> Patients = new TreeMap<Integer,Patient>();

    public void addPatient(String Name, int age, String condition)
    {

    }


    public void removePatient(int roomNumber)//useful to see if the room is taken or not 
    {
        Patients.remove(roomNumber);
    }


    public void updateCondition(Patient pat,String condition)
    {
        pat.setCondition(condition);
    }


    public void placePatient(Patient pat)//checking look for boundaries
    {
        
    }
}