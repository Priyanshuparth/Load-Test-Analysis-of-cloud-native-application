# Load Test Analysis of Cloud Native Application

![GitHub repo size](https://img.shields.io/github/repo-size/Priyanshuparth/Load-Test-Analysis-of-cloud-native-application)
![GitHub contributors](https://img.shields.io/github/contributors/Priyanshuparth/Load-Test-Analysis-of-cloud-native-application)
![GitHub stars](https://img.shields.io/github/stars/Priyanshuparth/Load-Test-Analysis-of-cloud-native-application?style=social)
![GitHub forks](https://img.shields.io/github/forks/Priyanshuparth/Load-Test-Analysis-of-cloud-native-application?style=social)
[![Instagram Follow](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/priyanshuparth) 
[![LinkedIn Follow](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://linkedin.com/in/priyanshuparth) 

## Overview
This project aims to analyze the load test results of a cloud-native application focusing on non-functional aspects such as success rate, resource utilization, and latency. The analysis will be conducted continuously over long periods (e.g., 12/24/48/72 hours) with comparisons to historical data.

## Problem Statement
The objective is to develop a sample cloud-native REST application that triggers multiple REST endpoints, push logs, and statistics to a cloud-native observability platform. Load testing will be performed using load tester tools to measure the transactions per second (TPS) the application can handle. A performance analyzer tool will be developed to capture data from the observability platform and analyze various metrics.

## Activities
1. Develop a sample cloud-native REST application that triggers 2-3 REST endpoints, including both synchronous and asynchronous calls. Push logs and statistics to a cloud-native observability platform.
2. Utilize load testing tools to measure the transactions per second (TPS) the application can handle under various scenarios.
3. Develop a performance analyzer tool to capture data from the observability platform, including CPU usage, latency, and generated logs/events.
4. Test different versions of the application with varying complexities and scenarios to assess performance changes.
5. Use Prometheus for capturing statistics data and for logs.
6. Use Grafana for visualizing the logs in a graphical manner.
7. Use Apache JMeter for performing the load to the application.

## Features
- Continuous load testing and monitoring over long periods.
- Comparison with historical data to identify performance improvements or degradation.
- Support for synchronous and asynchronous REST endpoints.
- CPU-intensive logic and error generation for performance testing.
- Data capture and analysis using Prometheus and Grafana.
- Load testing functional behavior and measuring performance using Apache JMeter.
- Dockerized deployment for easy setup and scalability.

## Technologies Used
- Programming Language: Java
- Tools: Docker, Prometheus, Grafana, Apache JMeter

## Prerequisites
- Docker installed on your machine.
- Basic understanding of cloud-native application development and testing.
- Basic understanding of Java springboot.
- Understanding of Grafana and Prometheus monitoring tool.

## Outcome
The project aims to provide clear results from load tests and performance analysis, comparing them with historical data to identify improvements or degradation in performance.

## How to Run

1. **Clone the Repository:**
   - Clone the repository to your local machine:
     ```
     git clone https://github.com/Priyanshuparth/Load-Test-Analysis-of-cloud-native-application.git
     ```

2. **Navigate to Each Component's Directory:**
   - Navigate to the directory of each component, such as `springhpeasync`, `springhpesync`, etc.

3. **Build Docker Image for Each Component:**
   - Inside each component directory, you'll find a `maven-wrapper.jar` or similar file.
   - Build a Docker image for each component using the following command:
     ```
     docker build -t dockerhpe.jar .
     ```

4. **Run Docker Image:**
   - After successfully building the Docker image for each component, you can run the image using the following command:
     ```
     docker run -p 8080:8080 dockerhpe.jar
     ```
   - Replace `dockerhpe.jar` with the appropriate image name for each component.

5. **Access the Application:**
   - Once the Docker container is running, you can access the application in your web browser at `http://localhost:8080`.

6. **Repeat for Each Component:**
   - Repeat steps 2-5 for each component in the project, building and running Docker images for each one.

By following these steps, you'll be able to build Docker images for each component of the project and run them locally on your machine. Don't forget to replace placeholders like `dockerhpe.jar` with the actual image names and adjust ports as needed.

## Contributors
- [Priyanshu Parth](https://github.com/Priyanshuparth)
- [Vaishnavi Upadhya](https://github.com/Vaishnaviupadhya)

## License
This project is licensed under the [MIT License](LICENSE).
