# NASREDDINE-JABARI-enset-adria-test
 

# Projet de Micro-services d'Application Financière

Ce projet vise à développer une application financière basée sur une architecture de micro-services. L'application comprend les services suivants : wallet-service, transfer-service, gateway-service, discovery-service et config-service. En outre, un frontend web simple sera développé pour l'application, et des mesures de sécurité seront prises en compte.

## Table des matières

1. [Configuration de base](#configuration-de-base)
2. [Micro-service Discovery-Service](#micro-service-discovery-service)
3. [Micro-service Gateway-Service](#micro-service-gateway-service)
4. [Micro-service Config-Service](#micro-service-config-service)
5. [Micro-service Wallet-Service](#micro-service-wallet-service)
6. [Micro-service Transfer-Service](#micro-service-transfer-service)
7. [Frontend Web](#frontend-web)
8. [Sécurité de l'application](#sécurité-de-lapplication)

## 1. Configuration de base


## 2. Micro-service Discovery-Service

Le service de découverte (Discovery Service) est responsable de la gestion des instances de micro-services et de la détection de nouveaux services. Il utilise généralement un système comme Eureka, Consul ou ZooKeeper. Vous devez développer et tester ce service.
![Alt text](<Screenshot 2023-10-30 092635-1.png>)
![Alt text](<Screenshot 2023-10-30 092641.png>)
## 3. Micro-service Gateway-Service

Le service de passerelle (Gateway Service) est un point d'entrée pour l'application, gérant le routage des requêtes aux micro-services appropriés. Vous devez développer et tester ce service.

![Alt text](<Screenshot 2023-10-30 094808Gate.png>)
![Alt text](<Screenshot 2023-10-30 094846gat.png>)

## 4. Micro-service Config-Service



## 5. Micro-service Wallet-Service

Le service de portefeuille (Wallet Service) gère les opérations liées aux portefeuilles des utilisateurs, telles que la création de portefeuilles, le solde, les transactions, etc. Vous devez développer et tester ce service.

![Alt text](<Screenshot 2023-10-30 091749.png>)
![Alt text](<Screenshot 2023-10-30 091719.png>)
![Alt text](<Screenshot 2023-10-30 091700.png>)

![Alt text](<Screenshot 2023-10-30 101432testwal.png>)

## 6. Micro-service Transfer-Service

Le service de transfert (Transfer Service) gère les opérations de transfert d'argent entre les portefeuilles des utilisateurs. Vous devez développer et tester ce service.

![Alt text](<Screenshot 2023-10-30 092439.png>)
![Alt text](<Screenshot 2023-10-30 092431.png>)
![Alt text](<Screenshot 2023-10-30 092424.png>)
![Alt text](<Screenshot 2023-10-30 095127tr.png>)

![Alt text](<Screenshot 2023-10-30 101908transTes.png>)
![Alt text](<Screenshot 2023-10-30 103913re.png>)

## 7. Frontend Web

Développez un frontend web simple pour l'application. Ce frontend devrait être en mesure de communiquer avec les micro-services pour effectuer des opérations telles que la consultation du solde, les transferts, etc.

## 8. Sécurité de l'application

Les mesures de sécurité pour protéger l'application. Cela peut inclure l'authentification des utilisateurs, l'autorisation des requêtes, la gestion des sessions, la sécurisation des communications entre les services.


*** All services are running ***
![Alt text](<Screenshot 2023-10-30 103219Final.png>)