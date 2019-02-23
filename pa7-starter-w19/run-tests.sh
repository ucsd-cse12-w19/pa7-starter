JARS=lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:lib/jfreechart.jar:lib/jcommon-1.0.23.jar

javac -cp $JARS:src/ src/ucsdcse12pa7student/*.java

java -cp $JARS:src/ org.junit.runner.JUnitCore ucsdcse12pa7student.LoaderTest 2>&1 | grep -v "\tat"
java -cp $JARS:src/ org.junit.runner.JUnitCore ucsdcse12pa7student.BSTTest 2>&1 | grep -v "\tat"

# Use this to run the Loader
# java -cp $JARS:src/ ucsdcse12pa6student.Loader
