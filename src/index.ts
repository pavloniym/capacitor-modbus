import { registerPlugin } from '@capacitor/core';

import type { ModbusClientPlugin } from './definitions';

const ModbusClient = registerPlugin<ModbusClientPlugin>('ModbusClient', {
  web: () => import('./web').then(m => new m.ModbusClientWeb()),
});

export * from './definitions';
export { ModbusClient };
