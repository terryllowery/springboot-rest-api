#!/usr/bin/env bash

function ping_it() {
    while true
    do
      curl http://localhost:8080
      echo
      sleep 5
    done
}

ping_it