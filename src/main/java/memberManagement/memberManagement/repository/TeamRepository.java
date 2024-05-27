package memberManagement.memberManagement.repository;

import memberManagement.memberManagement.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
