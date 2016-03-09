// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.wss;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.types.AnyContentType;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.wss._ListsSoap_UpdateContentType;

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
public class _ListsSoap_UpdateContentType
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String listName;
    protected String contentTypeId;
    protected AnyContentType contentTypeProperties;
    protected AnyContentType newFields;
    protected AnyContentType updateFields;
    protected AnyContentType deleteFields;
    protected String addToView;

    public _ListsSoap_UpdateContentType()
    {
        super();
    }

    public _ListsSoap_UpdateContentType(
        final String listName,
        final String contentTypeId,
        final AnyContentType contentTypeProperties,
        final AnyContentType newFields,
        final AnyContentType updateFields,
        final AnyContentType deleteFields,
        final String addToView)
    {
        // TODO : Call super() instead of setting all fields directly?
        setListName(listName);
        setContentTypeId(contentTypeId);
        setContentTypeProperties(contentTypeProperties);
        setNewFields(newFields);
        setUpdateFields(updateFields);
        setDeleteFields(deleteFields);
        setAddToView(addToView);
    }

    public String getListName()
    {
        return this.listName;
    }

    public void setListName(String value)
    {
        this.listName = value;
    }

    public String getContentTypeId()
    {
        return this.contentTypeId;
    }

    public void setContentTypeId(String value)
    {
        this.contentTypeId = value;
    }

    public AnyContentType getContentTypeProperties()
    {
        return this.contentTypeProperties;
    }

    public void setContentTypeProperties(AnyContentType value)
    {
        this.contentTypeProperties = value;
    }

    public AnyContentType getNewFields()
    {
        return this.newFields;
    }

    public void setNewFields(AnyContentType value)
    {
        this.newFields = value;
    }

    public AnyContentType getUpdateFields()
    {
        return this.updateFields;
    }

    public void setUpdateFields(AnyContentType value)
    {
        this.updateFields = value;
    }

    public AnyContentType getDeleteFields()
    {
        return this.deleteFields;
    }

    public void setDeleteFields(AnyContentType value)
    {
        this.deleteFields = value;
    }

    public String getAddToView()
    {
        return this.addToView;
    }

    public void setAddToView(String value)
    {
        this.addToView = value;
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
            "listName",
            this.listName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "contentTypeId",
            this.contentTypeId);
        this.contentTypeProperties.writeAsElement(
            writer,
            "contentTypeProperties");
        this.newFields.writeAsElement(
            writer,
            "newFields");
        this.updateFields.writeAsElement(
            writer,
            "updateFields");
        this.deleteFields.writeAsElement(
            writer,
            "deleteFields");
        XMLStreamWriterHelper.writeElement(
            writer,
            "addToView",
            this.addToView);

        writer.writeEndElement();
    }
}
