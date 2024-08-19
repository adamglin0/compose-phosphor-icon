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

public val LightGroup.`Globe-simple-light`: ImageVector
    get() {
        if (`_globe-simple-light` != null) {
            return `_globe-simple-light`!!
        }
        `_globe-simple-light` = Builder(name = "Globe-simple-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(217.8f, 122.0f)
                lineTo(173.89f, 122.0f)
                curveToRelative(-1.54f, -40.77f, -18.48f, -68.23f, -30.43f, -82.67f)
                arcTo(90.19f, 90.19f, 0.0f, false, true, 217.8f, 122.0f)
                close()
                moveTo(128.0f, 215.83f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, -15.19f, -19.45f)
                arcTo(128.37f, 128.37f, 0.0f, false, true, 94.13f, 134.0f)
                horizontalLineToRelative(67.74f)
                arcToRelative(128.37f, 128.37f, 0.0f, false, true, -18.68f, 62.38f)
                arcTo(110.0f, 110.0f, 0.0f, false, true, 128.0f, 215.83f)
                close()
                moveTo(94.13f, 122.0f)
                arcToRelative(128.37f, 128.37f, 0.0f, false, true, 18.68f, -62.38f)
                arcTo(110.0f, 110.0f, 0.0f, false, true, 128.0f, 40.17f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, 15.19f, 19.45f)
                arcTo(128.37f, 128.37f, 0.0f, false, true, 161.87f, 122.0f)
                close()
                moveTo(112.54f, 39.33f)
                curveToRelative(-12.0f, 14.44f, -28.89f, 41.9f, -30.43f, 82.67f)
                lineTo(38.2f, 122.0f)
                arcTo(90.19f, 90.19f, 0.0f, false, true, 112.54f, 39.33f)
                close()
                moveTo(38.2f, 134.0f)
                lineTo(82.11f, 134.0f)
                curveToRelative(1.54f, 40.77f, 18.48f, 68.23f, 30.43f, 82.67f)
                arcTo(90.19f, 90.19f, 0.0f, false, true, 38.2f, 134.0f)
                close()
                moveTo(143.46f, 216.67f)
                curveToRelative(11.95f, -14.44f, 28.89f, -41.9f, 30.43f, -82.67f)
                lineTo(217.8f, 134.0f)
                arcTo(90.19f, 90.19f, 0.0f, false, true, 143.46f, 216.67f)
                close()
            }
        }
        .build()
        return `_globe-simple-light`!!
    }

private var `_globe-simple-light`: ImageVector? = null
