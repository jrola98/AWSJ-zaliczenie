
INSERT INTO public.product
("name", votes, status)
VALUES('product1', 1, 1);

INSERT INTO public.basket
(uuid, user_uuid, product_id)
VALUES('f29e72ff-d772-4a3c-90e9-4035c899f800'::uuid, 'a0b674d6-c81f-4d73-a91e-ba2aba2b96ed'::uuid, 1);

INSERT INTO public.productinbasket
(basket_id, product_id, quantity)
VALUES(1, 1, 1);
