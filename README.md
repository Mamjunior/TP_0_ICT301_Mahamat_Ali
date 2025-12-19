# TP_0_ICT301_Mahamat_Ali
## Informations sur l’étudiant
- Nom : Mahamat  
- Prénom : Ali  
- Matricule : 23U2448  
- UE : ICT 301 – Conception logicielle  
- Année académique : 2025 – 2026  

## Objectif du TP
Ce travail pratique a pour objectif de comprendre et d’appliquer les cinq principes
SOLID de la programmation orientée objet.  
Chaque principe est illustré par :
- un exemple avant refactoring (violation du principe),
- un exemple après refactoring (respect du principe),
- des diagrammes de classes UML correspondants.


## Présentation des principes SOLID

### 1. SRP – Single Responsibility Principle
Une classe ne doit avoir qu’une seule responsabilité, c’est-à-dire une seule
raison de changer.  
Après refactoring, chaque responsabilité (données, affichage, persistance,
logique métier) est séparée dans une classe distincte.


### 2. OCP – Open/Closed Principle
Une classe doit être ouverte à l’extension mais fermée à la modification.  
L’utilisation du polymorphisme et des interfaces permet d’ajouter de nouveaux
comportements sans modifier le code existant.


### 3. LSP – Liskov Substitution Principle
Une classe dérivée doit pouvoir remplacer sa classe de base sans altérer le
comportement attendu du programme.  
Le refactoring consiste à éviter un héritage incorrect et à utiliser une abstraction
commune.

---

### 4. ISP – Interface Segregation Principle
Un client ne doit pas être forcé de dépendre d’interfaces qu’il n’utilise pas.  
Les interfaces trop larges sont divisées en interfaces plus spécifiques et cohérentes.

---

### 5. DIP – Dependency Inversion Principle
Les modules de haut niveau ne doivent pas dépendre des modules de bas niveau,
mais d’abstractions.  
Le refactoring repose sur l’utilisation d’interfaces et l’injection de dépendances.

---

## Outils utilisés
- Java (exemples de code)
- Git & GitHub (gestion de versions)
- LaTeX / Overleaf (diagrammes UML)
- Ubuntu Linux

---

## Conclusion
Ce TP m’a permis de mieux comprendre l’importance des principes SOLID dans la
conception de logiciels maintenables, extensibles et robustes.
