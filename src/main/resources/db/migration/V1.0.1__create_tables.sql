
-- public.status definition

-- Drop table

-- DROP TABLE public.status;

CREATE TABLE public.status (
	id int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
	"name" varchar NOT NULL,
	CONSTRAINT status_pk PRIMARY KEY (id)
);
-- public.product definition

-- Drop table

-- DROP TABLE public.product;

CREATE TABLE public.product (
	id int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
	"name" varchar NOT NULL,
	votes int8 NULL,
	status int8 NOT NULL,
	CONSTRAINT item_pk PRIMARY KEY (id)
);


-- public.product foreign keys

ALTER TABLE public.product ADD CONSTRAINT product_fk FOREIGN KEY (status) REFERENCES public.status(id);

-- public."user" definition

-- Drop table

-- DROP TABLE public."user";

CREATE TABLE public."user" (
	id int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
	"name" varchar NOT NULL,
	uuid uuid NOT NULL,
	CONSTRAINT user_pk PRIMARY KEY (id)
);
-- public.basket definition

-- Drop table

-- DROP TABLE public.basket;

CREATE TABLE public.basket (
	id int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
	uuid uuid NOT NULL,
	user_uuid uuid NOT NULL,
	product_id int8 NOT NULL,
	CONSTRAINT basket_pk PRIMARY KEY (id)
);


-- public.basket foreign keys

ALTER TABLE public.basket ADD CONSTRAINT basket_fk FOREIGN KEY (id) REFERENCES public."user"(id);
ALTER TABLE public.basket ADD CONSTRAINT basket_fk_1 FOREIGN KEY (id) REFERENCES public.product(id);

-- public.vote definition

-- Drop table

-- DROP TABLE public.vote;

CREATE TABLE public.vote (
	id int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
	user_id int8 NOT NULL,
	product_id int8 NOT NULL,
	vote int4 NOT NULL,
	CONSTRAINT vote_pk PRIMARY KEY (id)
);


-- public.vote foreign keys

ALTER TABLE public.vote ADD CONSTRAINT vote_fk FOREIGN KEY (id) REFERENCES public.product(id);
ALTER TABLE public.vote ADD CONSTRAINT vote_fk_1 FOREIGN KEY (id) REFERENCES public."user"(id);
-- public.productinbasket definition

-- Drop table

-- DROP TABLE public.productinbasket;

CREATE TABLE public.productinbasket (
	basket_id int8 NOT NULL,
	product_id int8 NOT NULL,
	quantity int4 NOT NULL DEFAULT 1,
	CONSTRAINT productinbasket_pk PRIMARY KEY (basket_id, product_id)
);