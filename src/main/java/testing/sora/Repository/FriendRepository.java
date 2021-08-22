package testing.sora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.sora.Model.friend;

public interface FriendRepository extends JpaRepository<friend,Long> {

}
