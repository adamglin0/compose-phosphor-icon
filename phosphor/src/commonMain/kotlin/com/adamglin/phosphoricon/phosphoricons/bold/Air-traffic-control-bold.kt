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

public val BoldGroup.`Air-traffic-control-bold`: ImageVector
    get() {
        if (`_air-traffic-control-bold` != null) {
            return `_air-traffic-control-bold`!!
        }
        `_air-traffic-control-bold` = Builder(name = "Air-traffic-control-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.38f, 68.52f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 60.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 21.2f, 86.83f)
                lineToRelative(26.19f, 72.0f)
                arcTo(20.06f, 20.06f, 0.0f, false, false, 66.18f, 172.0f)
                horizontalLineTo(92.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(172.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(172.0f)
                horizontalLineToRelative(25.82f)
                arcToRelative(20.06f, 20.06f, 0.0f, false, false, 18.79f, -13.17f)
                lineToRelative(26.19f, -72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 232.38f, 68.52f)
                close()
                moveTo(114.0f, 148.0f)
                lineTo(102.38f, 84.0f)
                horizontalLineToRelative(51.24f)
                lineTo(142.0f, 148.0f)
                close()
                moveTo(45.71f, 84.0f)
                horizontalLineTo(78.0f)
                lineToRelative(11.64f, 64.0f)
                horizontalLineTo(69.0f)
                close()
                moveTo(187.0f, 148.0f)
                horizontalLineTo(166.38f)
                lineTo(178.0f, 84.0f)
                horizontalLineToRelative(32.27f)
                close()
            }
        }
        .build()
        return `_air-traffic-control-bold`!!
    }

private var `_air-traffic-control-bold`: ImageVector? = null
