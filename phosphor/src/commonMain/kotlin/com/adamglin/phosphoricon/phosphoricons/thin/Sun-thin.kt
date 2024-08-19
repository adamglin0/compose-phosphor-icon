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

public val ThinGroup.`Sun-thin`: ImageVector
    get() {
        if (`_sun-thin` != null) {
            return `_sun-thin`!!
        }
        `_sun-thin` = Builder(name = "Sun-thin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 40.0f)
                lineTo(124.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(132.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(188.0f, 128.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, -60.0f, -60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 188.0f, 128.0f)
                close()
                moveTo(180.0f, 128.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -52.0f, 52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 180.0f, 128.0f)
                close()
                moveTo(61.17f, 66.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                close()
                moveTo(61.17f, 189.17f)
                lineTo(45.17f, 205.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                close()
                moveTo(192.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.17f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineToRelative(-16.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 68.0f)
                close()
                moveTo(194.83f, 189.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                close()
                moveTo(40.0f, 124.0f)
                lineTo(16.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(40.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 216.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 212.0f)
                close()
                moveTo(240.0f, 124.0f)
                lineTo(216.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return `_sun-thin`!!
    }

private var `_sun-thin`: ImageVector? = null
