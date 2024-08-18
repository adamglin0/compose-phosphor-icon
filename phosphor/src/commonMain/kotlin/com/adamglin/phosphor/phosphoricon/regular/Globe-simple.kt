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

public val RegularGroup.`Globe-simple`: ImageVector
    get() {
        if (`_globe-simple` != null) {
            return `_globe-simple`!!
        }
        `_globe-simple` = Builder(name = "Globe-simple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.12f, 104.12f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(215.62f, 120.0f)
                lineTo(175.79f, 120.0f)
                curveTo(174.0f, 83.49f, 159.94f, 57.67f, 148.41f, 42.4f)
                arcTo(88.19f, 88.19f, 0.0f, false, true, 215.63f, 120.0f)
                close()
                moveTo(96.23f, 136.0f)
                horizontalLineToRelative(63.54f)
                curveToRelative(-2.31f, 41.61f, -22.23f, 67.11f, -31.77f, 77.0f)
                curveTo(118.45f, 203.1f, 98.54f, 177.6f, 96.23f, 136.0f)
                close()
                moveTo(96.23f, 120.0f)
                curveTo(98.54f, 78.39f, 118.46f, 52.89f, 128.0f, 43.0f)
                curveToRelative(9.55f, 9.93f, 29.46f, 35.43f, 31.77f, 77.0f)
                close()
                moveTo(107.59f, 42.4f)
                curveTo(96.06f, 57.67f, 82.0f, 83.49f, 80.21f, 120.0f)
                lineTo(40.37f, 120.0f)
                arcTo(88.19f, 88.19f, 0.0f, false, true, 107.59f, 42.4f)
                close()
                moveTo(40.37f, 136.0f)
                lineTo(80.21f, 136.0f)
                curveToRelative(1.82f, 36.51f, 15.85f, 62.33f, 27.38f, 77.6f)
                arcTo(88.19f, 88.19f, 0.0f, false, true, 40.37f, 136.0f)
                close()
                moveTo(148.37f, 213.6f)
                curveToRelative(11.53f, -15.27f, 25.56f, -41.09f, 27.38f, -77.6f)
                horizontalLineToRelative(39.84f)
                arcTo(88.19f, 88.19f, 0.0f, false, true, 148.41f, 213.6f)
                close()
            }
        }
        .build()
        return `_globe-simple`!!
    }

private var `_globe-simple`: ImageVector? = null
