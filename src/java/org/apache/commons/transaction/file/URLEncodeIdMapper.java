/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//transaction/src/java/org/apache/commons/transaction/file/URLEncodeIdMapper.java,v 1.1 2004/12/18 23:19:09 ozeigermann Exp $
 * $Revision: 1.1 $
 * $Date: 2004/12/18 23:19:09 $
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

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.commons.codec.binary.Base64;

/**
 *
 */
public class URLEncodeIdMapper implements ResourceIdToPathMapper {
    public String getPathForId(Object resourceId) {
        String path = resourceId.toString();
        try {
            // XXX weired replacement for the fine JDK1.4 URLEncoder.encode(path, "UTF-8") 
            // method 
            // using this combination as a simple URLEncoder.encode without
            // charset may fail depending on local settings
            // for this reason the string will be encoded into base64 consisting
            // of ascii characters only
            // a further URL encoding is need as base64 might contain '/' which
            // might be a problem for some file systems 
            path = new String(Base64.encodeBase64(path.getBytes("UTF-8")), "ASCII");
            path = URLEncoder.encode(path);
        } catch (UnsupportedEncodingException e) {
            // we know this will not happen
        }
        return path;
    }
}
