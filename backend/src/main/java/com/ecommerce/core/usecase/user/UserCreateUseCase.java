package com.ecommerce.core.usecase.user;
import com.ecommerce.core.usecase.UseCase;
import com.ecommerce.core.entity.User;
public class UserCreateUseCase implements UseCase<UserCreateUseCase.InputData, UserCreateUseCase.OutputData> {
    private final UserRepository userRepository;

    public UserCreateUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public OutputData execute(InputData input) {

        User user = new User(input.getEmail(),input.getPassword(), input.getName());
        return new OutputData(userRepository.create(user));
    }

    public static class InputData implements UseCase.InputData {
        private final String email;
        private final String name;
        private final String password;

        public InputData(String email, String name, String password) {
            this.email = email;
            this.name = name;
            this.password = password;
        }
       public String getEmail() {
            return this.email;
        }
       public String getName() {
            return this.name;
        }
       public String getPassword() {
            return this.password;
        }
    }
    public static class OutputData implements  UseCase.OutputData {
        private final User user;
        public OutputData(User user) {
            this.user = user;
        }
        public User getUser() {
            return this.user;
        }
    }
}
