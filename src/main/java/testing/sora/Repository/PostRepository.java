package testing.sora.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import testing.sora.Model.post;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<post,Long> {

    public List<post> findAllByLead_id(Long lead_id);

}
