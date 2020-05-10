SHELL := /bin/bash
antlr_path = /usr/local/lib/antlr-4.8-complete.jar
antlr = java -Xmx500M -cp "${antlr_path}:$$CLASSPATH" org.antlr.v4.Tool
grun = java -Xmx500M -cp "${antlr_path}:$$CLASSPATH" org.antlr.v4.gui.TestRig
javac = javac -cp /usr/local/lib/antlr-4.8-complete.jar
out_java_path = src/main/antlr4/out_java
out_js_path = src/parser

gui:
	cd src/main/antlr4 && $(antlr) Shadow.g4 -o out_java
	cd ${out_java_path} && $(javac) Shadow*.java
	cd ${out_java_path} && $(grun) Shadow program ../../examples/now.Shadow -gui

node:
	cd src/main/antlr4 && $(antlr) -Dlanguage=JavaScript -visitor -o ../../parser Shadow.g4
	node src/shadow.js examples/now.shadow
nodetest: 
	cd src/main/antlr4 && $(antlr) -Dlanguage=JavaScript -visitor -o ../../parser Shadow.g4
	node src/shadow.js examples/a.shadow

tests:
	@cd src/main/antlr4 && $(antlr) -Dlanguage=JavaScript -visitor -o ../../parser Shadow.g4
	@cd src/tests && \
	for testfile in ./*_test.js ; \
	do \
 		echo "Executing test $$testfile..." ; \
 		node $$testfile ; \
	done
