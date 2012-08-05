/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Contains the GPS time from @ref GPSModule.  Required to compute the world magnetic model correctly when setting the home location.
 *
 * @see        The GNU Public License (GPL) Version 3
 *
 *****************************************************************************/
/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.openpilot.uavtalk.uavobjects;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openpilot.uavtalk.UAVObjectManager;
import org.openpilot.uavtalk.UAVObject;
import org.openpilot.uavtalk.UAVDataObject;
import org.openpilot.uavtalk.UAVObjectField;

/**
Contains the GPS time from @ref GPSModule.  Required to compute the world magnetic model correctly when setting the home location.

generated from gpstime.xml
 **/
public class GPSTime extends UAVDataObject {

	public GPSTime() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> YearElemNames = new ArrayList<String>();
		YearElemNames.add("0");
		fields.add( new UAVObjectField("Year", "", UAVObjectField.FieldType.INT16, YearElemNames, null) );

		List<String> MonthElemNames = new ArrayList<String>();
		MonthElemNames.add("0");
		fields.add( new UAVObjectField("Month", "", UAVObjectField.FieldType.INT8, MonthElemNames, null) );

		List<String> DayElemNames = new ArrayList<String>();
		DayElemNames.add("0");
		fields.add( new UAVObjectField("Day", "", UAVObjectField.FieldType.INT8, DayElemNames, null) );

		List<String> HourElemNames = new ArrayList<String>();
		HourElemNames.add("0");
		fields.add( new UAVObjectField("Hour", "", UAVObjectField.FieldType.INT8, HourElemNames, null) );

		List<String> MinuteElemNames = new ArrayList<String>();
		MinuteElemNames.add("0");
		fields.add( new UAVObjectField("Minute", "", UAVObjectField.FieldType.INT8, MinuteElemNames, null) );

		List<String> SecondElemNames = new ArrayList<String>();
		SecondElemNames.add("0");
		fields.add( new UAVObjectField("Second", "", UAVObjectField.FieldType.INT8, SecondElemNames, null) );


		// Compute the number of bytes for this object
		int numBytes = 0;
		ListIterator<UAVObjectField> li = fields.listIterator();
		while(li.hasNext()) {
			numBytes += li.next().getNumBytes();
		}
		NUMBYTES = numBytes;

		// Initialize object
		initializeFields(fields, ByteBuffer.allocate(NUMBYTES), NUMBYTES);
		// Set the default field values
		setDefaultFieldValues();
		// Set the object description
		setDescription(DESCRIPTION);
	}

	/**
	 * Create a Metadata object filled with default values for this object
	 * @return Metadata object with default values
	 */
	public Metadata getDefaultMetadata() {
		UAVObject.Metadata metadata = new UAVObject.Metadata();
    	metadata.flags =
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_ACCESS_SHIFT |
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_GCS_ACCESS_SHIFT |
		    0 << UAVOBJ_TELEMETRY_ACKED_SHIFT |
		    0 << UAVOBJ_GCS_TELEMETRY_ACKED_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_PERIODIC) << UAVOBJ_TELEMETRY_UPDATE_MODE_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_MANUAL) << UAVOBJ_GCS_TELEMETRY_UPDATE_MODE_SHIFT;
    	metadata.flightTelemetryUpdatePeriod = 10000;
    	metadata.gcsTelemetryUpdatePeriod = 0;
    	metadata.loggingUpdatePeriod = 30000;
 
		return metadata;
	}

	/**
	 * Initialize object fields with the default values.
	 * If a default value is not specified the object fields
	 * will be initialized to zero.
	 */
	public void setDefaultFieldValues()
	{

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(long instID) {
		// TODO: Need to get specific instance to clone
		try {
			GPSTime obj = new GPSTime();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public GPSTime GetInstance(UAVObjectManager objMngr, long instID)
	{
	    return (GPSTime)(objMngr.getObject(GPSTime.OBJID, instID));
	}

	// Constants
	protected static final long OBJID = 0xD4478084;
	protected static final String NAME = "GPSTime";
	protected static String DESCRIPTION = "Contains the GPS time from @ref GPSModule.  Required to compute the world magnetic model correctly when setting the home location.";
	protected static final boolean ISSINGLEINST = 1 == 1;
	protected static final boolean ISSETTINGS = 0 == 1;
	protected static int NUMBYTES = 0;


}
