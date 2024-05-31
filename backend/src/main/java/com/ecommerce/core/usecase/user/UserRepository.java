package com.ecommerce.core.usecase.user;
import com.ecommerce.core.entity.User;

import java.util.UUID;

public interface UserRepository {
    User create(User user);
    User getbyId(UUID id);
    User getbByEmail(String email);
    boolean existUser(String email);
}
