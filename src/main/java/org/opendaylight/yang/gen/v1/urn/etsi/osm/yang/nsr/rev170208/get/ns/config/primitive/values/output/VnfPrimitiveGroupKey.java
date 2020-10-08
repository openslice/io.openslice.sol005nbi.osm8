package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfPrimitiveGroupKey
 implements Identifier<VnfPrimitiveGroup> {
    private static final long serialVersionUID = -8070423034108030332L;
    private final String _memberVnfIndexRef;


    public VnfPrimitiveGroupKey(String _memberVnfIndexRef) {
    
    
        this._memberVnfIndexRef = _memberVnfIndexRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfPrimitiveGroupKey(VnfPrimitiveGroupKey source) {
        this._memberVnfIndexRef = source._memberVnfIndexRef;
    }


    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_memberVnfIndexRef);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        VnfPrimitiveGroupKey other = (VnfPrimitiveGroupKey) obj;
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfPrimitiveGroupKey.class);
        CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
        return helper.toString();
    }
}

