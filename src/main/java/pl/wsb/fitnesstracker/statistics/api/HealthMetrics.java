package pl.wsb.fitnesstracker.statistics.api;

import jakarta.persistence.*;
import lombok.*;
import pl.wsb.fitnesstracker.user.api.User;

@Entity
@Table(name = "health_metrics") // Nazwa tabeli sprawdzana przez testy
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class HealthMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne // Kluczowa relacja OneToOne wymagana w punkcie 7
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "weight")
    private double weight;

    @Column(name = "height")
    private double height;

    @Column(name = "bmi")
    private double bmi;
}