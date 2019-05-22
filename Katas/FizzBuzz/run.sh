#!/bin/bash


function build_src() {
	javac -classpath .:junit-4.13-beta-3.jar *.java
}

function clean_src() {
	rm *.class
}

function run_tests() {
	# Run Junit tests here
	java -classpath .:junit-4.13-beta-3.jar:hamcrest-core-2.1.jar org.junit.runner.JUnitCore  FizzBuzzTests
	
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
	test)
		echo Running Tests
		run_tests
	;;
	*)
		echo $1 is an invalid option. 
		#usage
	;;
esac


