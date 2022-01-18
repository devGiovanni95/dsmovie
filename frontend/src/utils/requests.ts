//padrao pra teste
//export const BASE_URL = "http://localhost:8080";

//                 esta variavel nao estiver disponivel usa este endereco de teste
export const BASE_URL = process.env.REACT_APP_BACKEND_URL ?? "http://localhost:8080";
