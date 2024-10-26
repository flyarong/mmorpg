package org.forfun.mmorpg.game.activity;

import jforgame.socket.share.message.Message;
import org.forfun.mmorpg.game.database.user.entity.PlayerEnt;

public interface IActivityHandler {

    void load();

    Message openPanel(PlayerEnt player);

    void receiveRewards(PlayerEnt player);

    ActivityTypes getActivityType();

    Activity getActivity();

    boolean canOpen();

    void checkPrepare();

    void checkStart();

    void checkEnd();

    void activityPrepare();

    void activityStart();

    void activityEnd();

    /**
     * 把活动数据持久化到数据库
     * @param fastSave 是否马上入库
     */
    void saveToDb(boolean fastSave);



}