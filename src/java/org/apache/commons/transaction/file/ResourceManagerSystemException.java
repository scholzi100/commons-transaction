/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//transaction/src/java/org/apache/commons/transaction/file/ResourceManagerSystemException.java,v 1.1 2004/11/18 23:27:19 ozeigermann Exp $
 * $Revision$
 * $Date$
 *
 * ====================================================================
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
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

package org.apache.commons.transaction.file;

/**
 * Signals an internal system error in a {@link ResourceManager}.
 * 
 * @version $Revision$
 *
 */
public class ResourceManagerSystemException extends ResourceManagerException {
    public ResourceManagerSystemException(String message, int status, Object txId, Throwable cause) {
        super(message, status, txId, cause);
    }

    public ResourceManagerSystemException(String message, int status, Object txId) {
        super(message, status, txId);
    }

    public ResourceManagerSystemException(int status, Object txId, Throwable cause) {
        super(status, txId, cause);
    }

    public ResourceManagerSystemException(int status, Object txId) {
        super(status, txId);
    }
}
