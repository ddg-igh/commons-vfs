/*
 * Copyright 2002, 2003,2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.vfs.provider.tar;

import org.apache.commons.vfs.provider.CompositeFileProvider;

import java.util.Collection;

/**
 * A file system provider for Tar files.  Provides read-only file systems.
 */
public class Tbz2FileProvider extends CompositeFileProvider
{
    protected final static Collection capabilities = TarFileProvider.capabilities;

    private final static String[] SCHEMES = new String[]
    {
        "bz2",
        "tar"
    };

    public Tbz2FileProvider()
    {
        super();
    }

    protected String[] getSchemes()
    {
        return SCHEMES;
    }

    public Collection getCapabilities()
    {
        return capabilities;
    }
}