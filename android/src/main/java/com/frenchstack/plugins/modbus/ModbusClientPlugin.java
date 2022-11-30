package com.frenchstack.plugins.modbus;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import java.io.IOException;

@CapacitorPlugin(name = "ModbusClient")
public class ModbusClientPlugin extends Plugin {

    private ModbusClient implementation = new ModbusClient();

    @PluginMethod
    public void setipAddress(PluginCall call)
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
    public void Connect(PluginCall call) throws IOException {
        implementation.Connect();
        call.resolve();
    }
}
