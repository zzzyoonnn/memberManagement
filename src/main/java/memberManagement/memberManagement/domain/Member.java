package memberManagement.memberManagement.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/*
CREATE TABLE Member (
    memberId BIGINT AUTO_INCREMENT PRIMARY KEY,
    memberName VARCHAR(255),
    isManager BOOLEAN,
    birthday DATE,
    workStartDate DATE,
    team_id BIGINT,
    FOREIGN KEY (team_id) REFERENCES Team(id)
);
 */

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memberId;
    private String memberName;

    private boolean isManager;
    private LocalDate birthday;
    private LocalDate workStartDate;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
