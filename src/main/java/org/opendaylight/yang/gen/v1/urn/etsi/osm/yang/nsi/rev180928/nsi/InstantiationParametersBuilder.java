package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceSubnet;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceVld;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link InstantiationParametersBuilder} instances.
 * 
 * @see InstantiationParametersBuilder
 *
 */
public class InstantiationParametersBuilder implements Builder<InstantiationParameters> {

    private List<NetsliceSubnet> _netsliceSubnet;
    private List<NetsliceVld> _netsliceVld;
    private String _sshKeys;
    private String _vimAccountId;


    Map<Class<? extends Augmentation<InstantiationParameters>>, Augmentation<InstantiationParameters>> augmentation = Collections.emptyMap();

    public InstantiationParametersBuilder() {
    }
    public InstantiationParametersBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceParams arg) {
        this._vimAccountId = arg.getVimAccountId();
        this._sshKeys = arg.getSshKeys();
        this._netsliceSubnet = arg.getNetsliceSubnet();
        this._netsliceVld = arg.getNetsliceVld();
    }

    public InstantiationParametersBuilder(InstantiationParameters base) {
        this._netsliceSubnet = base.getNetsliceSubnet();
        this._netsliceVld = base.getNetsliceVld();
        this._sshKeys = base.getSshKeys();
        this._vimAccountId = base.getVimAccountId();
        if (base instanceof InstantiationParametersImpl) {
            InstantiationParametersImpl impl = (InstantiationParametersImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<InstantiationParameters>>, Augmentation<InstantiationParameters>> aug =((AugmentationHolder<InstantiationParameters>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceParams) {
            this._vimAccountId = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceParams)arg).getVimAccountId();
            this._sshKeys = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceParams)arg).getSshKeys();
            this._netsliceSubnet = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceParams)arg).getNetsliceSubnet();
            this._netsliceVld = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceParams)arg).getNetsliceVld();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceParams]");
    }

    public List<NetsliceSubnet> getNetsliceSubnet() {
        return _netsliceSubnet;
    }
    
    public List<NetsliceVld> getNetsliceVld() {
        return _netsliceVld;
    }
    
    public String getSshKeys() {
        return _sshKeys;
    }
    
    public String getVimAccountId() {
        return _vimAccountId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<InstantiationParameters>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public InstantiationParametersBuilder setNetsliceSubnet(final List<NetsliceSubnet> values) {
        this._netsliceSubnet = values;
        return this;
    }
    
    public InstantiationParametersBuilder setNetsliceVld(final List<NetsliceVld> values) {
        this._netsliceVld = values;
        return this;
    }
    
    
    public InstantiationParametersBuilder setSshKeys(final String value) {
        this._sshKeys = value;
        return this;
    }
    
    public InstantiationParametersBuilder setVimAccountId(final String value) {
        this._vimAccountId = value;
        return this;
    }
    
    public InstantiationParametersBuilder addAugmentation(Class<? extends Augmentation<InstantiationParameters>> augmentationType, Augmentation<InstantiationParameters> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InstantiationParametersBuilder removeAugmentation(Class<? extends Augmentation<InstantiationParameters>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InstantiationParameters build() {
        return new InstantiationParametersImpl(this);
    }

    private static final class InstantiationParametersImpl implements InstantiationParameters {
    
        private final List<NetsliceSubnet> _netsliceSubnet;
        private final List<NetsliceVld> _netsliceVld;
        private final String _sshKeys;
        private final String _vimAccountId;
    
        private Map<Class<? extends Augmentation<InstantiationParameters>>, Augmentation<InstantiationParameters>> augmentation = Collections.emptyMap();
    
        InstantiationParametersImpl(InstantiationParametersBuilder base) {
            this._netsliceSubnet = base.getNetsliceSubnet();
            this._netsliceVld = base.getNetsliceVld();
            this._sshKeys = base.getSshKeys();
            this._vimAccountId = base.getVimAccountId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<InstantiationParameters> getImplementedInterface() {
            return InstantiationParameters.class;
        }
    
        @Override
        public List<NetsliceSubnet> getNetsliceSubnet() {
            return _netsliceSubnet;
        }
        
        @Override
        public List<NetsliceVld> getNetsliceVld() {
            return _netsliceVld;
        }
        
        @Override
        public String getSshKeys() {
            return _sshKeys;
        }
        
        @Override
        public String getVimAccountId() {
            return _vimAccountId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<InstantiationParameters>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_netsliceSubnet);
            result = prime * result + Objects.hashCode(_netsliceVld);
            result = prime * result + Objects.hashCode(_sshKeys);
            result = prime * result + Objects.hashCode(_vimAccountId);
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
            if (!InstantiationParameters.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            InstantiationParameters other = (InstantiationParameters)obj;
            if (!Objects.equals(_netsliceSubnet, other.getNetsliceSubnet())) {
                return false;
            }
            if (!Objects.equals(_netsliceVld, other.getNetsliceVld())) {
                return false;
            }
            if (!Objects.equals(_sshKeys, other.getSshKeys())) {
                return false;
            }
            if (!Objects.equals(_vimAccountId, other.getVimAccountId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InstantiationParametersImpl otherImpl = (InstantiationParametersImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InstantiationParameters>>, Augmentation<InstantiationParameters>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InstantiationParameters");
            CodeHelpers.appendValue(helper, "_netsliceSubnet", _netsliceSubnet);
            CodeHelpers.appendValue(helper, "_netsliceVld", _netsliceVld);
            CodeHelpers.appendValue(helper, "_sshKeys", _sshKeys);
            CodeHelpers.appendValue(helper, "_vimAccountId", _vimAccountId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
