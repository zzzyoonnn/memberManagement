package memberManagement.memberManagement.controller;

import memberManagement.memberManagement.domain.Member;
import memberManagement.memberManagement.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 직원 등록 기능
    @PostMapping("/member/save")
    public void saveMember(@RequestBody Member member) {
        memberService.saveMember(member);
    }

    // 직원 조회 기능
    @GetMapping("/member")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
}
