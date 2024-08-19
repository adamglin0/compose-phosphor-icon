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

public val ThinGroup.Cloudslash: ImageVector
    get() {
        if (_cloudslash != null) {
            return _cloudslash!!
        }
        _cloudslash = Builder(name = "Cloudslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(86.16f, 87.93f)
                quadToRelative(-1.38f, 2.55f, -2.59f, 5.19f)
                arcTo(60.0f, 60.0f, 0.0f, true, false, 72.0f, 212.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(83.19f, 83.19f, 0.0f, false, false, 32.88f, -6.69f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(160.0f, 204.0f)
                lineTo(72.0f, 204.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, -104.0f)
                arcToRelative(52.92f, 52.92f, 0.0f, false, true, 8.54f, 0.72f)
                arcTo(84.21f, 84.21f, 0.0f, false, false, 76.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 7.9f, -33.76f)
                lineTo(187.13f, 199.0f)
                arcTo(75.37f, 75.37f, 0.0f, false, true, 160.0f, 204.0f)
                close()
                moveTo(244.0f, 128.0f)
                arcToRelative(83.86f, 83.86f, 0.0f, false, true, -21.34f, 55.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.0f, -5.33f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 115.0f, 66.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.74f, -6.45f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 244.0f, 128.0f)
                close()
            }
        }
        .build()
        return _cloudslash!!
    }

private var _cloudslash: ImageVector? = null
