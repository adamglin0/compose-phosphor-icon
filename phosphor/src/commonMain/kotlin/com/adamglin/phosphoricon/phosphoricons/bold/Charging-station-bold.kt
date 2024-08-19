package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Charging-station-bold`: ImageVector
    get() {
        if (`_charging-station-bold` != null) {
            return `_charging-station-bold`!!
        }
        `_charging-station-bold` = Builder(name = "Charging-station-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(137.94f, 121.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.2f, 11.19f)
                lineToRelative(-16.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 180.0f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, true, -4.46f, -0.86f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.68f, -15.6f)
                lineTo(110.28f, 140.0f)
                horizontalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.14f, -16.46f)
                lineToRelative(16.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.28f, 8.92f)
                lineTo(113.72f, 116.0f)
                horizontalLineTo(128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 137.94f, 121.27f)
                close()
                moveTo(256.0f, 86.63f)
                verticalLineTo(166.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -60.0f, 0.0f)
                verticalLineTo(128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(180.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(56.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 72.0f, 28.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                verticalLineToRelative(44.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(86.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f)
                lineTo(211.51f, 64.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(247.8f, 66.83f)
                arcTo(27.81f, 27.81f, 0.0f, false, true, 256.0f, 86.63f)
                close()
                moveTo(156.0f, 204.0f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(204.0f)
                close()
            }
        }
        .build()
        return `_charging-station-bold`!!
    }

private var `_charging-station-bold`: ImageVector? = null
