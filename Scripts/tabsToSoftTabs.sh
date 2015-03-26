#!/bin/bash

ls *.* | awk '{print "expand -t 4 ", $0, " > /tmp/e; mv /tmp/e ", $0}' | sh -v