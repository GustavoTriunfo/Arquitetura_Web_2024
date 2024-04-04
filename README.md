# Arquitetura_Web_2024
## Aula 3 - Introdução a criação de API Rest: Executando no VS Code
![Imagem POST](Aula_Tres/images/AlunoController_vscode.png)

Nesse exercício fiz pela primeira vez uma API. Criei endpoints, métodos CRUD, cinco atributos para o objeto Aluno... Tudo o que foi solicitado na descrição da atividade.

## Exercício da aula 3: Chamada no Insomnia
### POST 
![Imagem POST](Aula_Tres/images/POST.png)
Esse é o POST criado no Insomnia para testar o endpoint da minha api. Nesse caso esse método cria objetos de alunos, e através do JSON os transmite para a ferramenta de visualização.

### PUT
![Imagem PUT](Aula_Tres/images/PUT_1.png)
Na primeira imagem podemos observar o PUT que faz a atualização no aluno especificado através do id na url.
![Imagem PUT](Aula_Tres/images/PUT_2.png)
E na segunda imagem temos o get que testa a atualização. Note que no POST inicial o nome do aluno estava diferente. Ou seja, foi atualizado corretamente.

### DELETE
![Imagem DELETE](Aula_Tres/images/DELETE_1.png)
Nessa primeira imagem vemos a execução do DELETE. Observe como ele especifica o aluno através do id.
![Imagem DELETE](Aula_Tres/images/DELETE_2.png)
Na segunda imagem temos o get que testa se a exclusão do objeto Aluno de fato aconteceu.

### GET
![Imagem GET](Aula_Tres/images/GET.png)
Essa é a imagem do GET que traz todos os alunos. Note que esse método já tinha sido usado anteriormente e demonstrou o comportamento adequado.
