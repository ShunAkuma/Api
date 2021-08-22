package testing.sora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.sora.Model.between_lead_friend;

public interface ILeadFriendRepository extends JpaRepository<between_lead_friend,Long> {
    
}
