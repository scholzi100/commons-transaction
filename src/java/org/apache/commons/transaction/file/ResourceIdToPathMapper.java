/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//transaction/src/java/org/apache/commons/transaction/file/ResourceIdToPathMapper.java,v 1.2 2005/01/09 15:12:12 ozeigermann Exp $
 * $Revision$
 * $Date$
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

package org.apache.commons.transaction.file;

/**
 * Mapper from a resourceId to a path string.
 * 
 * @since 1.1
 *
 */
public interface ResourceIdToPathMapper {
    
    /**
     * Maps the resource id object to a path string. 
     * 
     * @param resourceId the resource id
     * @return the path string
     */
    String getPathForId(Object resourceId);
}
