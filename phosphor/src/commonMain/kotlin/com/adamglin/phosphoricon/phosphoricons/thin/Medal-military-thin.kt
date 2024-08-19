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

public val ThinGroup.`Medal-military-thin`: ImageVector
    get() {
        if (`_medal-military-thin` != null) {
            return `_medal-military-thin`!!
        }
        `_medal-military-thin` = Builder(name = "Medal-military-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.0f, 44.0f)
                lineTo(49.0f, 44.0f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 36.0f, 57.0f)
                verticalLineToRelative(49.21f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 43.62f, 118.0f)
                lineToRelative(70.72f, 32.14f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 27.32f, 0.0f)
                lineTo(212.38f, 118.0f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 220.0f, 106.21f)
                lineTo(220.0f, 57.0f)
                arcTo(13.0f, 13.0f, 0.0f, false, false, 207.0f, 44.0f)
                close()
                moveTo(164.0f, 52.0f)
                verticalLineToRelative(79.24f)
                lineToRelative(-36.0f, 16.37f)
                lineTo(92.0f, 131.24f)
                lineTo(92.0f, 52.0f)
                close()
                moveTo(44.0f, 106.21f)
                lineTo(44.0f, 57.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                lineTo(84.0f, 52.0f)
                verticalLineToRelative(75.61f)
                lineTo(46.93f, 110.76f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 44.0f, 106.21f)
                close()
                moveTo(164.0f, 192.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 164.0f, 192.0f)
                close()
                moveTo(212.0f, 106.21f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.93f, 4.55f)
                lineTo(172.0f, 127.61f)
                lineTo(172.0f, 52.0f)
                horizontalLineToRelative(35.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return `_medal-military-thin`!!
    }

private var `_medal-military-thin`: ImageVector? = null
