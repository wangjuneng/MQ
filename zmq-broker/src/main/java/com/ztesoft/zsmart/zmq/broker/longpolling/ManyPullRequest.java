package com.ztesoft.zsmart.zmq.broker.longpolling;

import java.util.ArrayList;
import java.util.List;



/**
 * 长轮询请求
 * 
 * @author J.Wang
 *
 */
public class ManyPullRequest {
    private final ArrayList<PullRequest> pullRequestList = new ArrayList<PullRequest>();


    public synchronized void addPullRequest(final PullRequest pullRequest) {
        this.pullRequestList.add(pullRequest);
    }


    public synchronized void addPullRequest(final List<PullRequest> many) {
        this.pullRequestList.addAll(many);
    }


    public synchronized List<PullRequest> cloneListAndClear() {
        if (!this.pullRequestList.isEmpty()) {
            List<PullRequest> result = (ArrayList<PullRequest>) this.pullRequestList.clone();
            this.pullRequestList.clear();
            return result;
        }

        return null;
    }
}
