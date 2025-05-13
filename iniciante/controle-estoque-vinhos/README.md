# 🍷 Projeto: Controle de Estoque de Vinhos (Nível Fácil)

Um programa em Java para controle simples de estoque de vinhos, com entrada de dados via terminal, uso de arrays e geração de relatórios.

---

## 💡 Desafio

Desenvolver um sistema que permita:

- Permitir cadastrar vários vinhos (quantidade definida pelo usuário).
- Para cada vinho, ler:
  - nome 
  - tipo (tinto, branco, rosé)
  - quantidade em estoque 
  - preço unitário.
- Exibir um relatório final com todos os vinhos cadastrados, mostrando: 
  - nome 
  - tipo
  - quantidade
  - preço unitário
  - valor total em estoque (quantidade × preço).

---
## 🛠️ Funcionalidades Implementadas

- **Contagem por Tipo de Vinho:**  
  O programa mantém a contagem total de vinhos por tipo (Tinto, Branco, Rosé), permitindo uma visão detalhada da distribuição do estoque.

- **Cálculo do Valor Total do Estoque:**  
  Além de mostrar os dados de cada vinho, o programa calcula o valor total do estoque, somando os valores de todos os vinhos cadastrados.
---

## 🧠 Conceitos Praticados

- Arrays em Java
- Estruturas de repetição e condição
- Entrada de dados com `Scanner`
- Operações matemáticas simples
- Organização e separação de responsabilidades no código
- Uso de `equalsIgnoreCase()` para comparação de strings

---

## 📁 Estrutura do Projeto

```
controle-estoque-vinhos/
├── src/
│   └── br/
│       └── com/
│           └── dayene/
│               └── ControleEstoqueVinhos.java
├── README.md
```