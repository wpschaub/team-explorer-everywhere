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

import ms.tfs.versioncontrol.clientservices._03._ChangeType;
import ms.tfs.versioncontrol.clientservices._03._Conflict;
import ms.tfs.versioncontrol.clientservices._03._ConflictType;
import ms.tfs.versioncontrol.clientservices._03._GetOperation;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_ResolveResponse;
import ms.tfs.versioncontrol.clientservices._03._Resolution;

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
public class _RepositoryExtensionsSoap_ResolveResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _GetOperation[] resolveResult;
    protected _GetOperation[] undoOperations;
    protected _Conflict[] resolvedConflicts;
    protected int changePendedFlags;

    public _RepositoryExtensionsSoap_ResolveResponse()
    {
        super();
    }

    public _RepositoryExtensionsSoap_ResolveResponse(
        final _GetOperation[] resolveResult,
        final _GetOperation[] undoOperations,
        final _Conflict[] resolvedConflicts,
        final int changePendedFlags)
    {
        // TODO : Call super() instead of setting all fields directly?
        setResolveResult(resolveResult);
        setUndoOperations(undoOperations);
        setResolvedConflicts(resolvedConflicts);
        setChangePendedFlags(changePendedFlags);
    }

    public _GetOperation[] getResolveResult()
    {
        return this.resolveResult;
    }

    public void setResolveResult(_GetOperation[] value)
    {
        this.resolveResult = value;
    }

    public _GetOperation[] getUndoOperations()
    {
        return this.undoOperations;
    }

    public void setUndoOperations(_GetOperation[] value)
    {
        this.undoOperations = value;
    }

    public _Conflict[] getResolvedConflicts()
    {
        return this.resolvedConflicts;
    }

    public void setResolvedConflicts(_Conflict[] value)
    {
        this.resolvedConflicts = value;
    }

    public int getChangePendedFlags()
    {
        return this.changePendedFlags;
    }

    public void setChangePendedFlags(int value)
    {
        this.changePendedFlags = value;
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

                if (localName.equalsIgnoreCase("ResolveResult"))
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
                            _GetOperation complexObject0 = new _GetOperation();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.resolveResult = (_GetOperation[]) list0.toArray(new _GetOperation[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("undoOperations"))
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
                            _GetOperation complexObject0 = new _GetOperation();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.undoOperations = (_GetOperation[]) list0.toArray(new _GetOperation[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("resolvedConflicts"))
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
                            _Conflict complexObject0 = new _Conflict();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.resolvedConflicts = (_Conflict[]) list0.toArray(new _Conflict[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("changePendedFlags"))
                {
                    this.changePendedFlags = XMLConvert.toInt(reader.getElementText());
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
