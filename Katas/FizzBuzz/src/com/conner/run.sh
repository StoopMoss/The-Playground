#!/bin/bash

function build_src() {
	echo Building
	javac -classpath .:junit-4.13-beta-3.jar *.java
}

function clean_src() {
	echo Cleaning
	rm *.class
}
function run() {
	echo Running
	java FizzBuzz
}
function run_tests() {
	echo Running Tests
	# Run Junit tests here
	java -classpath .:junit-4.13-beta-3.jar:hamcrest-core-2.1.jar org.junit.runner.JUnitCore  FizzBuzzTests
	
}

case $1 in 
	build)
		build_src
	;;
	clean) 
		clean_src
	;;
	test)
		run_tests
	;;
	run)
		run
	;;
	build_and_run)
		build_src
		run
	;;
	*)
		echo $1 is an invalid option. 
		#usage
	;;
esac


