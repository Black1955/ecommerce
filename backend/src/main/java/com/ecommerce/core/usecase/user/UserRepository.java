package com.ecommerce.core.usecase.user;
import com.ecommerce.core.entity.User;
public interface UserRepository {
    User create(User user);
    User getbyId(long id);
    User getbByEmail(String email);
}
