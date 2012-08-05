/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Settings for the @ref AltitudeHold module
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
Settings for the @ref AltitudeHold module

generated from altitudeholdsettings.xml
 **/
public class AltitudeHoldSettings extends UAVDataObject {

	public AltitudeHoldSettings() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> KpElemNames = new ArrayList<String>();
		KpElemNames.add("0");
		fields.add( new UAVObjectField("Kp", "throttle/m", UAVObjectField.FieldType.FLOAT32, KpElemNames, null) );

		List<String> KiElemNames = new ArrayList<String>();
		KiElemNames.add("0");
		fields.add( new UAVObjectField("Ki", "throttle/m", UAVObjectField.FieldType.FLOAT32, KiElemNames, null) );

		List<String> KdElemNames = new ArrayList<String>();
		KdElemNames.add("0");
		fields.add( new UAVObjectField("Kd", "throttle/m", UAVObjectField.FieldType.FLOAT32, KdElemNames, null) );

		List<String> KaElemNames = new ArrayList<String>();
		KaElemNames.add("0");
		fields.add( new UAVObjectField("Ka", "throttle/(m/s^2)", UAVObjectField.FieldType.FLOAT32, KaElemNames, null) );

		List<String> PressureNoiseElemNames = new ArrayList<String>();
		PressureNoiseElemNames.add("0");
		fields.add( new UAVObjectField("PressureNoise", "m", UAVObjectField.FieldType.FLOAT32, PressureNoiseElemNames, null) );

		List<String> AccelNoiseElemNames = new ArrayList<String>();
		AccelNoiseElemNames.add("0");
		fields.add( new UAVObjectField("AccelNoise", "m/s^2", UAVObjectField.FieldType.FLOAT32, AccelNoiseElemNames, null) );

		List<String> AccelDriftElemNames = new ArrayList<String>();
		AccelDriftElemNames.add("0");
		fields.add( new UAVObjectField("AccelDrift", "m/s^2", UAVObjectField.FieldType.FLOAT32, AccelDriftElemNames, null) );


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
		    1 << UAVOBJ_TELEMETRY_ACKED_SHIFT |
		    1 << UAVOBJ_GCS_TELEMETRY_ACKED_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_ONCHANGE) << UAVOBJ_TELEMETRY_UPDATE_MODE_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_ONCHANGE) << UAVOBJ_GCS_TELEMETRY_UPDATE_MODE_SHIFT;
    	metadata.flightTelemetryUpdatePeriod = 0;
    	metadata.gcsTelemetryUpdatePeriod = 0;
    	metadata.loggingUpdatePeriod = 0;
 
		return metadata;
	}

	/**
	 * Initialize object fields with the default values.
	 * If a default value is not specified the object fields
	 * will be initialized to zero.
	 */
	public void setDefaultFieldValues()
	{
		getField("Kp").setValue(0.03);
		getField("Ki").setValue(0);
		getField("Kd").setValue(0.03);
		getField("Ka").setValue(0.005);
		getField("PressureNoise").setValue(0.4);
		getField("AccelNoise").setValue(5);
		getField("AccelDrift").setValue(0.001);

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(long instID) {
		// TODO: Need to get specific instance to clone
		try {
			AltitudeHoldSettings obj = new AltitudeHoldSettings();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public AltitudeHoldSettings GetInstance(UAVObjectManager objMngr, long instID)
	{
	    return (AltitudeHoldSettings)(objMngr.getObject(AltitudeHoldSettings.OBJID, instID));
	}

	// Constants
	protected static final long OBJID = 0xFEC55B42;
	protected static final String NAME = "AltitudeHoldSettings";
	protected static String DESCRIPTION = "Settings for the @ref AltitudeHold module";
	protected static final boolean ISSINGLEINST = 1 > 0;
	protected static final boolean ISSETTINGS = 1 > 0;
	protected static int NUMBYTES = 0;


}
