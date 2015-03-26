###############################################
# Makefile of WebsiteEater
###############################################

BUI = ../Build

default: format_for_github newbuild

##############################################
# To compile
##############################################

newbuild: create_dir clean compile run
    
create_dir:
	mkdir -p $(BUI)

compile: create_dir
	javac -d $(BUI) *.java

run:
	java -cp $(BUI) WebsiteEater
    
clean:
	rm -f $(BUI)/*.class


##############################################
# Utilities
##############################################

format_for_github: soft_tabs

soft_tabs:
	ls *.* | awk '{print "expand -t 4 ", $0, " > /tmp/e; mv /tmp/e ", $0}' | sh -v