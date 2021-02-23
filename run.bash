echo "compile exercises"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar  src/ex029/*.java  src/ex030/*.java src/ex031/*.java src/ex032/*.java src/ex033/*.java src/ex034/*.java src/ex035/*.java src/ex036/*.java src/ex037/*.java src/ex038/*.java src/ex039/*.java src/ex040/*.java src/ex041/*.java src/ex042/*.java src/ex043/*.java src/ex044/*.java src/ex045/*.java src/ex046/*.java src/ex047/*.java src/ex048/*.java src/ex049/*.java src/ex050/*.java -d ./bin
echo "compile Main"
javac -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar src/*.java -d ./bin
echo "run Main.java"
java -classpath .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar:/run_dir/json-simple-1.1.1.jar:./bin Main