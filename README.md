## API 명세

엔드포인트: `/api/send-gpt`

메서드: `POST`

요청 :
```
POST /api/send-gpt HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
  "prompt": "String"
}
```
예시 응답
```
HTTP/1.1 200 OK
Content-Type: application/json

{
  "choices": [
    {
      "message": {
        "role": "assistant",
        "content": "String"
      }
    }
  ]
}

```