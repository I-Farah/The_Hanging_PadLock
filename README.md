# The Hanging PadLock With JUnit - PadLock   
![padlock](https://user-images.githubusercontent.com/36029803/51781888-5fe9b300-20ed-11e9-8240-fd1752e22a0a.jpg)
#### Project Objective 
  1. Implement unit tests using the JUnit Testing Framework
  2. Analyze expected results to confirm correct functionality 
  
##### PadLock Class 
- The Padlock class will be used to model a 'standard', free‐hanging padlock like those used in high schools, gyms,
  and bus terminals.  The idea behind the Padlock is that there is a dial with 50 (between 0 and 49)and a 3‐number combination 
  such that the user will spin the number dial either to the left (counterclockwise) or right (clockwise).  
  In order to open the lock, the user must turn the dial to the right to get to the first number, then turn the dial to the  
  left to get to the second number, then finally turn the dial to the right to get to the third number.  

  ##### Functionality
  - 3 instance variables for the dial numbers that would be used as the combination.
  - 1 instance variable that represents the number being pointed to on the lock.
  - Instance variables that represent whether or not the lock can be opened right now.
  - A 3‐parameter constructor that sets the combination values for a lock that cannot currently be opened 
  - A toString method that returns the String representation of the PadLock object (textual description).
  - spinRight Method - spins the dial right
  - spinLeft Method - spins the dial left
  - getCurrentValue - gets the current lock dial number
  - isFirstConditionMet - returns true only if the first condition is met
  - isSecondConditionMet - returns true only if second condition is met
  - isThirdConditionMet - returns true if only if third condition is met
  - isOpen - returns true if all conditions are met
  
![padlock2](https://user-images.githubusercontent.com/36029803/51781853-ca4e2380-20ec-11e9-96fe-65f3e3fddeb4.png)

  #### Test Package With Test Classes For Each Method
  ---
![padlock3](https://user-images.githubusercontent.com/36029803/51781857-d934d600-20ec-11e9-8f09-42b19f160815.jpg)

#### Key Points
- PadLock class and its functionality placed into the model package and test classes where placed in testing package
- Created a separate testing class for each class method.
- There will be no working application in the end, but we will have a class that's been completely tested laying the foundation 
  for other applications
- We have a class that we are assured works properly (because we tested it) and this class can be placed into
  any application without fear of it having bugs. 
