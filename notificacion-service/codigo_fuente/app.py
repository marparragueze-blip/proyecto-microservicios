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
