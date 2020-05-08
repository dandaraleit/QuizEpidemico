package Quiz;

import java.util.Scanner;

public class QuizEpidemias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner ep = new Scanner(System.in);
		
		System.out.println("Saber sobre nosso passado é também compreender o que está acontecendo no presente e só "
				+ "assim ter o poder de transformar o futuro. \nEste é um jogo de perguntas e respostas sobre"
				+ "o que assolou várias sociedades pelo mundo: as epidemias e pandemias.\n");
		
		System.out.println("Para responder às perguntas, digite a letra da opção de sua escolha: 1, 2 ou 3\n");
		
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0;
		int pontos = 0;
		String nome;
		
		System.out.println("Primeiramente, como você quer ser chamado(a)? :)");
		 nome = ep.next();
		 
		System.out.println("\nSeja muito bem-vindo(a) " + nome + "! Agora já podemos iniciar as perguntas! Vamos lá:");
		
			
		
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
				System.out.println("Digite um dos números nos quais se encontram as opções de respostas, por favor.");
		} 
		
		} while (r1 < 1 || r1 > 3); 
		
		
		
		if(r1 == 2) {
			pontos++;
			System.out.println("Muito bem! Você fez seu primeiro ponto: " + pontos);
		}
		else {
			System.out.println("Você não pontuou :(");
				
			}
			
		
			
		
		do {
			
			System.out.println("\nSobre a Peste Negra, ela também era conhecida por qual nome? \n"
					+ "1 -> Peste de Bubônica \n2 -> Peste do Rato \n3 -> Peste Europeia");
			
			r2 = ep.nextInt();
			
			switch(r2) {
			
			case 1:
				System.out.println("Você acertou!");
				break;
				
			case 2:
				System.out.println("A resposta está errada. A Peste Negra também era conhecida como Peste Bubônica.");
				break;
				
			case 3:
				System.out.println("A resposta está errada. A Peste Negra também era conhecida como Peste Bubônica.");
				break;		
				
			default: 
				System.out.println("Digite um dos números nos quais se encontram as opções de respostas, por favor.");
			} 
		
		} while (r2 < 1 || r2 > 3); 
	
	
	
		if(r2 == 1) {
			pontos++;
			System.out.println("Sua pontuação é de: " + pontos);
		}
		else {
			System.out.println("Infelizmente você não pontuou nesta, sua pontuação continua com: " + pontos + " ponto");
				
			}
	
	
		
		do {
			
			System.out.println("\nAgora que você já está afiado(a), me responda outra: "
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
				System.out.println("Digite um dos números nos quais se encontram as opções de respostas, por favor.");
			}
			
		} while (r3 < 1 || r3 > 3); 
		
	
	
		if(r3 == 2) {
			pontos++;
			System.out.println("Sua pontuação agora é esta: " + pontos);
		}
		else {
			System.out.println("Não foi desta vez... Sua pontuação continua a mesma.");
				
			}
		
		
		
		
		do {
			
			System.out.println("\nEstá acabando: Das doenças abaixo, qual é a única que NÃO é causada por um vírus?\n"
					+ "1 -> Febre amarela \n2 -> Ebola  \n3 -> Cólera");
			
			r4 = ep.nextInt();
			
			switch(r4) {
			
			case 1:
				System.out.println("Errada a resposta. A cólera é causada pela bactéria Vibrio cholerae.");
				break;
				
			case 2:
				System.out.println("Errada a resposta. A cólera é causada pela bactéria Vibrio cholerae.");
				break;
				
			case 3:
				System.out.println("Você está certo(a)! A cólera é causada pela bactéria Vibrio cholerae.");
				break;
				
			default: 
				System.out.println("Digite um dos números nos quais se encontram as opções de respostas, por favor.");
			}
					
		} while (r4 < 1 || r4 > 3); 	
		
		
		if(r4 == 3) {
			pontos++;
			System.out.println("Arrasou! Olhe agora seus pontos: " + pontos);
		}
		else {
			System.out.println("Vamos melhorar esta pontuação na próxima pergunta?! "
					+ "Muita atenção pois será sua última chance heim!");
				
			}
		
		
		
		
		do {
		
			System.out.println("\nAgora a quinta e última pergunta: Qual a ordem cronológica em que as epidemias abaixo ocorreram: "
					+ "(OBS: já demos uma dica no início deste quiz) \n"
					+ "1 -> 1ª Gripe Espanhola 2ª Peste Negra 3ª Peste de Atenas \n" 
					+ "2 -> 1ª Peste Negra 2ª Peste de Atenas 3ª Gripe Espanhola \n"
					+ "3 -> 1ª Peste de Atenas 2ª Peste Negra 3ª Gripe Espanhola \n");
			
			r5 = ep.nextInt();
			
			switch(r5) {
			
			case 1:
				System.out.println("Errada a resposta.");
				break;
				
			case 2:
				System.out.println("Errada a resposta.");
				break;
				
			case 3:
				System.out.println("Você acertou a ordem :)");
				break;
				
			default: System.out.println("Digite um dos números nos quais se encontram as opções de respostas, por favor.");
			}
			
		} while (r5 < 1 || r5 > 3); 
		
		
		if(r5 == 3) {
			pontos++;
			
		}
		
		
		
		if(pontos < 4) {
		System.out.println("\nParabéns, quiz concluído! Você acertou " + pontos + " de 5 perguntas!");
		}
			
		if(pontos == 4 || pontos == 5) {
			System.out.println("\nParabéns! Quiz concluído com " + pontos + " acertos dentre 5 perguntas!"
					+ "\nVocê parece conhecer muito bem a história das epidemias e pandemias!");
			}
							
		
		
	}

}
