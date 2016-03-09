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
public final class _QueuedBuildUpdate
    extends FlagSet
{
    /**
     * Constructs a _QueuedBuildUpdate with no flags initially set.
     */
    public _QueuedBuildUpdate()
    {
        super();
    }

    /**
     * Constructs a _QueuedBuildUpdate with the given flags initially set.
     *
     * @param flags
     *        the flags initially contained in this set.
     */
    public _QueuedBuildUpdate(final _QueuedBuildUpdate_Flag[] flags)
    {
        super(flags);
    }

    /**
     * Constructs a _QueuedBuildUpdate with the given flags initially set.
     *
     * @param flagStrings
     *        the flags initially contained in this set.
     */
    public _QueuedBuildUpdate(final String[] flagStrings)
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
        return _QueuedBuildUpdate_Flag.fromString(
            value,
            _QueuedBuildUpdate_Flag.VALUES_TO_INSTANCES);
    }

    /**
     * Gets the flags this flag set contains.
     *
     * @return the flags this flag set contains.
     */
    public _QueuedBuildUpdate_Flag[] getFlags()
    {
        return (_QueuedBuildUpdate_Flag[]) this.toArray(new _QueuedBuildUpdate_Flag[this.size()]);
    }

    public boolean add(_QueuedBuildUpdate_Flag o)
    {
        return super.add(o);
    }

    public boolean contains(_QueuedBuildUpdate_Flag o)
    {
        return super.contains(o);
    }

    public boolean remove(_QueuedBuildUpdate_Flag o)
    {
        return super.remove(o);
    }

    /**
     * Defines the valid flag values that can be contained in _QueuedBuildUpdate.
     *
     * This class is non-final for the rare occasion where custom values must be
     * defined because the web service accepts values not publicly defined in its
     * web service definition.
     */
    public static class _QueuedBuildUpdate_Flag
        extends Flag
    {
        /**
         * This map lets static methods in this class map strings to the correct
         * instance type at deserialization time.
         */
        private final static Map VALUES_TO_INSTANCES = new HashMap();
        public static final _QueuedBuildUpdate_Flag None = new _QueuedBuildUpdate_Flag("None");
        public static final _QueuedBuildUpdate_Flag Priority = new _QueuedBuildUpdate_Flag("Priority");
        public static final _QueuedBuildUpdate_Flag Postponed = new _QueuedBuildUpdate_Flag("Postponed");
        public static final _QueuedBuildUpdate_Flag Retry = new _QueuedBuildUpdate_Flag("Retry");
        public static final _QueuedBuildUpdate_Flag BatchId = new _QueuedBuildUpdate_Flag("BatchId");
        public static final _QueuedBuildUpdate_Flag Requeue = new _QueuedBuildUpdate_Flag("Requeue");

        protected _QueuedBuildUpdate_Flag(final String name)
        {
            super(name, _QueuedBuildUpdate_Flag.VALUES_TO_INSTANCES);
        }
    }
}
