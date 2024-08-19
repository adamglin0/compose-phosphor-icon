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

public val LightGroup.`Device-mobile-light`: ImageVector
    get() {
        if (`_device-mobile-light` != null) {
            return `_device-mobile-light`!!
        }
        `_device-mobile-light` = Builder(name = "Device-mobile-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 18.0f)
                lineTo(80.0f, 18.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 58.0f, 40.0f)
                lineTo(58.0f, 216.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(198.0f, 40.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 176.0f, 18.0f)
                close()
                moveTo(70.0f, 62.0f)
                lineTo(186.0f, 62.0f)
                lineTo(186.0f, 194.0f)
                lineTo(70.0f, 194.0f)
                close()
                moveTo(80.0f, 30.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                lineTo(186.0f, 50.0f)
                lineTo(70.0f, 50.0f)
                lineTo(70.0f, 40.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 80.0f, 30.0f)
                close()
                moveTo(176.0f, 226.0f)
                lineTo(80.0f, 226.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(70.0f, 206.0f)
                lineTo(186.0f, 206.0f)
                verticalLineToRelative(10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 176.0f, 226.0f)
                close()
            }
        }
        .build()
        return `_device-mobile-light`!!
    }

private var `_device-mobile-light`: ImageVector? = null
