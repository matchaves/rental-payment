# Rental-PAYMENT

branch com initial conf application.yaml

```
base-path /
```

###CMD PARA CONFIRMAR O PAGAMENTO DO REGISTRO RENTAL-PRE COM STATUS DE PROCESSANDO NA TABELA RENTAL
```
POST /payment
INSERE NA PAYMENT REGISTRO DE PAGAMENT SE FOR APROVADO E SET O STATUS NA RENTAL PARA APROVADO.
```
branch com initial conf application.yaml com jib configurado

###CMD BUILD USANDO JIB PARA BUILD DOCKER IMAGE COM A TAG PASSADA VIA ARGUMENTO
gradle jibDockerBuild -Ptag=100 # tag do build da imagem docker

###CMD RODA CONTAINER SETANDO O IP DO PG E A PORTA PARA A API CONECTAR NO BANCO
###VARIAVEIS IP_PG e PORT ESTÃO REFERENCIADAS NO application.yaml
docker run -d --name customer --env ip_pg=192.160.XX.XX --env PORT=5436  colabdevops/rental:1