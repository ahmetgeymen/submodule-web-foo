# Sample Spring Webflux Application

## Prerequisite

---

* Gradle

## Starting App

---

You can start the application with command below.

```bash
> gradle bootRun
```

The application will start using port `8080`.

## Actuator - Git Properties

---

Request `GET /actuator/info` will return the information about the commit that app has been built on.
