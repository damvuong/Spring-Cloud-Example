#!/bin/bash

 Configurations
VAULT_ADDR="http://127.0.0.1:8200" # Vault server address
VAULT_TOKEN="root-token"                # Vault token (replace securely in production)
SECRET_PATH="secret/eureka"       # Path to store secrets in Vault

# Properties to write
EUREKA_USERNAME="admin"
EUREKA_PASSWORD="eureka@password"

export VAULT_ADDR=$VAULT_ADDR
export VAULT_TOKEN=$VAULT_TOKEN

# Write properties to Vault
echo "Writing properties to Vault..."
vault kv put $SECRET_PATH username="$EUREKA_USERNAME" password="$EUREKA_PASSWORD"

if [[ $? -eq 0 ]]; then
    echo "Secrets successfully written to Vault at path: $SECRET_PATH"
else
    echo "Error: Failed to write secrets to Vault."
    exit 1
fi