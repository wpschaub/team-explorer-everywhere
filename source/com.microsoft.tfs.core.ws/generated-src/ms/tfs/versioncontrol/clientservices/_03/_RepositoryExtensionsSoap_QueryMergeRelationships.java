// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryMergeRelationships;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _RepositoryExtensionsSoap_QueryMergeRelationships
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String serverItem;

    public _RepositoryExtensionsSoap_QueryMergeRelationships()
    {
        super();
    }

    public _RepositoryExtensionsSoap_QueryMergeRelationships(final String serverItem)
    {
        // TODO : Call super() instead of setting all fields directly?
        setServerItem(serverItem);
    }

    public String getServerItem()
    {
        return this.serverItem;
    }

    public void setServerItem(String value)
    {
        this.serverItem = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "serverItem",
            this.serverItem);

        writer.writeEndElement();
    }
}
