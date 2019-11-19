#!/bin/bash

echo "Initializing database..."
psql -U postgres --command "CREATE USER slicktest WITH SUPERUSER PASSWORD 'slicktest';"
createdb -U postgres -O slicktest slicktest
exit
