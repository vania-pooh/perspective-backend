package org.meridor.perspective.shell.validator;

import java.util.Set;

public interface ObjectValidator {
    
    Set<String> validate(Object object);
    
}
