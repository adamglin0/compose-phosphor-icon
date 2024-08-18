package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Calendar-star`: ImageVector
    get() {
        if (`_calendar-star` != null) {
            return `_calendar-star`!!
        }
        `_calendar-star` = Builder(name = "Calendar-star", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(184.0f, 32.0f)
                lineTo(184.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(88.0f, 32.0f)
                lineTo(88.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 48.0f)
                lineTo(72.0f, 48.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(88.0f, 48.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(184.0f, 48.0f)
                horizontalLineToRelative(24.0f)
                lineTo(208.0f, 208.0f)
                close()
                moveTo(176.62f, 113.64f)
                lineTo(146.78f, 111.33f)
                lineTo(135.35f, 84.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.7f, 0.0f)
                lineToRelative(-11.43f, 26.5f)
                lineToRelative(-29.84f, 2.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.47f, 14.14f)
                lineToRelative(22.52f, 18.59f)
                lineToRelative(-6.86f, 27.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.82f, 8.81f)
                lineTo(128.0f, 167.82f)
                lineToRelative(25.61f, 15.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.82f, -8.81f)
                lineToRelative(-6.86f, -27.71f)
                lineToRelative(22.52f, -18.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.47f, -14.14f)
                close()
                moveTo(144.51f, 137.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.68f, 8.09f)
                lineToRelative(3.5f, 14.12f)
                lineToRelative(-13.27f, -7.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.12f, 0.0f)
                lineToRelative(-13.27f, 7.81f)
                lineToRelative(3.5f, -14.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.68f, -8.09f)
                lineToRelative(-11.11f, -9.18f)
                lineToRelative(14.89f, -1.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.73f, -4.8f)
                lineToRelative(6.0f, -13.92f)
                lineToRelative(6.0f, 13.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.73f, 4.8f)
                lineToRelative(14.89f, 1.15f)
                close()
            }
        }
        .build()
        return `_calendar-star`!!
    }

private var `_calendar-star`: ImageVector? = null
