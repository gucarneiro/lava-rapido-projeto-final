# Lava Rápido - Sistema de Gestão de Atendimentos

Sistema desktop em Java (Swing) para gestão de atendimentos de um lava-rápido, com cadastro de veículos, cálculo automático de preços por tipo de serviço e geração de relatório dos atendimentos realizados.

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Swing](https://img.shields.io/badge/Java%20Swing-GUI-blue?style=for-the-badge)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![SENAI](https://img.shields.io/badge/SENAI-Projeto%20Final-orange?style=for-the-badge)](https://www.sp.senai.br/)

## 📌 Sobre o Projeto

Este projeto foi desenvolvido como **Projeto Final de avaliação do curso de Programação Java do SENAI**, com o objetivo de aplicar, em um sistema completo e funcional, os principais conceitos trabalhados ao longo da formação: Programação Orientada a Objetos, construção de interfaces gráficas com Java Swing, coleções, manipulação de arquivos e implementação de regras de negócio.

O sistema simula o dia a dia de um lava-rápido: o atendente cadastra o veículo do cliente (carro ou moto), seleciona o serviço desejado, o valor a cobrar é calculado automaticamente conforme uma tabela de preços, e, ao final do expediente, é possível gerar um relatório consolidado com todos os clientes atendidos.

A proposta central foi ir além de um exercício isolado de lógica, entregando uma aplicação com interface gráfica real, próxima do que se encontraria em um pequeno sistema comercial.

## 🚀 Funcionalidades

- [x] Cadastro de veículo com nome do cliente, modelo, cor e placa.
- [x] Seleção do tipo de veículo (Carro ou Moto) via `JRadioButton`.
- [x] Seleção do serviço desejado por meio de `JComboBox`.
- [x] Cálculo automático e dinâmico do valor a cobrar, de acordo com o tipo de veículo e o serviço escolhido.
- [x] Armazenamento dos clientes atendidos em uma lista (`ArrayList<Cliente>`) durante a sessão.
- [x] Botão "Cancelar" para limpar o formulário e reiniciar o cadastro.
- [x] Geração de relatório em arquivo `.txt` com todos os atendimentos realizados.
- [x] Janela secundária de confirmação exibida após a geração do relatório.
- [ ] Persistência dos atendimentos em banco de dados.
- [ ] Validação de campos obrigatórios (nome, placa etc.).
- [ ] Escolha do diretório de saída do relatório pelo usuário.

## 🛠️ Tecnologias Utilizadas

| Tecnologia          | Utilização                                                                 |
| ------------------- | --------------------------------------------------------------------------- |
| Java                | Linguagem principal da aplicação (Java SE)                                  |
| Java Swing          | Construção da interface gráfica (janelas, botões, campos de texto)          |
| java.io (FileWriter)| Geração do relatório de atendimentos em arquivo de texto                    |
| IntelliJ IDEA        | IDE utilizada, incluindo o GUI Designer para criação visual das telas (`.form`) |

## 📂 Estrutura do Projeto

```
src/
├── Cliente.java          # Classe modelo: dados do cliente e do veículo atendido
├── LavaRapidoForm.java   # Tela principal: cadastro, cálculo de valores e regras de negócio
├── LavaRapidoForm.form   # Layout visual da tela principal (IntelliJ GUI Designer)
├── RelatorioGerado.java  # Tela secundária exibida após a geração do relatório
├── RelatorioGerado.form  # Layout visual da tela de confirmação
└── Arquivo.java          # Responsável por gravar o relatório de atendimentos em .txt
```

## 🧠 Conceitos e Práticas Utilizadas

- **Interfaces Gráficas com Java Swing:** construção das telas com o GUI Designer do IntelliJ, combinando componentes visuais (`JButton`, `JRadioButton`, `JComboBox`) a lógica de negócio via `ActionListener`.
- **Programação Orientada a Eventos:** cada ação do usuário (clicar em cadastrar, trocar o tipo de veículo, escolher um serviço) dispara um evento que atualiza o estado da aplicação em tempo real.
- **Programação Orientada a Objetos:** a entidade `Cliente` encapsula os dados do atendimento, com getters e setters controlando o acesso aos atributos.
- **Coleções (Collections Framework):** uso de `ArrayList<Cliente>` para armazenar dinamicamente os atendimentos realizados durante a execução do programa.
- **Manipulação de Arquivos (I/O):** uso de `FileWriter` para persistir o relatório de atendimentos em disco.
- **Separação de Responsabilidades:** a geração do relatório foi isolada na classe `Arquivo`, mantendo a camada de interface (`LavaRapidoForm`) livre de lógica de escrita em arquivo.

## 📚 O Que Eu Aprendi

### Interfaces Gráficas com Swing

Este projeto foi minha primeira aplicação Java com interface gráfica completa. Aprendi a utilizar o GUI Designer do IntelliJ para desenhar as telas visualmente e a conectar cada componente a um `ActionListener`, entendendo como transitar entre janelas (tela principal e tela de relatório) mantendo o estado da aplicação.

### Regras de Negócio e Cálculo Dinâmico

Implementar a tabela de preços (variando por tipo de veículo e serviço) me exigiu pensar na organização da lógica condicional e em como manter a interface sempre sincronizada com o valor calculado, atualizando o label de preço a cada mudança de seleção do usuário.

### Manipulação de Arquivos em Java

Trabalhar na geração automatizada do relatório me permitiu compreender, na prática, como o Java grava dados em arquivos externos usando as classes do pacote `java.io`, consolidando um dos temas centrais do curso do SENAI.

## ⚙️ Como Executar o Projeto

### Pré-requisitos

- [Java JDK 11 ou superior](https://www.oracle.com/java/technologies/downloads/) instalado na máquina.
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recomendado, pois o projeto utiliza arquivos `.form` do GUI Designer para o layout das telas).
- Git (opcional, para clonar o repositório).

### Passo a Passo

1. **Clone o repositório:**

```
git clone https://github.com/gucarneiro/lava-rapido-projeto-final.git
```

2. **Abra o projeto no IntelliJ IDEA:**

Abra a pasta `lava-rapido-projeto-final` como projeto no IntelliJ para que os arquivos `.form` sejam corretamente interpretados junto com as classes `.java`.

3. **Execute a aplicação:**

Rode o método `main` da classe `LavaRapidoForm` diretamente pela IDE.

> ⚠️ Como a interface foi construída com o GUI Designer do IntelliJ (arquivos `.form`), a compilação via linha de comando (`javac`/`java`) pode não reproduzir corretamente o layout das telas. A execução pela IDE é a forma recomendada.

## 💻 Exemplos de Uso

Fluxo típico de atendimento na aplicação:

```
1. Preencher Nome, Modelo, Cor e Placa do veículo
2. Selecionar o tipo: ( ) Carro   ( ) Moto
3. Selecionar o serviço no combobox (ex: Lavagem Simples, Completa, Detalhada)
4. O valor é calculado e exibido automaticamente: R$ 80.0
5. Clicar em "Cadastrar" para registrar o atendimento
6. Ao final do dia, clicar em "Gerar Relatório"

<img width="387" height="450" alt="image" src="https://github.com/user-attachments/assets/a549b315-ad83-4e62-b3a5-6a02ab5eae6a" />

```

Trecho do relatório gerado (`relatorio.txt`):

```
Todos os clientes atendidos: 

Nome: Maria Silva
Modelo: Onix
Cor: Branco
Placa: ABC1234
Servico realizado: Lavagem Completa
Valor: R$ 80.0

------------------------------------ 
```

## 🧪 Testes

Atualmente, o projeto não conta com frameworks de testes automatizados como o `JUnit`. As validações foram feitas manualmente, testando os fluxos de cadastro, troca de tipo de veículo/serviço e geração de relatório diretamente pela interface gráfica.

*Oportunidade de melhoria:* extrair a lógica de cálculo de preços para uma classe própria e cobri-la com testes unitários, já que hoje ela está acoplada aos `ActionListener` da tela.

## 💡 Decisões Técnicas

### Uso do GUI Designer do IntelliJ (arquivos `.form`)

**Decisão:** construir a interface gráfica utilizando o editor visual do IntelliJ em vez de posicionar os componentes Swing manualmente via código.
**Motivo:** acelerar a construção das telas e concentrar o esforço de desenvolvimento na implementação das regras de negócio, dentro do prazo do projeto final do curso.
**Benefício:** separação clara entre o layout visual (`.form`) e o comportamento da aplicação (`.java`), com o custo de acoplar o build do projeto ao IntelliJ IDEA.

### Isolamento da geração de relatório em uma classe própria

**Decisão:** extrair a lógica de escrita do relatório para a classe `Arquivo`, em vez de implementá-la diretamente em `LavaRapidoForm`.
**Motivo:** manter a tela responsável apenas pela interação com o usuário, sem misturar lógica de I/O com lógica de interface.
**Benefício:** facilita futuras mudanças no formato do relatório (por exemplo, migrar de `.txt` para `.csv` ou `.pdf`) sem alterar a camada visual.

## 📈 Pontos Fortes

- **Fluxo completo de atendimento:** do preenchimento dos dados do cliente até a geração do relatório final, simulando um pequeno sistema de ponto de atendimento real.
- **Cálculo automático de preços:** o valor é recalculado em tempo real conforme o usuário altera o tipo de veículo e o serviço, sem necessidade de ações extras.
- **Organização em camadas:** separação entre modelo de dados (`Cliente`), interface (`LavaRapidoForm` e `RelatorioGerado`) e persistência do relatório (`Arquivo`).

## 🔧 O Que Pode Ser Melhorado

**Problema:** o caminho do arquivo de relatório está fixo (*hardcoded*) apontando para uma pasta local do Windows.
**Impacto:** o recurso de gerar relatório só funciona na máquina original de desenvolvimento.
**Possível solução:** permitir que o usuário escolha o diretório de saída com um `JFileChooser`, ou salvar por padrão na pasta do próprio projeto.

**Problema:** a tabela de preços está duplicada entre os listeners dos `JRadioButton`/`JComboBox` e o botão "Cadastrar".
**Impacto:** risco de os valores ficarem divergentes caso um dos trechos seja atualizado sem o outro.
**Possível solução:** centralizar os preços em uma única estrutura (por exemplo, um `Map<String, Double>` ou um método dedicado de cálculo).

**Problema:** ausência de validação dos campos de texto (nome, placa, modelo, cor).
**Impacto:** é possível cadastrar um atendimento com campos em branco.
**Possível solução:** validar os campos obrigatórios antes de instanciar o objeto `Cliente`.

## 🗺️ Próximos Passos

- [ ] Centralizar a tabela de preços em uma única estrutura de dados.
- [ ] Adicionar validação dos campos obrigatórios do formulário.
- [ ] Permitir a escolha do diretório de saída do relatório via `JFileChooser`.
- [ ] Persistir os atendimentos em um banco de dados (ex: SQLite ou MySQL) em vez de apenas gerar `.txt`.
- [ ] Implementar testes unitários para a lógica de cálculo de valores.

## 🤝 Contribuição

Contribuições são sempre bem-vindas! Se você deseja ajudar a melhorar este projeto, siga os passos abaixo:

1. Faça o fork do projeto.
2. Crie uma nova branch com a sua melhoria: `git checkout -b feature/minha-melhoria`
3. Salve suas alterações e crie uma mensagem de commit detalhada: `git commit -m "feat: centraliza tabela de precos"`
4. Envie suas alterações: `git push origin feature/minha-melhoria`
5. Abra um Pull Request.

## 📄 Licença

Este projeto ainda não possui uma licença definida.

## 👨‍💻 Autor

Desenvolvido por **Gustavo Carneiro**

- GitHub: <https://github.com/gucarneiro>
- LinkedIn: <https://www.linkedin.com/in/gucarneiro/>
