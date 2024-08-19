package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Paperplaneright: ImageVector
    get() {
        if (_paperplaneright != null) {
            return _paperplaneright!!
        }
        _paperplaneright = Builder(name = "Paperplaneright", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.86f, 110.48f)
                lineTo(65.8f, 14.58f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 37.15f, 38.64f)
                lineTo(67.33f, 128.0f)
                lineTo(37.15f, 217.36f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 244.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 9.81f, -2.58f)
                lineToRelative(0.09f, -0.06f)
                lineToRelative(168.0f, -96.07f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -34.81f)
                close()
                moveTo(63.19f, 215.26f)
                lineTo(88.61f, 140.0f)
                horizontalLineTo(144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(88.61f)
                lineTo(63.18f, 40.72f)
                lineToRelative(152.76f, 87.17f)
                close()
            }
        }
        .build()
        return _paperplaneright!!
    }

private var _paperplaneright: ImageVector? = null
