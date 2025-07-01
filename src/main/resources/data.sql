CREATE TABLE IF NOT EXISTS books (
         id SERIAL PRIMARY KEY,
         title TEXT NOT NULL,
         author TEXT NOT NULL,
         favorite BOOLEAN NOT NULL DEFAULT FALSE,
         genre TEXT;