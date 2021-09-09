package testing.sora.Model.InputDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
public class LeadLoginInputModel {
    private String login;
    private String password;

    public LeadLoginInputModel() {
    }

}
