<h1>Contador de Vogais</h1>
  <p>Este projeto em Java implementa um programa que conta o número de vogais em uma string fornecida pelo usuário. O programa é composto por duas classes principais: <code>Contador</code> e <code>Main</code>. A classe <code>Contador</code> realiza a contagem de vogais, enquanto a classe <code>Main</code> gerencia a entrada e saída de dados.</p>

  <h2>Estrutura do Projeto</h2>
    <ul>
        <li><strong>Contador.java</strong>: Contém a classe <code>Contador</code>, com o método <code>contarVogais</code>, responsável pela lógica de contagem de vogais na string.</li>
        <li><strong>Main.java</strong>: Contém a classe <code>Main</code>, que lida com a interação do usuário, solicitando a entrada de uma string e exibindo o total de vogais.</li>
    </ul>

   <h3>Classe <code>Contador</code></h3>
    <p>A classe <code>Contador</code> é responsável pela lógica central do programa. Ela possui:</p>
    <ul>
        <li>Um método <code>contarVogais(String texto)</code> que:
            <ul>
                <li>Recebe uma string <code>texto</code> como parâmetro.</li>
                <li>Define uma variável <code>contador</code> para armazenar o número total de vogais encontradas.</li>
                <li>Define uma string <code>vogais</code> contendo as vogais que devem ser contadas (incluindo letras maiúsculas e minúsculas).</li>
                <li>Percorre cada caractere da string <code>texto</code> usando um loop.</li>
                <li>Verifica se o caractere atual é uma vogal, comparando-o com os caracteres da string <code>vogais</code>.</li>
                <li>Se o caractere for uma vogal, incrementa o <code>contador</code>.</li>
                <li>Retorna o valor total de vogais na string após a contagem.</li>
            </ul>
        </li>
    </ul>

   <h3>Classe <code>Main</code></h3>
    <p>A classe <code>Main</code> é responsável pela interação com o usuário. Ela:</p>
    <ul>
        <li>Solicita ao usuário que insira uma string.</li>
        <li>Recebe e armazena a string fornecida.</li>
        <li>Usa o método <code>contarVogais</code> da classe <code>Contador</code> para calcular o total de vogais presentes na string.</li>
        <li>Exibe o número total de vogais na saída.</li>
    </ul>

   <h2>Funcionalidades Principais</h2>
    <ul>
        <li><strong>Contagem de Vogais:</strong> Conta as vogais em uma string, considerando vogais maiúsculas e minúsculas.</li>
        <li><strong>Interação com o Usuário:</strong> Permite ao usuário inserir uma string e fornece o total de vogais presentes nela.</li>
        <li><strong>Extensibilidade:</strong> O código é modular, permitindo futuras melhorias e ajustes, como suporte a caracteres acentuados ou outras funcionalidades relacionadas a manipulação de texto.</li>
    </ul>

   <h2>Aplicações e Casos de Uso</h2>
    <p>Este programa é ideal para:</p>
    <ul>
        <li><strong>Aplicações de Processamento de Texto:</strong> Onde é necessário realizar análise de conteúdo textual, como contagem de vogais em frases ou parágrafos.</li>
        <li><strong>Aprendizado de Lógica e Estrutura de Código:</strong> Um exemplo simples e prático para iniciantes em Java que desejam entender a manipulação de strings e contagem de caracteres.</li>
        <li><strong>Ferramentas de Análise Linguística:</strong> Pode ser adaptado para ferramentas que analisam padrões de vogais e consoantes em textos para estudos de linguística.</li>
    </ul>
