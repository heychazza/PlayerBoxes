package com.cjoseph.boxes.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import com.cjoseph.boxes.Boxes;
import com.cjoseph.boxes.util.ColorUtil;
import org.bukkit.command.CommandSender;

@CommandAlias("%mainCommand")
public class HelpCommand extends BaseCommand {
    private Boxes core;

    public HelpCommand(Boxes core) {
        this.core = core;
        core.getCommandManager().registerCommand(this, true);
    }

    @Subcommand("help")
    public void onCommand(CommandSender cs){
        if(cs.hasPermission("boxes.help"))
            core.sendCommandMsg(cs, "help");
        else
            core.sendCommandMsg(cs, "no-permission");
    }
}
