# 10-PIN BOWLING KATA

The goal of this KATA is to calculate the score of 1 round of 10-Pin Bowling. 
One round comprises of 10 frames and each frame consists of 2 rolls.

There are 3 unique sceanrios handled:
1. Miss: 0 pins are knocked down in a roll.The score for this roll would be 0.
2. Strike: All 10 pins are knocked down in a roll. In this sceanrio, there will only be a single roll
   in the frame and frame score would be 10 plus the score of next 2 rolls as bonus. In case of strike in
   the final frame 2 more rolls are awarded to calculate frame score.
3. Spare: Here all 10 pins are knocked down in 2 rolls of a frame.In case of spare, frame score will be 10
   plus the score of the next rollas bonus. In case of spare in final frame/roll, 1 more roll is awarded to
   calculate frame score.
   
   Roll score other than strike/spare would be equal to the number of pins knocked down in that roll.
   
   Test cases have been written to calculate initial score, score for single roll, test class method to simulate multiple
   identical scores for rolls, test cases for strike and spare scenarios and specific test cases for all strikes game and
   all spares game scenarios.
   
