
package core;

import java.util.ArrayList;

public class Patient {
    private int id;
    private Team team;
    private Ward ward;
    private ArrayList<Appoiment> appoiments;
    private ArrayList<Doctor> doctors;

    public Patient(int id, Team team, Ward ward) {
        this.id = id;
        this.team = team;
        this.ward = ward;
        this.appoiments = new ArrayList<>();
        this.doctors = new ArrayList<>();
        
        this.team.addPatient(this);
        this.ward.addPatient(this);
    }

    public int getId() {
        return id;
    }

    public Team getTeam() {
        return team;
    }
    
    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }
    
    public void addAppoiment(Appoiment appoiment){
        this.appoiments.add(appoiment);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Appoiment> getAppoiments() {
        return appoiments;
    }
    
    
}
