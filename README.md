# Spring Boot with Kotlin & JUnit 5

By `thenewboston`:
https://www.youtube.com/playlist?list=PL6gx4Cwl9DGDPsneZWaOFg0H2wsundyGr

Approach with TDD - Red, Green, Refactor

```http
GET /api/banks HTTP/1.1
Host: localhost:8080
```

```http
GET /api/banks/1234 HTTP/1.1
Host: localhost:8080
```

```http
POST /api/banks HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 81

{
    "accountNumber": "acc123",
    "trust": "31.145",
    "transactionFee": 2
}
```

```http
PATCH /api/banks HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 82

{
    "accountNumber": "acc123",
    "trust": "31.145",
    "transactionFee": 10
}
```

```http
DELETE /api/banks/acc123 HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 82

{
    "accountNumber": "acc123",
    "trust": "31.145",
    "transactionFee": 10
}
```
