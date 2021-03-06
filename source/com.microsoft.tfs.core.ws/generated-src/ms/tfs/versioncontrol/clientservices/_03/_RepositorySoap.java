// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.versioncontrol.clientservices._03._AccessEntry;
import ms.tfs.versioncontrol.clientservices._03._Annotation;
import ms.tfs.versioncontrol.clientservices._03._BranchRelative;
import ms.tfs.versioncontrol.clientservices._03._Change;
import ms.tfs.versioncontrol.clientservices._03._ChangeRequest;
import ms.tfs.versioncontrol.clientservices._03._ChangeType;
import ms.tfs.versioncontrol.clientservices._03._Changeset;
import ms.tfs.versioncontrol.clientservices._03._ChangesetMerge;
import ms.tfs.versioncontrol.clientservices._03._ChangesetMergeDetails;
import ms.tfs.versioncontrol.clientservices._03._CheckinNote;
import ms.tfs.versioncontrol.clientservices._03._CheckinNoteFieldDefinition;
import ms.tfs.versioncontrol.clientservices._03._CheckinNoteFieldValue;
import ms.tfs.versioncontrol.clientservices._03._CheckinNotificationInfo;
import ms.tfs.versioncontrol.clientservices._03._CheckinNotificationWorkItemInfo;
import ms.tfs.versioncontrol.clientservices._03._CheckinOptions;
import ms.tfs.versioncontrol.clientservices._03._CheckinResult;
import ms.tfs.versioncontrol.clientservices._03._CheckinWorkItemAction;
import ms.tfs.versioncontrol.clientservices._03._Conflict;
import ms.tfs.versioncontrol.clientservices._03._ConflictInformation;
import ms.tfs.versioncontrol.clientservices._03._ConflictType;
import ms.tfs.versioncontrol.clientservices._03._DeletedState;
import ms.tfs.versioncontrol.clientservices._03._ExtendedItem;
import ms.tfs.versioncontrol.clientservices._03._Failure;
import ms.tfs.versioncontrol.clientservices._03._FileType;
import ms.tfs.versioncontrol.clientservices._03._GetOperation;
import ms.tfs.versioncontrol.clientservices._03._GetRequest;
import ms.tfs.versioncontrol.clientservices._03._GlobalSecurity;
import ms.tfs.versioncontrol.clientservices._03._Item;
import ms.tfs.versioncontrol.clientservices._03._ItemMerge;
import ms.tfs.versioncontrol.clientservices._03._ItemSecurity;
import ms.tfs.versioncontrol.clientservices._03._ItemSet;
import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LabelChildOption;
import ms.tfs.versioncontrol.clientservices._03._LabelItemSpec;
import ms.tfs.versioncontrol.clientservices._03._LabelResult;
import ms.tfs.versioncontrol.clientservices._03._LabelResultStatus;
import ms.tfs.versioncontrol.clientservices._03._LocalVersion;
import ms.tfs.versioncontrol.clientservices._03._LocalVersionUpdate;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._Mapping;
import ms.tfs.versioncontrol.clientservices._03._MergeCandidate;
import ms.tfs.versioncontrol.clientservices._03._MergeOptions;
import ms.tfs.versioncontrol.clientservices._03._MergeSource;
import ms.tfs.versioncontrol.clientservices._03._PendingChange;
import ms.tfs.versioncontrol.clientservices._03._PendingSet;
import ms.tfs.versioncontrol.clientservices._03._PendingSetType;
import ms.tfs.versioncontrol.clientservices._03._PendingState;
import ms.tfs.versioncontrol.clientservices._03._PermissionChange;
import ms.tfs.versioncontrol.clientservices._03._PolicyFailureInfo;
import ms.tfs.versioncontrol.clientservices._03._PolicyOverrideInfo;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._RepositoryProperties;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_AddConflict;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_AddConflictResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CheckAuthentication;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CheckAuthenticationResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CheckIn;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CheckInResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CheckPendingChanges;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CheckPendingChangesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CreateAnnotation;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CreateAnnotationResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CreateBranch;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CreateBranchResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CreateCheckinNoteDefinition;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CreateCheckinNoteDefinitionResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CreateTeamProjectFolder;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CreateTeamProjectFolderResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CreateWorkspace;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CreateWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_DeleteAnnotation;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_DeleteAnnotationResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_DeleteLabel;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_DeleteLabelResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_DeleteShelveset;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_DeleteShelvesetResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_DeleteWorkspace;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_DeleteWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_Destroy;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_DestroyResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_Get;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_GetRepositoryProperties;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_GetRepositoryPropertiesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_GetResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_LabelItem;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_LabelItemResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_Merge;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_MergeResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_PendChanges;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_PendChangesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryAnnotation;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryAnnotationResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryBranches;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryBranchesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryChangesForChangeset;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryChangesForChangesetResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryChangeset;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryChangesetResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryCheckinNoteDefinition;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryCheckinNoteDefinitionResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryCheckinNoteFieldNames;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryCheckinNoteFieldNamesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryConflicts;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryConflictsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryEffectiveGlobalPermissions;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryEffectiveGlobalPermissionsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryEffectiveItemPermissions;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryEffectiveItemPermissionsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryFileTypes;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryFileTypesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryGlobalPermissions;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryGlobalPermissionsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryHistory;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryHistoryResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryItemPermissions;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryItemPermissionsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryItems;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryItemsById;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryItemsByIdResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryItemsExtended;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryItemsExtendedResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryItemsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryLabels;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryLabelsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryLocalVersions;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryLocalVersionsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryMergeCandidates;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryMergeCandidatesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryMerges;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryMergesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryMergesWithDetails;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryMergesWithDetailsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryPendingChangesById;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryPendingChangesByIdResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryPendingChangesForWorkspace;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryPendingChangesForWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryPendingSets;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryPendingSetsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryShelvedChanges;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryShelvedChangesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryShelvesets;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryShelvesetsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryWorkspace;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryWorkspaces;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_QueryWorkspacesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_RefreshIdentityDisplayName;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_RefreshIdentityDisplayNameResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_RemoveLocalConflict;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_RemoveLocalConflictResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_Resolve;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_ResolveResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_SetFileTypes;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_SetFileTypesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_Shelve;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_ShelveResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UndoPendingChanges;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UndoPendingChangesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UnlabelItem;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UnlabelItemResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_Unshelve;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UnshelveResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateChangeset;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateChangesetResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateCheckinNoteFieldName;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateCheckinNoteFieldNameResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateGlobalSecurity;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateGlobalSecurityResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateItemSecurity;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateItemSecurityResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateLocalVersion;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateLocalVersionResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdatePendingState;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdatePendingStateResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateWorkspace;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._RequestType;
import ms.tfs.versioncontrol.clientservices._03._Resolution;
import ms.tfs.versioncontrol.clientservices._03._SecurityChange;
import ms.tfs.versioncontrol.clientservices._03._SeverityType;
import ms.tfs.versioncontrol.clientservices._03._Shelveset;
import ms.tfs.versioncontrol.clientservices._03._TeamProjectFolderOptions;
import ms.tfs.versioncontrol.clientservices._03._TeamProjectFolderPermission;
import ms.tfs.versioncontrol.clientservices._03._VersionControlLabel;
import ms.tfs.versioncontrol.clientservices._03._VersionControlLink;
import ms.tfs.versioncontrol.clientservices._03._VersionSpec;
import ms.tfs.versioncontrol.clientservices._03._Warning;
import ms.tfs.versioncontrol.clientservices._03._WarningType;
import ms.tfs.versioncontrol.clientservices._03._WorkingFolder;
import ms.tfs.versioncontrol.clientservices._03._WorkingFolderType;
import ms.tfs.versioncontrol.clientservices._03._Workspace;

import java.lang.Object;
import java.lang.String;

import java.util.Calendar;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/VersionControl/ClientServices/03}RepositorySoap
 */
public interface _RepositorySoap
{
    public void addConflict(
        final String workspaceName,
        final String ownerName,
        final _ConflictType conflictType,
        final int itemId,
        final int versionFrom,
        final int pendingChangeId,
        final String sourceLocalItem,
        final String targetLocalItem,
        final int reason)
        throws TransportException, SOAPFault;

    public String checkAuthentication()
        throws TransportException, SOAPFault;

    public _RepositorySoap_CheckInResponse checkIn(
        final String workspaceName,
        final String ownerName,
        final String[] serverItems,
        final _Changeset info,
        final _CheckinNotificationInfo checkinNotificationInfo,
        final _CheckinOptions checkinOptions,
        final boolean deferCheckIn,
        final int checkInTicket)
        throws TransportException, SOAPFault;

    public _Failure[] checkPendingChanges(
        final String workspaceName,
        final String ownerName,
        final String[] serverItems)
        throws TransportException, SOAPFault;

    public void createAnnotation(
        final String annotationName,
        final String annotatedItem,
        final int version,
        final String annotationValue,
        final String comment,
        final boolean overwrite)
        throws TransportException, SOAPFault;

    public void createCheckinNoteDefinition(
        final String associatedServerItem,
        final _CheckinNoteFieldDefinition[] checkinNoteFields)
        throws TransportException, SOAPFault;

    public _Workspace createWorkspace(final _Workspace workspace)
        throws TransportException, SOAPFault;

    public void deleteAnnotation(
        final String annotationName,
        final String annotatedItem,
        final int version,
        final String annotationValue)
        throws TransportException, SOAPFault;

    public _LabelResult[] deleteLabel(
        final String labelName,
        final String labelScope)
        throws TransportException, SOAPFault;

    public void deleteShelveset(
        final String shelvesetName,
        final String ownerName)
        throws TransportException, SOAPFault;

    public void deleteWorkspace(
        final String workspaceName,
        final String ownerName)
        throws TransportException, SOAPFault;

    public _RepositorySoap_DestroyResponse destroy(
        final _ItemSpec item,
        final _VersionSpec versionSpec,
        final _VersionSpec stopAtSpec,
        final int flags)
        throws TransportException, SOAPFault;

    public _GetOperation[][] get(
        final String workspaceName,
        final String ownerName,
        final _GetRequest[] requests,
        final boolean force,
        final boolean noGet,
        final int maxResults,
        final int options)
        throws TransportException, SOAPFault;

    public _RepositoryProperties getRepositoryProperties()
        throws TransportException, SOAPFault;

    public _RepositorySoap_LabelItemResponse labelItem(
        final String workspaceName,
        final String workspaceOwner,
        final _VersionControlLabel label,
        final _LabelItemSpec[] labelSpecs,
        final _LabelChildOption children)
        throws TransportException, SOAPFault;

    public _RepositorySoap_MergeResponse merge(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec source,
        final _ItemSpec target,
        final _VersionSpec from,
        final _VersionSpec to,
        final _MergeOptions options,
        final _LockLevel lockLevel,
        final int optionsEx)
        throws TransportException, SOAPFault;

    public _RepositorySoap_PendChangesResponse pendChanges(
        final String workspaceName,
        final String ownerName,
        final _ChangeRequest[] changes,
        final int pendChangesOptions,
        final int supportedFeatures)
        throws TransportException, SOAPFault;

    public _Annotation[] queryAnnotation(
        final String annotationName,
        final String annotatedItem,
        final int version)
        throws TransportException, SOAPFault;

    public _BranchRelative[][] queryBranches(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items,
        final _VersionSpec version)
        throws TransportException, SOAPFault;

    public _Changeset queryChangeset(
        final int changesetId,
        final boolean includeChanges,
        final boolean generateDownloadUrls,
        final boolean includeSourceRenames)
        throws TransportException, SOAPFault;

    public _Change[] queryChangesForChangeset(
        final int changesetId,
        final boolean generateDownloadUrls,
        final int pageSize,
        final _ItemSpec lastItem)
        throws TransportException, SOAPFault;

    public _CheckinNoteFieldDefinition[] queryCheckinNoteDefinition(final String[] associatedServerItem)
        throws TransportException, SOAPFault;

    public String[] queryCheckinNoteFieldNames()
        throws TransportException, SOAPFault;

    public _Conflict[] queryConflicts(
        final String workspaceName,
        final String ownerName,
        final _ItemSpec[] items)
        throws TransportException, SOAPFault;

    public String[] queryEffectiveGlobalPermissions(final String identityName)
        throws TransportException, SOAPFault;

    public String[] queryEffectiveItemPermissions(
        final String workspaceName,
        final String workspaceOwner,
        final String item,
        final String identityName)
        throws TransportException, SOAPFault;

    public _FileType[] queryFileTypes()
        throws TransportException, SOAPFault;

    public _GlobalSecurity queryGlobalPermissions(final String[] identityNames)
        throws TransportException, SOAPFault;

    public _Changeset[] queryHistory(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec itemSpec,
        final _VersionSpec versionItem,
        final String user,
        final _VersionSpec versionFrom,
        final _VersionSpec versionTo,
        final int maxCount,
        final boolean includeFiles,
        final boolean generateDownloadUrls,
        final boolean slotMode,
        final boolean sortAscending)
        throws TransportException, SOAPFault;

    public _ItemSet[] queryItems(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items,
        final _VersionSpec version,
        final _DeletedState deletedState,
        final _ItemType itemType,
        final boolean generateDownloadUrls,
        final int options)
        throws TransportException, SOAPFault;

    public _LocalVersion[][] queryLocalVersions(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] itemSpecs)
        throws TransportException, SOAPFault;

    public _ExtendedItem[][] queryItemsExtended(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items,
        final _DeletedState deletedState,
        final _ItemType itemType,
        final int options)
        throws TransportException, SOAPFault;

    public _RepositorySoap_QueryItemPermissionsResponse queryItemPermissions(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] itemSpecs,
        final String[] identityNames)
        throws TransportException, SOAPFault;

    public _VersionControlLabel[] queryLabels(
        final String workspaceName,
        final String workspaceOwner,
        final String labelName,
        final String labelScope,
        final String owner,
        final String filterItem,
        final _VersionSpec versionFilterItem,
        final boolean includeItems,
        final boolean generateDownloadUrls)
        throws TransportException, SOAPFault;

    public _MergeCandidate[] queryMergeCandidates(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec source,
        final _ItemSpec target,
        final int options)
        throws TransportException, SOAPFault;

    public _RepositorySoap_QueryMergesResponse queryMerges(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec source,
        final _VersionSpec versionSource,
        final _ItemSpec target,
        final _VersionSpec versionTarget,
        final _VersionSpec versionFrom,
        final _VersionSpec versionTo,
        final int maxChangesets,
        final boolean showAll)
        throws TransportException, SOAPFault;

    public _ChangesetMergeDetails queryMergesWithDetails(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec source,
        final _VersionSpec versionSource,
        final _ItemSpec target,
        final _VersionSpec versionTarget,
        final _VersionSpec versionFrom,
        final _VersionSpec versionTo,
        final int maxChangesets,
        final boolean showAll)
        throws TransportException, SOAPFault;

    public _RepositorySoap_QueryPendingSetsResponse queryPendingSets(
        final String localWorkspaceName,
        final String localWorkspaceOwner,
        final String queryWorkspaceName,
        final String ownerName,
        final _ItemSpec[] itemSpecs,
        final boolean generateDownloadUrls)
        throws TransportException, SOAPFault;

    public _RepositorySoap_QueryPendingChangesForWorkspaceResponse queryPendingChangesForWorkspace(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] itemSpecs,
        final boolean generateDownloadUrls,
        final int pageSize,
        final String lastChange)
        throws TransportException, SOAPFault;

    public _RepositorySoap_QueryShelvedChangesResponse queryShelvedChanges(
        final String localWorkspaceName,
        final String localWorkspaceOwner,
        final String shelvesetName,
        final String ownerName,
        final _ItemSpec[] itemSpecs,
        final boolean generateDownloadUrls)
        throws TransportException, SOAPFault;

    public _Shelveset[] queryShelvesets(
        final String shelvesetName,
        final String ownerName)
        throws TransportException, SOAPFault;

    public _Workspace queryWorkspace(
        final String workspaceName,
        final String ownerName)
        throws TransportException, SOAPFault;

    public _Workspace[] queryWorkspaces(
        final String ownerName,
        final String computer,
        final int permissionsFilter)
        throws TransportException, SOAPFault;

    public void refreshIdentityDisplayName()
        throws TransportException, SOAPFault;

    public void removeLocalConflict(
        final String workspaceName,
        final String ownerName,
        final int conflictId)
        throws TransportException, SOAPFault;

    public _RepositorySoap_ResolveResponse resolve(
        final String workspaceName,
        final String ownerName,
        final int conflictId,
        final _Resolution resolution,
        final String newPath,
        final int encoding,
        final _LockLevel lockLevel)
        throws TransportException, SOAPFault;

    public void setFileTypes(final _FileType[] fileTypes)
        throws TransportException, SOAPFault;

    public _Failure[] shelve(
        final String workspaceName,
        final String workspaceOwner,
        final String[] serverItems,
        final _Shelveset shelveset,
        final boolean replace)
        throws TransportException, SOAPFault;

    public _RepositorySoap_UndoPendingChangesResponse undoPendingChanges(
        final String workspaceName,
        final String ownerName,
        final _ItemSpec[] items)
        throws TransportException, SOAPFault;

    public _RepositorySoap_UnlabelItemResponse unlabelItem(
        final String workspaceName,
        final String workspaceOwner,
        final String labelName,
        final String labelScope,
        final _ItemSpec[] items,
        final _VersionSpec version)
        throws TransportException, SOAPFault;

    public _RepositorySoap_UnshelveResponse unshelve(
        final String shelvesetName,
        final String shelvesetOwner,
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items)
        throws TransportException, SOAPFault;

    public void updateChangeset(
        final int changeset,
        final String comment,
        final _CheckinNote checkinNote)
        throws TransportException, SOAPFault;

    public void updateCheckinNoteFieldName(
        final String path,
        final String existingFieldName,
        final String newFieldName)
        throws TransportException, SOAPFault;

    public _RepositorySoap_UpdateGlobalSecurityResponse updateGlobalSecurity(final _PermissionChange[] changes)
        throws TransportException, SOAPFault;

    public _RepositorySoap_UpdateItemSecurityResponse updateItemSecurity(
        final String workspaceName,
        final String workspaceOwner,
        final _SecurityChange[] changes)
        throws TransportException, SOAPFault;

    public void updateLocalVersion(
        final String workspaceName,
        final String ownerName,
        final _LocalVersionUpdate[] updates)
        throws TransportException, SOAPFault;

    public void updatePendingState(
        final String workspaceName,
        final String workspaceOwner,
        final _PendingState[] updates)
        throws TransportException, SOAPFault;

    public _Workspace updateWorkspace(
        final String oldWorkspaceName,
        final String ownerName,
        final _Workspace newWorkspace,
        final int supportedFeatures)
        throws TransportException, SOAPFault;

    public _PendingChange[] queryPendingChangesById(
        final int[] pendingChangeIds,
        final boolean generateDownloadUrls)
        throws TransportException, SOAPFault;

    public _Item[] queryItemsById(
        final int[] itemIds,
        final int changeSet,
        final boolean generateDownloadUrls,
        final int options)
        throws TransportException, SOAPFault;

    public void createTeamProjectFolder(final _TeamProjectFolderOptions teamProjectOptions)
        throws TransportException, SOAPFault;

    public _CheckinResult createBranch(
        final String sourcePath,
        final String targetPath,
        final _VersionSpec version,
        final _Changeset info,
        final _CheckinNotificationInfo checkinNotificationInfo,
        final _Mapping[] mappings)
        throws TransportException, SOAPFault;
}
