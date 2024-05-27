package com.ecommerce.core.usecase;

public interface UseCase<I extends UseCase.InputData, O extends UseCase.OutputData> {
    O execute(I input);
    public interface InputData {

    }
    public interface OutputData {

    }
}
