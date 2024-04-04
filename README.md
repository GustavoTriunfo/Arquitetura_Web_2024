# Arquitetura_Web_2024
## Aula 4 - Inversão de controle e Injeção de dependências: Executando no VS Code
![Imagem vscode](Aula_Quatro/images/ExecucaoVSCode.png)
Nesse exercício precisei alterar toda a estrutura do sistema criado na aula passada para fazer o uso da injeção de dependência explicada em aula. Observe como existem mais diretórios nesse projeto. Isso se deve ao fato de agora existir uma forte divisão de responsabilidades que será ministrada pelo Spring Boot, direcionado pelas annotations específicas que utilizei.

## Exercício da aula 4: Chamada no Insomnia
### POST 
![Imagem POST](Aula_Quatro/images/POST_00.png)
Esse é o POST criado para testar o endpoint da minha aplicação. Através do JSON resultante podemos observar o que aconteceu. A criação de um novo objeto Aluno.

### PUT
![Imagem PUT](Aula_Quatro/images/UPDATE_01.png)
Na primeira imagem podemos observar o PUT que faz a atualização no aluno especificado através do id na url.
![Imagem PUT](Aula_Quatro/images/UPDATE_02.png)
E na segunda imagem temos o get que testa a atualização feita pelo PUT.

### DELETE
![Imagem DELETE](Aula_Quatro/images/DELETE_01.png)
Nessa primeira imagem vemos a execução do DELETE. Observe como ele especifica o aluno através do id.
![Imagem DELETE](Aula_Quatro/images/DELETE_02.png)
Na segunda imagem temos o get que testa se a exclusão do objeto Aluno de fato aconteceu.

### GET
![Imagem GET](Aula_Quatro/images/GET_01.png)
Essa é a imagem do GET que traz todos os alunos. 
![Imagem GET](Aula_Quatro/images/GET_02.png)
Essa segunda imagem nos mostra o GET que traz o Aluno através da especificação do id do aluno na URL.
