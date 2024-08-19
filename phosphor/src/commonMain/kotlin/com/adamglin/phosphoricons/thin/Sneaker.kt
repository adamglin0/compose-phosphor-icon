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

public val ThinGroup.Sneaker: ImageVector
    get() {
        if (_sneaker != null) {
            return _sneaker!!
        }
        _sneaker = Builder(name = "Sneaker", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.38f, 132.91f)
                lineToRelative(-60.72f, -20.24f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 150.0f, 97.53f)
                lineTo(126.69f, 43.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.07f, -6.4f)
                lineTo(35.9f, 64.25f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 75.53f)
                verticalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(167.06f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 227.38f, 132.91f)
                close()
                moveTo(38.63f, 71.77f)
                lineToRelative(75.72f, -27.53f)
                arcToRelative(3.84f, 3.84f, 0.0f, false, true, 1.37f, -0.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.63f, 2.32f)
                lineTo(128.17f, 67.0f)
                lineToRelative(-25.54f, 9.29f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 84.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 1.37f, -0.24f)
                lineToRelative(25.95f, -9.44f)
                lineToRelative(7.89f, 18.44f)
                lineToRelative(-20.58f, 7.48f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 120.0f, 108.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 1.37f, -0.24f)
                lineToRelative(21.0f, -7.64f)
                lineToRelative(0.25f, 0.6f)
                arcToRelative(36.11f, 36.11f, 0.0f, false, false, 13.52f, 15.7f)
                lineToRelative(-21.5f, 7.82f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 136.0f, 132.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 1.37f, -0.24f)
                lineToRelative(29.3f, -10.66f)
                lineToRelative(58.18f, 19.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 19.0f, 23.5f)
                horizontalLineTo(36.0f)
                verticalLineTo(75.53f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 38.63f, 71.77f)
                close()
                moveTo(240.0f, 196.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(172.0f)
                horizontalLineTo(244.0f)
                verticalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 240.0f, 196.0f)
                close()
            }
        }
        .build()
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
