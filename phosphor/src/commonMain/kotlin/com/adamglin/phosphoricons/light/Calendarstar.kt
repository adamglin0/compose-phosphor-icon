package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) {
            return _calendarStar!!
        }
        _calendarStar = Builder(name = "CalendarStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(182.0f, 34.0f)
                lineTo(182.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(170.0f, 34.0f)
                lineTo(86.0f, 34.0f)
                lineTo(86.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(74.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(74.0f, 46.0f)
                lineTo(74.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(86.0f, 46.0f)
                horizontalLineToRelative(84.0f)
                lineTo(170.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(182.0f, 46.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(176.46f, 115.63f)
                lineTo(145.46f, 113.23f)
                lineTo(133.51f, 85.62f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.0f, 0.0f)
                lineToRelative(-11.91f, 27.61f)
                lineToRelative(-31.0f, 2.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.36f, 10.61f)
                lineToRelative(23.49f, 19.39f)
                lineToRelative(-7.16f, 28.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.87f, 6.61f)
                lineTo(128.0f, 165.5f)
                lineToRelative(26.62f, 15.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.87f, -6.61f)
                lineToRelative(-7.16f, -28.93f)
                lineToRelative(23.49f, -19.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.36f, -10.61f)
                close()
                moveTo(145.78f, 138.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, 6.07f)
                lineToRelative(4.63f, 18.74f)
                lineTo(131.0f, 153.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.08f, 0.0f)
                lineToRelative(-17.37f, 10.22f)
                lineToRelative(4.63f, -18.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, -6.07f)
                lineTo(95.28f, 126.45f)
                lineToRelative(19.83f, -1.53f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, -3.61f)
                lineTo(128.0f, 103.14f)
                lineToRelative(7.84f, 18.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, 3.61f)
                lineToRelative(19.83f, 1.53f)
                close()
            }
        }
        .build()
        return _calendarStar!!
    }

private var _calendarStar: ImageVector? = null
