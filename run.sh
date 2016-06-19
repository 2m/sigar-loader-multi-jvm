sbt clean stage

trap 'trap - TERM && kill -- -$$' INT TERM EXIT

target/universal/stage/bin/sigar-loader-multi-jvm > out1.txt &
target/universal/stage/bin/sigar-loader-multi-jvm > out2.txt &

tail -f out1.txt out2.txt
