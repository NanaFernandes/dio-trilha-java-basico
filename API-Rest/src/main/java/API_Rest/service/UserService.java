package API_Rest.service;

import API_Rest.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}
