/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//transaction/src/java/org/apache/commons/transaction/memory/jca/MapConnection.java,v 1.1 2004/11/18 23:27:18 ozeigermann Exp $
 * $Revision: 1.1 $
 * $Date: 2004/11/18 23:27:18 $
 *
 * ====================================================================
 *
 * Copyright 1999-2002 The Apache Software Foundation 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.commons.transaction.memory.jca;

import java.util.Map;

import javax.resource.ResourceException;
import javax.resource.cci.Connection;
import javax.resource.cci.ConnectionMetaData;
import javax.resource.cci.Interaction;
import javax.resource.cci.LocalTransaction;
import javax.resource.cci.ResultSetInfo;
import javax.resource.spi.ManagedConnection;

/**
 *   
 * @version $Revision: 1.1 $
 * 
 */
public class MapConnection implements Connection {

    protected MapManagedConnection mc;
    
    public MapConnection(ManagedConnection mc) {
        this.mc = (MapManagedConnection) mc;
    }

    public Map getMap() {
        return mc.map;
    }

    public void close() throws ResourceException {
        mc.close();
    }

    public Interaction createInteraction() throws ResourceException {
        return null;
    }

    public LocalTransaction getLocalTransaction() throws ResourceException {
        return (LocalTransaction)mc.getLocalTransaction();
    }

    public ConnectionMetaData getMetaData() throws ResourceException {
        return null;
    }

    public ResultSetInfo getResultSetInfo() throws ResourceException {
        return null;
    }

    void invalidate() {
        mc = null;
    }

}
