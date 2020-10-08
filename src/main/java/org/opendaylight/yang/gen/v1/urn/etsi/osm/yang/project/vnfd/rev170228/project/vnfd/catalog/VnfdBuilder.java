package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.vnfd.catalog;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.HttpEndpoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.list.IpProfiles;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfOperationalStatus;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor.ServiceFunctionChain;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.InternalVld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.K8sCluster;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Kdu;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.ScalingGroupDescriptor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.VduDependency;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.VnfConfiguration;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfdBuilder} instances.
 * 
 * @see VnfdBuilder
 *
 */
public class VnfdBuilder implements Builder<Vnfd> {

    private List<ConnectionPoint> _connectionPoint;
    private String _description;
    private List<HttpEndpoint> _httpEndpoint;
    private String _id;
    private List<InternalVld> _internalVld;
    private List<IpProfiles> _ipProfiles;
    private K8sCluster _k8sCluster;
    private List<Kdu> _kdu;
    private String _logo;
    private MgmtInterface _mgmtInterface;
    private List<MonitoringParam> _monitoringParam;
    private String _name;
    private VnfOperationalStatus _operationalStatus;
    private List<PlacementGroups> _placementGroups;
    private List<ScalingGroupDescriptor> _scalingGroupDescriptor;
    private ServiceFunctionChain _serviceFunctionChain;
    private String _serviceFunctionType;
    private String _shortName;
    private List<Vdu> _vdu;
    private List<VduDependency> _vduDependency;
    private String _vendor;
    private String _version;
    private VnfConfiguration _vnfConfiguration;
    private VnfdKey key;


    Map<Class<? extends Augmentation<Vnfd>>, Augmentation<Vnfd>> augmentation = Collections.emptyMap();

    public VnfdBuilder() {
    }
    public VnfdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._logo = arg.getLogo();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._vnfConfiguration = arg.getVnfConfiguration();
        this._operationalStatus = arg.getOperationalStatus();
        this._mgmtInterface = arg.getMgmtInterface();
        this._internalVld = arg.getInternalVld();
        this._connectionPoint = arg.getConnectionPoint();
        this._vdu = arg.getVdu();
        this._kdu = arg.getKdu();
        this._k8sCluster = arg.getK8sCluster();
        this._vduDependency = arg.getVduDependency();
        this._serviceFunctionChain = arg.getServiceFunctionChain();
        this._serviceFunctionType = arg.getServiceFunctionType();
        this._scalingGroupDescriptor = arg.getScalingGroupDescriptor();
        this._monitoringParam = arg.getMonitoringParam();
        this._placementGroups = arg.getPlacementGroups();
        this._httpEndpoint = arg.getHttpEndpoint();
        this._ipProfiles = arg.getIpProfiles();
    }
    public VnfdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HttpEndpoints arg) {
        this._httpEndpoint = arg.getHttpEndpoint();
    }
    public VnfdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileList arg) {
        this._ipProfiles = arg.getIpProfiles();
    }

    public VnfdBuilder(Vnfd base) {
        this.key = base.key();
        this._id = base.getId();
        this._connectionPoint = base.getConnectionPoint();
        this._description = base.getDescription();
        this._httpEndpoint = base.getHttpEndpoint();
        this._internalVld = base.getInternalVld();
        this._ipProfiles = base.getIpProfiles();
        this._k8sCluster = base.getK8sCluster();
        this._kdu = base.getKdu();
        this._logo = base.getLogo();
        this._mgmtInterface = base.getMgmtInterface();
        this._monitoringParam = base.getMonitoringParam();
        this._name = base.getName();
        this._operationalStatus = base.getOperationalStatus();
        this._placementGroups = base.getPlacementGroups();
        this._scalingGroupDescriptor = base.getScalingGroupDescriptor();
        this._serviceFunctionChain = base.getServiceFunctionChain();
        this._serviceFunctionType = base.getServiceFunctionType();
        this._shortName = base.getShortName();
        this._vdu = base.getVdu();
        this._vduDependency = base.getVduDependency();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vnfConfiguration = base.getVnfConfiguration();
        if (base instanceof VnfdImpl) {
            VnfdImpl impl = (VnfdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vnfd>>, Augmentation<Vnfd>> aug =((AugmentationHolder<Vnfd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HttpEndpoints</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileList</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HttpEndpoints) {
            this._httpEndpoint = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HttpEndpoints)arg).getHttpEndpoint();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getName();
            this._shortName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getShortName();
            this._vendor = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getVendor();
            this._logo = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getLogo();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getDescription();
            this._version = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getVersion();
            this._vnfConfiguration = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getVnfConfiguration();
            this._operationalStatus = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getOperationalStatus();
            this._mgmtInterface = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getMgmtInterface();
            this._internalVld = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getInternalVld();
            this._connectionPoint = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getConnectionPoint();
            this._vdu = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getVdu();
            this._kdu = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getKdu();
            this._k8sCluster = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getK8sCluster();
            this._vduDependency = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getVduDependency();
            this._serviceFunctionChain = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getServiceFunctionChain();
            this._serviceFunctionType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getServiceFunctionType();
            this._scalingGroupDescriptor = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getScalingGroupDescriptor();
            this._monitoringParam = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getMonitoringParam();
            this._placementGroups = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor)arg).getPlacementGroups();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileList) {
            this._ipProfiles = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileList)arg).getIpProfiles();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HttpEndpoints, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileList]");
    }

    public VnfdKey key() {
        return key;
    }
    
    public List<ConnectionPoint> getConnectionPoint() {
        return _connectionPoint;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public List<HttpEndpoint> getHttpEndpoint() {
        return _httpEndpoint;
    }
    
    public String getId() {
        return _id;
    }
    
    public List<InternalVld> getInternalVld() {
        return _internalVld;
    }
    
    public List<IpProfiles> getIpProfiles() {
        return _ipProfiles;
    }
    
    public K8sCluster getK8sCluster() {
        return _k8sCluster;
    }
    
    public List<Kdu> getKdu() {
        return _kdu;
    }
    
    public String getLogo() {
        return _logo;
    }
    
    public MgmtInterface getMgmtInterface() {
        return _mgmtInterface;
    }
    
    public List<MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public String getName() {
        return _name;
    }
    
    public VnfOperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public List<PlacementGroups> getPlacementGroups() {
        return _placementGroups;
    }
    
    public List<ScalingGroupDescriptor> getScalingGroupDescriptor() {
        return _scalingGroupDescriptor;
    }
    
    public ServiceFunctionChain getServiceFunctionChain() {
        return _serviceFunctionChain;
    }
    
    public String getServiceFunctionType() {
        return _serviceFunctionType;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public List<Vdu> getVdu() {
        return _vdu;
    }
    
    public List<VduDependency> getVduDependency() {
        return _vduDependency;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }
    
    public VnfConfiguration getVnfConfiguration() {
        return _vnfConfiguration;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vnfd>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfdBuilder withKey(final VnfdKey key) {
        this.key = key;
        return this;
    }
    public VnfdBuilder setConnectionPoint(final List<ConnectionPoint> values) {
        this._connectionPoint = values;
        return this;
    }
    
    
    public VnfdBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    public VnfdBuilder setHttpEndpoint(final List<HttpEndpoint> values) {
        this._httpEndpoint = values;
        return this;
    }
    
    private static void check_idLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public VnfdBuilder setId(final String value) {
    if (value != null) {
        check_idLength(value);
        
    }
        this._id = value;
        return this;
    }
    public VnfdBuilder setInternalVld(final List<InternalVld> values) {
        this._internalVld = values;
        return this;
    }
    
    public VnfdBuilder setIpProfiles(final List<IpProfiles> values) {
        this._ipProfiles = values;
        return this;
    }
    
    
    public VnfdBuilder setK8sCluster(final K8sCluster value) {
        this._k8sCluster = value;
        return this;
    }
    public VnfdBuilder setKdu(final List<Kdu> values) {
        this._kdu = values;
        return this;
    }
    
    
    public VnfdBuilder setLogo(final String value) {
        this._logo = value;
        return this;
    }
    
    public VnfdBuilder setMgmtInterface(final MgmtInterface value) {
        this._mgmtInterface = value;
        return this;
    }
    public VnfdBuilder setMonitoringParam(final List<MonitoringParam> values) {
        this._monitoringParam = values;
        return this;
    }
    
    
    public VnfdBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VnfdBuilder setOperationalStatus(final VnfOperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    public VnfdBuilder setPlacementGroups(final List<PlacementGroups> values) {
        this._placementGroups = values;
        return this;
    }
    
    public VnfdBuilder setScalingGroupDescriptor(final List<ScalingGroupDescriptor> values) {
        this._scalingGroupDescriptor = values;
        return this;
    }
    
    
    public VnfdBuilder setServiceFunctionChain(final ServiceFunctionChain value) {
        this._serviceFunctionChain = value;
        return this;
    }
    
    public VnfdBuilder setServiceFunctionType(final String value) {
        this._serviceFunctionType = value;
        return this;
    }
    
    public VnfdBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    public VnfdBuilder setVdu(final List<Vdu> values) {
        this._vdu = values;
        return this;
    }
    
    public VnfdBuilder setVduDependency(final List<VduDependency> values) {
        this._vduDependency = values;
        return this;
    }
    
    
    public VnfdBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public VnfdBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    public VnfdBuilder setVnfConfiguration(final VnfConfiguration value) {
        this._vnfConfiguration = value;
        return this;
    }
    
    public VnfdBuilder addAugmentation(Class<? extends Augmentation<Vnfd>> augmentationType, Augmentation<Vnfd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdBuilder removeAugmentation(Class<? extends Augmentation<Vnfd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vnfd build() {
        return new VnfdImpl(this);
    }

    public static final class VnfdImpl implements Vnfd {
    
        @JsonProperty("connection-point")    
        private final List<ConnectionPoint> _connectionPoint;
        @JsonProperty("description")                        
        private final String _description;
        private final List<HttpEndpoint> _httpEndpoint;
        @JsonProperty("_id")                        
        private final String _id;
        private final List<InternalVld> _internalVld;
        private final List<IpProfiles> _ipProfiles;
        private final K8sCluster _k8sCluster;
        private final List<Kdu> _kdu;
        @JsonProperty("logo")                        
        private final String _logo;
        @JsonProperty("mgmt-interface")                         
        private final MgmtInterface _mgmtInterface;
        private final List<MonitoringParam> _monitoringParam;
        @JsonProperty("name")                
        private final String _name;
        private final VnfOperationalStatus _operationalStatus;
        @JsonProperty("placement-groups")                        
        private final List<PlacementGroups> _placementGroups;
        private final List<ScalingGroupDescriptor> _scalingGroupDescriptor;
        @JsonProperty("service-function-chain")                
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor.ServiceFunctionChain _serviceFunctionChain;
        private final String _serviceFunctionType;
        @JsonProperty("short-name")                        
        private final String _shortName;
        @JsonProperty("vdu")                        
        private final List<Vdu> _vdu;
        private final List<VduDependency> _vduDependency;
        @JsonProperty("vendor")                        
        private final String _vendor;
        @JsonProperty("version")                        
        private final String _version;
        //@JsonProperty("vnf-configuration")                        
        private final VnfConfiguration _vnfConfiguration;
        private final VnfdKey key;
    
        private Map<Class<? extends Augmentation<Vnfd>>, Augmentation<Vnfd>> augmentation = Collections.emptyMap();
    
        VnfdImpl(VnfdBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfdKey(base.getId());
            }
            this._id = key.getId();
            this._connectionPoint = base.getConnectionPoint();
            this._description = base.getDescription();
            this._httpEndpoint = base.getHttpEndpoint();
            this._internalVld = base.getInternalVld();
            this._ipProfiles = base.getIpProfiles();
            this._k8sCluster = base.getK8sCluster();
            this._kdu = base.getKdu();
            this._logo = base.getLogo();
            this._mgmtInterface = base.getMgmtInterface();
            this._monitoringParam = base.getMonitoringParam();
            this._name = base.getName();
            this._operationalStatus = base.getOperationalStatus();
            this._placementGroups = base.getPlacementGroups();
            this._scalingGroupDescriptor = base.getScalingGroupDescriptor();
            this._serviceFunctionChain = base.getServiceFunctionChain();
            this._serviceFunctionType = base.getServiceFunctionType();
            this._shortName = base.getShortName();
            this._vdu = base.getVdu();
            this._vduDependency = base.getVduDependency();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vnfConfiguration = base.getVnfConfiguration();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Vnfd> getImplementedInterface() {
            return Vnfd.class;
        }

        public VnfdImpl(){
        	this( new VnfdBuilder() );
        }        
                
        @Override
        public VnfdKey key() {
            return key;
        }
        
        @Override
        public List<ConnectionPoint> getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public List<HttpEndpoint> getHttpEndpoint() {
            return _httpEndpoint;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public List<InternalVld> getInternalVld() {
            return _internalVld;
        }
        
        @Override
        public List<IpProfiles> getIpProfiles() {
            return _ipProfiles;
        }
        
        @Override
        public K8sCluster getK8sCluster() {
            return _k8sCluster;
        }
        
        @Override
        public List<Kdu> getKdu() {
            return _kdu;
        }
        
        @Override
        public String getLogo() {
            return _logo;
        }
        
        @Override
        public MgmtInterface getMgmtInterface() {
            return _mgmtInterface;
        }
        
        @Override
        public List<MonitoringParam> getMonitoringParam() {
            return _monitoringParam;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public VnfOperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public List<PlacementGroups> getPlacementGroups() {
            return _placementGroups;
        }
        
        @Override
        public List<ScalingGroupDescriptor> getScalingGroupDescriptor() {
            return _scalingGroupDescriptor;
        }
        
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor.ServiceFunctionChain getServiceFunctionChain() {
            return _serviceFunctionChain;
        }
        
        @Override
        public String getServiceFunctionType() {
            return _serviceFunctionType;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public List<Vdu> getVdu() {
            return _vdu;
        }
        
        @Override
        public List<VduDependency> getVduDependency() {
            return _vduDependency;
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
        public VnfConfiguration getVnfConfiguration() {
            return _vnfConfiguration;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Vnfd>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_httpEndpoint);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_internalVld);
            result = prime * result + Objects.hashCode(_ipProfiles);
            result = prime * result + Objects.hashCode(_k8sCluster);
            result = prime * result + Objects.hashCode(_kdu);
            result = prime * result + Objects.hashCode(_logo);
            result = prime * result + Objects.hashCode(_mgmtInterface);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_placementGroups);
            result = prime * result + Objects.hashCode(_scalingGroupDescriptor);
            result = prime * result + Objects.hashCode(_serviceFunctionChain);
            result = prime * result + Objects.hashCode(_serviceFunctionType);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_vdu);
            result = prime * result + Objects.hashCode(_vduDependency);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vnfConfiguration);
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
            if (!Vnfd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vnfd other = (Vnfd)obj;
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_httpEndpoint, other.getHttpEndpoint())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_internalVld, other.getInternalVld())) {
                return false;
            }
            if (!Objects.equals(_ipProfiles, other.getIpProfiles())) {
                return false;
            }
            if (!Objects.equals(_k8sCluster, other.getK8sCluster())) {
                return false;
            }
            if (!Objects.equals(_kdu, other.getKdu())) {
                return false;
            }
            if (!Objects.equals(_logo, other.getLogo())) {
                return false;
            }
            if (!Objects.equals(_mgmtInterface, other.getMgmtInterface())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_placementGroups, other.getPlacementGroups())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupDescriptor, other.getScalingGroupDescriptor())) {
                return false;
            }
            if (!Objects.equals(_serviceFunctionChain, other.getServiceFunctionChain())) {
                return false;
            }
            if (!Objects.equals(_serviceFunctionType, other.getServiceFunctionType())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_vdu, other.getVdu())) {
                return false;
            }
            if (!Objects.equals(_vduDependency, other.getVduDependency())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vnfConfiguration, other.getVnfConfiguration())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdImpl otherImpl = (VnfdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vnfd>>, Augmentation<Vnfd>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vnfd");
            CodeHelpers.appendValue(helper, "_connectionPoint", _connectionPoint);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_httpEndpoint", _httpEndpoint);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_internalVld", _internalVld);
            CodeHelpers.appendValue(helper, "_ipProfiles", _ipProfiles);
            CodeHelpers.appendValue(helper, "_k8sCluster", _k8sCluster);
            CodeHelpers.appendValue(helper, "_kdu", _kdu);
            CodeHelpers.appendValue(helper, "_logo", _logo);
            CodeHelpers.appendValue(helper, "_mgmtInterface", _mgmtInterface);
            CodeHelpers.appendValue(helper, "_monitoringParam", _monitoringParam);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_operationalStatus", _operationalStatus);
            CodeHelpers.appendValue(helper, "_placementGroups", _placementGroups);
            CodeHelpers.appendValue(helper, "_scalingGroupDescriptor", _scalingGroupDescriptor);
            CodeHelpers.appendValue(helper, "_serviceFunctionChain", _serviceFunctionChain);
            CodeHelpers.appendValue(helper, "_serviceFunctionType", _serviceFunctionType);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_vdu", _vdu);
            CodeHelpers.appendValue(helper, "_vduDependency", _vduDependency);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "_vnfConfiguration", _vnfConfiguration);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
