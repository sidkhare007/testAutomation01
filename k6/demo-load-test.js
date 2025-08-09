import http from 'k6/http';
import { sleep, check } from 'k6';

export let options = {
  vus: 5,
  duration: '20s',
};

export default function () {
  let res = http.get('https://reqres.in/api/users?page=2');
  check(res, { 'status 200': (r) => r.status === 200 });
  sleep(1);
}
