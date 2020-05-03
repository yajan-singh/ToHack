import java.util.*;

public class Terminal 
{
    private TreeMap<Integer, Patient> Patients;
    private Patient[][] Rooms;
    public Terminal(int rows, int columns)
    {
        Patients = new TreeMap<Integer,Patient>();
        Rooms = new Patient[rows][columns];
    }
    public void addPatient(String Name, int age, String condition)
    {
        Patient NewPatient = new Patient(Name, age, condition);
        placePatient(NewPatient);
    }

    public void removePatient(int roomNumber)
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
    private boolean checkCollisions(int i , int j,Patient currentPatient)
    {
    if(i==0 && j==0)
    {
        if(Rooms[i+1][j] != null)
        {
            if(Rooms[i+1][j].getCondition().equalsIgnoreCase("covid-19")||currentPatient.getCondition().equalsIgnoreCase("covid-19"))
            {
                return false;
            }
        }
        if(Rooms[i][j+1] != null)
        {
            if(Rooms[i][j+1].getCondition().equalsIgnoreCase("covid-19")||currentPatient.getCondition().equalsIgnoreCase("covid-19"))
            {
                return false;
            }
        }
    }
    if(i==0 && j == Rooms[0].length)
    {
        if(Rooms[i+1][j] != null)
        {
            if(Rooms[i+1][j].getCondition().equalsIgnoreCase("covid-19")||currentPatient.getCondition().equalsIgnoreCase("covid-19"))
            {
                return false;
            }
        }
        if(Rooms[i][j-1] != null)
        {
            if(Rooms[i][j-1].getCondition().equalsIgnoreCase("covid-19")||currentPatient.getCondition().equalsIgnoreCase("covid-19"))
            {
                return false;
            }
        }

    }
    if(i==Rooms.length && j==0)
    {
        if(Rooms[i-1][j].getCondition().equalsIgnoreCase("covid-19")||currentPatient.getCondition().equalsIgnoreCase("covid-19"))
        {
            
        }
    }
    }
}
