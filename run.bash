echo "compile exercises"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar  src/ex015/*.java  src/ex016/*.java src/ex017/*.java src/ex018/*.java src/ex019/*.java src/ex020/*.java src/ex021/*.java src/ex022/*.java src/ex023/*.java src/ex024/*.java src/ex025/*.java src/ex015/*.java src/ex026/*.java src/ex027/*.java src/ex028/*.java -d ./bin
echo "compile Main"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar -d . Main.java  
echo "run Main.java"
java -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar:./bin Main
