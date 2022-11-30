export interface ModbusClientPlugin
{
  setIpAddress(options : { ip : string }): Promise<void>;
  setPort(options : { port : number }): Promise<void>;
  connect(): Promise<void>;

  connectTo(options : { ip : string, port : number }): Promise<void>;
  disconnect(): Promise<void>;
  isConnected(): Promise<{ result : boolean }>;
  readHoldingRegisters(options : { start : number, count : number }): Promise<{ result : number[] }>;
  convertRegistersToFloat(options : { registers : number[], order : 0 | 1 }): Promise<{ result : number }>;
}