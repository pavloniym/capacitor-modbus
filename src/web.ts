import { WebPlugin } from '@capacitor/core';

import type { ModbusClientPlugin } from './definitions';

export class ModbusClientWeb extends WebPlugin implements ModbusClientPlugin
{
  async setIpAddress(options : { ip : string }): Promise<void> { throw this.unimplemented(); }
  async setPort(options : { port : number }): Promise<void> { throw this.unimplemented(); }
  async connect(): Promise<void> { throw this.unimplemented(); }

  async connectTo(options : { ip : string, port : number }) : Promise<void> { throw this.unimplemented(); }
  async disconnect(): Promise<void> { throw this.unimplemented(); }
  async isConnected(): Promise<{ result : boolean }> { throw this.unimplemented(); }
  async readHoldingRegisters(options : { start : number, count : number }): Promise<{ result : number[] }> { throw this.unimplemented(); }
  async convertRegistersToFloat(options : { registers : number[], order : 0 | 1 }): Promise<{ result : number }> { throw this.unimplemented(); }
}
