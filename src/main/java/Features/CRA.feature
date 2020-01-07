@Cra
Feature: En tant que Collaborateur, je souhaite accéder à l'interface CRA pour ajouter un commentaire à mon CRA
   
	Scenario: Ajouter un commentaire à mon CRA 
		Given je clique sur le widget cra à travers le bouton Remplir mon cra
		When je saisie un commentaire
		And je clique sur enregistrer
		Then je vérifie que le commentaire a été ajouté