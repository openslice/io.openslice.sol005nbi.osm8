package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ExecScaleOutOutputBuilder} instances.
 * 
 * @see ExecScaleOutOutputBuilder
 *
 */
public class ExecScaleOutOutputBuilder implements Builder<ExecScaleOutOutput> {

    private BigInteger _instanceId;


    Map<Class<? extends Augmentation<ExecScaleOutOutput>>, Augmentation<ExecScaleOutOutput>> augmentation = Collections.emptyMap();

    public ExecScaleOutOutputBuilder() {
    }

    public ExecScaleOutOutputBuilder(ExecScaleOutOutput base) {
        this._instanceId = base.getInstanceId();
        if (base instanceof ExecScaleOutOutputImpl) {
            ExecScaleOutOutputImpl impl = (ExecScaleOutOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ExecScaleOutOutput>>, Augmentation<ExecScaleOutOutput>> aug =((AugmentationHolder<ExecScaleOutOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public BigInteger getInstanceId() {
        return _instanceId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ExecScaleOutOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static final Range<java.math.BigInteger>[] CHECKINSTANCEIDRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKINSTANCEIDRANGE_RANGES = a;
    }
    private static void checkInstanceIdRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKINSTANCEIDRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKINSTANCEIDRANGE_RANGES, value);
    }
    
    public ExecScaleOutOutputBuilder setInstanceId(final BigInteger value) {
    if (value != null) {
        checkInstanceIdRange(value);
        
    }
        this._instanceId = value;
        return this;
    }
    
    public ExecScaleOutOutputBuilder addAugmentation(Class<? extends Augmentation<ExecScaleOutOutput>> augmentationType, Augmentation<ExecScaleOutOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExecScaleOutOutputBuilder removeAugmentation(Class<? extends Augmentation<ExecScaleOutOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExecScaleOutOutput build() {
        return new ExecScaleOutOutputImpl(this);
    }

    private static final class ExecScaleOutOutputImpl implements ExecScaleOutOutput {
    
        private final BigInteger _instanceId;
    
        private Map<Class<? extends Augmentation<ExecScaleOutOutput>>, Augmentation<ExecScaleOutOutput>> augmentation = Collections.emptyMap();
    
        ExecScaleOutOutputImpl(ExecScaleOutOutputBuilder base) {
            this._instanceId = base.getInstanceId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ExecScaleOutOutput> getImplementedInterface() {
            return ExecScaleOutOutput.class;
        }
    
        @Override
        public BigInteger getInstanceId() {
            return _instanceId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ExecScaleOutOutput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_instanceId);
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
            if (!ExecScaleOutOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ExecScaleOutOutput other = (ExecScaleOutOutput)obj;
            if (!Objects.equals(_instanceId, other.getInstanceId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecScaleOutOutputImpl otherImpl = (ExecScaleOutOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ExecScaleOutOutput>>, Augmentation<ExecScaleOutOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ExecScaleOutOutput");
            CodeHelpers.appendValue(helper, "_instanceId", _instanceId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
