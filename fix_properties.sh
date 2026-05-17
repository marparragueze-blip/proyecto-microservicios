#!/bin/bash
cd ~/proyecto-microservicios

# Auth-Service
cat > auth-service/src/main/resources/application.properties <<EOF
spring.application.name=auth-service
server.port=8080
spring.datasource.url=jdbc:mysql://db_auth:3306/auth_db
spring.datasource.username=root
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
EOF

# Usuario-Service
cat > usuario-service/src/main/resources/application.properties <<EOF
spring.application.name=usuario-service
server.port=8081
spring.datasource.url=jdbc:mysql://db_usuario:3306/usuario_db
spring.datasource.username=root
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
EOF

# Producto-Service
cat > producto-service/src/main/resources/application.properties <<EOF
spring.application.name=producto-service
server.port=8082
spring.datasource.url=jdbc:mysql://db_producto:3306/producto_db
spring.datasource.username=root
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
EOF

# Carrito-Service
cat > carrito-service/src/main/resources/application.properties <<EOF
spring.application.name=carrito-service
server.port=8083
spring.datasource.url=jdbc:mysql://db_carrito:3306/carrito_db
spring.datasource.username=root
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
EOF

# Catalogo-Service
cat > catalogo-service/src/main/resources/application.properties <<EOF
spring.application.name=catalogo-service
server.port=8084
spring.datasource.url=jdbc:mysql://db_catalogo:3306/catalogo_db
spring.datasource.username=root
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
EOF

# Pago-Service
cat > pago-service/src/main/resources/application.properties <<EOF
spring.application.name=pago-service
server.port=8085
spring.datasource.url=jdbc:mysql://db_pago:3306/pago_db
spring.datasource.username=root
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
EOF

# Inventario-Service
cat > inventario-service/src/main/resources/application.properties <<EOF
spring.application.name=inventario-service
server.port=8086
spring.datasource.url=jdbc:mysql://db_inventario:3306/inventario_db
spring.datasource.username=root
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update
EOF

