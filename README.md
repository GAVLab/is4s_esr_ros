# IS4S ESR Project

## Installation

### Create a ROS workspace (if you don't have one already):

    mkdir ~/ros_workspace
    cd ~/ros_workspace
    rosws init .

_Note: you can change `~/ros_workspace/` to any path you would like._

### Source the `setup.bash` file to get the ROS_WORKSPACE environment variable up-to-date:

    source setup.bash

### Download and install prerequisites:

    rosinstall $ROS_WORKSPACE "http://rosjava.googlecode.com/hg/rosjava.rosinstall"
    source setup.bash
    rosmake rosjava

### Download the IS4S ESR project with the rosinstall file:

    rosinstall $ROS_WORKSPACE "https://raw.github.com/GAVLab/is4s_esr_ros/master/is4s_esr.rosinstall"
    source setup.bash

### Build the IS4S ESR project:

