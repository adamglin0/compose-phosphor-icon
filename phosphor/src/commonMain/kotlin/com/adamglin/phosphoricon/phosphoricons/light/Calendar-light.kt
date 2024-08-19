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

public val LightGroup.`Calendar-light`: ImageVector
    get() {
        if (`_calendar-light` != null) {
            return `_calendar-light`!!
        }
        `_calendar-light` = Builder(name = "Calendar-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(48.0f, 46.0f)
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
                lineTo(210.0f, 82.0f)
                lineTo(46.0f, 82.0f)
                lineTo(46.0f, 48.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 48.0f, 46.0f)
                close()
                moveTo(208.0f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 94.0f)
                lineTo(210.0f, 94.0f)
                lineTo(210.0f, 208.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f)
                close()
                moveTo(110.0f, 120.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(98.0f, 129.71f)
                lineToRelative(-7.32f, 3.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -5.36f, -10.74f)
                lineToRelative(16.0f, -8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 110.0f, 120.0f)
                close()
                moveTo(169.57f, 149.25f)
                lineTo(148.0f, 178.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(136.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, -9.6f)
                lineTo(160.0f, 142.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -16.65f, -11.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 133.0f, 125.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 36.62f, 24.26f)
                close()
            }
        }
        .build()
        return `_calendar-light`!!
    }

private var `_calendar-light`: ImageVector? = null
