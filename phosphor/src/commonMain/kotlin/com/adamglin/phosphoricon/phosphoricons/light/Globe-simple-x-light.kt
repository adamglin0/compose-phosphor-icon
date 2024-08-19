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

public val LightGroup.`Globe-simple-x-light`: ImageVector
    get() {
        if (`_globe-simple-x-light` != null) {
            return `_globe-simple-x-light`!!
        }
        `_globe-simple-x-light` = Builder(name = "Globe-simple-x-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.24f, 172.24f)
                lineTo(200.49f, 192.0f)
                lineToRelative(19.75f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(192.0f, 200.49f)
                lineToRelative(-19.76f, 19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(183.51f, 192.0f)
                lineToRelative(-19.75f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(192.0f, 183.51f)
                lineToRelative(19.76f, -19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                close()
                moveTo(230.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(94.13f, 134.0f)
                arcToRelative(128.29f, 128.29f, 0.0f, false, false, 18.68f, 62.37f)
                curveToRelative(9.35f, 15.11f, 18.85f, 22.88f, 18.95f, 22.95f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 128.0f, 230.0f)
                horizontalLineToRelative(0.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 230.0f, 128.0f)
                close()
                moveTo(143.46f, 39.33f)
                curveToRelative(11.95f, 14.44f, 28.89f, 41.9f, 30.43f, 82.67f)
                lineTo(217.8f, 122.0f)
                arcTo(90.19f, 90.19f, 0.0f, false, false, 143.46f, 39.33f)
                close()
                moveTo(112.81f, 59.63f)
                arcTo(128.29f, 128.29f, 0.0f, false, false, 94.13f, 122.0f)
                horizontalLineToRelative(67.74f)
                arcToRelative(128.29f, 128.29f, 0.0f, false, false, -18.68f, -62.37f)
                arcTo(109.19f, 109.19f, 0.0f, false, false, 128.0f, 40.18f)
                arcTo(109.19f, 109.19f, 0.0f, false, false, 112.81f, 59.63f)
                close()
                moveTo(38.2f, 122.0f)
                lineTo(82.11f, 122.0f)
                curveToRelative(1.54f, -40.77f, 18.48f, -68.23f, 30.43f, -82.67f)
                arcTo(90.19f, 90.19f, 0.0f, false, false, 38.2f, 122.0f)
                close()
                moveTo(82.11f, 134.0f)
                lineTo(38.2f, 134.0f)
                arcToRelative(90.19f, 90.19f, 0.0f, false, false, 74.34f, 82.67f)
                curveTo(100.59f, 202.23f, 83.65f, 174.77f, 82.11f, 134.0f)
                close()
            }
        }
        .build()
        return `_globe-simple-x-light`!!
    }

private var `_globe-simple-x-light`: ImageVector? = null
