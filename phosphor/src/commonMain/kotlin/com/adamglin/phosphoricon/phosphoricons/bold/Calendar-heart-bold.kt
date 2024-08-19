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

public val BoldGroup.`Calendar-heart-bold`: ImageVector
    get() {
        if (`_calendar-heart-bold` != null) {
            return `_calendar-heart-bold`!!
        }
        `_calendar-heart-bold` = Builder(name = "Calendar-heart-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(188.0f, 28.0f)
                lineTo(188.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(92.0f, 28.0f)
                lineTo(92.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 52.0f)
                lineTo(68.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(152.0f, 84.0f)
                arcToRelative(35.86f, 35.86f, 0.0f, false, false, -24.0f, 9.19f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 68.0f, 120.0f)
                curveToRelative(0.0f, 17.0f, 9.53f, 33.56f, 28.32f, 49.22f)
                arcToRelative(151.47f, 151.47f, 0.0f, false, false, 26.31f, 17.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.74f, 0.0f)
                arcToRelative(151.47f, 151.47f, 0.0f, false, false, 26.31f, -17.51f)
                curveTo(178.47f, 153.56f, 188.0f, 137.0f, 188.0f, 120.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 152.0f, 84.0f)
                close()
                moveTo(128.0f, 162.29f)
                curveToRelative(-13.15f, -7.86f, -36.0f, -25.06f, -36.0f, -42.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                curveTo(164.0f, 137.23f, 141.14f, 154.44f, 128.0f, 162.29f)
                close()
            }
        }
        .build()
        return `_calendar-heart-bold`!!
    }

private var `_calendar-heart-bold`: ImageVector? = null
