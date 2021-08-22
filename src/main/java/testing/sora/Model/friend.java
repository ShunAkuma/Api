package testing.sora.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter

public class friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "family")
    private String family;
    @Column(name = "nickname")
    private String nickname;

    public friend(String name, String family, String nickname) {
        this.name = name;
        this.family = family;
        this.nickname = nickname;
    }
}
