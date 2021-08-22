package testing.sora.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String body;
    private String description;
    private String authornickname;
    private Long viewing;

    @Column(name = "lead_id")
    private Long lead_id;
}
