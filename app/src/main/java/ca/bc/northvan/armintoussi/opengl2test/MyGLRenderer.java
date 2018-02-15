package ca.bc.northvan.armintoussi.opengl2test;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by armin2 on 2/15/2018.
 */

public class MyGLRenderer implements GLSurfaceView.Renderer {


    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        //set background frame color
        GLES20.glClearColor(0.0f, 0.0f,0.0f, 1.0f);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0,0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        // Redraw background color;
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
    }
}