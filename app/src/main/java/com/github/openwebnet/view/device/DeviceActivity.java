package com.github.openwebnet.view.device;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.github.openwebnet.OpenWebNetApplication;
import com.github.openwebnet.R;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import butterknife.ButterKnife;

public class DeviceActivity extends AbstractDeviceActivity {

    private static final Logger log = LoggerFactory.getLogger(DeviceActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        OpenWebNetApplication.component(this).inject(this);
        ButterKnife.bind(this);

        initSpinnerEnvironment();
        initSpinnerGateway();
    }

    @Override
    protected void onMenuSave() {
        log.debug("environment: {}", getSelectedEnvironment());
        log.debug("gateway: {}", getSelectedGateway());
    }
}