# 💱 Conversor de Moedas / Currency Converter

![Java](https://img.shields.io/badge/Java-17-blue)
![API](https://img.shields.io/badge/API-ExchangeRate-green)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow)

---

## 🇧🇷 Descrição

Projeto em Java para conversão de moedas em tempo real, utilizando a API pública da [ExchangeRate API](https://www.exchangerate-api.com/).  
O sistema opera via terminal e apresenta um menu interativo para o usuário escolher os pares de conversão.

---

## 🇺🇸 Description

Java project for real-time currency conversion using the [ExchangeRate API](https://www.exchangerate-api.com/).  
The application runs in the terminal and allows users to select currency pairs for conversion through an interactive menu.

---

## 📌 Funcionalidades / Features

- ✅ Conversões entre: BRL, USD, EUR, PYG
- ✅ Taxas atualizadas em tempo real via API
- ✅ Exibição da taxa utilizada
- ✅ Interface no terminal com menu interativo
- ✅ Cálculo automático do valor convertido

---

## 🛠 Tecnologias / Technologies

- Java 17
- Gson (Google JSON library)
- `HttpClient` (Java 11+)
- ExchangeRate API
- IntelliJ IDEA

---

## 🚀 Como executar / How to run

### 1. Clone o repositório / Clone the repository

```bash
git clone https://github.com/dudavalmor/ConversorMoedas.git
cd ConversorMoedas
```

### 2. Configure sua chave da API / Set your API key

- Crie uma conta gratuita em: [https://www.exchangerate-api.com](https://www.exchangerate-api.com)
- Copie sua chave (API key), algo como: `56859e5e9a48f7b032c00a5b`
- Substitua no código a string `SUA_CHAVE_AQUI` por sua chave real:

```java
// Troque isso:
"https://v6.exchangerate-api.com/v6/SUA_CHAVE_AQUI/latest/" + moedaBase

// Por isso:
"https://v6.exchangerate-api.com/v6/56859e5e9a48f7b032c00a5b/latest/" + moedaBase
```

### 3. Execute o programa / Run the program

Abra o `Main.java` no IntelliJ e execute, ou rode pelo terminal com:

```bash
javac Main.java
java Main
```

---

## 💡 Exemplo de uso / Example of use

```text
1) Real >> Dólar
2) Real >> Euro
3) Real >> Guarani
4) Dólar >> Real
5) Euro >> Real
6) Guarani >> Real
7) Sair

Digite a opção: 1
Digite o valor que deseja converter: 100

100.00 BRL converted to USD:
Rate: 0.1822
Converted value: 18.22
```

---

## 📁 Estrutura / Structure

```
ConversorMoedas/
├── Main.java              # Interface principal / Main logic
├── Busca.java             # Consulta à API / API access
├── ConverteSigla.java     # Mapeamento de opções / Menu option mapping
├── Moeda.java             # Classe de apoio / Helper class (opcional)
├── MoedaRecord.java       # Record com siglas de moedas / Currency code record
```

---

## ✅ Melhorias futuras / Future improvements

- [ ] Armazenar histórico de conversões / Store conversion history
- [ ] Criar interface gráfica (Swing/JavaFX) / GUI support
- [ ] Suporte para mais moedas / Support for more currencies

---

## 🤝 Contribuições / Contributions

Contribuições são bem-vindas!  
Feel free to fork, open issues, or submit pull requests 🚀

---

## 📝 Licença / License

Este projeto está sob a licença MIT.  
This project is licensed under the MIT License.


