
package core;

import java.util.ArrayList;

public abstract class Doctor {
    protected int id;
    protected Team team;
    protected ArrayList<Appoiment> appoiments;
    protected ArrayList<Patient> patients;

    public Doctor(int id, Team team) {
        this.id = id;
        this.team = team;
        this.appoiments = new ArrayList<>();
        this.patients = new ArrayList<>();
        
        this.team.addDoctor(this);
    }

    public int getId() {
        return id;
    }
    
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }
    
    public void addAppoiment(Appoiment appoiment){
        this.appoiments.add(appoiment);
    }
    
}
