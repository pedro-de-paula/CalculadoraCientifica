# 📐 Calculadora Científica em Java

Uma calculadora científica completa desenvolvida em Java, com suporte a operações matemáticas básicas, funções trigonométricas, logaritmos, exponenciais, operações com números complexos e conceitos de elétrica (números em forma polar/retangular, fator de potência, etc).

---

## 📦 Funcionalidades

### ✅ Operações Aritméticas
- Soma
- Subtração
- Multiplicação
- Divisão
- Exponenciação
- Radiciação (n-ésima raiz)

### ✅ Funções Matemáticas
- Logaritmo (base 10 e natural)
- Exponencial (e^x)
- Fatorial
- Permutação e Combinação
- Arredondamentos: `floor`, `ceil`, `round`
- Valor absoluto (`abs`)
- Raiz cúbica
- Geração de número aleatório

### ✅ Trigonometria
- Seno, Cosseno, Tangente (graus)
- Funções hiperbólicas: `sinh`, `cosh`, `tanh`
- Inversas hiperbólicas: `asinh`, `acosh`, `atanh`

### ✅ Números Complexos
- Soma, subtração, multiplicação e divisão de complexos
- Conversão entre forma retangular e polar
- Cálculo do módulo, argumento (fase) e conjugado
- Potência de número complexo em forma polar

### ✅ Elétrica (Corrente Alternada)
- Conversão de números complexos (Z, I, V) entre retangular ↔ polar
- Fator de Potência (cos(θ))

---

## 🚀 Como executar o projeto

### 🔧 Pré-requisitos
- Java JDK 8 ou superior
- Um editor (VSCode, IntelliJ, Eclipse) ou terminal

### 📂 Estrutura dos arquivos

Calculadora/
├── Main.java
├── Calculadora.java
└── README.md


### 💻 Compilar e rodar via terminal

```bash
# Acesse a pasta do projeto
cd Calculadora

# Compile os arquivos
javac Main.java Calculadora.java

# Execute
java Main

🧪 Exemplo de uso
--- CALCULADORA CIENTÍFICA ---
Escolha uma operação:
1 - Somar
2 - Subtrair
...
22 - Retangular → Polar
23 - Polar → Retangular
0 - Sair
Opção: 22

Parte real: 3
Parte imaginária: 4
Forma polar: 5 ∠ 53.13°

🛠️ Tecnologias Utilizadas
Java SE 8+
Math API (java.lang.Math)
Estrutura modular de pacotes

👨‍💻 Autor
Desenvolvido por Pedro de Paula
Projeto acadêmico de uma calculadora científica com suporte a matemática avançada e conceitos de engenharia elétrica.
Para mais projetos : https://github.com/pedro-de-paula
