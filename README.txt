*****************************DEVOIR INF 4047 PATRON DE CONTRUCTION************************************



Nous avons quatre(4) dossiers src. Chaque dossier contient deux dossiers(pakages)

 



1. LE DOSSIER ABSTRACT FACTORY

     Le dossier Abstract Factory contient deux autres dossier abstractfactory1e et abstractfactory2exo. Ces dossiers contient les differents code pour appliquer le patron ABSTRACT FACTORY. Abstract factory est un patron de construction qui consiste a créer des objets d'une même famille.


i)Le dossier abstractfactory1e contient
   Une class client ,une interface ProduitA, une interface ProduitB implementer par les class ProduitA1,ProduitA2 ProduitB1,ProsuitB2, une interface ProduitFactory implemente par les class ProduitFactory1 ProduitFactory2
   
  Comment Proceder:

     On crée une interface ProduitFactory qui aura deux méthode abstraite. Cette interface sera implenter par deux classes ProduitFactory1 et ProduitFactory2 qui vont utiliser ces méthodes là.
Ces methodes consiste à créer des objets de même famille. 

   Dans ce devoir les familles d'objet à créer sont ProduitA1,ProduitA2,ProduitB1,ProduitB2 
ProduitA et ProduitB sont des class abstraite qui contiennent des methodes abstraite.Ces methodes seront implementées par les differents familles.

     Comment executer le premier code code:
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier abstractFactory1e dans l'éditeur et compiler le fichier client
     

ii)Le dossier abstractfactory2exo contient

   Une class client, une interface ProduitA, une interface ProduitB implementé par les class ProduitA1, ProduitA2, ProduitA3 ProduitB1,ProduitB2, ProduitB3 une interface ProduitFactory implemente par les class ProduitFactory1, ProduitFactory2, ProduitFactory3

     Comment Proceder:

     On crée une interface ProduitFactory qui aura deux méthode abstraite. Cette interface sera implenter par deux classes ProduitFactory1 et ProduitFactory2 qui vont utiliser ces méthodes là.
Ces methodes consiste à créer des objets de même famille. 
   Dans ce devoir les familles d'objet à créer sont ProduitA1,ProduitA2,ProduitA1,ProduitB1,ProduitB2,ProduitB3
ProduitA et ProduitB sont des class abstraite qui contiennent des methodes abstraite.Ces methodes seront implementées par les differents familles de produit.

     Comment executer le deuxième code:
    Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le pakage abstractfactory2exo dans l'éditeur et compiler le fichier client







2.LE DOSSIER FACTORYF1METHOD
   
   Le dossier FACTORY1MEHTOD contient deux autres dossier EXEMPLEFACTORY et exo1. Ces dossiers contient les differents code pour appliquer le patron  FACTORY (la première methode). Factory est un patron de construction qui consiste a créer des objets de même type.


i)EXEMPLEFACTORY contient:
   
   Une class client, une class Factory, une class abstraite Produit qui est implentée par les class Produit1 et Produit2
  Comment Proceder:
     On crée une classe Factory qui aura une méthode qui prendra en parametre des valeurs qui va specifier le type de produire à instanciers.

 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier EXEMPLEFACTORY dans l'éditeur et compiler le fichier client

ii)exo1 contient:
   
   Une class client, une class Factory, une class abstraite Produit qui est implentée par les class Produit1, Produit2, Produit3

  Comment Proceder:
     On crée une classe Factory qui aura une méthode qui prendra en parametre des valeurs qui va specifier le type de produire à instanciers.

 Comment executer le deuxième code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier exo1 dans l'éditeur et compiler le fichier client

   


3.LE DOSSIER FACTORYMETHOD 2
   
  Le dossier FACTORY1MEHTOD contient deux autres dossier EXEMPLEFACTORY et exo1. Ces dossiers contient les differents code pour appliquer le patron  FACTORY (la deuxieme methode). Factory est un patron de construction qui consiste a créer des objets de même type.
 

i)factory2method contient:
   
   Une class client, une class abstraite Factory qui est implementer par deux class concrètes Factory1 et Factory2, une class abstraite Produit qui est implentée par les class Produit1 et Produit2
  
Comment Proceder:
     
   On crée une class abstraite Factory qui sera implementer par deux class Factory1 et Factory2. La class Factory1 va instancier produit1 et la classe Factory2 va instancier Produit2

 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier factory2method dans l'éditeur et compiler le fichier client


ii)exo2 contient:
   
   Une class client, une class abstraite Factory qui est implementer par trois class concrètes Factory1 et Factory2, une class abstraite Produit qui est implentée par les class Produit1 et Produit2
  
Comment Proceder:
     
   On crée une class abstraite Factory qui sera implementer par deux class Factory1 et Factory2. La class Factory1 va instancier produit1 et la classe Factory2 va instancier Produit2

 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier exo2 dans l'éditeur et compiler le fichier client
   





4.Singleton

  Le dossier Singleton contient deux autres dossier construction et singleton2. Ces dossiers contient les differents code pour appliquer le patron  SINGLETON .le patron Singleton consist a créer une class qui sera instancier une fois. 

i)construction contient:
   
     Dans construction il ya un dossier un singleton. a l'interieur on y trouve deux class Singleton et TestSingleton,
La class singleton est un class final.
  
Comment Proceder:
 
   On crée une class final Singleton qui va contenir un attribut de type Singleton et deux autres attributs qui seront en privé. On crée un constructeur qui va instancier cette class. Ce contructeur sera  privé. Ensuite on crée une méthode qui va appeler ce constructeur et l'autoriser à instancier la class une seul fois. 

 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier construction dans l'éditeur et compiler le fichier aui contient le main

ii)singleton2 contient:
   
 A l'interieur on y trouve deux class Arithmetique et TestArithmetique,
La class singleton est un class final.
  
Comment Proceder:
 
   On crée une class final Arithmetique qui va contenir un attribut de type Singleton et trois autres attributs qui seront en privé. On crée un constructeur qui va instancier cette class. Ce contructeur sera  privé. Ensuite on crée une méthode qui va appeler ce constructeur et l'autoriser à instancier la class une seul fois. 

 Comment executer le code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier singleton2 dans l'éditeur et compiler le fichier qui contient le main





5) Le dossier Builder
   Dans le dossier builder, on y trouve deux deux dossier builderexample and builserExercice. Ces dossiers, contiennent les codes pour executer le patron Builder. Le patron Builder est un patron de contruction qui aide à la construction d'un objet complex à parti d'autre 
 objet

i)builderexample 

  Le dossier builderexample contient la classe client, la classe directeur, la classe abstraite MonteurPizza qui est implementer par les class MonteurPizzaPiquente, MonteurPizzaReine ,la classe pizza

Comment Proceder:
 
   On crée une classe Pizza qui va contenir des fonction pour définir Pizza. Ensuite on crée une classe abstraite Monteurpizza qui aura 4 fontion pour monter la pizza. 
Apres célà on crée deux classes concrètes qui vont monter chacune une pizza qui contiendra les differents ingredients. 
Apres célà on crée une classe directeur qui possèdera la methode construire qui va se charger d'assembler les différents ingredients de la pizza. Pour pouvoir construire, on va créer une variable de type MonteurPizza qui va implementer les différentes fonctions.
En fin on crée la classe client qui appeler la methode constuire pour obtenir la pizza.


 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier builderexample dans l'éditeur et compiler le fichier client

ii) builderExercice 

 Le dossier builderexample contient la classe client, la classe directeur, la classe abstraite MonteurPizza qui est implementer par les class MonteurPizzaPiquente, MonteurPizzaReine,MonteurPizzaLocale ,la classe pizza

Comment Proceder:
 
   On crée une classe Pizza qui va contenir des fonction pour définir Pizza. Ensuite on crée une classe abstraite Monteurpizza qui aura 4 fontion pour monter la pizza. 
Apres célà on crée trois classes concrètes qui vont monter chacune une pizza qui contiendra les differents ingredients. 
Apres célà on crée une classe directeur qui possèdera la methode construire qui va se charger d'assembler les différents ingredients de la pizza. Pour pouvoir construire, on va créer une variable de type MonteurPizza qui va implementer les différentes fonctions.
En fin on crée la classe client qui appeler la methode constuire pour obtenir la pizza.


 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier builderExercice dans l'éditeur et compiler le fichier client

   


