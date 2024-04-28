#!/bin/bash


VERSION=$(mvn help:evaluate -Dexpression=project.parent.version -q -DforceStdout)-$BASE-$(date "+%Y%m%d-%H%M%S")
