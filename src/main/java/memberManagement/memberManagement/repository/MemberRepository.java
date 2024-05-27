package memberManagement.memberManagement.repository;

import memberManagement.memberManagement.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
