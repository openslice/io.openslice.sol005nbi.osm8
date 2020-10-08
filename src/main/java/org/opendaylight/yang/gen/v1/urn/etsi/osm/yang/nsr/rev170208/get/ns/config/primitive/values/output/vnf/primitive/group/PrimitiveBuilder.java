package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.vnf.primitive.group;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.vnf.primitive.group.primitive.Parameter;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link PrimitiveBuilder} instances.
 * 
 * @see PrimitiveBuilder
 *
 */
public class PrimitiveBuilder implements Builder<Primitive> {

    private Long _index;
    private String _name;
    private List<Parameter> _parameter;
    private PrimitiveKey key;


    Map<Class<? extends Augmentation<Primitive>>, Augmentation<Primitive>> augmentation = Collections.emptyMap();

    public PrimitiveBuilder() {
    }

    public PrimitiveBuilder(Primitive base) {
        this.key = base.key();
        this._index = base.getIndex();
        this._name = base.getName();
        this._parameter = base.getParameter();
        if (base instanceof PrimitiveImpl) {
            PrimitiveImpl impl = (PrimitiveImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Primitive>>, Augmentation<Primitive>> aug =((AugmentationHolder<Primitive>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public PrimitiveKey key() {
        return key;
    }
    
    public Long getIndex() {
        return _index;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Primitive>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public PrimitiveBuilder withKey(final PrimitiveKey key) {
        this.key = key;
        return this;
    }
    private static void checkIndexRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public PrimitiveBuilder setIndex(final Long value) {
    if (value != null) {
        checkIndexRange(value);
        
    }
        this._index = value;
        return this;
    }
    
    public PrimitiveBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public PrimitiveBuilder setParameter(final List<Parameter> values) {
        this._parameter = values;
        return this;
    }
    
    
    public PrimitiveBuilder addAugmentation(Class<? extends Augmentation<Primitive>> augmentationType, Augmentation<Primitive> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PrimitiveBuilder removeAugmentation(Class<? extends Augmentation<Primitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Primitive build() {
        return new PrimitiveImpl(this);
    }

    private static final class PrimitiveImpl implements Primitive {
    
        private final Long _index;
        private final String _name;
        private final List<Parameter> _parameter;
        private final PrimitiveKey key;
    
        private Map<Class<? extends Augmentation<Primitive>>, Augmentation<Primitive>> augmentation = Collections.emptyMap();
    
        PrimitiveImpl(PrimitiveBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new PrimitiveKey(base.getIndex());
            }
            this._index = key.getIndex();
            this._name = base.getName();
            this._parameter = base.getParameter();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Primitive> getImplementedInterface() {
            return Primitive.class;
        }
    
        @Override
        public PrimitiveKey key() {
            return key;
        }
        
        @Override
        public Long getIndex() {
            return _index;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Primitive>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_index);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameter);
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
            if (!Primitive.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Primitive other = (Primitive)obj;
            if (!Objects.equals(_index, other.getIndex())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PrimitiveImpl otherImpl = (PrimitiveImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Primitive>>, Augmentation<Primitive>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Primitive");
            CodeHelpers.appendValue(helper, "_index", _index);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
