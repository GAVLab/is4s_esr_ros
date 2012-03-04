#!/usr/bin/env python

import roslib; roslib.load_manifest('is4s_esr_gazebo')

import rospy
from sensor_msgs.msg import CompressedImage

pub = None
rotation = None

def callback(msg):
    global pub, rotation
    pub.publish(msg)

def main():
    global pub, rotation
    rospy.init_node('camera_remap')
    
    pub = rospy.Publisher('/robot1/application/camera/rgb/image_color/compressed_throttle', CompressedImage)
    
    rospy.Subscriber("/camera/compressed", CompressedImage, callback)
    
    rospy.spin()

if __name__ == '__main__':
    try:
        main()
    except rospy.ROSInterruptException: 
        pass