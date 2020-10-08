package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceBus;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.volume.info.VolumeSource;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VolumesBuilder} instances.
 * 
 * @see VolumesBuilder
 *
 */
public class VolumesBuilder implements Builder<Volumes> {

    private String _description;
    private DeviceBus _deviceBus;
    private DeviceType _deviceType;
    private String _name;
    private BigInteger _size;
    private String _volumeId;
    private VolumeSource _volumeSource;
    private VolumesKey key;


    Map<Class<? extends Augmentation<Volumes>>, Augmentation<Volumes>> augmentation = Collections.emptyMap();

    public VolumesBuilder() {
    }
    public VolumesBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo arg) {
        this._description = arg.getDescription();
        this._size = arg.getSize();
        this._volumeSource = arg.getVolumeSource();
        this._deviceBus = arg.getDeviceBus();
        this._deviceType = arg.getDeviceType();
    }

    public VolumesBuilder(Volumes base) {
        this.key = base.key();
        this._name = base.getName();
        this._description = base.getDescription();
        this._deviceBus = base.getDeviceBus();
        this._deviceType = base.getDeviceType();
        this._size = base.getSize();
        this._volumeId = base.getVolumeId();
        this._volumeSource = base.getVolumeSource();
        if (base instanceof VolumesImpl) {
            VolumesImpl impl = (VolumesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Volumes>>, Augmentation<Volumes>> aug =((AugmentationHolder<Volumes>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo) {
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo)arg).getDescription();
            this._size = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo)arg).getSize();
            this._volumeSource = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo)arg).getVolumeSource();
            this._deviceBus = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo)arg).getDeviceBus();
            this._deviceType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo)arg).getDeviceType();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo]");
    }

    public VolumesKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public DeviceBus getDeviceBus() {
        return _deviceBus;
    }
    
    public DeviceType getDeviceType() {
        return _deviceType;
    }
    
    public String getName() {
        return _name;
    }
    
    public BigInteger getSize() {
        return _size;
    }
    
    public String getVolumeId() {
        return _volumeId;
    }
    
    public VolumeSource getVolumeSource() {
        return _volumeSource;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Volumes>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VolumesBuilder withKey(final VolumesKey key) {
        this.key = key;
        return this;
    }
    
    public VolumesBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VolumesBuilder setDeviceBus(final DeviceBus value) {
        this._deviceBus = value;
        return this;
    }
    
    public VolumesBuilder setDeviceType(final DeviceType value) {
        this._deviceType = value;
        return this;
    }
    
    public VolumesBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKSIZERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKSIZERANGE_RANGES = a;
    }
    private static void checkSizeRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKSIZERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKSIZERANGE_RANGES, value);
    }
    
    public VolumesBuilder setSize(final BigInteger value) {
    if (value != null) {
        checkSizeRange(value);
        
    }
        this._size = value;
        return this;
    }
    
    public VolumesBuilder setVolumeId(final String value) {
        this._volumeId = value;
        return this;
    }
    
    public VolumesBuilder setVolumeSource(final VolumeSource value) {
        this._volumeSource = value;
        return this;
    }
    
    public VolumesBuilder addAugmentation(Class<? extends Augmentation<Volumes>> augmentationType, Augmentation<Volumes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VolumesBuilder removeAugmentation(Class<? extends Augmentation<Volumes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Volumes build() {
        return new VolumesImpl(this);
    }

    private static final class VolumesImpl implements Volumes {
    
        private final String _description;
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceBus _deviceBus;
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceType _deviceType;
        private final String _name;
        private final BigInteger _size;
        private final String _volumeId;
        private final VolumeSource _volumeSource;
        private final VolumesKey key;
    
        private Map<Class<? extends Augmentation<Volumes>>, Augmentation<Volumes>> augmentation = Collections.emptyMap();
    
        VolumesImpl(VolumesBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VolumesKey(base.getName());
            }
            this._name = key.getName();
            this._description = base.getDescription();
            this._deviceBus = base.getDeviceBus();
            this._deviceType = base.getDeviceType();
            this._size = base.getSize();
            this._volumeId = base.getVolumeId();
            this._volumeSource = base.getVolumeSource();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Volumes> getImplementedInterface() {
            return Volumes.class;
        }
    
        @Override
        public VolumesKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceBus getDeviceBus() {
            return _deviceBus;
        }
        
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceType getDeviceType() {
            return _deviceType;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public BigInteger getSize() {
            return _size;
        }
        
        @Override
        public String getVolumeId() {
            return _volumeId;
        }
        
        @Override
        public VolumeSource getVolumeSource() {
            return _volumeSource;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Volumes>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_deviceBus);
            result = prime * result + Objects.hashCode(_deviceType);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_size);
            result = prime * result + Objects.hashCode(_volumeId);
            result = prime * result + Objects.hashCode(_volumeSource);
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
            if (!Volumes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Volumes other = (Volumes)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_deviceBus, other.getDeviceBus())) {
                return false;
            }
            if (!Objects.equals(_deviceType, other.getDeviceType())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_size, other.getSize())) {
                return false;
            }
            if (!Objects.equals(_volumeId, other.getVolumeId())) {
                return false;
            }
            if (!Objects.equals(_volumeSource, other.getVolumeSource())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VolumesImpl otherImpl = (VolumesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Volumes>>, Augmentation<Volumes>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Volumes");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_deviceBus", _deviceBus);
            CodeHelpers.appendValue(helper, "_deviceType", _deviceType);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_size", _size);
            CodeHelpers.appendValue(helper, "_volumeId", _volumeId);
            CodeHelpers.appendValue(helper, "_volumeSource", _volumeSource);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
