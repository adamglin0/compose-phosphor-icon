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

public val LightGroup.`Sun-horizon-light`: ImageVector
    get() {
        if (`_sun-horizon-light` != null) {
            return `_sun-horizon-light`!!
        }
        `_sun-horizon-light` = Builder(name = "Sun-horizon-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 154.0f)
                lineTo(197.28f, 154.0f)
                arcToRelative(70.91f, 70.91f, 0.0f, false, false, 0.72f, -10.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, -140.0f, 0.0f)
                arcToRelative(70.91f, 70.91f, 0.0f, false, false, 0.72f, 10.0f)
                lineTo(16.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(240.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(70.0f, 144.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, true, 115.13f, 10.0f)
                lineTo(70.87f, 154.0f)
                arcTo(58.63f, 58.63f, 0.0f, false, true, 70.0f, 144.0f)
                close()
                moveTo(214.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(48.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(208.0f, 194.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 200.0f)
                close()
                moveTo(74.63f, 42.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.74f, -5.37f)
                lineToRelative(8.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.74f, 5.36f)
                close()
                moveTo(18.63f, 93.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.05f, -2.69f)
                lineToRelative(16.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.36f, 10.74f)
                lineToRelative(-16.0f, -8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.63f, 93.32f)
                close()
                moveTo(210.63f, 106.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.69f, -8.05f)
                lineToRelative(16.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 5.36f, 10.74f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.05f, -2.69f)
                close()
                moveTo(162.63f, 53.32f)
                lineTo(170.63f, 37.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.74f, 5.37f)
                lineToRelative(-8.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.74f, -5.36f)
                close()
            }
        }
        .build()
        return `_sun-horizon-light`!!
    }

private var `_sun-horizon-light`: ImageVector? = null
