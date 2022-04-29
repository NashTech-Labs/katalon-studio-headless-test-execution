import { Httpx } from 'https://jslib.k6.io/httpx/0.0.4/index.js';

const session = new Httpx({
  baseURL: 'https://httpbin.test.k6.io',
  timeout: 20000, // 20s timeout
});

export default function testSuite() {
  const resp = session.delete(`/delete`);
}
