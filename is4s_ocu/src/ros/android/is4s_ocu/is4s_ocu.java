/*
 * Copyright (C) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ros.android.is4s_ocu;

import ros.android.activity.RosAppActivity;
import android.os.Bundle;
import org.ros.node.Node;
import android.util.Log;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

//TODO: search for all instances of TODO

/**
 * @author damonkohler@google.com (Damon Kohler)
 * @author pratkanis@willowgarage.com (Tony Pratkanis)
 */
public class is4s_ocu extends RosAppActivity {
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    setDefaultAppName("is4s_ocu_app");
    setDashboardResource(R.id.top_bar);
    setMainWindowResource(R.layout.main);
    super.onCreate(savedInstanceState);
    
    //TODO: add code
    //Called on creation. ROS hasn't started yet, so don't start
    //anything that depends on ROS. Instead, look up things like
    //resources. Initialize your layout here.
  }
  
  /** Called when the node is created */
  @Override
  protected void onNodeCreate(Node node) {
    super.onNodeCreate(node);
    //TODO: Put your initialization code here
  }

  /** Called when the node is destroyed */
  @Override
  protected void onNodeDestroy(Node node) {
    super.onNodeDestroy(node);
    //TODO: Put your shutdown code here for things the reference the node
  }
  
  /** Creates the menu for the options */
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.is4s_ocu_res_menu, menu);
    return true;
  }

  /** Run when the menu is clicked. */
  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
    case R.id.kill: //Shutdown if the user clicks kill
      android.os.Process.killProcess(android.os.Process.myPid());
      return true;
    //TODO: add cases for any additional menu items here.
    default:
      return super.onOptionsItemSelected(item);
    }
  }
}
