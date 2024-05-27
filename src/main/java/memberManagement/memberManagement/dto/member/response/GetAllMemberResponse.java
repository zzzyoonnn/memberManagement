package memberManagement.memberManagement.dto.member.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Member;

@Getter
@Setter
@RequiredArgsConstructor
public class GetAllMemberResponse {
    private String name;
    private String teamName;
    private String role;
    private String birthday;
    private String workStartDate;
    private String upgradeDate;
}
