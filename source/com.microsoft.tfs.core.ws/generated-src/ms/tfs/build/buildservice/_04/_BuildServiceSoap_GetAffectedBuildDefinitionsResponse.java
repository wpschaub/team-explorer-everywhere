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

import ms.tfs.build.buildservice._04._BuildDefinition;
import ms.tfs.build.buildservice._04._BuildDefinitionSourceProvider;
import ms.tfs.build.buildservice._04._BuildReason;
import ms.tfs.build.buildservice._04._BuildServiceSoap_GetAffectedBuildDefinitionsResponse;
import ms.tfs.build.buildservice._04._BuildStatus;
import ms.tfs.build.buildservice._04._DefinitionQueueStatus;
import ms.tfs.build.buildservice._04._DefinitionTriggerType;
import ms.tfs.build.buildservice._04._DeleteOptions;
import ms.tfs.build.buildservice._04._NameValueField;
import ms.tfs.build.buildservice._04._ProcessTemplate;
import ms.tfs.build.buildservice._04._ProcessTemplateType;
import ms.tfs.build.buildservice._04._PropertyValue;
import ms.tfs.build.buildservice._04._RetentionPolicy;
import ms.tfs.build.buildservice._04._Schedule;
import ms.tfs.build.buildservice._04._ScheduleDays;
import ms.tfs.build.buildservice._04._WorkspaceMapping;
import ms.tfs.build.buildservice._04._WorkspaceMappingType;
import ms.tfs.build.buildservice._04._WorkspaceTemplate;

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
public class _BuildServiceSoap_GetAffectedBuildDefinitionsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _BuildDefinition[] getAffectedBuildDefinitionsResult;

    public _BuildServiceSoap_GetAffectedBuildDefinitionsResponse()
    {
        super();
    }

    public _BuildServiceSoap_GetAffectedBuildDefinitionsResponse(
        final _BuildDefinition[] getAffectedBuildDefinitionsResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetAffectedBuildDefinitionsResult(getAffectedBuildDefinitionsResult);
    }

    public _BuildDefinition[] getGetAffectedBuildDefinitionsResult()
    {
        return this.getAffectedBuildDefinitionsResult;
    }

    public void setGetAffectedBuildDefinitionsResult(_BuildDefinition[] value)
    {
        this.getAffectedBuildDefinitionsResult = value;
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

                if (localName.equalsIgnoreCase("GetAffectedBuildDefinitionsResult"))
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
                            _BuildDefinition complexObject0 = new _BuildDefinition();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.getAffectedBuildDefinitionsResult = (_BuildDefinition[]) list0.toArray(
                                new _BuildDefinition[list0.size()]);
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
