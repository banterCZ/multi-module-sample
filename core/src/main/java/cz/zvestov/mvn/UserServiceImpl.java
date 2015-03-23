package cz.zvestov.mvn;

import cz.zvestov.sample.UserService;

import java.util.Arrays;
import java.util.List;

/**
 *  Default implementation of {@link cz.zvestov.sample.UserService}.
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<String> getUserNames() {
        return Arrays.asList("Chuck Norris", "Rambo");
    }

}
