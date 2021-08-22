package testing.sora.Rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import testing.sora.Model.lead;
import testing.sora.Repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@PersistenceContext(unitName = "testingBTW")

class RegistrationsTest {
    private EntityManager em;
    @Autowired
    UserRepository userRepository;


    @Test
    @Transactional
    void reg() {
//        Configuration config = new Configuration().configure();
//        config.setProperty("hibernate.connection.username", "xyz" );
//        config.setProperty("hibernate.connection.password", "password" );
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testing");
        em = entityManagerFactory.createEntityManager();

        assertEquals(em.find(lead.class,4 ),userRepository.findById(4L));
    }
}