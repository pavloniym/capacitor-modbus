import { WebPlugin } from '@capacitor/core';

import type { ModbusClientPlugin } from './definitions';

export class ModbusClientWeb extends WebPlugin implements ModbusClientPlugin {
  // async echo(options: { value: string }): Promise<{ value: string }> {
  //   console.log('ECHO', options);
  //   return options;
  // }

  async setipAddress(options: { ip: string }): Promise<void>
  {
    return;
  }

  async setPort(options: { port: number }): Promise<void>
  {
    return;
  }

  async Connect(): Promise<void>
  {
    return;
  }

}
