package testing.sora.Model;

import javax.persistence.*;
import java.util.Optional;

@Entity

public class between_lead_friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lead_id")
    private lead lead;

    @ManyToOne
    @JoinColumn(name = "friend_id")
    private friend friend;

    public between_lead_friend() {
    }

    public between_lead_friend(lead lead, friend friend) {
        this.lead = lead;
        this.friend = friend;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
