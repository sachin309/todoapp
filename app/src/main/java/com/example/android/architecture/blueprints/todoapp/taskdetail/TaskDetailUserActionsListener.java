

package com.example.android.architecture.blueprints.todoapp.taskdetail;


import android.view.View;

/**
 * Listener used with data binding to process user actions.
 */
public interface TaskDetailUserActionsListener {

    void onCompleteChanged(View v);
}
