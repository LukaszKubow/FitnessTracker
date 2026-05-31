package pl.wsb.fitnesstracker.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wsb.fitnesstracker.event.UserEvent.UserEvent;

@Repository
public interface UserEventRepository extends JpaRepository<UserEvent, Long> {

}