JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Route.java \
	Driver.java \
	Station.java \
	ContractCompany.java \
	CSVParser.java \
	LoadBalancer.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
