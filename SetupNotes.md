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


Links:

http://answers.ros.org/question/28109/app-for-android
http://www.ros.org/wiki/ApplicationsPlatform/Clients/Android
http://www.ros.org/wiki/ApplicationsPlatform/Clients/Android/Tutorials/HowToWritePr2Props
	
http://code.google.com/p/rosjava/source/browse/?repo=android#hg

source /home/hododav/Development/ros_workspace/appmanandroid/setup.bash

need to patch rosjava_core with:
http://code.google.com/p/rosjava/issues/detail?id=76
from rosjava directory:
patch -p1 < ~/Downloads/rosjava_core.patch
from:
http://answers.ros.org/question/12675/target-nodeps-does-not-exist-in-the-project
also need to patch android.xml in appmanandroid - has its own rosjava_core???

turns outs appmanager install installs rosjava and rosjava.android
