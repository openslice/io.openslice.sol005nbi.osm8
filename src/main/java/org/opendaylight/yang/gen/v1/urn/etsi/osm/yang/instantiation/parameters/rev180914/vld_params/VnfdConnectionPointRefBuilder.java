package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_params;
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
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfdConnectionPointRefBuilder} instances.
 * 
 * @see VnfdConnectionPointRefBuilder
 *
 */
public class VnfdConnectionPointRefBuilder implements Builder<VnfdConnectionPointRef> {

    private IpAddress _ipAddress;
    private String _memberVnfIndexRef;
    private String _vnfdConnectionPointRef;
    private VnfdConnectionPointRefKey key;


    Map<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> augmentation = Collections.emptyMap();

    public VnfdConnectionPointRefBuilder() {
    }

    public VnfdConnectionPointRefBuilder(VnfdConnectionPointRef base) {
        this.key = base.key();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        this._ipAddress = base.getIpAddress();
        if (base instanceof VnfdConnectionPointRefImpl) {
            VnfdConnectionPointRefImpl impl = (VnfdConnectionPointRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> aug =((AugmentationHolder<VnfdConnectionPointRef>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public VnfdConnectionPointRefKey key() {
        return key;
    }
    
    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public String getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfdConnectionPointRef>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfdConnectionPointRefBuilder withKey(final VnfdConnectionPointRefKey key) {
        this.key = key;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder setMemberVnfIndexRef(final String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder setVnfdConnectionPointRef(final String value) {
        this._vnfdConnectionPointRef = value;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder addAugmentation(Class<? extends Augmentation<VnfdConnectionPointRef>> augmentationType, Augmentation<VnfdConnectionPointRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdConnectionPointRefBuilder removeAugmentation(Class<? extends Augmentation<VnfdConnectionPointRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdConnectionPointRef build() {
        return new VnfdConnectionPointRefImpl(this);
    }

    private static final class VnfdConnectionPointRefImpl implements VnfdConnectionPointRef {
    
        private final IpAddress _ipAddress;
        private final String _memberVnfIndexRef;
        private final String _vnfdConnectionPointRef;
        private final VnfdConnectionPointRefKey key;
    
        private Map<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> augmentation = Collections.emptyMap();
    
        VnfdConnectionPointRefImpl(VnfdConnectionPointRefBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfdConnectionPointRefKey(base.getMemberVnfIndexRef(), base.getVnfdConnectionPointRef());
            }
            this._memberVnfIndexRef = key.getMemberVnfIndexRef();
            this._vnfdConnectionPointRef = key.getVnfdConnectionPointRef();
            this._ipAddress = base.getIpAddress();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VnfdConnectionPointRef> getImplementedInterface() {
            return VnfdConnectionPointRef.class;
        }
    
        @Override
        public VnfdConnectionPointRefKey key() {
            return key;
        }
        
        @Override
        public IpAddress getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public String getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfdConnectionPointRef>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ipAddress);
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
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
            if (!VnfdConnectionPointRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfdConnectionPointRef other = (VnfdConnectionPointRef)obj;
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdConnectionPointRefImpl otherImpl = (VnfdConnectionPointRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfdConnectionPointRef");
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_vnfdConnectionPointRef", _vnfdConnectionPointRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
