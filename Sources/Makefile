#
# Makefile of WebsiteEater
#

BUI = ../build
BIN = ../bin

default: compile
	
newbuild: clean compile run

compile:
	javac -d $(BUI) *.java

run:
	java -cp $(BUI) WebsiteEater

clean:
	rm -f $(BUI)/*.class
