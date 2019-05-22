#!/bin/bash


function build_src() {
	#javac *.java
}

function clean_src() {
	rm *.class
}

case $1 in 
	build)
		echo building 
		build_src
	;;
	clean) 
		echo cleaning 
		clean_src
	;;
	*)
		echo $1 is an invalid option. 
		#usage
	;;
esac


