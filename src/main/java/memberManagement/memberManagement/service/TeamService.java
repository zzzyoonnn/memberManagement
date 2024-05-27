package memberManagement.memberManagement.service;

import memberManagement.memberManagement.domain.Team;
import memberManagement.memberManagement.repository.TeamRepository;

import java.util.List;

public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }
}