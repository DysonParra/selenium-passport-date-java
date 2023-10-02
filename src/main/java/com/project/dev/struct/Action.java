/*
 * @fileoverview    {Action} se encarga de realizar tareas especificas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.struct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * TODO: Definición de {@code Action}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public abstract class Action {

    protected String type;
    protected Object value;
    protected long delay;

    public abstract boolean executeAction(@NonNull WebDriver driver, @NonNull WebElement element) throws Exception;

}