// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._BuildReason;
import ms.tfs.build.buildservice._04._BuildServiceSoap_QueryProcessTemplatesResponse;
import ms.tfs.build.buildservice._04._ProcessTemplate;
import ms.tfs.build.buildservice._04._ProcessTemplateType;

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
public class _BuildServiceSoap_QueryProcessTemplatesResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _ProcessTemplate[] queryProcessTemplatesResult;

    public _BuildServiceSoap_QueryProcessTemplatesResponse()
    {
        super();
    }

    public _BuildServiceSoap_QueryProcessTemplatesResponse(final _ProcessTemplate[] queryProcessTemplatesResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryProcessTemplatesResult(queryProcessTemplatesResult);
    }

    public _ProcessTemplate[] getQueryProcessTemplatesResult()
    {
        return this.queryProcessTemplatesResult;
    }

    public void setQueryProcessTemplatesResult(_ProcessTemplate[] value)
    {
        this.queryProcessTemplatesResult = value;
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

                if (localName.equalsIgnoreCase("QueryProcessTemplatesResult"))
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
                            _ProcessTemplate complexObject0 = new _ProcessTemplate();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.queryProcessTemplatesResult = (_ProcessTemplate[]) list0.toArray(
                                new _ProcessTemplate[list0.size()]);
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
