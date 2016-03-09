// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._BuildServiceSoap_ProcessChangeset;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildServiceSoap_ProcessChangeset
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected int changesetId;

    public _BuildServiceSoap_ProcessChangeset()
    {
        super();
    }

    public _BuildServiceSoap_ProcessChangeset(final int changesetId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setChangesetId(changesetId);
    }

    public int getChangesetId()
    {
        return this.changesetId;
    }

    public void setChangesetId(int value)
    {
        this.changesetId = value;
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
            "changesetId",
            this.changesetId);

        writer.writeEndElement();
    }
}
