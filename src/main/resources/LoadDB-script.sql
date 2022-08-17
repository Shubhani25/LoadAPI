-- Table: public.loads

-- DROP TABLE IF EXISTS public.loads;

CREATE TABLE IF NOT EXISTS public.loads
(
    id integer NOT NULL DEFAULT nextval('loads_id_seq'::regclass),
    shipper_id integer NOT NULL,
    loading_point character varying(50) COLLATE pg_catalog."default" NOT NULL,
    unloading_point character varying(50) COLLATE pg_catalog."default" NOT NULL,
    product_type character varying(50) COLLATE pg_catalog."default" NOT NULL,
    no_of_trucks integer NOT NULL,
    weight numeric NOT NULL,
    comment character varying(100) COLLATE pg_catalog."default" NOT NULL,
    date timestamp with time zone NOT NULL,
    CONSTRAINT loads_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.loads
    OWNER to postgres;