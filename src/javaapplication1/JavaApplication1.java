import java.util.HashSet;

import java.util.Iterator;

import java.util.Scanner;

import java.util.Set;



public class TelaTriangulo {



	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informa o tipo do triangulo");

		System.out.println("Informa o valor do lado a");

		double a = sc.nextDouble();

		System.out.println("Informa o valor do lado b");

		double b = sc.nextDouble();

		System.out.println("Informa o valor do lado c");

		double c = sc.nextDouble();



		Set<String> propriedades = new HashSet<String>();

		double hipotenusa = a;

		if (hipotenusa < b) {

			hipotenusa = b;

		}

		if (hipotenusa < c) {

			hipotenusa = c;

		}

		if ((a + b + c - hipotenusa) > hipotenusa) {

			propriedades.add("Válido");

			if (a == b || b == c || c == a) {

				if (a == b && b == c) {

					propriedades.add("Equilátero");

				} else {

					propriedades.add("Isósceles");

				}

			}

			if (a != b && b != c && c != a) {

				propriedades.add("Escaleno");

			}

			if (((a * a + b * b + c * c) - hipotenusa * hipotenusa) == hipotenusa

					* hipotenusa) {

				propriedades.add("Retângulo");

			}

		} else {

			propriedades.add("Inválido");

		}

		

		System.out.println("Propriedades do triangulo ->");

		for (String valor : propriedades) {

			System.out.println(valor);

		}

	}

}
/*
1. Use o Eclipse Java Oxygen/Netbeans ou a ferramenta que desejar

2. Crie uma conta no Bitbucket/GitHub ou ... O  código deve estar em um Git na Nuvem do repositório escolhido

http://www.mateuspaduaweb.com.br/versionando-com-o-git-utilizando-o-bitbucket-como-repositorio-remoto/

https://www.upinside.com.br/blog/aprenda-a-utilizar-o-bitbucket-como-repositorio-remoto-parte-1

3. Crie uma branch para fazer melhorias no código (siga as práticas do GitFlow)

4. Crie uma classe para o Triangulo e tire o código de negócio que esta no método main e leve para nova classe

5. Criar testes unitários para o código desenvolvido

6. Estudar Complexidade Ciclomática

https://pt.wikipedia.org/wiki/Complexidade_ciclom%C3%A1tica

http://blog.caelum.com.br/medindo-a-complexidade-do-seu-codigo/

https://www.treinaweb.com.br/blog/complexidade-ciclomatica-analise-estatica-e-refatoracao/

7. Criar em um Wiki (por exemplo do Bitbucket) uma página resumindo o que você entendeu sobre Complexidade ciclomática

8. Analisar a complexidade do seu código usando o site http://www.lizard.ws/ ou outra ferramenta que preferir (ex. SonarCloud - https://sonarcloud.io/about) e refatore o código desenvolvido de forma a diminuir a complexidade ciclomática da sua solução.

9. Adicionar o seu código a integração contínua Pode usar Bitbucket (Deployments), Circle CI, Travis CI, Jenkins ou a ferramenta que desejar...

10. Entregar evidencias de que a tarefa foi feita (ex. link de repositório público ou documento word descrevendo o que fez)





 MARCOS VINICIUS DA SILVA OLEGÁRIO
Comentários ao envio
Comentários (0)
Status de envio: Nenhuma tentativa
Status da avaliação: Não avaliado
*/
