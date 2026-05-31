package pl.wsb.fitnesstracker.user.internal;

import org.springframework.stereotype.Component;
import pl.wsb.fitnesstracker.user.api.User;
import pl.wsb.fitnesstracker.user.api.UserDtoSimple;

@Component
class UserMapper {

    UserDtoSimple toUserDtoSimple(User user) {
        return new UserDtoSimple(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getBirthdate() // Mapujemy datę urodzenia
        );
    }
}