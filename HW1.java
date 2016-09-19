#****************************Problem 1*****************************************
ls /bin > tap/x
letters = (a b c d e f g h i j k l m n o p q r s t u v w x y z)
for i in (letters[*])
do
  echo $1 'grep "^${i}" /tmp/x |wc -l'  #wc is word count -l is number of lines
done




#***************************Problem 2******************************************
#reverse count
function reverse {
 let x = $1
 while [ ${x} -gt 0]
 do
  let x=x-1
  echo
${names[$x]}    #prints out last item of array and decrements x
 done
}
 names=('ls $1')
 reverse ${#names[@]}
#***********************Problem 3***********************************************
x =0
count = 0
ls - s $1 | grep -v "^total" |while read size name
do
 let x=x-1
 let count=count+size
 echo $count > /tmp/count$$
 echo $x > /tmp/x$$
done x = 'cat /tmp/x$$
to be continued....


#********************Problem 4******************************************************