// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._AccessMapping;
import ms.ws._LocationMapping;
import ms.ws._LocationServiceData;
import ms.ws._LocationWebServiceSoap_RemoveAccessMappingResponse;
import ms.ws._ServiceDefinition;

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
public class _LocationWebServiceSoap_RemoveAccessMappingResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _LocationServiceData removeAccessMappingResult;

    public _LocationWebServiceSoap_RemoveAccessMappingResponse()
    {
        super();
    }

    public _LocationWebServiceSoap_RemoveAccessMappingResponse(final _LocationServiceData removeAccessMappingResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setRemoveAccessMappingResult(removeAccessMappingResult);
    }

    public _LocationServiceData getRemoveAccessMappingResult()
    {
        return this.removeAccessMappingResult;
    }

    public void setRemoveAccessMappingResult(_LocationServiceData value)
    {
        this.removeAccessMappingResult = value;
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

                if (localName.equalsIgnoreCase("RemoveAccessMappingResult"))
                {
                    this.removeAccessMappingResult = new _LocationServiceData();
                    this.removeAccessMappingResult.readFromElement(reader);
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
