Traffic simulation project 

As this is a solo project, this traffic simulation will focus on flow control on the light. I notice during COVID-19, traffic on the 9th road slow down as home quarantine order published. This project will do the simulation and compare the light duration time for different scenario.  


Building a traffic simulation for the 9th road in front of my apartment. As quarantine in home in past few month I got more time to observe the traffic flow of the 9th road. Set two intersection as CR1 and CR2 and simplify the problem as sample graph below. 
 
Assume light set (1,4) (2,3) (5,8), (6,7) change at the same time. And ignore the Yellow light.
Base on Observation, light set (1,4) and (5,8) has 20 seconds for green and 120 seconds for red. On the other hand, light set (2,3) and (6,7) has oppose set which is 20 seconds for red and 120 seconds for green. 
Assume all the car drive in same speed and would not crash and past over. Simplify the multiple lance into single lance. Driving time for different section assume as below.


source file list
Car.java
Document.java
FrameDemo.java
Light.java
Road.java
Setting.java

Run Setting demo

Reference
https://gitee.com/sapperjiang/TrafficSim/blob/master/%E5%8A%A8%E6%80%81%E4%BA%A4%E9%80%9A%E5%88%86%E6%9E%90%E6%8A%80%E6%9C%AF.pdf
https://zhuanlan.zhihu.com/p/66961439
https://sumo.dlr.de/docs/


