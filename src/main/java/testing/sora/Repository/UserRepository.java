package testing.sora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testing.sora.Model.lead;

@Repository
public interface UserRepository extends JpaRepository<lead,Long> {
    public lead findByNickname(String nickname);
    public lead findByLogin(String login);
}
