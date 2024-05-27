package memberManagement.memberManagement.dto.member.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaveMemberRequest {
    private String memberName;          // 이름
    private boolean isManager;          // 매니저 여부
    private String birthday;            // 생일
    private String workStartDate;       // 입사일
    private String upgradeDate;         // 승진일
    private Long teamId;                // 팀 번호

    public String getMemberName() {
        return memberName;
    }

    public boolean isManager() {
        return isManager;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getWorkStartDate() {
        return workStartDate;
    }

    public String getUpgradeDate() {
        return upgradeDate;
    }

    public Long getTeamId() {
        return teamId;
    }
}
