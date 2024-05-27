package memberManagement.memberManagement.service;

import memberManagement.memberManagement.domain.Member;
import memberManagement.memberManagement.repository.MemberRepository;
import memberManagement.memberManagement.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    public MemberService(MemberRepository memberRepository, TeamRepository teamRepository) {
        this.memberRepository = memberRepository;
        this.teamRepository = teamRepository;
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }




}
