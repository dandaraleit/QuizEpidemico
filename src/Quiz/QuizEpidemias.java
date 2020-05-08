package Quiz;

import java.util.Scanner;

public class QuizEpidemias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner ep = new Scanner(System.in);
		
		System.out.println("Saber sobre nosso passado � tamb�m compreender o que est� acontecendo no presente e s� "
				+ "assim ter o poder de transformar o futuro. \nEste � um jogo de perguntas e respostas sobre"
				+ "o que assolou v�rias sociedades pelo mundo: as epidemias e pandemias.\n");
		
		System.out.println("Para responder �s perguntas, digite a letra da op��o de sua escolha: 1, 2 ou 3\n");
		
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0;
		int pontos = 0;
		String nome;
		
		System.out.println("Primeiramente, como voc� quer ser chamado(a)? :)");
		 nome = ep.next();
		 
		System.out.println("\nSeja muito bem-vindo(a) " + nome + "! Agora j� podemos iniciar as perguntas! Vamos l�:");
		
			
		
		do {	
			
			System.out.println("\nQual foi a primeira epidemia a surgir no mundo? \n"
				+ "1 -> Peste Negra \n2 -> Peste de Atenas \n3 -> Ebola");
		
			r1 = ep.nextInt();	
		
			switch(r1) {
		
			case 1:
				System.out.println("Resposta errada. A primeira epidemia que existiu no mundo foi a Peste de Atenas (430-427 a.C.)");
			break;
			
			case 2:
				System.out.println("Certa resposta!");
			break;
			
			case 3:
				System.out.println("Resposta errada. A primeira epidemia que existiu no mundo foi a Peste de Atenas (430-427 a.C.)");
			break; 
			
			default: 
				System.out.println("Digite um dos n�meros nos quais se encontram as op��es de respostas, por favor.");
		} 
		
		} while (r1 < 1 || r1 > 3); 
		
		
		
		if(r1 == 2) {
			pontos++;
			System.out.println("Muito bem! Voc� fez seu primeiro ponto: " + pontos);
		}
		else {
			System.out.println("Voc� n�o pontuou :(");
				
			}
			
		
			
		
		do {
			
			System.out.println("\nSobre a Peste Negra, ela tamb�m era conhecida por qual nome? \n"
					+ "1 -> Peste de Bub�nica \n2 -> Peste do Rato \n3 -> Peste Europeia");
			
			r2 = ep.nextInt();
			
			switch(r2) {
			
			case 1:
				System.out.println("Voc� acertou!");
				break;
				
			case 2:
				System.out.println("A resposta est� errada. A Peste Negra tamb�m era conhecida como Peste Bub�nica.");
				break;
				
			case 3:
				System.out.println("A resposta est� errada. A Peste Negra tamb�m era conhecida como Peste Bub�nica.");
				break;		
				
			default: 
				System.out.println("Digite um dos n�meros nos quais se encontram as op��es de respostas, por favor.");
			} 
		
		} while (r2 < 1 || r2 > 3); 
	
	
	
		if(r2 == 1) {
			pontos++;
			System.out.println("Sua pontua��o � de: " + pontos);
		}
		else {
			System.out.println("Infelizmente voc� n�o pontuou nesta, sua pontua��o continua com: " + pontos + " ponto");
				
			}
	
	
		
		do {
			
			System.out.println("\nAgora que voc� j� est� afiado(a), me responda outra: "
					+ "\nOnde supostamente a Gripe Espanhola surgiu? \n"
					+ "1 -> Espanha \n2 -> Estados Unidos \n3 -> Coreia do Sul");
			
			r3 = ep.nextInt();
			
			switch(r3) {
			
			case 1:
				System.out.println("Errado. Possivelmente a Gripe Espanhola tenha surgido nos EUA ou na China.");
				break;
				
			case 2:
				System.out.println("Respota certa! Possivelmente a Gripe Espanhola tenha surgido nos EUA ou na China.");
				break;
				
			case 3:
				System.out.println("Errado. Possivelmente a Gripe Espanhola tenha surgido nos EUA ou na China.");
				break;
				
			default: 
				System.out.println("Digite um dos n�meros nos quais se encontram as op��es de respostas, por favor.");
			}
			
		} while (r3 < 1 || r3 > 3); 
		
	
	
		if(r3 == 2) {
			pontos++;
			System.out.println("Sua pontua��o agora � esta: " + pontos);
		}
		else {
			System.out.println("N�o foi desta vez... Sua pontua��o continua a mesma.");
				
			}
		
		
		
		
		do {
			
			System.out.println("\nEst� acabando: Das doen�as abaixo, qual � a �nica que N�O � causada por um v�rus?\n"
					+ "1 -> Febre amarela \n2 -> Ebola  \n3 -> C�lera");
			
			r4 = ep.nextInt();
			
			switch(r4) {
			
			case 1:
				System.out.println("Errada a resposta. A c�lera � causada pela bact�ria Vibrio cholerae.");
				break;
				
			case 2:
				System.out.println("Errada a resposta. A c�lera � causada pela bact�ria Vibrio cholerae.");
				break;
				
			case 3:
				System.out.println("Voc� est� certo(a)! A c�lera � causada pela bact�ria Vibrio cholerae.");
				break;
				
			default: 
				System.out.println("Digite um dos n�meros nos quais se encontram as op��es de respostas, por favor.");
			}
					
		} while (r4 < 1 || r4 > 3); 	
		
		
		if(r4 == 3) {
			pontos++;
			System.out.println("Arrasou! Olhe agora seus pontos: " + pontos);
		}
		else {
			System.out.println("Vamos melhorar esta pontua��o na pr�xima pergunta?! "
					+ "Muita aten��o pois ser� sua �ltima chance heim!");
				
			}
		
		
		
		
		do {
		
			System.out.println("\nAgora a quinta e �ltima pergunta: Qual a ordem cronol�gica em que as epidemias abaixo ocorreram: "
					+ "(OBS: j� demos uma dica no in�cio deste quiz) \n"
					+ "1 -> 1� Gripe Espanhola 2� Peste Negra 3� Peste de Atenas \n" 
					+ "2 -> 1� Peste Negra 2� Peste de Atenas 3� Gripe Espanhola \n"
					+ "3 -> 1� Peste de Atenas 2� Peste Negra 3� Gripe Espanhola \n");
			
			r5 = ep.nextInt();
			
			switch(r5) {
			
			case 1:
				System.out.println("Errada a resposta.");
				break;
				
			case 2:
				System.out.println("Errada a resposta.");
				break;
				
			case 3:
				System.out.println("Voc� acertou a ordem :)");
				break;
				
			default: System.out.println("Digite um dos n�meros nos quais se encontram as op��es de respostas, por favor.");
			}
			
		} while (r5 < 1 || r5 > 3); 
		
		
		if(r5 == 3) {
			pontos++;
			
		}
		
		
		
		if(pontos < 4) {
		System.out.println("\nParab�ns, quiz conclu�do! Voc� acertou " + pontos + " de 5 perguntas!");
		}
			
		if(pontos == 4 || pontos == 5) {
			System.out.println("\nParab�ns! Quiz conclu�do com " + pontos + " acertos dentre 5 perguntas!"
					+ "\nVoc� parece conhecer muito bem a hist�ria das epidemias e pandemias!");
			}
							
		
		
	}

}
