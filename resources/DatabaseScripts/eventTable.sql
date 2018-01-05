-- Table: public."Events"

DROP TABLE public."Events";

CREATE TABLE public."Events"
(
    "eventTime" timestamp with time zone,
    gadget1 integer,
    gadget2 integer,
    gadget3 integer
)
WITH (
    OIDS = FALSE
)
