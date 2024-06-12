# Classe Data

Este repositório contém a implementação da classe `Data` em Java, conforme solicitado no exercício. A classe `Data` tem três atributos inteiros: `dia`, `mês` e `ano`, e fornece várias formas de inicialização e formatação de datas.

## Estrutura do Projeto

- `Data.java`: Contém a implementação da classe `Data`.
- `DataTeste.java`: Contém a classe de teste para verificar o funcionamento da classe `Data`.

## Construtores da Classe `Data`

1. **Construtor padrão**:
   - Inicializa a data com o valor padrão: dia 01, mês 01, ano 1900.

2. **Construtor com apenas o dia**:
   - Inicializa a data com o dia fornecido, mês 01 e ano 1900.
   - O dia deve estar entre 1 e 31.

3. **Construtor com dia e mês**:
   - Inicializa a data com o dia e mês fornecidos, ano 1900.
   - O mês deve estar entre 1 e 12.
   - O dia deve ser válido para o mês fornecido (considerando meses com 30, 31 dias e fevereiro com 28 ou 29 dias).

4. **Construtor com dia, mês e ano**:
   - Inicializa a data com o dia, mês e ano fornecidos.
   - O mês deve estar entre 1 e 12.
   - O dia deve ser válido para o mês e ano fornecidos (considerando ano bissexto).

## Formatação das Datas

A classe `Data` fornece três métodos para exibir a data em diferentes formatos:

1. **Formato curto**: `dd/mm/aa`
   - Exemplo: `01/01/00`

2. **Formato longo**: `dd/mm/aaaa`
   - Exemplo: `01/01/1900`

3. **Formato por extenso**: `dd de mês_por_extenso de aaaa`
   - Exemplo: `01 de janeiro de 1900`

### Este programa foi desenvolvido por @andree.zxs ou André Luís, aluno do 3° ano do curso Técnico em Desenvolvimento de Sistemas (TDS), Turma A. 👨‍💻
