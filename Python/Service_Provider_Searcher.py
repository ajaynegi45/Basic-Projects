while True:
    # Taking input from the user
    num = input("Enter your number:- ")
    # checking two things all input are numeric and having 10 digit.
    if (not(num.isdigit())) and len(num)!= 10:
        print("Please enter 10 digit numeric value\n")
    # checking for only all input are numeric.
    elif (not(num.isdigit())):
        print("Invalid number or Non numeric number\nPlease enter a numeric value\n")
    # checking for length of mobile number is 10 or not
    elif len(num)!= 10:
        print("You enter",len(num),"digit Invaild Number\nPlease enter 10 digit Number\n")
    # if all
    else:
        # Checking for Airtel Delhi Number
        if num[0:4]=="8130" or num[0:4]=="8527" or num[0:4]=="8800" or num[0:4]=="8826" or num[0:4]=="9560" or num[0:4]=="9650" or num[0:4]=="9717" or num[0:4]=="9810" or num[0:4]=="9818" or num[0:4]=="9871" or num[0:4]=="9910" or num[0:4]=="9958" or num[0:4]=="9599" or num[0:4]=="9971" or num[0:4]=="7042":
            print("Entered number is registered in Delhi \"Airtel\"\n")
        # Checking For Vodafone Uttarakhand Number
        elif num[0:4]=="9536" or num[0:4]=="9627" or num[0:4]=="9675" or num[0:4]=="9719" or num[0:4]=="9720" or num[0:4]=="9758" or num[0:4]=="9759" or num[0:4]=="9761" or num[0:4]=="8006" or num[0:4]=="8317" or num[0:4]=="8650" or num[0:4]=="8859" or num[0:4]=="7409" or num[0:4]=="7609" or num[0:4]=="7830" or num[0:4]=="8394" :
            print("Entered number is registered in Uttarakhand \"Vodafone\"\n")
        # If number not found in database
        else:
            print("Number is not in Database\n")
        # yes or no for repeating task
        while True:
            ajay = False
            # taking input as yes or no
            again = input("Let's do next calculation? (yes/no): ")
            # if you enter no then breaking this loop
            if again == "no" or again == "NO" or again=="No":
                print("Entered Value is ", again,"That's Why Stoping Calculation\n")
                break
            # if you enter yes then breaking this loop
            elif again =="YES"or again =="yES" or again =="yeS" or again =="Yes" or again =="yes":
                ajay = True
                break
            # if you enter other word. Then repeat ask for ("yes" or "no")
            else:
                print("Enter value is \""+again+"\""+". Which is worng.\nPlease Enter correct Value\n")
                continue
         # if you enter no in previous loop then also break from this loop
        if ajay == False:
            break
        # if you enter yes in previous loop then repeat taking input from user
        else:
            continue