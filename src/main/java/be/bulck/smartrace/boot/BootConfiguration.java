/*
 * Smart Race
 * Copyright (C) 2015-2017 Fabien Vanden Bulck
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package be.bulck.smartrace.boot;

import be.bulck.smartrace.boot.command.Command;

import java.util.List;

/**
 * A class representing the configuration of boot.
 *
 * @author Fabien Vanden Bulck
 */
public class BootConfiguration {

    /** The commands of boot. */
    private List<Command> commands;


    /**
     * Gets the commands of boot.
     *
     * @return the array of commands of boot
     */
    public Command[] getCommands() {
        return commands.toArray(new Command[commands.size()]);
    }

    /**
     * Sets the commands of boot.
     *
     * @param commands the new array of commands of boot
     */
    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }
}
