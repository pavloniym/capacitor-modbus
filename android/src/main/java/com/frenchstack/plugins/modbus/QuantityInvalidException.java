package com.frenchstack.plugins.modbus;

//import Exceptions.ModbusException;

public class QuantityInvalidException
extends ModbusException {
    public QuantityInvalidException() {
    }

    public QuantityInvalidException(String s) {
        super(s);
    }
}

