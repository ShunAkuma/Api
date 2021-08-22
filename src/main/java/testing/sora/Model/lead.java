package testing.sora.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String family;
    private String login;
    private String password;
    private String nickname;
    public lead(String name, String family, String login, String password, String nickname) {
        this.name = name;
        this.family = family;
        this.login = login;
        this.password = password;
        this.nickname = nickname;
    }

    public lead() {
    }

}
