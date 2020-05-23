#!/bin/bash

CLASS=CircularQueue

function build() {
    echo Starting build...
    javac *.java
	echo Build finished. 
}

function run() {
    echo Starting $CLASS...
    java $CLASS
	echo Done.
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
