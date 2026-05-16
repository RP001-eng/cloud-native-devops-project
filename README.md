# Cloud Native GitOps CI/CD Pipeline using GitHub Actions and Kubernetes

## Project Overview

This project demonstrates a complete cloud-native DevOps workflow using GitHub Actions, Docker, Kubernetes, Argo CD, Prometheus, and Grafana.

The pipeline automates:

* Application build and testing
* Docker image creation
* Docker image push to DockerHub
* Kubernetes deployment updates
* GitOps-based continuous deployment using Argo CD
* Monitoring and observability using Prometheus and Grafana

This project follows modern DevOps and GitOps practices used in real-world cloud-native environments.

---

# Architecture Diagram

```text
Developer Pushes Code
        ↓
GitHub Repository
        ↓
GitHub Actions CI/CD Pipeline
        ↓
Maven Build + Unit Testing
        ↓
Docker Image Build
        ↓
Push Docker Image to DockerHub
        ↓
Update Kubernetes Manifest
        ↓
Push to GitOps Repository
        ↓
Argo CD Detects Git Changes
        ↓
Automatically Deploys to Kubernetes
        ↓
Prometheus Collects Metrics
        ↓
Grafana Visualizes Dashboards
```

---

# Tech Stack

| Category             | Tool           |
| -------------------- | -------------- |
| Programming Language | Java 17        |
| Framework            | Spring Boot    |
| Build Tool           | Maven          |
| Version Control      | Git & GitHub   |
| CI/CD                | GitHub Actions |
| Containerization     | Docker         |
| Container Registry   | DockerHub      |
| Orchestration        | Kubernetes     |
| Local Kubernetes     | Minikube       |
| GitOps               | Argo CD        |
| Monitoring           | Prometheus     |
| Visualization        | Grafana        |

---

# Features

* Automated CI/CD pipeline using GitHub Actions
* Dockerized Spring Boot application
* Kubernetes Deployment and Service configuration
* GitOps implementation using Argo CD
* Auto-sync Kubernetes deployments
* Scalable Kubernetes deployments with replicas
* Monitoring using Prometheus and Grafana
* End-to-end cloud-native deployment workflow

---

# Project Workflow

## CI/CD Workflow

```text
Code Push
    ↓
GitHub Actions Triggered
    ↓
Maven Build & Test
    ↓
Docker Image Build
    ↓
DockerHub Push
```

## GitOps Workflow

```text
Kubernetes Manifest Update
        ↓
Push to GitOps Repository
        ↓
Argo CD Detects Change
        ↓
Automatic Kubernetes Deployment
```

---

# Project Structure

```text
cloud-native-devops-project/
│
├── demo/
│   ├── src/
│   ├── pom.xml
│   └── Dockerfile
│
├── .github/
│   └── workflows/
│       └── ci.yml
│
├── k8s/
│   ├── deployment.yaml
│   └── service.yaml
│
└── README.md
```

---

# Spring Boot Application

A simple REST API was developed using Spring Boot.

## Endpoint

```http
GET /hello
```

## Response

```json
{
  "message": "DevOps Project Running Successfully"
}
```

---

# Dockerization

The application was containerized using Docker.

## Docker Build

```bash
docker build -t devops-demo-app .
```

## Run Container

```bash
docker run -d -p 8080:8080 devops-demo-app
```

---

# GitHub Actions CI/CD Pipeline

The GitHub Actions workflow automates:

* Maven build
* Unit testing
* Docker image creation
* DockerHub push

## Workflow File

```text
.github/workflows/ci.yml
```

---

# Kubernetes Deployment

The Dockerized application is deployed into Kubernetes using:

* Deployment YAML
* Service YAML

## Apply Deployment

```bash
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml
```

## Verify Pods

```bash
kubectl get pods
```

---

# GitOps using Argo CD

Argo CD continuously monitors the GitOps repository and automatically synchronizes Kubernetes deployments whenever manifest files are updated.

## Argo CD Features Used

* Continuous Deployment
* Auto Sync
* Git-based deployment management
* Kubernetes state reconciliation

---

# Monitoring and Observability

Prometheus and Grafana were integrated for monitoring Kubernetes workloads and cluster metrics.

## Monitoring Features

* Pod monitoring
* Cluster monitoring
* CPU and memory metrics
* Dashboard visualization

---

# Important Commands

## Docker Commands

```bash
docker build -t devops-demo-app .
docker images
docker ps
docker logs <container-id>
```

## Kubernetes Commands

```bash
kubectl get pods
kubectl get svc
kubectl get deployments
kubectl apply -f deployment.yaml
kubectl scale deployment devops-demo-deployment --replicas=4
```

## Minikube Commands

```bash
minikube start
minikube service devops-demo-service
```

---

# Learning Outcomes

Through this project, the following DevOps concepts were implemented and understood:

* CI/CD Automation
* Docker Containerization
* Kubernetes Orchestration
* GitOps Principles
* Continuous Deployment
* Infrastructure Automation
* Monitoring and Observability
* Cloud-Native Architecture

---

# Future Enhancements

* Deploy on AWS EKS
* Add Ingress Controller
* Implement Helm Charts
* Add SonarQube Integration
* Add Slack/Email Notifications
* Implement Blue-Green Deployment
* Add Terraform Infrastructure Automation

---

# Conclusion

This project demonstrates a modern cloud-native DevOps workflow using GitHub Actions, Docker, Kubernetes, Argo CD, Prometheus, and Grafana.

It showcases end-to-end automation, GitOps deployment strategy, Kubernetes orchestration, and monitoring implementation aligned with industry DevOps practices.
