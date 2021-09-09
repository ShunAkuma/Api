package testing.sora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import testing.sora.Model.post;

import java.util.List;
import java.util.Map;

@EnableJpaRepositories
@Repository
public interface PostRepository extends JpaRepository<post,Long> {
    public post findByAuthornickname(String authornickname);
    public Iterable<post> findAllByAuthornickname(String Authornickname);
}
