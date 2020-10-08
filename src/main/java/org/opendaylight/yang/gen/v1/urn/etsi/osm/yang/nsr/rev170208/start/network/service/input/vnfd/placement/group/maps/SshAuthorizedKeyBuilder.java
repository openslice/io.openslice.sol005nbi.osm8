package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link SshAuthorizedKeyBuilder} instances.
 * 
 * @see SshAuthorizedKeyBuilder
 *
 */
public class SshAuthorizedKeyBuilder implements Builder<SshAuthorizedKey> {

    private Object _keyPairRef;
    private SshAuthorizedKeyKey key;


    Map<Class<? extends Augmentation<SshAuthorizedKey>>, Augmentation<SshAuthorizedKey>> augmentation = Collections.emptyMap();

    public SshAuthorizedKeyBuilder() {
    }

    public SshAuthorizedKeyBuilder(SshAuthorizedKey base) {
        this.key = base.key();
        this._keyPairRef = base.getKeyPairRef();
        if (base instanceof SshAuthorizedKeyImpl) {
            SshAuthorizedKeyImpl impl = (SshAuthorizedKeyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<SshAuthorizedKey>>, Augmentation<SshAuthorizedKey>> aug =((AugmentationHolder<SshAuthorizedKey>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public SshAuthorizedKeyKey key() {
        return key;
    }
    
    public Object getKeyPairRef() {
        return _keyPairRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<SshAuthorizedKey>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public SshAuthorizedKeyBuilder withKey(final SshAuthorizedKeyKey key) {
        this.key = key;
        return this;
    }
    
    public SshAuthorizedKeyBuilder setKeyPairRef(final Object value) {
        this._keyPairRef = value;
        return this;
    }
    
    public SshAuthorizedKeyBuilder addAugmentation(Class<? extends Augmentation<SshAuthorizedKey>> augmentationType, Augmentation<SshAuthorizedKey> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SshAuthorizedKeyBuilder removeAugmentation(Class<? extends Augmentation<SshAuthorizedKey>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SshAuthorizedKey build() {
        return new SshAuthorizedKeyImpl(this);
    }

    private static final class SshAuthorizedKeyImpl implements SshAuthorizedKey {
    
        private final Object _keyPairRef;
        private final SshAuthorizedKeyKey key;
    
        private Map<Class<? extends Augmentation<SshAuthorizedKey>>, Augmentation<SshAuthorizedKey>> augmentation = Collections.emptyMap();
    
        SshAuthorizedKeyImpl(SshAuthorizedKeyBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new SshAuthorizedKeyKey(base.getKeyPairRef());
            }
            this._keyPairRef = key.getKeyPairRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<SshAuthorizedKey> getImplementedInterface() {
            return SshAuthorizedKey.class;
        }
    
        @Override
        public SshAuthorizedKeyKey key() {
            return key;
        }
        
        @Override
        public Object getKeyPairRef() {
            return _keyPairRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<SshAuthorizedKey>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_keyPairRef);
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
            if (!SshAuthorizedKey.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            SshAuthorizedKey other = (SshAuthorizedKey)obj;
            if (!Objects.equals(_keyPairRef, other.getKeyPairRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SshAuthorizedKeyImpl otherImpl = (SshAuthorizedKeyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SshAuthorizedKey>>, Augmentation<SshAuthorizedKey>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SshAuthorizedKey");
            CodeHelpers.appendValue(helper, "_keyPairRef", _keyPairRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
