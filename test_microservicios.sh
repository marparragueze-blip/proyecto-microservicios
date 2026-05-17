#!/bin/bash

echo "🔍 Probando microservicios Java..."
curl -s http://localhost:5051/actuator/health && echo " -> auth-service OK"
curl -s http://localhost:5052/actuator/health && echo " -> usuario-service OK"
curl -s http://localhost:5053/actuator/health && echo " -> producto-service OK"
curl -s http://localhost:5054/actuator/health && echo " -> carrito-service OK"
curl -s http://localhost:5055/actuator/health && echo " -> catalogo-service OK"
curl -s http://localhost:5056/actuator/health && echo " -> inventario-service OK"
curl -s http://localhost:5057/actuator/health && echo " -> pago-service OK"

echo "🔍 Probando microservicios Python..."
curl -s http://localhost:5061/health && echo " -> notificacion-service OK"
curl -s http://localhost:5062/health && echo " -> envio-service OK"
curl -s http://localhost:5063/health && echo " -> reportes-service OK"
