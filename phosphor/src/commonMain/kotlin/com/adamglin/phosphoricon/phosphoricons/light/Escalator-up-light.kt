package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Escalator-up-light`: ImageVector
    get() {
        if (`_escalator-up-light` != null) {
            return `_escalator-up-light`!!
        }
        `_escalator-up-light` = Builder(name = "Escalator-up-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 42.0f)
                lineTo(168.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.41f, 1.93f)
                lineTo(69.37f, 146.0f)
                lineTo(32.0f, 146.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(88.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.41f, -1.93f)
                lineTo(186.63f, 110.0f)
                lineTo(224.0f, 110.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 42.0f)
                close()
                moveTo(226.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(184.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.41f, 1.93f)
                lineTo(85.37f, 202.0f)
                lineTo(32.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 160.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(72.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.41f, -1.93f)
                lineTo(170.63f, 54.0f)
                lineTo(224.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(228.24f, 171.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(206.0f, 166.49f)
                lineTo(206.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(194.0f, 166.49f)
                lineToRelative(-13.76f, 13.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                close()
            }
        }
        .build()
        return `_escalator-up-light`!!
    }

private var `_escalator-up-light`: ImageVector? = null
