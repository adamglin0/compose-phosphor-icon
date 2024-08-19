package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Calendar-heart-thin`: ImageVector
    get() {
        if (`_calendar-heart-thin` != null) {
            return `_calendar-heart-thin`!!
        }
        `_calendar-heart-thin` = Builder(name = "Calendar-heart-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(180.0f, 36.0f)
                lineTo(180.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(172.0f, 36.0f)
                lineTo(84.0f, 36.0f)
                lineTo(84.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(76.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(76.0f, 44.0f)
                lineTo(76.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(84.0f, 44.0f)
                horizontalLineToRelative(88.0f)
                lineTo(172.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(180.0f, 44.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(152.0f, 92.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -24.0f, 13.59f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 76.0f, 120.0f)
                curveToRelative(0.0f, 14.51f, 8.56f, 29.0f, 25.44f, 43.07f)
                arcToRelative(143.52f, 143.52f, 0.0f, false, false, 24.77f, 16.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f)
                arcToRelative(143.52f, 143.52f, 0.0f, false, false, 24.77f, -16.51f)
                curveTo(171.44f, 149.0f, 180.0f, 134.51f, 180.0f, 120.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 152.0f, 92.0f)
                close()
                moveTo(128.0f, 171.47f)
                curveToRelative(-8.46f, -4.64f, -44.0f, -25.67f, -44.0f, -51.47f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                curveTo(172.0f, 145.8f, 136.46f, 166.83f, 128.0f, 171.47f)
                close()
            }
        }
        .build()
        return `_calendar-heart-thin`!!
    }

private var `_calendar-heart-thin`: ImageVector? = null
