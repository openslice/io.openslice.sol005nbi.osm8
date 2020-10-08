package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.actions;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class InsufficientDataKey
 implements Identifier<InsufficientData> {
    private static final long serialVersionUID = -1701498022369005341L;
    private final String _url;


    public InsufficientDataKey(String _url) {
    
    
        this._url = _url;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InsufficientDataKey(InsufficientDataKey source) {
        this._url = source._url;
    }


    public String getUrl() {
        return _url;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_url);
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
        InsufficientDataKey other = (InsufficientDataKey) obj;
        if (!Objects.equals(_url, other._url)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(InsufficientDataKey.class);
        CodeHelpers.appendValue(helper, "_url", _url);
        return helper.toString();
    }
}

