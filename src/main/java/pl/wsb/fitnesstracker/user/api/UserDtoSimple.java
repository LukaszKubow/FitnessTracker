package pl.wsb.fitnesstracker.user.api;

import jakarta.annotation.Nullable;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;

public record UserDtoSimple(
        @Nullable Long id,
        String firstName,
        String lastName,
        @JsonFormat(pattern = "yyyy-MM-dd") LocalDate birthdate
) {
}