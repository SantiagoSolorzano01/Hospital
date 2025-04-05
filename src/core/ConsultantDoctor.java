
package core;

public class ConsultantDoctor extends Doctor{
    private Team leaderOf;

    public ConsultantDoctor(int id, Team team) {
        super(id, team);
        this.leaderOf = team;
        
        this.leaderOf.setTeamLeader(this);
    }
}
