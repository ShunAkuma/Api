package testing.sora.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
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


    public Long getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthornickname() {
        return this.authornickname;
    }

    public void setAuthornickname(String authornickname) {
        this.authornickname = authornickname;
    }

    public Long getViewing() {
        return this.viewing;
    }

    public void setViewing(Long viewing) {
        this.viewing = viewing;
    }

    public Long getLead_id() {
        return this.lead_id;
    }

    public void setLead_id(Long lead_id) {
        this.lead_id = lead_id;
    }

}
