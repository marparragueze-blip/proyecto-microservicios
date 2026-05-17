#!/bin/bash
cd ~/proyecto-microservicios

# Envio-Service
cat > envio-service/codigo_fuente/app.py <<EOF
from flask import Flask
import mysql.connector

app = Flask(__name__)

def get_db_connection():
    return mysql.connector.connect(
        host="db_envio",
        user="root",
        password="tu_password",
        database="envio_db"
    )

@app.route("/health")
def health():
    return {"status": "UP"}

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=8087)
EOF

# Notificacion-Service
cat > notificacion-service/codigo_fuente/app.py <<EOF
from flask import Flask
import mysql.connector

app = Flask(__name__)

def get_db_connection():
    return mysql.connector.connect(
        host="db_notificacion",
        user="root",
        password="tu_password",
        database="notificacion_db"
    )

@app.route("/health")
def health():
    return {"status": "UP"}

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=8088)
EOF

# Reportes-Service
cat > reportes-service/codigo_fuente/app.py <<EOF
from flask import Flask
import mysql.connector

app = Flask(__name__)

def get_db_connection():
    return mysql.connector.connect(
        host="db_reportes",
        user="root",
        password="tu_password",
        database="reportes_db"
    )

@app.route("/health")
def health():
    return {"status": "UP"}

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=8089)
EOF

