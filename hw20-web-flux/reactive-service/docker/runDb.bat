docker run --rm --name pg-docker ^
-e POSTGRES_PASSWORD=admin ^
-e POSTGRES_USER=postgres ^
-e POSTGRES_DB=reactive ^
-p 5432:5432 ^
postgres:13