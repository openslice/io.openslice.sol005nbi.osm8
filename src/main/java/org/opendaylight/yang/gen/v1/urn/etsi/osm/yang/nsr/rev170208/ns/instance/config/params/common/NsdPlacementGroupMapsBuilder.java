package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudAccountType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.CloudProvider;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NsdPlacementGroupMapsBuilder} instances.
 * 
 * @see NsdPlacementGroupMapsBuilder
 *
 */
public class NsdPlacementGroupMapsBuilder implements Builder<NsdPlacementGroupMaps> {

    private CloudProvider _cloudProvider;
    private CloudAccountType _cloudType;
    private String _placementGroupRef;
    private NsdPlacementGroupMapsKey key;


    Map<Class<? extends Augmentation<NsdPlacementGroupMaps>>, Augmentation<NsdPlacementGroupMaps>> augmentation = Collections.emptyMap();

    public NsdPlacementGroupMapsBuilder() {
    }
    public NsdPlacementGroupMapsBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput arg) {
        this._cloudType = arg.getCloudType();
        this._cloudProvider = arg.getCloudProvider();
    }

    public NsdPlacementGroupMapsBuilder(NsdPlacementGroupMaps base) {
        this.key = base.key();
        this._placementGroupRef = base.getPlacementGroupRef();
        this._cloudProvider = base.getCloudProvider();
        this._cloudType = base.getCloudType();
        if (base instanceof NsdPlacementGroupMapsImpl) {
            NsdPlacementGroupMapsImpl impl = (NsdPlacementGroupMapsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NsdPlacementGroupMaps>>, Augmentation<NsdPlacementGroupMaps>> aug =((AugmentationHolder<NsdPlacementGroupMaps>) base).augmentations();
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

    public NsdPlacementGroupMapsKey key() {
        return key;
    }
    
    public CloudProvider getCloudProvider() {
        return _cloudProvider;
    }
    
    public CloudAccountType getCloudType() {
        return _cloudType;
    }
    
    public String getPlacementGroupRef() {
        return _placementGroupRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NsdPlacementGroupMaps>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NsdPlacementGroupMapsBuilder withKey(final NsdPlacementGroupMapsKey key) {
        this.key = key;
        return this;
    }
    
    public NsdPlacementGroupMapsBuilder setCloudProvider(final CloudProvider value) {
        this._cloudProvider = value;
        return this;
    }
    
    public NsdPlacementGroupMapsBuilder setCloudType(final CloudAccountType value) {
        this._cloudType = value;
        return this;
    }
    
    public NsdPlacementGroupMapsBuilder setPlacementGroupRef(final String value) {
        this._placementGroupRef = value;
        return this;
    }
    
    public NsdPlacementGroupMapsBuilder addAugmentation(Class<? extends Augmentation<NsdPlacementGroupMaps>> augmentationType, Augmentation<NsdPlacementGroupMaps> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsdPlacementGroupMapsBuilder removeAugmentation(Class<? extends Augmentation<NsdPlacementGroupMaps>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NsdPlacementGroupMaps build() {
        return new NsdPlacementGroupMapsImpl(this);
    }

    private static final class NsdPlacementGroupMapsImpl implements NsdPlacementGroupMaps {
    
        private final CloudProvider _cloudProvider;
        private final CloudAccountType _cloudType;
        private final String _placementGroupRef;
        private final NsdPlacementGroupMapsKey key;
    
        private Map<Class<? extends Augmentation<NsdPlacementGroupMaps>>, Augmentation<NsdPlacementGroupMaps>> augmentation = Collections.emptyMap();
    
        NsdPlacementGroupMapsImpl(NsdPlacementGroupMapsBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NsdPlacementGroupMapsKey(base.getPlacementGroupRef());
            }
            this._placementGroupRef = key.getPlacementGroupRef();
            this._cloudProvider = base.getCloudProvider();
            this._cloudType = base.getCloudType();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<NsdPlacementGroupMaps> getImplementedInterface() {
            return NsdPlacementGroupMaps.class;
        }
    
        @Override
        public NsdPlacementGroupMapsKey key() {
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
        public String getPlacementGroupRef() {
            return _placementGroupRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NsdPlacementGroupMaps>> E augmentation(Class<E> augmentationType) {
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
            if (!NsdPlacementGroupMaps.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NsdPlacementGroupMaps other = (NsdPlacementGroupMaps)obj;
            if (!Objects.equals(_cloudProvider, other.getCloudProvider())) {
                return false;
            }
            if (!Objects.equals(_cloudType, other.getCloudType())) {
                return false;
            }
            if (!Objects.equals(_placementGroupRef, other.getPlacementGroupRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsdPlacementGroupMapsImpl otherImpl = (NsdPlacementGroupMapsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NsdPlacementGroupMaps>>, Augmentation<NsdPlacementGroupMaps>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NsdPlacementGroupMaps");
            CodeHelpers.appendValue(helper, "_cloudProvider", _cloudProvider);
            CodeHelpers.appendValue(helper, "_cloudType", _cloudType);
            CodeHelpers.appendValue(helper, "_placementGroupRef", _placementGroupRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
