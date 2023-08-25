# BukkitMotdAPI

Antes de ler as informações do plugin, lembre-se que é obrigatório ter ele no seu servidor e não ter outros plugins de MOTD, ele é um plugin que será predefinido com base no que será aplicado em sua API, em breve ele será mais fácil de manipular.

Uma API para criação de motds customizados para a tela de boas-vindas do seu servidor, tudo isto de forma fácil e rápida!
Nossos MOTDs podem ser chamados de várias formas, isto incluí método organizado e desorganizado, gosto de chamar assim.

Método desorganizado:
- Você inicia seu objeto (MOTD) já com as linhas e o estado dele.

![Screenshot](https://imgur.com/qw0p6Cv.png)

Método organizado:
 Você cria um objeto (MOTD) e tem a permissão de setar as linhas
 tanto a linha 1 quanto a linha 2, o estado na criação.

![Screenshot](https://imgur.com/HdQtSnX.png)

Método animado:
 Você atualmente só pode usar o método
 animado para criar animações do motd
 de forma simples, mas acho interessante.

 Um outro porém que talvez seja ruim:
 as linhas são independentes.

Passo a Passo:
- Defina duas listas em String
- Inicie o objeto e sete as animatedLine.

- Método Organizado

![Screenshot](https://imgur.com/TFT4rGH.png)

- Método Desorganizado:

![Screenshot](https://imgur.com/0x1c4lM.png)

Estados:
- STATIC
- UNCOLOR
- ANIMATED (Não funcional)
