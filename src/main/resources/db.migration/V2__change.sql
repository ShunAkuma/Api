create table "post"(
   "id" bigserial primary key ,
   "title" varchar not null,
   "body" varchar not null,
   "description" varchar,
   "authornickname" varchar not null,
   "viewing" int8,
   "lead_id" int8 not null,
   CONSTRAINT "lead_fk0" foreign key ("lead_id") references "lead"("id")
)