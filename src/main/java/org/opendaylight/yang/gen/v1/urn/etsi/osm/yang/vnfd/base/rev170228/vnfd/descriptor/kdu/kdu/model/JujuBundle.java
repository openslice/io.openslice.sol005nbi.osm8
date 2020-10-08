package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.kdu.model;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.KduModel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case juju-bundle {
 *   leaf juju-bundle {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/kdu/kdu-model/juju-bundle</i>
 *
 */
public interface JujuBundle
    extends
    DataObject,
    Augmentable<JujuBundle>,
    KduModel
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("juju-bundle");

    /**
     * Juju bundle that models the KDU, in any of the following ways:- 
     * &amp;lt;juju-repo&amp;gt;/&amp;lt;juju-bundle&amp;gt;- &amp;lt;juju-bundle 
     * folder under k8s_models folder in the package&amp;gt;- &amp;lt;juju-bundle tgz 
     * file (w/ or w/o extension) under k8s_models folder in the package&amp;gt;- 
     * &amp;lt;URL_where_to_fetch_juju_bundle&amp;gt;
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jujuBundle</code>, or <code>null</code> if not present
     */
    @Nullable
    String getJujuBundle();

}

