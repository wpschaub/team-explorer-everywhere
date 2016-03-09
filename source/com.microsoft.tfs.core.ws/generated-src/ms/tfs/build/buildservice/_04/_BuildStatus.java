// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /flagSet.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Automatically generated flag set class.
 */
public final class _BuildStatus
    extends FlagSet
{
    /**
     * Constructs a _BuildStatus with no flags initially set.
     */
    public _BuildStatus()
    {
        super();
    }

    /**
     * Constructs a _BuildStatus with the given flags initially set.
     *
     * @param flags
     *        the flags initially contained in this set.
     */
    public _BuildStatus(final _BuildStatus_Flag[] flags)
    {
        super(flags);
    }

    /**
     * Constructs a _BuildStatus with the given flags initially set.
     *
     * @param flagStrings
     *        the flags initially contained in this set.
     */
    public _BuildStatus(final String[] flagStrings)
    {
        super(flagStrings);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.microsoft.tfs.core.ws.runtime.types.FlagSet\#findFlagInstance(java.lang
     * .String)
     */
    protected Flag findFlagInstance(final String value)
        throws SOAPSerializationException
    {
        return _BuildStatus_Flag.fromString(
            value,
            _BuildStatus_Flag.VALUES_TO_INSTANCES);
    }

    /**
     * Gets the flags this flag set contains.
     *
     * @return the flags this flag set contains.
     */
    public _BuildStatus_Flag[] getFlags()
    {
        return (_BuildStatus_Flag[]) this.toArray(new _BuildStatus_Flag[this.size()]);
    }

    public boolean add(_BuildStatus_Flag o)
    {
        return super.add(o);
    }

    public boolean contains(_BuildStatus_Flag o)
    {
        return super.contains(o);
    }

    public boolean remove(_BuildStatus_Flag o)
    {
        return super.remove(o);
    }

    /**
     * Defines the valid flag values that can be contained in _BuildStatus.
     *
     * This class is non-final for the rare occasion where custom values must be
     * defined because the web service accepts values not publicly defined in its
     * web service definition.
     */
    public static class _BuildStatus_Flag
        extends Flag
    {
        /**
         * This map lets static methods in this class map strings to the correct
         * instance type at deserialization time.
         */
        private final static Map VALUES_TO_INSTANCES = new HashMap();
        public static final _BuildStatus_Flag None = new _BuildStatus_Flag("None");
        public static final _BuildStatus_Flag InProgress = new _BuildStatus_Flag("InProgress");
        public static final _BuildStatus_Flag Succeeded = new _BuildStatus_Flag("Succeeded");
        public static final _BuildStatus_Flag PartiallySucceeded = new _BuildStatus_Flag("PartiallySucceeded");
        public static final _BuildStatus_Flag Failed = new _BuildStatus_Flag("Failed");
        public static final _BuildStatus_Flag Stopped = new _BuildStatus_Flag("Stopped");
        public static final _BuildStatus_Flag NotStarted = new _BuildStatus_Flag("NotStarted");
        public static final _BuildStatus_Flag All = new _BuildStatus_Flag("All");

        protected _BuildStatus_Flag(final String name)
        {
            super(name, _BuildStatus_Flag.VALUES_TO_INSTANCES);
        }
    }
}
