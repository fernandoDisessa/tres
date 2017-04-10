# Tres

Procura um caracter que seja o primeiro caracter Vogal, após uma consoante, onde

esta consoante é sucessora de uma vogal e que este caracter não se repita no resto da stream.

### Build

Após baixar o projeto, executar o comando:

<code> mvn clean package </code>

Execução:
Deve-se passar a String a ser analisada 

<code> java -jar tres-0.0.1-SNAPSHOT.jar string_a_ser_analisada </code>

- Se encontrar, o retorno será o caracter encontrado

- Se não houver um caracter de acordo com as regras, a mensagem "No Result" é exibida.

- Se nenhuma String for passada como parâmetro, a mensagem "Error: No parameter" é exibida.

 
