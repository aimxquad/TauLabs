/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             The simulated Attitude estimation from @ref Sensors.
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
The simulated Attitude estimation from @ref Sensors.

generated from attitudesimulated.xml
 **/
public class AttitudeSimulated extends UAVDataObject {

	public AttitudeSimulated() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> q1ElemNames = new ArrayList<String>();
		q1ElemNames.add("0");
		fields.add( new UAVObjectField("q1", "", UAVObjectField.FieldType.FLOAT32, q1ElemNames, null) );

		List<String> q2ElemNames = new ArrayList<String>();
		q2ElemNames.add("0");
		fields.add( new UAVObjectField("q2", "", UAVObjectField.FieldType.FLOAT32, q2ElemNames, null) );

		List<String> q3ElemNames = new ArrayList<String>();
		q3ElemNames.add("0");
		fields.add( new UAVObjectField("q3", "", UAVObjectField.FieldType.FLOAT32, q3ElemNames, null) );

		List<String> q4ElemNames = new ArrayList<String>();
		q4ElemNames.add("0");
		fields.add( new UAVObjectField("q4", "", UAVObjectField.FieldType.FLOAT32, q4ElemNames, null) );

		List<String> RollElemNames = new ArrayList<String>();
		RollElemNames.add("0");
		fields.add( new UAVObjectField("Roll", "degrees", UAVObjectField.FieldType.FLOAT32, RollElemNames, null) );

		List<String> PitchElemNames = new ArrayList<String>();
		PitchElemNames.add("0");
		fields.add( new UAVObjectField("Pitch", "degrees", UAVObjectField.FieldType.FLOAT32, PitchElemNames, null) );

		List<String> YawElemNames = new ArrayList<String>();
		YawElemNames.add("0");
		fields.add( new UAVObjectField("Yaw", "degrees", UAVObjectField.FieldType.FLOAT32, YawElemNames, null) );

		List<String> VelocityElemNames = new ArrayList<String>();
		VelocityElemNames.add("North");
		VelocityElemNames.add("East");
		VelocityElemNames.add("Down");
		fields.add( new UAVObjectField("Velocity", "m/s", UAVObjectField.FieldType.FLOAT32, VelocityElemNames, null) );

		List<String> PositionElemNames = new ArrayList<String>();
		PositionElemNames.add("North");
		PositionElemNames.add("East");
		PositionElemNames.add("Down");
		fields.add( new UAVObjectField("Position", "m", UAVObjectField.FieldType.FLOAT32, PositionElemNames, null) );


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
    	metadata.flightTelemetryUpdatePeriod = 100;
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

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(long instID) {
		// TODO: Need to get specific instance to clone
		try {
			AttitudeSimulated obj = new AttitudeSimulated();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public AttitudeSimulated GetInstance(UAVObjectManager objMngr, long instID)
	{
	    return (AttitudeSimulated)(objMngr.getObject(AttitudeSimulated.OBJID, instID));
	}

	// Constants
	protected static final long OBJID = 0x9266CE74;
	protected static final String NAME = "AttitudeSimulated";
	protected static String DESCRIPTION = "The simulated Attitude estimation from @ref Sensors.";
	protected static final boolean ISSINGLEINST = 1 > 0;
	protected static final boolean ISSETTINGS = 0 > 0;
	protected static int NUMBYTES = 0;


}
