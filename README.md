# Design Patterns em Java

Bem-vindo ao repositório! Aqui você encontrará implementações e explicações de cinco padrões de projeto (*Design Patterns*) essenciais para o desenvolvimento de software:

## Padrões abordados

### Facade (Fachada)
Simplifica o uso de sistemas complexos criando uma interface única para interagir com múltiplas classes. Exemplo: um controle remoto que liga vários dispositivos com um único botão.

### Factory (Fábrica)
Centraliza a criação de objetos sem expor os detalhes de implementação. Exemplo: uma fábrica de carros que entrega modelos específicos sob demanda.

### Mediator (Mediador)
Facilita a comunicação entre objetos sem que eles se conheçam diretamente, reduzindo dependências. Exemplo: um chat em grupo onde um servidor intermedia mensagens entre usuários.

### Observer (Observador)
Define uma relação de "publicação e inscrição", onde múltiplos objetos podem reagir automaticamente a mudanças em um objeto principal. Exemplo: um sistema de notificações que alerta os usuários sobre atualizações.

### Strategy (Estratégia)
Permite alterar o comportamento de um objeto dinamicamente através da substituição de algoritmos. Exemplo: diferentes estratégias de pagamento em um e-commerce (cartão, boleto, PIX).

## Estrutura do Repositório
Cada padrão possui uma pasta dedicada com:
- **Código-fonte** com exemplos práticos em Java.
- **Explicação** detalhada do conceito e do funcionamento.
- **Casos de uso** para facilitar a compreensão.

## Como usar
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/design-patterns-java.git
   ```
2. Navegue até o padrão desejado:
   ```sh
   cd design-patterns-java/facade
   ```
3. Compile e execute os exemplos:
   ```sh
   javac *.java && java Main
   ```

## Referências
- *Design Patterns: Elements of Reusable Object-Oriented Software* – Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
- Documentação oficial da Oracle sobre padrões de projeto.

