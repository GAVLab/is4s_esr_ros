# IS4S Android OCU 

## Dependencies
* ROS http://www.ros.org
* rosjava http://www.ros.org/wiki/rosjava
* Android SDK http://developer.android.com

## Installation instructions

Install rosinstall:

	sudo apt-get install python-setuptools
	sudo easy_install -U rosinstall

Create a workspace:

	mkdir ~/ros_workspace
	cd ~/ros_workspace
	rosws init ./
	source setup.bash

Create a stack:

	export ROS_PACKAGE_PATH=$ROS_PACKAGE_PATH:~/ros_workspace/
	cd ~/ros_workspace
	mkdir is4s_esr_ros
	cd is4s_esr_ros
	roscreate-stack .

Create packages inside stack:

	