#!/bin/bash

CLASS=LinkedList

function build() {
    echo building
    javac *.java
}

function run() {
    echo running
    java $CLASS
}

case $1 in 
	build)
		build
	;;
	run)
		run
	;;
	build_and_run)
		build
		run
	;;
	*)
		echo $1 is an invalid option. 
		#usage
	;;
esac
