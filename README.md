# 📚 Curso de Lógica para Programação III

**Instrutor**: Marcio Michelluzzi

## 📋 Lista de Exercícios - POO

### 1. 🧍‍♂️ Pessoa
Crie uma classe para representar uma Pessoa com os atributos:
- `nome` (privado)
- `data de nascimento` (privado)
- `altura` (privado)

Métodos:
- `getters e setters` para os atributos
- `imprimir`: imprime todos os dados da pessoa
- `calcularIdade`: calcula a idade da pessoa

### 2. 💳 ContaCorrente
Implemente uma classe `ContaCorrente` com os atributos:
- `número da conta`
- `nome do correntista`
- `saldo` (opcional, valor default zero)

Métodos:
- `alterarNome`
- `depósito`
- `saque`

### 3. ⛽ BombaCombustivel
Desenvolva uma classe `BombaCombustivel` com os atributos:
- `tipo de combustível`
- `valor por litro`
- `quantidade de combustível`

Métodos:
- `abastecerPorValor`: informa a quantidade de litros
- `abastecerPorLitro`: calcula o valor a ser pago
- `alterarValor`: altera o valor do litro
- `alterarCombustivel`: altera o tipo de combustível
- `alterarQuantidadeCombustivel`: altera a quantidade de combustível

### 4. 🏢 Elevador
Crie uma classe `Elevador` com atributos:
- `andar atual` (inicialmente térreo = 0)
- `total de andares` (desconsiderando o térreo)
- `capacidade do elevador`
- `quantas pessoas estão presentes`

Métodos:
- `Inicializa`: recebe a capacidade e o total de andares
- `Entra`: acrescenta uma pessoa (se houver espaço)
- `Sai`: remove uma pessoa (se houver alguém)
- `Sobe`: sobe um andar (se não for o último)
- `Desce`: desce um andar (se não for o térreo)

### 5. 🎓 Aluno
Implemente uma classe `Aluno` com os atributos:
- `matrícula`
- `nome`
- `2 notas de prova`
- `1 nota de trabalho`

Métodos:
- `media`: calcula a média final (peso das provas: 2,5; peso do trabalho: 2)
- `final`: calcula quanto o aluno precisa para a prova final (retorna zero se não precisar)

### 6. 🛒 Invoice
Crie uma classe `Invoice` para representar uma fatura com os atributos:
- `número do item`
- `descrição do item`
- `quantidade comprada`
- `preço unitário`

Métodos:
- `getters e setters`
- `getInvoiceAmount`: calcula o valor total da fatura

### 7. 👷‍♂️ Funcionario
Crie uma classe `Funcionario` com os atributos:
- `primeiro nome`
- `sobrenome`
- `salário mensal`

Métodos:
- `getters e setters`
- Se o salário não for positivo, configure-o como 0.0.
- Crie um método para calcular o salário anual e aumentá-lo em 10%.

### 8. 📅 Data
Escreva uma classe `Data` que representa uma data com os métodos:
- `Construtor`: define a data, verifica sua validade
- `Compara`: compara com outra data (retorna 0, 1 ou -1)
- `GetDia`, `GetMes`, `GetAno`
- `GetMesExtenso`: retorna o mês por extenso
- `IsBissexto`: verifica se o ano é bissexto
- `Clone`: clona a si próprio

### 9. ✈️ Voo
Crie uma classe `Voo` para representar um voo com os atributos:
- `número do voo`
- `data` (use a classe `Data`)
- `100 passageiros` (máximo)

Métodos:
- `ProximoLivre`: retorna o próximo assento livre
- `Verifica`: verifica se um assento está ocupado
- `Ocupa`: ocupa um assento
- `Vagas`: retorna o número de assentos disponíveis
- `GetVoo`: retorna o número do voo

### 10. ⚽ Jogador de Futebol
Crie uma classe `JogadorDeFutebol` com os atributos:
- `nome`
- `posição`
- `data de nascimento`
- `nacionalidade`
- `altura`
- `peso`

Métodos:
- `getters e setters`
- `imprimir`: imprime todos os dados do jogador
- `calcularIdade`: calcula a idade
- `aposentadoria`: calcula quanto tempo falta para o jogador se aposentar, baseado na posição.

### 11. 🎟️ Ingresso e IngressoVIP
Implemente uma classe `Ingresso` com:
- `valor`

Métodos:
- `imprimirValor`

Crie uma classe `IngressoVIP`, que herda de `Ingresso` e possui:
- `valor adicional`

Métodos:
- `getValorVIP`: retorna o valor total do ingresso VIP

### 12. 📖 Agenda
Crie uma classe `Agenda` para armazenar até 10 pessoas. Métodos:
- `armazenarPessoa(nome, idade, altura)`
- `removerPessoa(nome)`
- `buscarPessoa(nome)`: retorna a posição na agenda
- `imprimirAgenda`: imprime todos os dados
- `imprimirPessoa(index)`: imprime os dados da pessoa na posição `index`

### 13. ➕ Calculadora e Calculadora Científica
Implemente uma classe `Calculadora` para operações básicas:
- `soma`
- `subtração`
- `divisão`
- `multiplicação`

Crie uma classe `CalculadoraCientifica` que herda de `Calculadora` e adiciona:
- `raizQuadrada`
- `potencia`

### 14. 💻 Fatura
Crie uma classe `Fatura` para representar uma fatura com os atributos:
- `número`
- `descrição`
- `quantidade`
- `preço por item`

Métodos:
- `getTotalFatura`: calcula o valor total da fatura

### 15. 👨‍💼 Funcionário com Contador
Crie uma classe `Funcionario` para representar um funcionário com os atributos:
- `nome`
- `sobrenome`
- `salário mensal`

Adicione uma variável de classe para contar o número de funcionários.

### 16. 🚗 Carro
Desenvolva uma classe `Carro` para representar um carro com:
- `tanque de combustível`: máximo de 50 litros
- `consumo`: 15 km/litro

Métodos:
- `abastecer`
- `mover`
- `getCombustivelRestante`
- `getDistanciaPercorrida`

### 17. 📅 Agendamento de Compromissos
Crie uma classe para gerenciar compromissos com atributos:
- `tipo de compromisso`
- `data`
- `nome do participante`
- `telefone`

Métodos:
- `agendar`
- `remover`
- `alterar`
- `exibir por participante`
- `exibir por data`
