package estatistica;

/*
 *Voc� ver� nesta unidade dois tipos: as medidas de tend�ncia
 *central, que localizam o centro da distribui��o dos dados, e as
 *separatrizes ou quantis, que a dividem em partes iguais. 
 * 
 * Medidas de tend�ncia central
 * As medidas de tend�ncia central estimam o centro de uma
 * distribui��o dos dados ou localizam onde os dados se
 * concentram,
 * 
 * E como identificar o centro da distribui��o dos dados?
 * 
 * A medida mais comum � a m�dia, que representa o valor t�pico de um
 * conjunto de dados. Para obt�-la, voc� deve efetuar a soma dos
 * valores dos dados e dividir o resultado pelo n�mero total de
 * dados.
 * 
 * m�dia ponderada
 * Quando os dados est�o atrelados a pondera��es, isto �, quando
 * queremos dar diferentes pesos aos dados, A m�dia ponderada 
 * generaliza a m�dia simples, que corresponde ao caso particular 
 * no qual todos dados tem a mesma pondera��o.
 * 
 * Como definir a mediana?
 * Quando o padr�o da distribui��o dos dados � assim�trico, a mediana 
 * representa melhor o seu centro. Ela � definida como o valor que 
 * divide a distribui��o dos dados em duas partes, cada uma com 50% 
 * dos dados.
 * 
 * Como definir o moda?
 * Por sua vez, a medida que considera os valores mais frequentes na 
 * distribui��o dos dados � a moda. Pode ser unimodal, quando existe 
 * um �nico valor mais frequente, ou bimodal, quando h� dois valores 
 * mais frequentes. A moda n�o � influenciada por valores extremos.
 * 
 * moda => para dados qualitativos
 * mediana => para dados numericos
 * 
 * MEDIDAS SEPARATRIZES
 * As medidas separatrizes, tamb�m chamadas de quantis, dividem
 * a distribui��o dos dados em termos de uma porcentagem. Por exemplo, 
 * considere as notas de uma prova, que variam de 0 a 10 pontos. 
 * Como saber para qual valor 80% das notas s�o menores, e 20%, maiores? 
 * Usando esse crit�rio, podemos selecionar os alunos com melhor 
 * desempenho em um teste a partir de um valor de separatriz.
 * 
 * SEPARATRIZES COMUNS = QUARTIS / DECIS / PERCENTIS
 * 
 * QUARTIS = SEPARAM OS DADOS EM 4 PARTES IGUAIS
 * DECIS = SEPARAM OS DADOS EM 10 PARTES IGUAIS
 * PERCENTIS = SEPARAM OS DADOS EM 100 PARTES IGUAIS
 * 
 * UNID_8_2
 * Medidas de tend�ncia central para dados n�o agrupados 
 * EXEMPLO:
 * Suponha que precisamos ter uma estimativa dos pesos dos rec�m-nascidos 
 * de uma maternidade. A m�dia vai resumir, em um �nico valor, esses 
 * pesos. Imagine que temos 30 valores de pesos, considerando como unidade
 * 1 decagrama : 380, 467, 418, 351, 368, 407, 376, 431, 381, 376, 369, 
 * 420, 401, 392, 349, 351, 376, 385, 409, 388, 424, 343, 345, 445, 416, 
 * 376, 382, 379, 378, 430.
 * 
 * Primeiro, voc� precisa somar todos esses pesos, o que resulta em 11.713.
 * Agora, divida esse valor pelo n�mero de dados, que � 30:
 * 
 * 
 * MEDIA PONDERADA POR PESOS
 * EXEMPLO:
 * a nota final de um curso consiste em 3 avalia��es com as seguintes
 * pondera��es: avalia��o escrita com peso 0,5, avalia��o oral 
 * com peso 0,3 e avalia��o de um trabalho com peso 0,2. Um dos
 * alunos obteve as seguintes notas, respectivamente: 8, 5 e 7. Qual
 * ser� a sua nota final? Para descobrir essa resposta, devemos 
 * multiplicar cada nota por seu respectivo peso e somar o resultado:
 * 0,5 � 8 + 0,3 � 5 + 0,2 � 7 = 6,9 Perceba que, como a soma dos 
 * pesos � 1, n�o precisamos efetuar a divis�o pelo peso.
 * 
 * MEDIANA DE TENDENCIA CENTRAL
 * Outra medida de tend�ncia central � a mediana, que divide um
 * conjunto de dados num�ricos em duas partes, cada uma com metade 
 * desses dados. Como calcul�-la para um conjunto de n dados num�ricos 
 * denotados por xi, i = 1, ..., n? Primeiramente, ordenamos os dados 
 * de forma crescente em valor, elaborando um rol de dados, estudado 
 * em unidades anteriores. Se o n�mero de dados for �mpar, o valor da 
 * mediana � o valor do dado na posi��o central, 
 * 
 * definido pela f�rmula:
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
