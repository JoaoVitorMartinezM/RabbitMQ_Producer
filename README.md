# RabbitMQ_Producer
Testando pela primeira vez o RabbitMQ para envio de mensagens.


#Iniciando o broker
docker run --rm -p 15672:15672 -p 5672:5672 --name rabbitMQ -e RABBITMQ_DEFAULT_USER=guest -e RABBITMQ_DEFAULT_PASS=guest rabbitmq:3-management

<b>Matenha o container em execução, não feche o terminal</b>

#Clone este projeto e inicie a aplicação
git clone https://github.com/JoaoVitorMartinezM/RabbitMQ_Producer.git

#requisição
POST
http:localhost:8080/api/pessoa
body:
{
    "cpf" : 12312312333,
    "nome": "nome",
    "sobreNome": "sobrenome"
}

#RabbitMQ
http://localhost:15672/
user:guest
pass:guest

Ao realitar a requisição, uma mensagem é enviada para a fila de "pessoa.ok", criada na inicialização da aplicação.

#BD Enbarcado
http://localhost:8080/h2-console
user:guest
pass:guest

