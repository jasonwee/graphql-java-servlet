# BUILT FOR OPENTRACKER
I build this for Opentracker

export Java home
```
export JAVA_HOME=/usr/lib/jvm/jdk-1.8.74/
```

check version
```
$ ./gradlew -v
./gradlew: 23: cd: can't cd to "./

------------------------------------------------------------
Gradle 6.7.1
------------------------------------------------------------

Build time:   2020-11-16 17:09:24 UTC
Revision:     2972ff02f3210d2ceed2f1ea880f026acfbab5c0

Kotlin:       1.3.72
Groovy:       2.5.12
Ant:          Apache Ant(TM) version 1.10.8 compiled on May 10 2020
JVM:          1.8.0_74 (Oracle Corporation 25.74-b02)
OS:           Linux 5.2.0-3-amd64 amd64
```

to build
```
./gradlew graphql-java-servlet:build -x test
```


# GraphQL Java Servlet
[![Maven Central](https://img.shields.io/maven-central/v/com.graphql-java-kickstart/graphql-java-servlet.svg)](https://maven-badges.herokuapp.com/maven-central/com.graphql-java-kickstart/graphql-java-servlet)
[![Build Status](https://github.com/graphql-java-kickstart/graphql-java-servlet/workflows/Publish%20snapshot/badge.svg)](https://github.com/graphql-java-kickstart/graphql-java-servlet/actions?query=workflow%3A%22Publish+snapshot%22)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=graphql-java-kickstart_graphql-java-servlet&metric=alert_status)](https://sonarcloud.io/dashboard?id=graphql-java-kickstart_graphql-java-servlet)

## We are looking for contributors!
Are you interested in improving our documentation, working on the codebase, reviewing PRs?

[Reach out to us on Discussions](https://github.com/graphql-java-kickstart/graphql-java-servlet/discussions) and join the team!

We hope you'll get involved! Read our [Contributors' Guide](CONTRIBUTING.md) for more details.

## Overview
Implementation of GraphQL Java Servlet including support for Relay.js, Apollo and OSGi out of the box.
This project wraps the Java implementation of GraphQL provided by [GraphQL Java](https://www.graphql-java.com).
See [GraphQL Java documentation](https://www.graphql-java.com/documentation/latest/) for more in depth details
regarding GraphQL Java itself. 

We try to stay up to date with GraphQL Java as much as possible. The current version supports
 **GraphQL Java 16.1**.
 
This project requires at least Java 8.

## Installation and getting started

See [Getting started](https://www.graphql-java-kickstart.com/servlet/getting-started/) for more
detailed instructions.
