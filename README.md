# campain-web-services

How to setup localy:

1. Create a Database local using docker Image


   docker run --name postgres-db \
   -e POSTGRES_PASSWORD=dummypassword \
   -e POSTGRES_USER=campain-user \
   -e POSTGRES_DB=mycampain \
   -p 5432:5432 \
   -d postgres



2. Generate the Tables from @Entity and @Embeddable


   gradle clean build


3. Generate the Stubs from wsdl File

In gradle wsdl session 

you can run generateWsdlStubs

to generate the Stubs in build/generated-sources/wsdl   

after run copyWsdlStubsToSrc

to copy Stubs in src/main/java

and finaly run cleanWsdlStubsClasses

to clean build/generated-sources/wsdl


VALUES FOR REQ to M-PROMO

MABEOnly Values

MABEOnly = 0: Mabeplan AND Kampagne                               
MABEOnly = 1: only Mabeplan                                        
MABEOnly = 2: only Kampagne  

Projektleiter Values for DEV

Projektleiter = sonja.wodjereck@migros.ch

Update Values

Update = 0 : Is being created in M-PROMO for the first time

Update = 1 : To add some changes, it was already created in M-PROMO and not marked as delete.

Update = 2 : To delete the Campain, it was already created in M-PROMO and marked as delete.

VALUES FROM M-PROMO RES  

if the campaingn was correctly create in M-PROMO the Res includes S

S=Success  
for Example S Massnahme 9938 wurde erfolgreich aus KMS angelegt.

if the Res includes 
W=Warning 
A=Abbruch 
I=Info

then campaingn was also correctly create in M-PROMO  

But E means campaingn was not correctly create in M-PROMO

E=Error

Some Error Messages if campaingn was not correctly create in M-PROMO:

E	Der eingegebene Projektleiter existiert nicht

E	Es gibt Fehler bei Löschen von Tabelle ZMB_MASSNAHME_T

E	Kampagne existiert noch nicht, Update nicht möglich.

E	Kampagne hat bereits Objektzuordnungen

E	Marketingplanobjekt zu KampagnenID KAMP_11314 nicht gefunden

E	Unter dem Angegebenen Namen existiert bereits eine Kampagne.

E	Bitte mindestens eine Organisationseinheit wählen

E	Der Angegebene Projektleiter existiert nicht oder ihm fehlt die Rolle.

E	Projektleiter E-Mail Adresse existiert nicht.















