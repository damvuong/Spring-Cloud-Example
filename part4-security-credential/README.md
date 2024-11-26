# spring-cloud
spring cloud study project

docker cp ./scripts/vault-init.sh $(docker ps -q --filter "name=vault"):/vault-init.sh && docker exec -it $(docker ps -q --filter "name=vault") bash /vault-init.sh