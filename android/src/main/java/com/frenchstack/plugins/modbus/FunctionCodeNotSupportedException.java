package com.pavloniym.capacitor.plugins.modbus;

//import Exceptions.ModbusException;

public class FunctionCodeNotSupportedException
extends ModbusException {
    public FunctionCodeNotSupportedException() {
    }

    public FunctionCodeNotSupportedException(String s) {
        super(s);
    }
}

