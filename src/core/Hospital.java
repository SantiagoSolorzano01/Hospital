
package core;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;

    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }
    
    public void addTeam(int teamId, int consultantDoctorId){
        Team team = new Team(teamId);
        ConsultantDoctor consultantDoctor = new ConsultantDoctor(consultantDoctorId, team);
        this.teams.add(team);
    }
    
    public Team getTeam(int teamId){
        for (Team team : this.teams){
            if(team.getId() == teamId){
                return team;
            }
        }
        return null;
    }
    
    public void addJuniorDoctor(Team team, int juniorDoctorId){
        JuniorDoctor juniorDoctor = new JuniorDoctor(juniorDoctorId, team);
    }
    
    public void addWard(int wardId){
        Ward ward = new Ward(wardId);
        this.wards.add(ward);
    }
    
    public void assignPatientDoctor(Patient patient, int addId){
        int doctorId = patient.getTeam().getId() + addId;
        Doctor doctor = this.getDoctor(doctorId);
        patient.addDoctor(doctor);
        doctor.addPatient(patient);
    }
    
    public void assignAppoiment(Patient patient, int addId){
        int doctorId = patient.getTeam().getId() + addId;
        Doctor doctor = this.getDoctor(doctorId);
        Appoiment appoiment = new Appoiment(doctor, patient);
    }
    
    public Doctor getDoctor(int doctorId){
        for (Team team : this.teams){
            for (Doctor doctor : team.getDoctors()){
                if(doctor.getId() == doctorId){
                    return doctor;
                }
            }
        }
        return null;
    }
    
    public Patient getPatient(int patientId){
        for (Team team : this.teams){
            for (Patient patient : team.getPatients()){
                if(patient.getId() == patientId){
                    return patient;
                }
            }
        }
        return null;
    }
    
    public Ward getWard(int wardId){
        for (Ward ward : this.wards){
            if(ward.getId() == wardId){
                return ward;
            }
        }
        return null;
    }
    
    public void addPatient(Ward ward, Team team, int patientId){
        Patient patient = new Patient(patientId, team, ward);
    }
    
    public void numberDoctorsPatient(){
        for (Ward ward : this.wards){
            for (Patient patient : ward.getPatients()){
                int con = 0;
                for(Doctor doctor : patient.getDoctors()){
                    con++;
                }
                System.out.println("paciente " + patient.getId() + " has " + con + " doctors" );
            }
        }
    }
    
    public void numberPatientsTeam(){
        for (Team team : this.teams){
            int con = 0;
            for (Patient patient : team.getPatients()){
                con++;
            }
            System.out.println("Team " + team.getId() + " has " + con + " patients");
        }
    }
    
    public void relationAppoiments(){
        for (Ward ward : this.wards){
            for (Patient patient : ward.getPatients()){
                int a = 0;
                for (Appoiment appoiment : patient.getAppoiments()){
                    a++;
                }
                System.out.println("Patient " + patient.getId() + " has " + a + " appoiments");
            }
        }
    }
    
    
}
