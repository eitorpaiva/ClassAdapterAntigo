Exemplo de Utilização do Class Adapter:

Este exemplo é utilizado no meu trabalho de Linguagem de Programação IV a respeito de Design Patterns, mais especificamente de Class Adapter.

Esse exemplo conta com as classes:
Atacador(Interface)
RoboInimigo(Classe)
TanqueInimigo(Classe)
RoboInimigoAdapter(Adapter)
Teste (Classe Principal)

O robô não possui piloto, pode andar para frente e usa suas próprias mãos para atacar o inimigo.
O tanque possui piloto, pode ir para frente e usa arma de fogo para atacar o inimigo.

A ideia é usar os métodos da classe TanqueInimigo em um robô, e para isso funcionar, existe a classe RoboInimigoAdapter.
Lembrando que se o robô tenta usar o método armaDeFogo(), ele tem seu método adaptado para baterComAsMaos().
Se o robô tenta usar o método atribuirPiloto(), ele tem seu método adaptado para reagirAUmHumano().

Espero que tenha ficado claro. Obrigado!
