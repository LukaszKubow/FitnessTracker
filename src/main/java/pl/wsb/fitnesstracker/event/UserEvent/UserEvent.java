package pl.wsb.fitnesstracker.event.UserEvent;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.wsb.fitnesstracker.event.Event;
import pl.wsb.fitnesstracker.user.api.User; // Import encji User
import java.time.LocalDateTime;

@Entity
@Table(name = "user_event")
@Getter
@Setter
@NoArgsConstructor
public class UserEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private LocalDateTime registrationDate;

}