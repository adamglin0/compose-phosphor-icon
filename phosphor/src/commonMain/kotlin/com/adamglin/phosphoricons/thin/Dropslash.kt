package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) {
            return _dropSlash!!
        }
        _dropSlash = Builder(name = "DropSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(69.81f, 69.93f)
                curveTo(52.7f, 94.85f, 44.0f, 119.75f, 44.0f, 144.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 145.32f, 57.4f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, -76.0f)
                curveToRelative(0.0f, -22.1f, 7.85f, -44.95f, 23.33f, -68.0f)
                lineTo(183.92f, 195.46f)
                arcTo(75.83f, 75.83f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(92.78f, 47.62f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.65f, 42.0f)
                arcToRelative(244.78f, 244.78f, 0.0f, false, true, 33.06f, -29.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.58f, 0.0f)
                arcTo(250.18f, 250.18f, 0.0f, false, true, 171.0f, 50.37f)
                curveToRelative(26.81f, 30.84f, 41.0f, 63.21f, 41.0f, 93.63f)
                arcToRelative(84.32f, 84.32f, 0.0f, false, true, -3.0f, 22.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.86f, 2.94f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, -1.06f, -0.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.8f, -4.92f)
                arcTo(75.89f, 75.89f, 0.0f, false, false, 204.0f, 144.0f)
                curveToRelative(0.0f, -62.29f, -63.08f, -113.25f, -76.0f, -123.0f)
                arcTo(251.38f, 251.38f, 0.0f, false, false, 98.44f, 47.48f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.78f, 47.62f)
                close()
            }
        }
        .build()
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
