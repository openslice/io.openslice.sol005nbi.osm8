package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.mgmt._interface.SshKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link MgmtInterfaceBuilder} instances.
 * 
 * @see MgmtInterfaceBuilder
 *
 */
public class MgmtInterfaceBuilder implements Builder<MgmtInterface> {

    private IpAddress _ipAddress;
    private PortNumber _port;
    private SshKey _sshKey;


    Map<Class<? extends Augmentation<MgmtInterface>>, Augmentation<MgmtInterface>> augmentation = Collections.emptyMap();

    public MgmtInterfaceBuilder() {
    }

    public MgmtInterfaceBuilder(MgmtInterface base) {
        this._ipAddress = base.getIpAddress();
        this._port = base.getPort();
        this._sshKey = base.getSshKey();
        if (base instanceof MgmtInterfaceImpl) {
            MgmtInterfaceImpl impl = (MgmtInterfaceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<MgmtInterface>>, Augmentation<MgmtInterface>> aug =((AugmentationHolder<MgmtInterface>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public PortNumber getPort() {
        return _port;
    }
    
    public SshKey getSshKey() {
        return _sshKey;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<MgmtInterface>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public MgmtInterfaceBuilder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
    public MgmtInterfaceBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
    public MgmtInterfaceBuilder setSshKey(final SshKey value) {
        this._sshKey = value;
        return this;
    }
    
    public MgmtInterfaceBuilder addAugmentation(Class<? extends Augmentation<MgmtInterface>> augmentationType, Augmentation<MgmtInterface> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MgmtInterfaceBuilder removeAugmentation(Class<? extends Augmentation<MgmtInterface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MgmtInterface build() {
        return new MgmtInterfaceImpl(this);
    }

    private static final class MgmtInterfaceImpl implements MgmtInterface {
    
        private final IpAddress _ipAddress;
        private final PortNumber _port;
        private final SshKey _sshKey;
    
        private Map<Class<? extends Augmentation<MgmtInterface>>, Augmentation<MgmtInterface>> augmentation = Collections.emptyMap();
    
        MgmtInterfaceImpl(MgmtInterfaceBuilder base) {
            this._ipAddress = base.getIpAddress();
            this._port = base.getPort();
            this._sshKey = base.getSshKey();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<MgmtInterface> getImplementedInterface() {
            return MgmtInterface.class;
        }
    
        @Override
        public IpAddress getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
        }
        
        @Override
        public SshKey getSshKey() {
            return _sshKey;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<MgmtInterface>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_port);
            result = prime * result + Objects.hashCode(_sshKey);
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
            if (!MgmtInterface.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            MgmtInterface other = (MgmtInterface)obj;
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (!Objects.equals(_sshKey, other.getSshKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MgmtInterfaceImpl otherImpl = (MgmtInterfaceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MgmtInterface>>, Augmentation<MgmtInterface>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MgmtInterface");
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "_port", _port);
            CodeHelpers.appendValue(helper, "_sshKey", _sshKey);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
