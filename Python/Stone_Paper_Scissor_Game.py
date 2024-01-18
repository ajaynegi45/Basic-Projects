''' Stone Paper Scissor Game '''
# Stone is denote as "S"
# Paper is denote as "P"
# Scissors is denote as "C"

print("\n")
import time
count_seconds = 3
for i in reversed(range(count_seconds + 1)):
	if i > 0:
		print(i, end=' >>> ', flush = True)
		time.sleep(1)
	else:
		print('Now You can start your Game \n')



import random
def gamewin(comp, you):
# if two values are equal, declare tie 
    if comp == you:
        return None
#check for all possiblities  when computer choose Stone
    elif comp == 'S':
       if you == 'P':
            return True
       elif you == 'C':
            return False
#check for all possiblities  when computer choose Paper
    elif comp == "P":
        if you == 'C':
            return True
        elif you == 'S':
            return False
#check for all possiblities  when computer choose Scissors
    elif comp == 'C':
        if you == 'S':
            return True
        elif you == 'P':
            return False


print("\n Computer Turn 🖥 :- Option Selected\n Now Your Turn")
random_no = random.randint(1,3)
if random_no == 1:
    comp = 'S'
elif random_no == 2:
    comp = 'P'
elif random_no == 3:
    comp = 'C'

you = input(" Your's Turn👨 :- Choose any one Option Stone('S') Paper('P') or Scissors('C') :-  ")
a = gamewin(comp, you)

print(f" You Choose 👨 :- {you}")
print(f" Computer Choose 🖥 :- {comp}")

if a == None:
    print(" Popat 🤣, Game is Tie ")
elif a:
    print(" 🎉 Yeah, You win! 🥳")
else:
    print(" You Loser 👎 ")
