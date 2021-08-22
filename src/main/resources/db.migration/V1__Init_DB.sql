CREATE TABLE "lead" (
   "id" serial NOT NULL,
   "login" varchar(255) NOT NULL,
   "password" varchar(255) NOT NULL,
   "name" varchar(255) NOT NULL,
   "family" varchar(255) NOT NULL,
   "nickname" varchar(255) NOT NULL,
   CONSTRAINT "lead_pk" PRIMARY KEY ("id")
);


CREATE TABLE "friend" (
     "id" serial NOT NULL,
     "name" varchar(255) NOT NULL,
     "family" varchar(255) NOT NULL,
     "nickname" varchar(255) NOT NULL,
     CONSTRAINT "friend_pk" PRIMARY KEY ("id")
);



CREATE TABLE "between_lead_friend" (
  "id" serial NOT NULL,
  "lead_id" serial NOT NULL,
  "friend_id" serial NOT NULL,
  CONSTRAINT "between_lead_friend_pk" PRIMARY KEY ("id"),
  CONSTRAINT "between_lead_friend_fk0" FOREIGN KEY ("lead_id") REFERENCES "lead"("id"),
  CONSTRAINT "between_lead_friend_fk1" FOREIGN KEY ("friend_id") REFERENCES "friend"("id")
);






