-- Database: faculdade

CREATE DATABASE faculdade
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

-- Table: public.curso

CREATE TABLE IF NOT EXISTS public.curso
(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255)
);

ALTER TABLE IF EXISTS public.curso
    OWNER TO postgres;

-- Table: public.aluno

CREATE TABLE IF NOT EXISTS public.aluno
(
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) COLLATE pg_catalog."default",
    curso VARCHAR(255) COLLATE pg_catalog."default",
    email VARCHAR(255) COLLATE pg_catalog."default",
    idade INTEGER,
    endereco VARCHAR(255) COLLATE pg_catalog."default",
    curso_id INTEGER,
    FOREIGN KEY (curso_id) REFERENCES public.curso (id) ON DELETE SET NULL
);

ALTER TABLE IF EXISTS public.aluno
    OWNER TO postgres;
