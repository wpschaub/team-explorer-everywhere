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

import ms.tfs.versioncontrol.clientservices._03._PropertyValue;

import java.lang.Object;
import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _PropertyValue
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected String pname;

    // Elements
    protected Object val;
    protected String changedBy;
    protected Calendar changedDate;

    public _PropertyValue()
    {
        super();
    }

    public _PropertyValue(
        final String pname,
        final Object val,
        final String changedBy,
        final Calendar changedDate)
    {
        // TODO : Call super() instead of setting all fields directly?
        setPname(pname);
        setVal(val);
        setChangedBy(changedBy);
        setChangedDate(changedDate);
    }

    public String getPname()
    {
        return this.pname;
    }

    public void setPname(final String value)
    {
        this.pname = value;
    }

    public Object getVal()
    {
        return this.val;
    }

    public void setVal(Object value)
    {
        this.val = value;
    }

    public String getChangedBy()
    {
        return this.changedBy;
    }

    public void setChangedBy(String value)
    {
        this.changedBy = value;
    }

    public Calendar getChangedDate()
    {
        return this.changedDate;
    }

    public void setChangedDate(Calendar value)
    {
        this.changedDate = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "pname",
            this.pname);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "val",
            this.val);
        XMLStreamWriterHelper.writeElement(
            writer,
            "ChangedBy",
            this.changedBy);
        XMLStreamWriterHelper.writeElement(
            writer,
            "ChangedDate",
            this.changedDate,
            true);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("pname"))
            {
                this.pname = attributeValue;
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("val"))
                {
                    this.val = XMLStreamReaderHelper.readObjectElement(reader);
                }
                else if (localName.equalsIgnoreCase("ChangedBy"))
                {
                    this.changedBy = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("ChangedDate"))
                {
                    this.changedDate = XMLConvert.toCalendar(
                            reader.getElementText(),
                            true);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
