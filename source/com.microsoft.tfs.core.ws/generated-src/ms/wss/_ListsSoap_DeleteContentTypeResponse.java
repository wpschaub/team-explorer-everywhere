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

import ms.wss._ListsSoap_DeleteContentTypeResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ListsSoap_DeleteContentTypeResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected AnyContentType deleteContentTypeResult;

    public _ListsSoap_DeleteContentTypeResponse()
    {
        super();
    }

    public _ListsSoap_DeleteContentTypeResponse(final AnyContentType deleteContentTypeResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setDeleteContentTypeResult(deleteContentTypeResult);
    }

    public AnyContentType getDeleteContentTypeResult()
    {
        return this.deleteContentTypeResult;
    }

    public void setDeleteContentTypeResult(AnyContentType value)
    {
        this.deleteContentTypeResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("DeleteContentTypeResult"))
                {
                    if (this.deleteContentTypeResult == null)
                    {
                        throw new XMLStreamException(
                                "An AnyContentType implementation must be supplied by the caller "
                                + "for the 'deleteContentTypeResult' field before deserialization can occur.");
                    }

                    this.deleteContentTypeResult.readFromElement(reader);
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
