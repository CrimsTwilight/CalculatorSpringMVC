package by.crims.service;

import by.crims.entity.Operation;
import by.crims.operations.*;
import org.springframework.stereotype.Component;

@Component
public class CalcService {
    public double getResult(Operation operation) {
        switch (operation.getOperation()) {
            case "add": return Addition.calculate(operation.getNum1(), operation.getNum2());
            case "sub": return Subtraction.calculate(operation.getNum1(), operation.getNum2());
            case "mult": return Multiplication.calculate(operation.getNum1(), operation.getNum2());
            case "div": return Division.calculate(operation.getNum1(), operation.getNum2());
        }
        return 0;
    }
}