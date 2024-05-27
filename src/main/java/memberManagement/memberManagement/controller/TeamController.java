package memberManagement.memberManagement.controller;

import memberManagement.memberManagement.domain.Team;
import memberManagement.memberManagement.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    // 팀 등록 기능
    @PostMapping("/team/save")
    public void saveTeam(@RequestBody Team team) {
        teamService.saveTeam(team);
    }

    // 팀 조회 기능
    @GetMapping("/team")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }
}
