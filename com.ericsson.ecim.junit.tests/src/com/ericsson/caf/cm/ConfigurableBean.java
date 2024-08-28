/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2010
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.ericsson.caf.cm;

import java.io.Serializable;

import javax.naming.Name;

/**
 * Base class for all configurable beans. The CM framework is responsible for
 * initiate its members.
 * 
 * 
 * @author emartgu qmartjo
 * 
 * 
 */
public abstract class ConfigurableBean implements Serializable {
    private static final long serialVersionUID = -6223884162724871224L;
    protected Name name;
    protected ConfigurableBean parent;
    
    /**
     * @return the name to the bean provided by the back-end
     */
    public Name getName() {
        return name;
    }

    /**
     * set the parent of this bean or null if this is the top-level bean
     */
    public void setParent(ConfigurableBean parent) {
        this.parent = parent;
    }

    /**
     * set the name by the back-end
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * @return the parent of this bean or null if this is the top-level bean
     */
    public ConfigurableBean getParent() {
        return parent;
    }
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof ConfigurableBean))
            return false;
        ConfigurableBean other = (ConfigurableBean) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name=").append(name).append(";parent=");
        if (parent != null) {
            sb.append(parent.getName());
        } else {
            sb.append("null");
        }
        return sb.toString();
    }
}
