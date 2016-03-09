// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /flagSet.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Automatically generated flag set class.
 */
public final class _BuildServiceHostUpdate
    extends FlagSet
{
    /**
     * Constructs a _BuildServiceHostUpdate with no flags initially set.
     */
    public _BuildServiceHostUpdate()
    {
        super();
    }

    /**
     * Constructs a _BuildServiceHostUpdate with the given flags initially set.
     *
     * @param flags
     *        the flags initially contained in this set.
     */
    public _BuildServiceHostUpdate(final _BuildServiceHostUpdate_Flag[] flags)
    {
        super(flags);
    }

    /**
     * Constructs a _BuildServiceHostUpdate with the given flags initially set.
     *
     * @param flagStrings
     *        the flags initially contained in this set.
     */
    public _BuildServiceHostUpdate(final String[] flagStrings)
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
        return _BuildServiceHostUpdate_Flag.fromString(
            value,
            _BuildServiceHostUpdate_Flag.VALUES_TO_INSTANCES);
    }

    /**
     * Gets the flags this flag set contains.
     *
     * @return the flags this flag set contains.
     */
    public _BuildServiceHostUpdate_Flag[] getFlags()
    {
        return (_BuildServiceHostUpdate_Flag[]) this.toArray(new _BuildServiceHostUpdate_Flag[this.size()]);
    }

    public boolean add(_BuildServiceHostUpdate_Flag o)
    {
        return super.add(o);
    }

    public boolean contains(_BuildServiceHostUpdate_Flag o)
    {
        return super.contains(o);
    }

    public boolean remove(_BuildServiceHostUpdate_Flag o)
    {
        return super.remove(o);
    }

    /**
     * Defines the valid flag values that can be contained in _BuildServiceHostUpdate.
     *
     * This class is non-final for the rare occasion where custom values must be
     * defined because the web service accepts values not publicly defined in its
     * web service definition.
     */
    public static class _BuildServiceHostUpdate_Flag
        extends Flag
    {
        /**
         * This map lets static methods in this class map strings to the correct
         * instance type at deserialization time.
         */
        private final static Map VALUES_TO_INSTANCES = new HashMap();
        public static final _BuildServiceHostUpdate_Flag None = new _BuildServiceHostUpdate_Flag("None");
        public static final _BuildServiceHostUpdate_Flag Name = new _BuildServiceHostUpdate_Flag("Name");
        public static final _BuildServiceHostUpdate_Flag BaseUrl = new _BuildServiceHostUpdate_Flag("BaseUrl");
        public static final _BuildServiceHostUpdate_Flag RequireClientCertificates = new _BuildServiceHostUpdate_Flag(
                    "RequireClientCertificates");

        protected _BuildServiceHostUpdate_Flag(final String name)
        {
            super(name, _BuildServiceHostUpdate_Flag.VALUES_TO_INSTANCES);
        }
    }
}
