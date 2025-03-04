package com.github.fabienrenaud.jjb;

import com.github.fabienrenaud.jjb.data.JsonSource;
import com.github.fabienrenaud.jjb.data.JsonSourceFactory;
import io.github.wycst.wast.json.JSONVmOptions;

/**
 * @author Fabien Renaud
 */
public abstract class JsonBench {

    protected static final JsonSource CLI_JSON_SOURCE = JsonSourceFactory.create();
    public abstract JsonSource JSON_SOURCE();

    public JsonBench() {
        JSONVmOptions.disableIntrinsicCandidate();
        JSONVmOptions.disableIncubatorVector();
    }

    public Object gson() throws Exception {
        return null;
    }

    public Object jackson() throws Exception {
        return null;
    }

    public Object jackson_afterburner() throws Exception {
        return null;
    }

    public Object jackson_blackbird() throws Exception {
        return null;
    }

    public Object orgjson() throws Exception {
        return null;
    }

    public Object genson() throws Exception {
        return null;
    }

    public Object yasson() throws Exception {
        return null;
    }

    public Object jakartajson() throws Exception {
        return null;
    }

    public Object flexjson() throws Exception {
        return null;
    }

    public Object fastjson() throws Exception {
        return null;
    }

    public Object fastjson_features() throws Exception {
        return null;
    }

    public Object jsonio() throws Exception {
        return null;
    }

    public Object boon() throws Exception {
        return null;
    }

    public Object johnzon() throws Exception {
        return null;
    }

    public Object jsonsmart() throws Exception {
        return null;
    }

    public Object dsljson() throws Exception {
        return null;
    }

    public Object dsljson_reflection() throws Exception {
        return null;
    }

    public Object logansquare() throws Exception {
        return null;
    }

    public Object jsonsimple() throws Exception {
        return null;
    }

    public Object nanojson() throws Exception {
        return null;
    }

    public Object jodd() throws Exception {
        return null;
    }

    public Object moshi() throws Exception {
        return null;
    }

    public Object tapestry() throws Exception {
        return null;
    }

    public Object minimaljson() throws Exception {
        return null;
    }

    public Object mjson() throws Exception {
        return null;
    }

    public Object underscore_java() throws Exception {
        return null;
    }

    public Object purejson() throws Exception {
        return null;
    }

    public Object avajejsonb_jackson() throws Exception {
        return null;
    }

    public Object avajejsonb() throws Exception {
        return null;
    }

    public Object qson() throws Exception {
        return null;
    }
    
    public Object antons() throws Exception {
        return null;
    }

    public Object quickbuf_json() throws Exception {
        return null;
    }

    public Object wast() throws Exception {
        return null;
    }

}
