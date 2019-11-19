# Slick Test

The purpose of this repository is to extend the Typesafe slick-test repository with my own examples. Technologies used in this repository are: `slick`, `liquibase`, `scalatest`, `postgresql`, and `h2`.

# Deploy

```
cd scripts
./setup-local-database.sh # sets up user and db
cd liquibase
liquibase update # migrations
cd ..
psql -U postgres -d slicktest -f populate_database.sql # populates with data
```
