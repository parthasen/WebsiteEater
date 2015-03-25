#
# Makefile of WebsiteEater
#

BUI = ../Build

default: newbuild

newbuild: create_dir clean compile run
    
create_dir:
	mkdir -p $(BUI)

compile: create_dir
	javac -d $(BUI) *.java

run:
	java -cp $(BUI) WebsiteEater
    
clean:
	rm -f $(BUI)/*.class
