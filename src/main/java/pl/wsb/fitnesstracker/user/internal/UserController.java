package pl.wsb.fitnesstracker.user.internal;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wsb.fitnesstracker.user.api.UserDtoSimple;
import pl.wsb.fitnesstracker.user.api.UserProvider;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Controller responsible for handling user-related Internet API requests.
 */
@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
class UserController {

    private final UserProvider userProvider;
    private final UserMapper userMapper;

    /**
     * Retrieves basic information about all users registered in the system.
     *
     * @return list of {@link UserDtoSimple} objects containing basic user data
     */
    @GetMapping
    public List<UserDtoSimple> getAllUsers() {
        return userProvider.findAllUsers()
                .stream()
                .map(userMapper::toUserDtoSimple)
                .collect(Collectors.toList());
    }
}