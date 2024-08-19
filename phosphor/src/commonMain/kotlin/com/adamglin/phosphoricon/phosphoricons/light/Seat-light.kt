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

public val LightGroup.`Seat-light`: ImageVector
    get() {
        if (`_seat-light` != null) {
            return `_seat-light`!!
        }
        `_seat-light` = Builder(name = "Seat-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(112.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, -12.0f)
                lineTo(216.0f, 226.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 232.0f)
                close()
                moveTo(222.0f, 160.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(114.11f, 206.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, true, -12.53f, -7.74f)
                lineToRelative(-58.11f, -116.0f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, true, 0.0f, -12.52f)
                lineToRelative(22.12f, -44.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 18.58f, -6.35f)
                lineToRelative(33.74f, 14.24f)
                lineToRelative(0.34f, 0.17f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 6.27f, 18.78f)
                lineToRelative(-0.09f, 0.16f)
                lineTo(110.18f, 79.16f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 1.73f)
                lineToRelative(31.78f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.78f, 1.09f)
                lineTo(208.0f, 145.98f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 160.0f)
                close()
                moveTo(210.0f, 160.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(143.77f, 158.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, true, -12.52f, -7.74f)
                lineToRelative(-31.78f, -64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, -12.5f)
                lineToRelative(0.09f, -0.17f)
                lineToRelative(14.25f, -26.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.08f, -1.47f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.89f, -1.1f)
                lineTo(79.35f, 30.37f)
                lineTo(79.0f, 30.21f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.89f, -0.21f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.79f, 1.1f)
                lineToRelative(-22.12f, 44.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 1.78f)
                lineToRelative(58.12f, 116.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.79f, 1.11f)
                lineTo(208.0f, 193.99f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return `_seat-light`!!
    }

private var `_seat-light`: ImageVector? = null
