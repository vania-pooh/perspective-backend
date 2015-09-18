package org.meridor.perspective.framework.storage;

import org.meridor.perspective.beans.Instance;

import java.util.Collection;
import java.util.Optional;

public interface InstancesAware {


    boolean instanceExists(Instance instance);

    Collection<Instance> getInstances(Optional<String> query) throws IllegalQueryException;

    Optional<Instance> getInstance(String instanceId);

    void saveInstance(Instance instance);

    boolean isInstanceDeleted(String instanceId);

    void deleteInstance(Instance instance);

}