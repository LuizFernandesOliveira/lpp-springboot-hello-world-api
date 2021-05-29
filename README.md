# #1 Hello World:  Minimum API

<img src="https://miro.medium.com/max/856/1*O68LbDvD5Dcsnez73M7v4Q.png" alt="linguagem" width="80px"/>

### **Problemática**
criar uma API que rode na porta 3333, que tenha a rota GET /welcome e retorne um status 200 e um JSON com a seguinte estrutura:

```json
{
	"message": "Hello World"
}
```
### **Screenshot**

![screenshot](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/bd890d65-032e-4e7b-8940-5599fd14d606/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20210529%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20210529T052606Z&X-Amz-Expires=86400&X-Amz-Signature=131079ab7de07a5fe96af201f13303d7cec5475eb8adf1a57906f4c1995b315e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22)

### Starting
- instalando dependencias
    ```shell
    ./mvnw package
    ```
- inicializar aplicação
    ```shell
    ./mvnw spring-boot:run
    ```
- testar aplicação
    ```shell
    ./mvnw test
    ```