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

public val LightGroup.`Compass-light`: ImageVector
    get() {
        if (`_compass-light` != null) {
            return `_compass-light`!!
        }
        `_compass-light` = Builder(name = "Compass-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(173.32f, 74.63f)
                lineToRelative(-64.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.69f, 2.69f)
                lineToRelative(-32.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 80.0f, 182.0f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, false, 2.68f, -0.63f)
                lineToRelative(64.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.69f, -2.69f)
                lineToRelative(32.0f, -64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.05f, -8.05f)
                close()
                moveTo(139.53f, 139.53f)
                lineTo(93.42f, 162.58f)
                lineToRelative(23.0f, -46.11f)
                lineToRelative(46.11f, -23.0f)
                close()
            }
        }
        .build()
        return `_compass-light`!!
    }

private var `_compass-light`: ImageVector? = null
