package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.vld;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VirtualLinkType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.provider.network.ProviderNetwork;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.vld.common.InitParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.vld.vld.VnfdConnectionPointRef;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VldBuilder} instances.
 * 
 * @see VldBuilder
 *
 */
public class VldBuilder implements Builder<Vld> {

    private String _description;
    private String _id;
    private InitParams _initParams;
    private BigInteger _leafBandwidth;
    private String _name;
    private ProviderNetwork _providerNetwork;
    private BigInteger _rootBandwidth;
    private String _shortName;
    private VirtualLinkType _type;
    private String _vendor;
    private String _version;
    private List<VnfdConnectionPointRef> _vnfdConnectionPointRef;
    private Boolean _mgmtNetwork;
    private VldKey key;


    Map<Class<? extends Augmentation<Vld>>, Augmentation<Vld>> augmentation = Collections.emptyMap();

    public VldBuilder() {
    }
    public VldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdVldCommon arg) {
        this._initParams = arg.getInitParams();
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._type = arg.getType();
        this._rootBandwidth = arg.getRootBandwidth();
        this._leafBandwidth = arg.getLeafBandwidth();
        this._mgmtNetwork = arg.isMgmtNetwork();
        this._providerNetwork = arg.getProviderNetwork();
    }
    public VldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._type = arg.getType();
        this._rootBandwidth = arg.getRootBandwidth();
        this._leafBandwidth = arg.getLeafBandwidth();
        this._mgmtNetwork = arg.isMgmtNetwork();
        this._providerNetwork = arg.getProviderNetwork();
    }
    public VldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork arg) {
        this._providerNetwork = arg.getProviderNetwork();
    }

    public VldBuilder(Vld base) {
        this.key = base.key();
        this._id = base.getId();
        this._description = base.getDescription();
        this._initParams = base.getInitParams();
        this._leafBandwidth = base.getLeafBandwidth();
        this._name = base.getName();
        this._providerNetwork = base.getProviderNetwork();
        this._rootBandwidth = base.getRootBandwidth();
        this._shortName = base.getShortName();
        this._type = base.getType();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        this._mgmtNetwork = base.isMgmtNetwork();
        if (base instanceof VldImpl) {
            VldImpl impl = (VldImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vld>>, Augmentation<Vld>> aug =((AugmentationHolder<Vld>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdVldCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdVldCommon) {
            this._initParams = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdVldCommon)arg).getInitParams();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork) {
            this._providerNetwork = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork)arg).getProviderNetwork();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getName();
            this._shortName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getShortName();
            this._vendor = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getVendor();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getDescription();
            this._version = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getVersion();
            this._type = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getType();
            this._rootBandwidth = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getRootBandwidth();
            this._leafBandwidth = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getLeafBandwidth();
            this._mgmtNetwork = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).isMgmtNetwork();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdVldCommon, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon]");
    }

    public VldKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public InitParams getInitParams() {
        return _initParams;
    }
    
    public BigInteger getLeafBandwidth() {
        return _leafBandwidth;
    }
    
    public String getName() {
        return _name;
    }
    
    public ProviderNetwork getProviderNetwork() {
        return _providerNetwork;
    }
    
    public BigInteger getRootBandwidth() {
        return _rootBandwidth;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public VirtualLinkType getType() {
        return _type;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }
    
    public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    
    public Boolean isMgmtNetwork() {
        return _mgmtNetwork;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vld>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VldBuilder withKey(final VldKey key) {
        this.key = key;
        return this;
    }
    
    public VldBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VldBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public VldBuilder setInitParams(final InitParams value) {
        this._initParams = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKLEAFBANDWIDTHRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKLEAFBANDWIDTHRANGE_RANGES = a;
    }
    private static void checkLeafBandwidthRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKLEAFBANDWIDTHRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKLEAFBANDWIDTHRANGE_RANGES, value);
    }
    
    public VldBuilder setLeafBandwidth(final BigInteger value) {
    if (value != null) {
        checkLeafBandwidthRange(value);
        
    }
        this._leafBandwidth = value;
        return this;
    }
    
    public VldBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VldBuilder setProviderNetwork(final ProviderNetwork value) {
        this._providerNetwork = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKROOTBANDWIDTHRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKROOTBANDWIDTHRANGE_RANGES = a;
    }
    private static void checkRootBandwidthRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKROOTBANDWIDTHRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKROOTBANDWIDTHRANGE_RANGES, value);
    }
    
    public VldBuilder setRootBandwidth(final BigInteger value) {
    if (value != null) {
        checkRootBandwidthRange(value);
        
    }
        this._rootBandwidth = value;
        return this;
    }
    
    public VldBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public VldBuilder setType(final VirtualLinkType value) {
        this._type = value;
        return this;
    }
    
    public VldBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public VldBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    public VldBuilder setVnfdConnectionPointRef(final List<VnfdConnectionPointRef> values) {
        this._vnfdConnectionPointRef = values;
        return this;
    }
    
    
    public VldBuilder setMgmtNetwork(final Boolean value) {
        this._mgmtNetwork = value;
        return this;
    }
    
    public VldBuilder addAugmentation(Class<? extends Augmentation<Vld>> augmentationType, Augmentation<Vld> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VldBuilder removeAugmentation(Class<? extends Augmentation<Vld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vld build() {
        return new VldImpl(this);
    }

    public static final class VldImpl implements Vld {
    
        @JsonProperty("description")    	
        private final String _description;
        @JsonProperty("id")
        private final String _id;
        private final InitParams _initParams;
        private final BigInteger _leafBandwidth;
        @JsonProperty("name")                        
        private final String _name;
        private final ProviderNetwork _providerNetwork;
        private final BigInteger _rootBandwidth;
        @JsonProperty("short-name")                        
        private final String _shortName;
        @JsonProperty("type")                        
        private final VirtualLinkType _type;
        @JsonProperty("vendor")                        
        private final String _vendor;
        @JsonProperty("version")                        
        private final String _version;
        @JsonProperty("vnfd-connection-point-ref")                        
        private final List<VnfdConnectionPointRef> _vnfdConnectionPointRef;
        @JsonProperty("mgmt-network")                        
        private final Boolean _mgmtNetwork;
        private final VldKey key;
    
        private Map<Class<? extends Augmentation<Vld>>, Augmentation<Vld>> augmentation = Collections.emptyMap();
    
        VldImpl(VldBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VldKey(base.getId());
            }
            this._id = key.getId();
            this._description = base.getDescription();
            this._initParams = base.getInitParams();
            this._leafBandwidth = base.getLeafBandwidth();
            this._name = base.getName();
            this._providerNetwork = base.getProviderNetwork();
            this._rootBandwidth = base.getRootBandwidth();
            this._shortName = base.getShortName();
            this._type = base.getType();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
            this._mgmtNetwork = base.isMgmtNetwork();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
        
        public VldImpl(){
    		this( new VldBuilder() );        	
        }
    
        @Override
        public Class<Vld> getImplementedInterface() {
            return Vld.class;
        }
    
        @Override
        public VldKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public InitParams getInitParams() {
            return _initParams;
        }
        
        @Override
        public BigInteger getLeafBandwidth() {
            return _leafBandwidth;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public ProviderNetwork getProviderNetwork() {
            return _providerNetwork;
        }
        
        @Override
        public BigInteger getRootBandwidth() {
            return _rootBandwidth;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public VirtualLinkType getType() {
            return _type;
        }
        
        @Override
        public String getVendor() {
            return _vendor;
        }
        
        @Override
        public String getVersion() {
            return _version;
        }
        
        @Override
        public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
        }
        
        @Override
        public Boolean isMgmtNetwork() {
            return _mgmtNetwork;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Vld>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_initParams);
            result = prime * result + Objects.hashCode(_leafBandwidth);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_rootBandwidth);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
            result = prime * result + Objects.hashCode(_mgmtNetwork);
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
            if (!Vld.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vld other = (Vld)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_initParams, other.getInitParams())) {
                return false;
            }
            if (!Objects.equals(_leafBandwidth, other.getLeafBandwidth())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_providerNetwork, other.getProviderNetwork())) {
                return false;
            }
            if (!Objects.equals(_rootBandwidth, other.getRootBandwidth())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_mgmtNetwork, other.isMgmtNetwork())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VldImpl otherImpl = (VldImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vld>>, Augmentation<Vld>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vld");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_initParams", _initParams);
            CodeHelpers.appendValue(helper, "_leafBandwidth", _leafBandwidth);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_providerNetwork", _providerNetwork);
            CodeHelpers.appendValue(helper, "_rootBandwidth", _rootBandwidth);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "_vnfdConnectionPointRef", _vnfdConnectionPointRef);
            CodeHelpers.appendValue(helper, "_mgmtNetwork", _mgmtNetwork);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
