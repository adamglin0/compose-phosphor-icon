package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.73f, 113.13f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 159.82f, 102.0f)
                lineTo(227.48f, 55.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.0f, 13.21f)
                lineToRelative(-67.67f, 46.3f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, -4.51f, 1.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 157.73f, 113.13f)
                close()
                moveTo(238.6f, 198.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.12f, 2.08f)
                lineTo(136.0f, 137.7f)
                lineTo(93.49f, 166.78f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -9.0f, -13.19f)
                lineTo(121.83f, 128.0f)
                lineTo(84.44f, 102.41f)
                arcToRelative(35.86f, 35.86f, 0.0f, true, true, 9.0f, -13.19f)
                lineToRelative(143.0f, 97.87f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 238.6f, 198.22f)
                close()
                moveTo(80.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -5.86f, 14.14f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 80.0f, 180.0f)
                close()
                moveTo(74.14f, 90.13f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -28.28f, 0.0f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 74.14f, 90.13f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
