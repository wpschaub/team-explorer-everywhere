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

import ms.tfs.versioncontrol.clientservices._03._Item;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._VersionControlLabel;

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
public class _VersionControlLabel
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected Calendar date;
    protected String name;
    protected String owner;
    protected String ownerdisp;
    protected String owneruniq;
    protected String scope;
    protected int lid;

    // Elements
    protected String comment;
    protected _Item[] items;

    public _VersionControlLabel()
    {
        super();
    }

    public _VersionControlLabel(
        final Calendar date,
        final String name,
        final String owner,
        final String ownerdisp,
        final String owneruniq,
        final String scope,
        final int lid,
        final String comment,
        final _Item[] items)
    {
        // TODO : Call super() instead of setting all fields directly?
        setDate(date);
        setName(name);
        setOwner(owner);
        setOwnerdisp(ownerdisp);
        setOwneruniq(owneruniq);
        setScope(scope);
        setLid(lid);
        setComment(comment);
        setItems(items);
    }

    public Calendar getDate()
    {
        return this.date;
    }

    public void setDate(final Calendar value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'date' is a required attribute, its value cannot be null");
        }

        this.date = value;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(final String value)
    {
        this.name = value;
    }

    public String getOwner()
    {
        return this.owner;
    }

    public void setOwner(final String value)
    {
        this.owner = value;
    }

    public String getOwnerdisp()
    {
        return this.ownerdisp;
    }

    public void setOwnerdisp(final String value)
    {
        this.ownerdisp = value;
    }

    public String getOwneruniq()
    {
        return this.owneruniq;
    }

    public void setOwneruniq(final String value)
    {
        this.owneruniq = value;
    }

    public String getScope()
    {
        return this.scope;
    }

    public void setScope(final String value)
    {
        this.scope = value;
    }

    public int getLid()
    {
        return this.lid;
    }

    public void setLid(final int value)
    {
        this.lid = value;
    }

    public String getComment()
    {
        return this.comment;
    }

    public void setComment(String value)
    {
        this.comment = value;
    }

    public _Item[] getItems()
    {
        return this.items;
    }

    public void setItems(_Item[] value)
    {
        this.items = value;
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
            "date",
            this.date,
            true);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "name",
            this.name);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "owner",
            this.owner);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "ownerdisp",
            this.ownerdisp);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "owneruniq",
            this.owneruniq);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "scope",
            this.scope);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "lid",
            this.lid);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "Comment",
            this.comment);

        if (this.items != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Items");

            for (int iterator0 = 0; iterator0 < this.items.length; iterator0++)
            {
                this.items[iterator0].writeAsElement(
                    writer,
                    "Item");
            }

            writer.writeEndElement();
        }

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

            if (localName.equalsIgnoreCase("date"))
            {
                this.date = XMLConvert.toCalendar(
                        attributeValue,
                        true);
            }
            else if (localName.equalsIgnoreCase("name"))
            {
                this.name = attributeValue;
            }
            else if (localName.equalsIgnoreCase("owner"))
            {
                this.owner = attributeValue;
            }
            else if (localName.equalsIgnoreCase("ownerdisp"))
            {
                this.ownerdisp = attributeValue;
            }
            else if (localName.equalsIgnoreCase("owneruniq"))
            {
                this.owneruniq = attributeValue;
            }
            else if (localName.equalsIgnoreCase("scope"))
            {
                this.scope = attributeValue;
            }
            else if (localName.equalsIgnoreCase("lid"))
            {
                this.lid = XMLConvert.toInt(attributeValue);
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

                if (localName.equalsIgnoreCase("Comment"))
                {
                    this.comment = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("Items"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _Item complexObject0 = new _Item();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.items = (_Item[]) list0.toArray(new _Item[list0.size()]);
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
