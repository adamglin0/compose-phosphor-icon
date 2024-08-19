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

public val BoldGroup.`Calendar-bold`: ImageVector
    get() {
        if (`_calendar-bold` != null) {
            return `_calendar-bold`!!
        }
        `_calendar-bold` = Builder(name = "Calendar-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(68.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                lineTo(204.0f, 76.0f)
                lineTo(52.0f, 76.0f)
                lineTo(52.0f, 52.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(52.0f, 100.0f)
                lineTo(204.0f, 100.0f)
                lineTo(204.0f, 204.0f)
                close()
                moveTo(112.0f, 124.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(88.0f, 143.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.37f, -22.0f)
                lineToRelative(16.0f, -8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 124.0f)
                close()
                moveTo(173.49f, 157.88f)
                lineTo(163.9f, 168.0f)
                lineTo(168.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(136.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.71f, -20.25f)
                lineTo(155.45f, 142.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.55f, -2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.47f, -2.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.78f, -12.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 180.0f, 140.0f)
                arcToRelative(27.77f, 27.77f, 0.0f, false, true, -5.64f, 16.86f)
                arcTo(10.63f, 10.63f, 0.0f, false, true, 173.49f, 157.88f)
                close()
            }
        }
        .build()
        return `_calendar-bold`!!
    }

private var `_calendar-bold`: ImageVector? = null
