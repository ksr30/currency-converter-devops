#!/bin/bash

sbt clean compile coverage test coverageReport
touch temp.txt
xml2 < target/scala-2.12/scoverage-report/scoverage.xml > temp.txt

#while IFS= read -r line
#do
#tag=$line
#done < tag.txt

while IFS= read -r line
do
#echo "$line"
if [[ $line == *"/scoverage/@statement-rate"* ]]; then
  echo "It's there!"
statementrate=${line:27:2}
fi
done < temp.txt

echo $statementrate

if [ $statementrate -lt 70 ]; then
echo "no"
else
echo "yes"
sbt assembly
cp target/scala-2.13/scala-assig-currency-converter-assembly-0.1.jar jarImage/ 
cd jarImage/
docker build . -t ksr30/currency-converter
docker push ksr30/currency-converter

fi


 

