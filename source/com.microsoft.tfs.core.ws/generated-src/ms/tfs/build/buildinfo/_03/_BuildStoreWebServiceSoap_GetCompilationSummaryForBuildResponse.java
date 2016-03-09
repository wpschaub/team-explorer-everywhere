// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildinfo._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildinfo._03._BuildStoreWebServiceSoap_GetCompilationSummaryForBuildResponse;
import ms.tfs.build.buildinfo._03._CompilationSummaryData;

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
public class _BuildStoreWebServiceSoap_GetCompilationSummaryForBuildResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _CompilationSummaryData getCompilationSummaryForBuildResult;

    public _BuildStoreWebServiceSoap_GetCompilationSummaryForBuildResponse()
    {
        super();
    }

    public _BuildStoreWebServiceSoap_GetCompilationSummaryForBuildResponse(
        final _CompilationSummaryData getCompilationSummaryForBuildResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetCompilationSummaryForBuildResult(getCompilationSummaryForBuildResult);
    }

    public _CompilationSummaryData getGetCompilationSummaryForBuildResult()
    {
        return this.getCompilationSummaryForBuildResult;
    }

    public void setGetCompilationSummaryForBuildResult(_CompilationSummaryData value)
    {
        this.getCompilationSummaryForBuildResult = value;
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

                if (localName.equalsIgnoreCase("GetCompilationSummaryForBuildResult"))
                {
                    this.getCompilationSummaryForBuildResult = new _CompilationSummaryData();
                    this.getCompilationSummaryForBuildResult.readFromElement(reader);
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
