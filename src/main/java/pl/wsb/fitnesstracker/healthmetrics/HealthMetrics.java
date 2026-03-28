package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.persistence.*;
import java.time.LocalDate;
import pl.wsb.fitnesstracker.user.api.User;

@Entity
@Table(name = "health_metrics")
public class HealthMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private double weight;
    private double height;
    private LocalDate date;

}
