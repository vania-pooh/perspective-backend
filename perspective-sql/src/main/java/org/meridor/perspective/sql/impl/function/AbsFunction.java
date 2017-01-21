package org.meridor.perspective.sql.impl.function;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

import static org.meridor.perspective.sql.impl.function.FunctionUtils.*;

@Component
public class AbsFunction implements Function<Double> {
    
    @Override
    public Set<String> validateInput(List<Object> args) {
        return oneOf(
                args,
                argsCount(1),
                isNumber(0)
        );
    }

    @Override
    public Class<Double> getReturnType() {
        return Double.class;
    }

    @Override
    public FunctionName getName() {
        return FunctionName.ABS;
    }

    @Override
    public Double apply(List<Object> objects) {
        return Math.abs(Double.valueOf(String.valueOf(objects.get(0))));
    }

    @Override
    public String getSignature() {
        return "ABS(X)";
    }

    @Override
    public String getDescription() {
        return "Returns absolute value of X.";
    }
}
