package com.frenchstack.plugins.modbus;

//import Exceptions.ModbusException;

public class CRCCheckFailedException
extends ModbusException {
    public CRCCheckFailedException() {
    }

    public CRCCheckFailedException(String s) {
        super(s);
    }
}

