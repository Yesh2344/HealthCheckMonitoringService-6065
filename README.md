# Health Check Monitoring Service

A Java-based service for monitoring the health of various systems and services.

## Badges
[![Build Status](https://travis-ci.org/travis-ci/travis-web.svg?branch=master)](https://travis-ci.org/travis-ci/travis-web)
[![Code Coverage](https://codecov.io/gh/travis-ci/travis-web/branch/master/graph/badge.svg)](https://codecov.io/gh/travis-ci/travis-web)

## Installation
1. Clone the repository: `git clone https://github.com/your-username/health-check-monitoring-service.git`
2. Build the project: `./gradlew build`
3. Run the application: `./gradlew bootRun`

## Usage
The service provides a REST API for checking the health of various systems and services.

### API Endpoints
* `GET /health-check`: Returns the health status of all monitored systems and services.
* `GET /health-check/{id}`: Returns the health status of a specific system or service.
* `POST /health-check`: Creates a new health check for a system or service.

### Example Usage