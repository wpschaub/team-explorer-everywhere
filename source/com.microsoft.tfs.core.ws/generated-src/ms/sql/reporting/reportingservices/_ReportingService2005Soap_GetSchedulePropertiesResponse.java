// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._DailyRecurrence;
import ms.sql.reporting.reportingservices._DaysOfWeekSelector;
import ms.sql.reporting.reportingservices._MinuteRecurrence;
import ms.sql.reporting.reportingservices._MonthlyDOWRecurrence;
import ms.sql.reporting.reportingservices._MonthlyRecurrence;
import ms.sql.reporting.reportingservices._MonthsOfYearSelector;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_GetSchedulePropertiesResponse;
import ms.sql.reporting.reportingservices._Schedule;
import ms.sql.reporting.reportingservices._ScheduleDefinition;
import ms.sql.reporting.reportingservices._ScheduleStateEnum;
import ms.sql.reporting.reportingservices._WeekNumberEnum;
import ms.sql.reporting.reportingservices._WeeklyRecurrence;

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
public class _ReportingService2005Soap_GetSchedulePropertiesResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _Schedule schedule;

    public _ReportingService2005Soap_GetSchedulePropertiesResponse()
    {
        super();
    }

    public _ReportingService2005Soap_GetSchedulePropertiesResponse(final _Schedule schedule)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSchedule(schedule);
    }

    public _Schedule getSchedule()
    {
        return this.schedule;
    }

    public void setSchedule(_Schedule value)
    {
        this.schedule = value;
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

                if (localName.equalsIgnoreCase("Schedule"))
                {
                    this.schedule = new _Schedule();
                    this.schedule.readFromElement(reader);
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
