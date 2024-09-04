# Target_desafio_de_Codigo

<h1 align="center" style="text-align: center; background-color: #000; border-radius: 10px">  
    <img src = "https://github.com/user-attachments/assets/c2d42437-379c-49a3-9190-d5b1cd7f7edf" style="margin-top: 10px; height: 300px; width: 300px ">
    <p style="text-shadow : 1px 1px 10px orange">Desafios de Código</p>
</h1>

> ### Foi proposto alguns desafios onde seguem as respostas no README e nos codigos nas pastas, onde utilizei a linguagem java versão 17 para realiza-los.

>"

### 🗂️Hierarquia das pastas

```bash
  target
    └── src
        └── desafios
            ├── primeiro
            │   └── Fabonacci
            ├── segundo
            │   └── VerificarLetras
            └── terceiro
                └── Incrementa
```


<br/>

## 🔨 Tools
<div display="inline">
    <img align="center" alt="Java" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" />

</div>
<br/>

## Author 🧑🏼‍🎨

- [@ThiagoMdO](https://github.com/ThiagoMdO)

<br/>

## Três ultimas Perguntas ⚙️

## 3) Observe o trecho de código abaixo:
int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
Ao final do processamento, qual será o valor da variável SOMA?   
SOMA = 66 (OBS: existe um desafio onde faço o looping e exibe a resposta no programa)


## 4) Descubra a lógica e complete o próximo elemento:

### a) Sequência de números ímpares
**Sequência**: 1, 3, 5, 7, **11**  
**Lógica**: Números ímpares consecutivos.  
**Próximo elemento**: **11**

---

### b) Sequência de potências de 2
**Sequência**: 2, 4, 8, 16, 32, 64, **128**  
**Lógica**: Multiplicar o número por 2 (ou dobrar o anterior).  
**Próximo elemento**: **128**

---

### c) Sequência de quadrados perfeitos
**Sequência**: 0, 1, 4, 9, 16, 25, 36, **49**  
**Lógica**: Números quadrados perfeitos (n²).  
**Próximo elemento**: **49** (7²)

---

### d) Multiplicação do último número por ele mesmo
**Sequência**: 4, 16, 36, 64, **4096**  
**Lógica**: Multiplicar o último número por ele mesmo.  
**Próximo elemento**: **4096** (64 * 64)

---

### e) Sequência de Fibonacci
**Sequência**: 1, 1, 2, 3, 5, 8, **13**  
**Lógica**: Soma dos dois números anteriores.  
**Próximo elemento**: **13**

---

### f) Sequência indefinida
**Sequência**: 2, 10, 12, 16, 17, 18, 19, **?**  
**Lógica**: Não consegui identificar.  
**Próximo elemento**: **?**


# 5) Solução para o Problema dos Interruptores e Lâmpadas

## Cenário
Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Não é possível ver as lâmpadas da sala onde você está, mas pode ligar e desligar os interruptores quantas vezes quiser. O objetivo é descobrir qual interruptor controla qual lâmpada, fazendo apenas **duas idas** até uma das salas das lâmpadas.

## Passos para resolver o problema

1. **Ligue o primeiro interruptor** e espere alguns minutos para que a lâmpada correspondente aqueça.
2. **Desligue o primeiro interruptor**.
3. **Ligue o segundo interruptor** e vá para a sala das lâmpadas para observar.

### 3.1 Se a lâmpada estiver ligada:
- **Conclusão**: Essa lâmpada está ligada ao **segundo interruptor**.
- **Vá para outra sala**:
    - Se a lâmpada estiver **apagada e quente**, ela está ligada ao **primeiro interruptor**, pois ficou ligada antes de ser desligada.
    - Se a lâmpada estiver **apagada e fria**, ela está ligada ao **terceiro interruptor**, que nunca foi ligado.

### 3.2 Se a lâmpada estiver apagada:
- Verifique se a lâmpada está **quente** ou **fria**:
    - **Quente**: Ela está ligada ao **primeiro interruptor**, que foi desligado após algum tempo.
    - **Fria**: Ela está ligada ao **terceiro interruptor**, que nunca foi ligado.
- **Vá para outra sala**:
    - Se a lâmpada estiver **acesa**, ela está ligada ao **segundo interruptor**.
    - Se a lâmpada estiver **apagada**, siga a lógica da temperatura (quente/fria) para identificar se é do **primeiro** ou **terceiro interruptor**.

## Resumo
- **Lâmpada acesa**: Controlada pelo interruptor ligado por último (Interruptor 2).
- **Lâmpada apagada e quente**: Controlada pelo primeiro interruptor, que foi desligado antes de ir para a sala.
- **Lâmpada apagada e fria**: Controlada pelo terceiro interruptor, que nunca foi ligado.


## Author 🧑🏼‍🎨

- [@ThiagoMdO](https://github.com/ThiagoMdO)

More information in my [Portfolio](https://thiagomdo.github.io/Site_Portfolio/)


## Feedback

Se você tiver algum feedback, por favor me contate por email: oliveirathiagomendees@gmail.com

