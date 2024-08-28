#!/bin/sh 
rm -f src/yang/*
cp INPUT_FILES/* src/yang/
cp utils/YANG_extensions/* src/yang/

ant yang2xsd

rm -rf xsd/*
cp out/xsd/* xsd/

ant yang2xsd_link

rm -rf out/src/*
