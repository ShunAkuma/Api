package testing.sora.Model.InputDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Getter
public class LeadLoginInputModel {

    @NotNull
    @Size(min = 6,max = 20)
    private String login;
    @NotNull
    @Size(min = 8,max = 20)
    private String password;

    public LeadLoginInputModel() {
    }

}
