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

![screenshot](./screenshots/screen1.png)

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