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

import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateQueuedBuilds;
import ms.tfs.build.buildservice._03._QueuePriority;
import ms.tfs.build.buildservice._03._QueuedBuildUpdate;
import ms.tfs.build.buildservice._03._QueuedBuildUpdateOptions;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildServiceSoap_UpdateQueuedBuilds
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _QueuedBuildUpdateOptions[] updateOptions;

    public _BuildServiceSoap_UpdateQueuedBuilds()
    {
        super();
    }

    public _BuildServiceSoap_UpdateQueuedBuilds(final _QueuedBuildUpdateOptions[] updateOptions)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUpdateOptions(updateOptions);
    }

    public _QueuedBuildUpdateOptions[] getUpdateOptions()
    {
        return this.updateOptions;
    }

    public void setUpdateOptions(_QueuedBuildUpdateOptions[] value)
    {
        this.updateOptions = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.updateOptions != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("updateOptions");

            for (int iterator0 = 0; iterator0 < this.updateOptions.length; iterator0++)
            {
                this.updateOptions[iterator0].writeAsElement(
                    writer,
                    "QueuedBuildUpdateOptions");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
