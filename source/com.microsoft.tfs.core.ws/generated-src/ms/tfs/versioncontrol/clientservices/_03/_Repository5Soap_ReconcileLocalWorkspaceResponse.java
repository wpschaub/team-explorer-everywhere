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
import ms.tfs.versioncontrol.clientservices._03._Failure;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._MergeSource;
import ms.tfs.versioncontrol.clientservices._03._PendingChange;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._ReconcileResult;
import ms.tfs.versioncontrol.clientservices._03._Repository5Soap_ReconcileLocalWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._RequestType;
import ms.tfs.versioncontrol.clientservices._03._SeverityType;
import ms.tfs.versioncontrol.clientservices._03._Warning;
import ms.tfs.versioncontrol.clientservices._03._WarningType;

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
public class _Repository5Soap_ReconcileLocalWorkspaceResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _ReconcileResult reconcileLocalWorkspaceResult;

    public _Repository5Soap_ReconcileLocalWorkspaceResponse()
    {
        super();
    }

    public _Repository5Soap_ReconcileLocalWorkspaceResponse(final _ReconcileResult reconcileLocalWorkspaceResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setReconcileLocalWorkspaceResult(reconcileLocalWorkspaceResult);
    }

    public _ReconcileResult getReconcileLocalWorkspaceResult()
    {
        return this.reconcileLocalWorkspaceResult;
    }

    public void setReconcileLocalWorkspaceResult(_ReconcileResult value)
    {
        this.reconcileLocalWorkspaceResult = value;
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

                if (localName.equalsIgnoreCase("ReconcileLocalWorkspaceResult"))
                {
                    this.reconcileLocalWorkspaceResult = new _ReconcileResult();
                    this.reconcileLocalWorkspaceResult.readFromElement(reader);
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
