# Gerenciamento de Formulários Acadêmicos

Sistema simples para o cadastro e gerenciamento de formulários acadêmicos, armazenando dados como nome, matéria, professor e unidade em um banco de dados MySQL.

## Funcionalidades

- **Cadastro de Formulários**: Insira dados como nome, matéria, professor e unidade.
- **Armazenamento em MySQL**: Dados armazenados em um banco de dados MySQL.

## Estrutura do Projeto

O projeto é dividido nas seguintes camadas:

- **`ConnectionFactory`**: Responsável pela conexão com o banco de dados.
- **`Formulario`**: Modelo de dados que representa o formulário.
- **`FormularioDao`**: Realiza operações de banco de dados (inserção).
- **`FormularioService`**: Coordena o processo de cadastro.
- **`Principal`**: Classe principal para rodar a aplicação.

## Como Rodar

### 1. Requisitos

- **Java**: JDK 8 ou superior.
- **MySQL**: Banco de dados MySQL configurado.

### 2. Banco de Dados

Crie o banco de dados `db_faculdade` e a tabela `tb_formulario` com o seguinte comando SQL:

CREATE TABLE tb_formulario (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255),
  materia VARCHAR(255),
  professor VARCHAR(255),
  unidade VARCHAR(255)
);


```sql
CREATE TABLE tb_formulario (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255),
  materia VARCHAR(255),
  professor VARCHAR(255),
  unidade VARCHAR(255)
);
```

### 3. Rodando o Projeto

Execute a classe `Principal` para iniciar o processo de cadastro de formulários. O programa pedirá ao usuário as informações por meio de caixas de diálogo e armazenará os dados no banco de dados.

## Estrutura de Pacotes

O projeto está estruturado em pacotes para facilitar a organização do código:

- **`configuration`**: Contém a classe `ConnectionFactory` para gerenciar a conexão com o banco de dados.
- **`sistemagerenciamento`**: Contém as classes principais de negócio, incluindo `Formulario`, `FormularioDao`, `FormularioService` e `Principal`.
- **`sistemagerenciamento.model`**: Contém a classe `Formulario`, que representa a estrutura dos dados.
- **`sistemagerenciamento.dao`**: Contém a classe `FormularioDao` responsável pelas operações SQL.
- **`sistemagerenciamento.service`**: Contém a classe `FormularioService`, que contém a lógica de negócios para o cadastro de formulários.

## Dependências

Este projeto utiliza apenas as bibliotecas padrão do Java, além do driver JDBC para MySQL. Para garantir a compatibilidade com o MySQL, baixe o **JDBC Driver** do MySQL e adicione ao seu projeto.

## Exemplo de Fluxo

1. O usuário executa a aplicação.
2. O sistema solicita as informações do formulário (nome, matéria, professor e unidade) através de caixas de diálogo (`JOptionPane`).
3. O sistema armazena os dados no banco de dados MySQL.

## Contribuições

- NAYARA RENATA COSTA DE PAULA
- ERIC HUMBERTO DO NASCIMENTO BELISÁRIO
- YSADORA CHACON MILANI

Este projeto está aberto para contribuições. Se você encontrar algum problema ou quiser adicionar novas funcionalidades, fique à vontade para abrir uma *issue* ou enviar um *pull request*.

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
