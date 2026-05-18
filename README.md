
CONTROL DE PROYECTO

 ╔══════════════════════════════════════════════════════════════════════╗
 ║               VIRTUAL NETWORK DOCKER: [backend-net]                  ║
 ╚════════════════════════════════════════════════════# 📊 CONTROL DE PROYECTO — HITO 2
    
┌──────────────────────────────────────────────────────────┐
│  CURSO: DESARROLLO FULLSTACK 1 (DSY1103) — DUOC UC 2026  │
│  DOCENTE: MICHAEL                                        │
└──────────────────────────────────────────────────────────┘

### 👥 EQUIPO DE DESARROLLO
* 🔹 **Maria Parraguez**

1. ARQUITECTURA DE RED (DOCKER) & REGLA DE ORO

        │                                              │
        ▼                                              ▼
 ┌──────────────┐                               ┌──────────────┐
 │  PRODUCTO    │═══════════[ FEIGN ]══════════►│   USUARIO    │
 │  SERVICE     │◄═══════════( HTTP )═══════════│   SERVICE    │
 │ (Puerto 8082)│                               │ (Puerto 8083)│
 └──────┬───────┘                               └──────┬───────┘
        │                                              │
        ▼ (Aislado)                                    ▼ (Aislado)
 ┌──────────────┐                               ┌──────────────┐
 │ db-productos │                               │ db-usuarios  │
 │  (MySQL 8.0) │                               │  (MySQL 8.0) │
 └──────────────┘                               └──────────────┘

⚠️ REGLA DE ORO: Se aplica el patrón Database-per-Service. producto-service jamás accede directamente a db-usuarios. Toda la integración es síncrona mediante endpoints expuestos y clientes declarativos.


2. MAPA DE DEPENDENCIAS Y CONTRATOS REST


 ┌──────────────────┐      Petición HTTP GET       ┌──────────────────┐
 │ PRODUCTO-SERVICE │═════════════════════════════►│ USUARIO-SERVICE  │
 │   (Consumidor)   │◄─────────────────────────────│   (Proveedor)    │
 └──────────────────┘   Retorna JSON: UsuarioDTO   └──


 Componente                     Detalle Técnico
 
 Ruta del Endpoint              /api/usuarios/{id}
 Método de Acceso               GET
 Contrato/DTO                   UsuarioDTO { id, nombre, email }



3. ECOSISTEMA COMPLETO DE CONTENEDORES (10 MODULOS)

 🔴 [SERVICIOS CORE REALES - SPRING BOOT]
 ├── 📦 auth-service --------► Port: 8081 ──► DB: auth_db (MySQL)
 ├── 📦 producto-service ----► Port: 8082 ──► DB: productos_db (MySQL)
 └── 📦 usuario-service -----► Port: 8083 ──► DB: usuarios_db (MySQL)

 🟢 [SERVICIOS DE CONTINGENCIA HÍBRIDA - ALPINE LINUX]
 ├── 🔲 carrito-service -----► Port: 8084 ──► (Consumo 0MB RAM/Disco)
 ├── 🔲 catalogo-service ----► Port: 8085 ──► (Consumo 0MB RAM/Disco)
 ├── 🔲 inventario-service --► Port: 8086 ──► (Consumo 0MB RAM/Disco)
 ├── 🔲 pago-service --------► Port: 8087 ──► (Consumo 0MB RAM/Disco)
 ├── 🔲 envio-service -------► Port: 8088 ──► (Consumo 0MB RAM/Disco)
 ├── 🔲 notificacion-service-► Port: 8089 ──► (Consumo 0MB RAM/Disco)
 └── 🔲 reportes-service ----► Port: 8090 ──► (Consumo 0MB RAM/Disco)


 4. OPERACIONES Y RESILIENCIA (AWS EC2)


  [ DEPLOY COMMAND ]  ──►  docker compose up --build -d
  [ TRACE SYSTEM ]    ──►  Logs estructurados vía SLF4J (log.info)
  [ ERROR HANDLER ]   ──►  Mitigación de caídas en cascada (HTTP 503)
  
  
  <img width="859" height="503" alt="image" src="https://github.com/user-attachments/assets/aae730f5-a756-4261-a243-2c0bd1daaf6e" />

  
