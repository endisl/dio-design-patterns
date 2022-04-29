## Apple Stocks

First, I wanna know how much money I could have made yesterday if I'd been trading Apple stocks all day.  
So I grabbed Apple's stock prices from yesterday and put them in an array called stockPrices, where:  
The indices are the time (in minutes) past trade opening time, which was 9:30am local time.  
The values are the price (in US dollars) of one share of Apple stock at that time.  
So if the stock cost $500 at 10:30am, that means stockPrices[60] = 500.  
Write an efficient method that takes stockPrices and returns the best profit I could have made from one purchase and one sale of one share of Apple stock yesterday.  
Example:  
int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};  
getMaxProfit(stockPrices);  
Output: 6 (buying for $5 and selling for $11)  


## K-Pairs

A financial analyst is responsible for a portfolio of profitable stocks represented in an array.  
Each item in the array represents the yearly profit of a corresponding stock.  
The analyst gathers all distinct pairs of stocks that reached the target profit.  
Distinct pairs are pairs that differ in at least one element.  
Given the array of profits, find the number of distinct pairs of stocks where the sum of each pair's profits is exactly equal to the target profit.  
Example:  
stocksProfit = [5, 7, 9, 13, 11, 6, 6, 3, 3]  
target = 12  
3 distinct pairs of stocks: (5,7), (3,9) and (6,6)  
Output: 3  

## Knight Moves

Given a chess board of n rows (top to bottom) and n columns (left to right).  
In each move, a knight moves either:  
- 2 column positions and 1 row position  
- 2 row positions and 1 colummn position  

In other words, a move is 2 steps along one axis and 1 step along a perpendicular axis.  
Given a starting position A and ending position B, calculate the minimum number of moves needed by the knight to move from A to B if it is possible. If it is not possible, return -1.  
Input:  
n = 9  
startRow = 4  
startCol = 4  
endRow = 4  
endCol = 8  
Output: 2  

## Money

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.  
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.  
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.  
A seguir mostre a relação de notas necessárias.  
Entrada  
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).  
Saída  
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.  
Obs: Utilize ponto (.) para separar a parte decimal. 

## Number of Ways

A box contains a number of chocolates that can only be removed 1 at a time or 3 at a time.  
How many ways can the box be emptied?  
The answer can be very large so return it as a modulo of 10<sup>9</sup>+7.  
For example, there are n = 7 chocolates initially.  
They can be removed nine ways, as follows:  
1. (1,1,1,1,1,1,1)  
2. (1,1,1,1,3)  
3. (1,1,1,3,1)  
4. (1,1,3,1,1)  
5. (1,3,1,1,1)  
6. (3,1,1,1,1)  
7. (1,3,3)  
8. (3,1,3)  
9. (3,3,1)  

## Robot

[Description and Python version](https://github.com/endisl/ada-challenges/blob/main/robot.py)

## Secret Board

O senhor Milli, morador da cidade Petland, é o famoso proprietário da maior fábrica de jogos de tabuleiros do mundo.  
Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro, que ele apelidou de Tabuleiro da Frequência.  
O jogo ocorre da seguinte forma. Inicialmente, um tabuleiro com dimensões N × N é dado contendo apenas 0’s. Depois disso, Q operações são propostas, podendo ser de 4 tipos:  
1 X R: Atribuir o valor R a todos os números da linha X;  
2 X R: Atribuir o valor R a todos os números da coluna X;  
3 X: Imprimir o valor mais frequente na linha X;  
4 X: Imprimir o valor mais frequente da coluna X.  
Milli não é muito bom com computadores, mas é bastante preguiçoso. Sabendo que você é um dos melhores programadores do mundo, ele precisa sua ajuda para resolver este problema

Entrada  
A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 105), representando, respectivamente, o tamanho do tabuleiro e a quantidade de operações. As próximas Q linhas da entrada vão conter as Q operações. O primeiro inteiro de cada linha vai indicar o tipo da operação. Caso seja 1 ou 2, será seguido por mais dois inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50). Caso seja 3 ou 4, será seguido por apenas mais um inteiro X.

Saída  
Para cada operação do tipo 3 ou 4, seu programa deve produzir uma linha, contendo o valor da resposta correspondente. Se uma linha ou coluna tiver dois ou mais valores que se repetem o mesmo número de vezes, você deve imprimir o maior deles. Por exemplo, se uma linha tem os valores [5,7,7,2,5,2,1,3], tanto o 2, 5 e 7 se repetem duas vezes, então a resposta será 7, pois é o maior deles.  

Input 1  
2 4   
1 1 1  
2 2 2  
3 1  
3 2  
Output 1  
2  
2  

Input 2  
3 6  
1 1 2  
1 2 3  
1 3 4  
4 3  
1 3 0  
4 3  
Output 2  
4  
3  





