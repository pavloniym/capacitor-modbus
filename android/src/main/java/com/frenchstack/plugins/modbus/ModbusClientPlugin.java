package com.frenchstack.plugins.modbus;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CapacitorPlugin(name = "ModbusClient")
public class ModbusClientPlugin extends Plugin {

    private ModbusClient implementation = new ModbusClient();

    @PluginMethod
    public void setIpAddress(PluginCall call)
    {
        String ip = call.getString("ip");

        implementation.setipAddress(ip);

        call.resolve();
    }

    @PluginMethod
    public void setPort(PluginCall call)
    {
        int port = call.getInt("port");

        implementation.setPort(port);

        call.resolve();
    }

    @PluginMethod
    public void connect(PluginCall call) throws IOException
    {
        implementation.Connect();

        call.resolve();
    }

    @PluginMethod
    public void disconnect(PluginCall call) throws IOException
    {
        implementation.Disconnect();

        call.resolve();
    }

    @PluginMethod
    public void connectTo(PluginCall call) throws IOException
    {
        String ip = call.getString("ip");
        int port = call.getInt("port");

        implementation.Connect(ip, port);

        call.resolve();
    }

    @PluginMethod
    public void isConnected(PluginCall call) throws IOException
    {
        boolean result = implementation.isConnected();

        JSObject jsResponse = new JSObject();
        jsResponse.put("result", result);
        call.resolve(jsResponse);
    }

    @PluginMethod
    public void readHoldingRegisters(PluginCall call) throws IOException, ModbusException
    {
        int start = call.getInt("start");
        int count = call.getInt("count");

        int[] result = implementation.ReadHoldingRegisters(start, count);


        JSArray jsArray = new JSArray();
        for (int i = 0; i < result.length; i++)
        {
            jsArray.put(result[i]);
        }

        JSObject jsResponse = new JSObject();
        jsResponse.put("result", jsArray);
        call.resolve(jsResponse);
    }

    @PluginMethod
    public void convertRegistersToFloat(PluginCall call) throws IOException, ModbusException, JSONException {
        int order = call.getInt("order");
        JSArray jsRegisters = call.getArray("registers");
        int[] registers = new int[jsRegisters.length()];
        for (int i = 0; i < jsRegisters.length(); i++) {
            registers[i] = jsRegisters.getInt(i);
        }

        float result = implementation.ConvertRegistersToFloat(registers, ModbusClient.RegisterOrder.values()[order]);

        JSObject jsResponse = new JSObject();
        jsResponse.put("result", result);
        call.resolve(jsResponse);
    }

    
}
