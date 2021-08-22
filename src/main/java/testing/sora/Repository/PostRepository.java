package testing.sora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testing.sora.Model.post;
@Repository
public interface PostRepository extends JpaRepository<post,Long> {

}
