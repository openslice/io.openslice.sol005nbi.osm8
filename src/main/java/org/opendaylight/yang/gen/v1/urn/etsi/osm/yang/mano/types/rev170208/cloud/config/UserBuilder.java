package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.user.KeyPair;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link UserBuilder} instances.
 * 
 * @see UserBuilder
 *
 */
public class UserBuilder implements Builder<User> {

    private List<KeyPair> _keyPair;
    private String _name;
    private String _userInfo;
    private UserKey key;


    Map<Class<? extends Augmentation<User>>, Augmentation<User>> augmentation = Collections.emptyMap();

    public UserBuilder() {
    }

    public UserBuilder(User base) {
        this.key = base.key();
        this._name = base.getName();
        this._keyPair = base.getKeyPair();
        this._userInfo = base.getUserInfo();
        if (base instanceof UserImpl) {
            UserImpl impl = (UserImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<User>>, Augmentation<User>> aug =((AugmentationHolder<User>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public UserKey key() {
        return key;
    }
    
    public List<KeyPair> getKeyPair() {
        return _keyPair;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getUserInfo() {
        return _userInfo;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<User>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public UserBuilder withKey(final UserKey key) {
        this.key = key;
        return this;
    }
    public UserBuilder setKeyPair(final List<KeyPair> values) {
        this._keyPair = values;
        return this;
    }
    
    
    public UserBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public UserBuilder setUserInfo(final String value) {
        this._userInfo = value;
        return this;
    }
    
    public UserBuilder addAugmentation(Class<? extends Augmentation<User>> augmentationType, Augmentation<User> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UserBuilder removeAugmentation(Class<? extends Augmentation<User>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public User build() {
        return new UserImpl(this);
    }

    private static final class UserImpl implements User {
    
        private final List<KeyPair> _keyPair;
        private final String _name;
        private final String _userInfo;
        private final UserKey key;
    
        private Map<Class<? extends Augmentation<User>>, Augmentation<User>> augmentation = Collections.emptyMap();
    
        UserImpl(UserBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new UserKey(base.getName());
            }
            this._name = key.getName();
            this._keyPair = base.getKeyPair();
            this._userInfo = base.getUserInfo();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<User> getImplementedInterface() {
            return User.class;
        }
    
        @Override
        public UserKey key() {
            return key;
        }
        
        @Override
        public List<KeyPair> getKeyPair() {
            return _keyPair;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getUserInfo() {
            return _userInfo;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<User>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_keyPair);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_userInfo);
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
            if (!User.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            User other = (User)obj;
            if (!Objects.equals(_keyPair, other.getKeyPair())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_userInfo, other.getUserInfo())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UserImpl otherImpl = (UserImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<User>>, Augmentation<User>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("User");
            CodeHelpers.appendValue(helper, "_keyPair", _keyPair);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_userInfo", _userInfo);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
