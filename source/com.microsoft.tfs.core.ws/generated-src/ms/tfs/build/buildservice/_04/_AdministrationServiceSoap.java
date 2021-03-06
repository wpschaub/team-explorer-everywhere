// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AcquireServiceHost;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AcquireServiceHostResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildAgents;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildAgentsResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildControllers;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildControllersResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildServiceHost;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildServiceHostResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildAgents;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildAgentsResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildControllers;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildControllersResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildServiceHost;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_DeleteBuildServiceHostResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildAgents;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildAgentsByUri;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildAgentsByUriResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildAgentsResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildControllers;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildControllersByUri;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildControllersByUriResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildControllersResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildServiceHosts;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildServiceHostsByUri;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildServiceHostsByUriResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_QueryBuildServiceHostsResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_ReleaseServiceHost;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_ReleaseServiceHostResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildAgents;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildAgentsResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildControllers;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildControllersResponse;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildServiceHost;
import ms.tfs.build.buildservice._04._AdministrationServiceSoap_UpdateBuildServiceHostResponse;
import ms.tfs.build.buildservice._04._AgentStatus;
import ms.tfs.build.buildservice._04._BuildAgent;
import ms.tfs.build.buildservice._04._BuildAgentQueryResult;
import ms.tfs.build.buildservice._04._BuildAgentSpec;
import ms.tfs.build.buildservice._04._BuildAgentUpdate;
import ms.tfs.build.buildservice._04._BuildAgentUpdateOptions;
import ms.tfs.build.buildservice._04._BuildController;
import ms.tfs.build.buildservice._04._BuildControllerQueryResult;
import ms.tfs.build.buildservice._04._BuildControllerSpec;
import ms.tfs.build.buildservice._04._BuildControllerUpdate;
import ms.tfs.build.buildservice._04._BuildControllerUpdateOptions;
import ms.tfs.build.buildservice._04._BuildServiceHost;
import ms.tfs.build.buildservice._04._BuildServiceHostQueryResult;
import ms.tfs.build.buildservice._04._BuildServiceHostUpdate;
import ms.tfs.build.buildservice._04._BuildServiceHostUpdateOptions;
import ms.tfs.build.buildservice._04._ControllerStatus;
import ms.tfs.build.buildservice._04._PropertyValue;
import ms.tfs.build.buildservice._04._ServiceHostStatus;

import java.lang.Object;
import java.lang.String;

import java.util.Calendar;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2010/Build}AdministrationServiceSoap
 */
public interface _AdministrationServiceSoap
{
    public _BuildAgent[] addBuildAgents(final _BuildAgent[] agents)
        throws TransportException, SOAPFault;

    public void deleteBuildAgents(final String[] agentUris)
        throws TransportException, SOAPFault;

    public _BuildAgentQueryResult[] queryBuildAgents(final _BuildAgentSpec[] agentSpecs)
        throws TransportException, SOAPFault;

    public _BuildAgentQueryResult queryBuildAgentsByUri(
        final String[] agentUris,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public void updateBuildAgents(final _BuildAgentUpdateOptions[] updates)
        throws TransportException, SOAPFault;

    public _BuildController[] addBuildControllers(final _BuildController[] controllers)
        throws TransportException, SOAPFault;

    public void deleteBuildControllers(final String[] controllerUris)
        throws TransportException, SOAPFault;

    public _BuildControllerQueryResult[] queryBuildControllers(final _BuildControllerSpec[] controllerSpecs)
        throws TransportException, SOAPFault;

    public _BuildControllerQueryResult queryBuildControllersByUri(
        final String[] controllerUris,
        final String[] propertyNameFilters,
        final boolean includeAgents)
        throws TransportException, SOAPFault;

    public void updateBuildControllers(final _BuildControllerUpdateOptions[] updates)
        throws TransportException, SOAPFault;

    public _BuildServiceHost addBuildServiceHost(final _BuildServiceHost serviceHost)
        throws TransportException, SOAPFault;

    public void deleteBuildServiceHost(final String serviceHostUri)
        throws TransportException, SOAPFault;

    public _BuildServiceHostQueryResult queryBuildServiceHosts(final String computer)
        throws TransportException, SOAPFault;

    public _BuildServiceHostQueryResult queryBuildServiceHostsByUri(final String[] serviceHostUris)
        throws TransportException, SOAPFault;

    public void updateBuildServiceHost(final _BuildServiceHostUpdateOptions update)
        throws TransportException, SOAPFault;

    public void acquireServiceHost(
        final String serviceHostUri,
        final String ownerName)
        throws TransportException, SOAPFault;

    public void releaseServiceHost(final String serviceHostUri)
        throws TransportException, SOAPFault;
}
