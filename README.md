# Multilevel Queue Scheduling Simulation

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)

## 📖 Project Overview
This project is a Java-based simulation of the **Multilevel Queue Scheduling** algorithm, developed for the **Operating Systems (CPIT260)** course. It demonstrates how modern operating systems handle process scheduling by categorizing processes into different queues with varying priorities. 

## ✨ Key Features
* **Multilevel Queues:** Processes are divided into distinct queues based on their priority levels.
* **Round Robin Scheduling:** Within each queue, the Round Robin algorithm is employed to ensure fair CPU time allocation.
* **Context Switching:** A dedicated `Dispatcher` component is integrated to accurately simulate context switching between executing processes.
* **Process Control Block (PCB) Management:** Core OS concepts are implemented to track process states, CPU burst times, and execution progress.

## 🏗️ System Architecture
The simulation consists of several core classes:
* **`Process`:** Represents a Process Control Block (PCB), storing details like burst time, priority, and arrival time.
* **`QueueLevel`:** Manages individual queues and handles the Round Robin execution logic for processes within that queue.
* **`Dispatcher`:** Simulates the context switch mechanism when transferring CPU control from one process to another.
* **`Scheduler`:** The central controller that distributes processes to the appropriate `QueueLevel` based on their priority.
* **`Main`:** The entry point that initializes the simulation, configures processes, and triggers the scheduling cycle.

## 🚀 Getting Started

### Prerequisites
* [Java Development Kit (JDK) 8+](https://www.oracle.com/java/technologies/downloads/)
* [Apache Maven](https://maven.apache.org/) (or use Apache NetBeans IDE)

### Installation & Execution
1. Clone the repository:
    git clone <repository_url>

2. Navigate to the project directory:
    cd OperatingSystemProject

3. Compile and run the project using Maven:
    mvn clean compile
    mvn exec:java -Dexec.mainClass="Main"
   
*(Alternatively, you can open and run the project directly using Apache NetBeans).*

---
*Developed for academic purposes to illustrate core Operating System scheduling concepts.*
