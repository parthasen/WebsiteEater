###############################################
# Makefile of WebsiteEater
###############################################

SCRIPTS = ../Scripts
BUILD = ../Build

default: format_for_github newbuild

##############################################
# To compile
##############################################

newbuild: create_dir clean compile run
    
create_dir:
	mkdir -p $(BUILD)

compile: create_dir
	javac -d $(BUILD) *.java

run:
	java -cp $(BUILD) WebsiteEater
    
clean:
	rm -f $(BUILD)/*.class


##############################################
# Utilities
##############################################

format_for_github:
	$(SCRIPTS)/tabsToSoftTabs.sh
	
count_lines:
	$(SCRIPTS)/countLines.sh