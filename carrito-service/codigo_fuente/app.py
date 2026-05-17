from fastapi import FastAPI

app = FastAPI()

@app.get("/")
def home():
    return {"message": "modulo3 funcionando"}
