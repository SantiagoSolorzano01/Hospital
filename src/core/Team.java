
package core;

import java.util.ArrayList;

public class Team {
    private int id;
    private ConsultantDoctor teamLeader;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Team(int id) {
        this.id = id;
        this.teamLeader = null;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    public void addDoctor (Doctor doctor){
        this.doctors.add(doctor);
    }
    
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setTeamLeader(ConsultantDoctor teamLeader) {
        this.teamLeader = teamLeader;
    }

    public int getId() {
        return id;
    }
    
    
}
