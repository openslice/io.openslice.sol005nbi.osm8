package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudAccountType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.CloudProvider;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.SshAuthorizedKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.User;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfdPlacementGroupMapsBuilder} instances.
 * 
 * @see VnfdPlacementGroupMapsBuilder
 *
 */
public class VnfdPlacementGroupMapsBuilder implements Builder<VnfdPlacementGroupMaps> {

    private CloudProvider _cloudProvider;
    private CloudAccountType _cloudType;
    private Object _placementGroupRef;
    private List<SshAuthorizedKey> _sshAuthorizedKey;
    private List<User> _user;
    private Uuid _vnfdIdRef;
    private VnfdPlacementGroupMapsKey key;


    Map<Class<? extends Augmentation<VnfdPlacementGroupMaps>>, Augmentation<VnfdPlacementGroupMaps>> augmentation = Collections.emptyMap();

    public VnfdPlacementGroupMapsBuilder() {
    }
    public VnfdPlacementGroupMapsBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput arg) {
        this._cloudType = arg.getCloudType();
        this._cloudProvider = arg.getCloudProvider();
    }

    public VnfdPlacementGroupMapsBuilder(VnfdPlacementGroupMaps base) {
        this.key = base.key();
        this._placementGroupRef = base.getPlacementGroupRef();
        this._vnfdIdRef = base.getVnfdIdRef();
        this._cloudProvider = base.getCloudProvider();
        this._cloudType = base.getCloudType();
        this._sshAuthorizedKey = base.getSshAuthorizedKey();
        this._user = base.getUser();
        if (base instanceof VnfdPlacementGroupMapsImpl) {
            VnfdPlacementGroupMapsImpl impl = (VnfdPlacementGroupMapsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfdPlacementGroupMaps>>, Augmentation<VnfdPlacementGroupMaps>> aug =((AugmentationHolder<VnfdPlacementGroupMaps>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput) {
            this._cloudType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput)arg).getCloudType();
            this._cloudProvider = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput)arg).getCloudProvider();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput]");
    }

    public VnfdPlacementGroupMapsKey key() {
        return key;
    }
    
    public CloudProvider getCloudProvider() {
        return _cloudProvider;
    }
    
    public CloudAccountType getCloudType() {
        return _cloudType;
    }
    
    public Object getPlacementGroupRef() {
        return _placementGroupRef;
    }
    
    public List<SshAuthorizedKey> getSshAuthorizedKey() {
        return _sshAuthorizedKey;
    }
    
    public List<User> getUser() {
        return _user;
    }
    
    public Uuid getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfdPlacementGroupMaps>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfdPlacementGroupMapsBuilder withKey(final VnfdPlacementGroupMapsKey key) {
        this.key = key;
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder setCloudProvider(final CloudProvider value) {
        this._cloudProvider = value;
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder setCloudType(final CloudAccountType value) {
        this._cloudType = value;
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder setPlacementGroupRef(final Object value) {
        this._placementGroupRef = value;
        return this;
    }
    public VnfdPlacementGroupMapsBuilder setSshAuthorizedKey(final List<SshAuthorizedKey> values) {
        this._sshAuthorizedKey = values;
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder setUser(final List<User> values) {
        this._user = values;
        return this;
    }
    
    
    public VnfdPlacementGroupMapsBuilder setVnfdIdRef(final Uuid value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder addAugmentation(Class<? extends Augmentation<VnfdPlacementGroupMaps>> augmentationType, Augmentation<VnfdPlacementGroupMaps> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder removeAugmentation(Class<? extends Augmentation<VnfdPlacementGroupMaps>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdPlacementGroupMaps build() {
        return new VnfdPlacementGroupMapsImpl(this);
    }

    private static final class VnfdPlacementGroupMapsImpl implements VnfdPlacementGroupMaps {
    
        private final CloudProvider _cloudProvider;
        private final CloudAccountType _cloudType;
        private final Object _placementGroupRef;
        private final List<SshAuthorizedKey> _sshAuthorizedKey;
        private final List<User> _user;
        private final Uuid _vnfdIdRef;
        private final VnfdPlacementGroupMapsKey key;
    
        private Map<Class<? extends Augmentation<VnfdPlacementGroupMaps>>, Augmentation<VnfdPlacementGroupMaps>> augmentation = Collections.emptyMap();
    
        VnfdPlacementGroupMapsImpl(VnfdPlacementGroupMapsBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfdPlacementGroupMapsKey(base.getPlacementGroupRef(), base.getVnfdIdRef());
            }
            this._placementGroupRef = key.getPlacementGroupRef();
            this._vnfdIdRef = key.getVnfdIdRef();
            this._cloudProvider = base.getCloudProvider();
            this._cloudType = base.getCloudType();
            this._sshAuthorizedKey = base.getSshAuthorizedKey();
            this._user = base.getUser();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VnfdPlacementGroupMaps> getImplementedInterface() {
            return VnfdPlacementGroupMaps.class;
        }
    
        @Override
        public VnfdPlacementGroupMapsKey key() {
            return key;
        }
        
        @Override
        public CloudProvider getCloudProvider() {
            return _cloudProvider;
        }
        
        @Override
        public CloudAccountType getCloudType() {
            return _cloudType;
        }
        
        @Override
        public Object getPlacementGroupRef() {
            return _placementGroupRef;
        }
        
        @Override
        public List<SshAuthorizedKey> getSshAuthorizedKey() {
            return _sshAuthorizedKey;
        }
        
        @Override
        public List<User> getUser() {
            return _user;
        }
        
        @Override
        public Uuid getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfdPlacementGroupMaps>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cloudProvider);
            result = prime * result + Objects.hashCode(_cloudType);
            result = prime * result + Objects.hashCode(_placementGroupRef);
            result = prime * result + Objects.hashCode(_sshAuthorizedKey);
            result = prime * result + Objects.hashCode(_user);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
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
            if (!VnfdPlacementGroupMaps.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfdPlacementGroupMaps other = (VnfdPlacementGroupMaps)obj;
            if (!Objects.equals(_cloudProvider, other.getCloudProvider())) {
                return false;
            }
            if (!Objects.equals(_cloudType, other.getCloudType())) {
                return false;
            }
            if (!Objects.equals(_placementGroupRef, other.getPlacementGroupRef())) {
                return false;
            }
            if (!Objects.equals(_sshAuthorizedKey, other.getSshAuthorizedKey())) {
                return false;
            }
            if (!Objects.equals(_user, other.getUser())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdPlacementGroupMapsImpl otherImpl = (VnfdPlacementGroupMapsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfdPlacementGroupMaps>>, Augmentation<VnfdPlacementGroupMaps>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfdPlacementGroupMaps");
            CodeHelpers.appendValue(helper, "_cloudProvider", _cloudProvider);
            CodeHelpers.appendValue(helper, "_cloudType", _cloudType);
            CodeHelpers.appendValue(helper, "_placementGroupRef", _placementGroupRef);
            CodeHelpers.appendValue(helper, "_sshAuthorizedKey", _sshAuthorizedKey);
            CodeHelpers.appendValue(helper, "_user", _user);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
