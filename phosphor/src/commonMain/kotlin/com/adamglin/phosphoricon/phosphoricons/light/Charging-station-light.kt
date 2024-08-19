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

public val LightGroup.`Charging-station-light`: ImageVector
    get() {
        if (`_charging-station-light` != null) {
            return `_charging-station-light`!!
        }
        `_charging-station-light` = Builder(name = "Charging-station-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.0f, 124.64f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.6f, 5.59f)
                lineToRelative(-16.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.14f, -4.46f)
                lineTo(119.14f, 134.0f)
                lineTo(96.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.57f, -8.23f)
                lineToRelative(16.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.14f, 4.46f)
                lineTo(104.86f, 122.0f)
                lineTo(128.0f, 122.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 133.0f, 124.64f)
                close()
                moveTo(246.0f, 86.64f)
                lineTo(246.0f, 168.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -44.0f, 0.0f)
                lineTo(202.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(174.0f, 118.0f)
                verticalLineToRelative(92.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(32.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(50.0f, 210.0f)
                lineTo(50.0f, 56.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 72.0f, 34.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 22.0f, 22.0f)
                verticalLineToRelative(50.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 22.0f, 22.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                lineTo(234.0f, 86.63f)
                arcToRelative(9.93f, 9.93f, 0.0f, false, false, -2.93f, -7.07f)
                lineTo(211.76f, 60.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineToRelative(19.32f, 19.31f)
                arcTo(21.88f, 21.88f, 0.0f, false, true, 246.0f, 86.63f)
                close()
                moveTo(162.0f, 210.0f)
                lineTo(162.0f, 56.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(72.0f, 46.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 62.0f, 56.0f)
                lineTo(62.0f, 210.0f)
                close()
            }
        }
        .build()
        return `_charging-station-light`!!
    }

private var `_charging-station-light`: ImageVector? = null
