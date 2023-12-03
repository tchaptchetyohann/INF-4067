*****************************DEVOIR INF 4047 PATRON DE STRUCTURATION************************************



Nous avons quatre(4) dossiers src. Chaque dossier contient deux dossiers(pakages)

 



1. LE DOSSIER ADAPTATEUR
     Le dossier Adaptateur contient deux trois dossier adapterexemple2 , adapterpatron1 et adapteurExample3. Ces dossiers contient les differents code pour appliquer le patron Adaptateur. Adapteur est un patron de structuration qui consiste a convertir l'interface d'une classe a ce qui est attendue par le client.


i)Le dossier adapterexemple2 contient
   Une class Gestion:qui est le client 
   une interface Stack:introduit les different fonction, 
   DlistImpStack: la classe qui implemente Stack(la classe adaptateur)   
   DList:La classe qui doit etre adaptee
  

     Comment executer le premier code code:
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier adapterexemple2 dans l'éditeur et compiler le fichier client
     

ii)Le dossier adapterpatron1 contient

   Une class ServeurWeb:qui est le client 
   une interface Document:introduit les different fonction, 
   DocumentPDF: la classe qui implemente Document(la classe adaptateur)   
   Composant:La classe qui doit etre adaptee

     Comment executer le deuxième code:
    Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    

iii)Le dossier adapteurExample3 contient

   Une class program:qui est le client 
   une interface ICarre:introduit les different fonction, 
   Adapterectangle: la classe qui implemente ICarre(la classe adaptateur)   
   Rectangle:La classe qui doit etre adaptee

     Comment executer le deuxième code:
    Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
   







2.LE DOSSIER PATRON COMPOSITE
   
   Le dossier PATRON COMPOSITE contient deux autres dossier CompositeFichiers et compositeTexte.  COMPOSITE est un patron de structuration qui consiste a créer une hiérachisation d'objet.


i)CompositeFichiers contient:
   
   Une class client: la class qui contient le main
   Une class abstraite Dossiers: il declare l'interface commun de tous les objets
   une classes Repertoires: il definit les comportement des différents des fils des classes dossiers 
   une class abstraite Fichier: une class qui definit les operation élémentaire
une class Text: une class qui herite de Fichier et implemente les opération élémentaire
une Class Pdf: une class qui herite de Fichier et implemente les opération élémentaire

 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier CompositeFichiers dans l'éditeur et compiler le fichier client

ii)CompositeTexte contient:
   
   Une class client: la class qui contient le main
   Une class abstraite Texte: il declare l'interface commun de tous les objets
   une classes Section: il definit les comportement des différents des fils des classes dossiers 
   une class  Paragraphe: une class qui implemente les operation élémentaire

 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier CompositeTexte dans l'éditeur et compiler le fichier client
   


3.LE DOSSIER PATRON BRIDGE 
   
  Le dossier FACTORY1MEHTOD contient trois autres dossier PatronBridgeForme ,PatronBridgeNouvelleCouleur et PatronBridgeNouvelleforme. Ces dossiers contient les differents code pour appliquer le patron  Bridge . Bridge est un patron de Structuration qui consiste a découpler une interface d'une classe.
 

i)PatronBridgeForme contient:
   
   Une class client: la class qui contient la fonction main qui va executer les différents fonctions
   Une class abstraite Form: Il defint l'interface de l'abstraction
   les class Rectangle et Cercle:Des classe concretes qui vont implementer les fonction de Form
   une classe abstraite Couleur: ils contient les fonctions des couleurs
   les classes Bleu et Rouge: Ces classes implementes les fonctions de Couleur
  

 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier PatronBridgeForme dans l'éditeur et compiler le fichier client


ii)PatronBridgeNouvelleCouleur contient:
   
   Une class client: la class qui contient la fonction main qui va executer les différents fonctions
   Une class abstraite Form: Il defint l'interface de l'abstraction
   les class Rectangle et Cercle:Des classe concretes qui vont implementer les fonction de Form
   une classe abstraite Couleur: ils contient les fonctions des couleurs
   les classes Bleu  Blanc et Rouge: Ces classes implementes les fonctions de Couleur
  

 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier PatronBridgeForme dans l'éditeur et compiler le fichier client

iii)PatronBridgeNouvelleforme contient:
   
   Une class client: la class qui contient la fonction main qui va executer les différents fonctions
   Une class abstraite Form: Il defint l'interface de l'abstraction
   les class Rectangle Carre et Cercle:Des classe concretes qui vont implementer les fonction de Form
   une classe abstraite Couleur: ils contient les fonctions des couleurs
   les classes Bleu et Rouge: Ces classes implementes les fonctions de Couleur
  

 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier PatronBridgeForme dans l'éditeur et compiler le fichier client




4.PATRON DECORATOR

  Le dossier PATRON DECORATOR contient un dossier decorator. Ce dossier contient les differents code pour appliquer le patron  DECORATOR .le patron Decorator consist a attacher dynamiquement des fonctionnalités supplementaire à un objet sans toute fois modifié le code de cet objet. 

i)Decorator:
   
     Dans construction il ya un dossier un singleton. a l'interieur on y trouve deux class Singleton et TestSingleton,

Il contient des class FenetreSimple qui est l'objet que l'on veut decorer
Et la class DecorateurCurseurVertical et DecorateurCuseurHorizontal qui de decore la classe

 Comment executer le premier code code?
     Pour executer le code il faut 
    -Installer le java JDk    
    -Installer un éditeur 
    Ouvrir l'éditeur ensuite 
    Ouvrez le dossier Decorator dans l'éditeur et compiler le fichier client
