# Batalha Naval em Java

Este é um projeto simples de um jogo de tabuleiro "Batalha Naval" implementado em Java. Ele utiliza a biblioteca gráfica `edu.princeton.cs.algs4.Draw` para desenhar o tabuleiro e os navios em uma janela gráfica.

## Funcionalidades

- **Tabuleiro de Jogo**:
  - O jogo apresenta dois tabuleiros 10x10 lado a lado.
  - Cada tabuleiro é desenhado com coordenadas horizontais (letras de A a J) e verticais (números de 0 a 9) para facilitar a identificação das posições.

- **Navios**:
  - Os navios são desenhados no tabuleiro com suas posições e orientações especificadas.
  - Suporta navios tanto na orientação horizontal quanto vertical.
  - Cada navio é desenhado como uma sequência de quadrados preenchidos na grade.

## Estrutura do Projeto

### Classe `App`

A classe principal que inicia o jogo e monta o tabuleiro com os navios.

- Configura a janela gráfica (`Draw`) com dimensões de 1000x600.
- Cria dois tabuleiros e posiciona os navios em suas respectivas grades.
- Exibe o tabuleiro e os navios na janela gráfica.

### Classe `Grade`

Responsável por desenhar os tabuleiros do jogo.

- Cada tabuleiro é composto por 10 linhas e 10 colunas.
- As células do tabuleiro têm dimensões fixas de 40x40 pixels.
- As coordenadas horizontais e verticais são exibidas para facilitar a localização de posições.

### Classe `Navio`

Desenha os navios no tabuleiro de acordo com suas posições e orientações.

- **Posicionamento**:
  - Cada navio é posicionado com base em uma grade inicial e em coordenadas especificadas (x, y).
- **Orientação**:
  - Navios podem ser desenhados na vertical ou na horizontal.
- **Tamanho**:
  - Os navios são desenhados com a quantidade de quadrados determinada por parâmetro.
- **Grade**:
  - É informado para a classe, em qual grade o objeto navio vai ser posicionado.

## Exemplo de Uso

```java
public class App {

    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        draw.setCanvasSize(1000, 600);
        draw.setXscale(0, 1000);
        draw.setYscale(0, 600);

        Navio navios[] = new Navio[5];
        
        navios[0] = new Navio(4, 0, 0, "horizontal", 1);
        navios[0].desenhar(draw);
        navios[1] = new Navio(5, 3, 2, "vertical", 1);
        navios[1].desenhar(draw);

        Grade grade = new Grade(50, 100);
        grade.desenhar(draw);
        Grade grade2 = new Grade(550, 100);
        grade2.desenhar(draw);

        draw.show();
    }
}
```

## Dependências

- **Biblioteca `algs4`**: 
  - Certifique-se de incluir o arquivo `algs4.jar` no classpath do projeto para utilizar a funcionalidade gráfica.

## Como Executar

1. Clone este repositório.
2. Inclua a biblioteca `algs4.jar` no classpath do seu projeto.
3. Compile as classes Java:
   ```bash
   javac -cp ".:algs4.jar" ifsc/poo/*.java
   ```
4. Execute o programa principal:
   ```bash
   java -cp ".:algs4.jar" ifsc.poo.App
   ```

## Captura de Tela

Abaixo está uma imagem representando o tabuleiro e os navios desenhados pela aplicação:

![Tabuleiro e Navios](assets/tabuleiro-navios.png)

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou relatar problemas na seção de issues.

## Licença

Este projeto é distribuído sob a licença [MIT](LICENSE).
