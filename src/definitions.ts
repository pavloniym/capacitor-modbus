export interface ModbusClientPlugin {
  // echo(options: { value: string }): Promise<{ value: string }>;

  setipAddress(options: { ip : string }): Promise<void>;
  setPort(options: { port : number }): Promise<void>;
  Connect(): Promise<void>;
}
