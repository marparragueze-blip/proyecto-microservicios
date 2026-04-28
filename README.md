# Proyecto Semestral: Sistema de Microservicios

## Integrantes:
- Nombre 1:Rocio Saez
- Nombre 2 Ivan Pereira
- Nombre 3 Maria Parraguez

### Estado del Sistema (Hito 1)

| Microservicio | Puerto | DB Name | Funcionalidad |
|---|---:|---|---|
| modulo1 | 8081 | auth_db | Registro y Login |
| modulo2 | 8082 | db_modulo2 | CRUD de entidad |
| modulo3 | 8083 | db_modulo3 | CRUD de entidad |
| modulo4 | 8084 | db_modulo4 | Servicio base |
| modulo5 | 8085 | db_modulo5 | Servicio base |
| modulo6 | 8086 | db_modulo6 | Servicio base |
| modulo7 | 8087 | db_modulo7 | Servicio base |
| modulo8 | 8088 | db_modulo8 | Servicio base |
| modulo9 | 8089 | db_modulo9 | Servicio base |
| modulo10 | 8090 | db_modulo10 | Servicio base |

### Despliegue Técnico
- **Instancia:** AWS EC2 Ubuntu
- **Comando de inicio:** `docker compose up -d`
- **Estructura:** Monorepo con 10 módulos y volumes configurados

