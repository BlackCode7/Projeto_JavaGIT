package estatistica;

/*
 *Você verá nesta unidade dois tipos: as medidas de tendência
 *central, que localizam o centro da distribuição dos dados, e as
 *separatrizes ou quantis, que a dividem em partes iguais. 
 * 
 * Medidas de tendência central
 * As medidas de tendência central estimam o centro de uma
 * distribuição dos dados ou localizam onde os dados se
 * concentram,
 * 
 * E como identificar o centro da distribuição dos dados?
 * 
 * A medida mais comum é a média, que representa o valor típico de um
 * conjunto de dados. Para obtê-la, você deve efetuar a soma dos
 * valores dos dados e dividir o resultado pelo número total de
 * dados.
 * 
 * média ponderada
 * Quando os dados estão atrelados a ponderações, isto é, quando
 * queremos dar diferentes pesos aos dados, A média ponderada 
 * generaliza a média simples, que corresponde ao caso particular 
 * no qual todos dados tem a mesma ponderação.
 * 
 * Como definir a mediana?
 * Quando o padrão da distribuição dos dados é assimétrico, a mediana 
 * representa melhor o seu centro. Ela é definida como o valor que 
 * divide a distribuição dos dados em duas partes, cada uma com 50% 
 * dos dados.
 * 
 * Como definir o moda?
 * Por sua vez, a medida que considera os valores mais frequentes na 
 * distribuição dos dados é a moda. Pode ser unimodal, quando existe 
 * um único valor mais frequente, ou bimodal, quando há dois valores 
 * mais frequentes. A moda não é influenciada por valores extremos.
 * 
 * moda => para dados qualitativos
 * mediana => para dados numericos
 * 
 * MEDIDAS SEPARATRIZES
 * As medidas separatrizes, também chamadas de quantis, dividem
 * a distribuição dos dados em termos de uma porcentagem. Por exemplo, 
 * considere as notas de uma prova, que variam de 0 a 10 pontos. 
 * Como saber para qual valor 80% das notas são menores, e 20%, maiores? 
 * Usando esse critério, podemos selecionar os alunos com melhor 
 * desempenho em um teste a partir de um valor de separatriz.
 * 
 * SEPARATRIZES COMUNS = QUARTIS / DECIS / PERCENTIS
 * 
 * QUARTIS = SEPARAM OS DADOS EM 4 PARTES IGUAIS
 * DECIS = SEPARAM OS DADOS EM 10 PARTES IGUAIS
 * PERCENTIS = SEPARAM OS DADOS EM 100 PARTES IGUAIS
 * 
 * UNID_8_2
 * Medidas de tendência central para dados não agrupados 
 * EXEMPLO:
 * Suponha que precisamos ter uma estimativa dos pesos dos recém-nascidos 
 * de uma maternidade. A média vai resumir, em um único valor, esses 
 * pesos. Imagine que temos 30 valores de pesos, considerando como unidade
 * 1 decagrama : 380, 467, 418, 351, 368, 407, 376, 431, 381, 376, 369, 
 * 420, 401, 392, 349, 351, 376, 385, 409, 388, 424, 343, 345, 445, 416, 
 * 376, 382, 379, 378, 430.
 * 
 * Primeiro, você precisa somar todos esses pesos, o que resulta em 11.713.
 * Agora, divida esse valor pelo número de dados, que é 30:
 * 
 * 
 * MEDIA PONDERADA POR PESOS
 * EXEMPLO:
 * a nota final de um curso consiste em 3 avaliações com as seguintes
 * ponderações: avaliação escrita com peso 0,5, avaliação oral 
 * com peso 0,3 e avaliação de um trabalho com peso 0,2. Um dos
 * alunos obteve as seguintes notas, respectivamente: 8, 5 e 7. Qual
 * será a sua nota final? Para descobrir essa resposta, devemos 
 * multiplicar cada nota por seu respectivo peso e somar o resultado:
 * 0,5 × 8 + 0,3 × 5 + 0,2 × 7 = 6,9 Perceba que, como a soma dos 
 * pesos é 1, não precisamos efetuar a divisão pelo peso.
 * 
 * MEDIANA DE TENDENCIA CENTRAL
 * Outra medida de tendência central é a mediana, que divide um
 * conjunto de dados numéricos em duas partes, cada uma com metade 
 * desses dados. Como calculá-la para um conjunto de n dados numéricos 
 * denotados por xi, i = 1, ..., n? Primeiramente, ordenamos os dados 
 * de forma crescente em valor, elaborando um rol de dados, estudado 
 * em unidades anteriores. Se o número de dados for ímpar, o valor da 
 * mediana é o valor do dado na posição central, 
 * 
 * definido pela fórmula:
 * 
 * (N+1)/2 
 * 
 * N = significa o numero de dados existentes
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class unid_8_MedidasTendenciaCentral_separatrizes {
	
	public static double media(double peso1) {
		double peso1 = [];
		return (peso1/2);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
