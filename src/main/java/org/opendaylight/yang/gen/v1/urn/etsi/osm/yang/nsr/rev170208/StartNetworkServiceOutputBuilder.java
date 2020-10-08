package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link StartNetworkServiceOutputBuilder} instances.
 * 
 * @see StartNetworkServiceOutputBuilder
 *
 */
public class StartNetworkServiceOutputBuilder implements Builder<StartNetworkServiceOutput> {

    private Uuid _nsrId;


    Map<Class<? extends Augmentation<StartNetworkServiceOutput>>, Augmentation<StartNetworkServiceOutput>> augmentation = Collections.emptyMap();

    public StartNetworkServiceOutputBuilder() {
    }

    public StartNetworkServiceOutputBuilder(StartNetworkServiceOutput base) {
        this._nsrId = base.getNsrId();
        if (base instanceof StartNetworkServiceOutputImpl) {
            StartNetworkServiceOutputImpl impl = (StartNetworkServiceOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<StartNetworkServiceOutput>>, Augmentation<StartNetworkServiceOutput>> aug =((AugmentationHolder<StartNetworkServiceOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Uuid getNsrId() {
        return _nsrId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<StartNetworkServiceOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public StartNetworkServiceOutputBuilder setNsrId(final Uuid value) {
        this._nsrId = value;
        return this;
    }
    
    public StartNetworkServiceOutputBuilder addAugmentation(Class<? extends Augmentation<StartNetworkServiceOutput>> augmentationType, Augmentation<StartNetworkServiceOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public StartNetworkServiceOutputBuilder removeAugmentation(Class<? extends Augmentation<StartNetworkServiceOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public StartNetworkServiceOutput build() {
        return new StartNetworkServiceOutputImpl(this);
    }

    private static final class StartNetworkServiceOutputImpl implements StartNetworkServiceOutput {
    
        private final Uuid _nsrId;
    
        private Map<Class<? extends Augmentation<StartNetworkServiceOutput>>, Augmentation<StartNetworkServiceOutput>> augmentation = Collections.emptyMap();
    
        StartNetworkServiceOutputImpl(StartNetworkServiceOutputBuilder base) {
            this._nsrId = base.getNsrId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<StartNetworkServiceOutput> getImplementedInterface() {
            return StartNetworkServiceOutput.class;
        }
    
        @Override
        public Uuid getNsrId() {
            return _nsrId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<StartNetworkServiceOutput>> E augmentation(Class<E> augmentationType) {
            return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_nsrId);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!StartNetworkServiceOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            StartNetworkServiceOutput other = (StartNetworkServiceOutput)obj;
            if (!Objects.equals(_nsrId, other.getNsrId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StartNetworkServiceOutputImpl otherImpl = (StartNetworkServiceOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<StartNetworkServiceOutput>>, Augmentation<StartNetworkServiceOutput>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("StartNetworkServiceOutput");
            CodeHelpers.appendValue(helper, "_nsrId", _nsrId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
