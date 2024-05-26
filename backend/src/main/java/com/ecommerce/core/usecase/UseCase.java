package main.java.com.ecommerce.core.usecase;

public interface UseCase<I extends InputData, O extends OutputData> {
    O execute(I input);
    public interface InputData {

    }
    public interface OutputData {

    }
}
