# Visit All Nodes In A System Once

Algorithm-Java

This project contains an algorithm coded in java for jumping through all the nodes of a system only once. The return value is a boolean, true if such a path is possible in the system and false if not. 

## Summary

It's based upon the depth first algorithm. It checks if it exist a path through the system from the start node, if such a path exist the function returns true. All nodes is an independent object which each have a number of neighbours. 

**Feel free to use the code as your own! If you have any questions regarding the project, don't hesitate to contact!**

### Node Class

The first node gets marked, it then gets added to a queue and the path lenght gets increased. If the path lenght equals the number of nodes in the system then we're finished and it exists a path.
If such a path is not found, check the neighbours, and then the neighbours neighbours until the whole system is tested.


### DirectGraph Class

An example class displaying a node network and shows a implementation of the visitAll function. 
