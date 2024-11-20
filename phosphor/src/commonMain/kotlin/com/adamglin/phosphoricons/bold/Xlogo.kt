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

public val BoldGroup.XLogo: ImageVector
    get() {
        if (_xLogo != null) {
            return _xLogo!!
        }
        _xLogo = Builder(name = "XLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.12f, 209.56f)
                lineToRelative(-61.0f, -95.8f)
                lineToRelative(59.72f, -65.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.76f, -16.14f)
                lineTo(143.81f, 92.77f)
                lineTo(106.12f, 33.56f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 28.0f)
                horizontalLineTo(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 37.88f, 46.44f)
                lineToRelative(61.0f, 95.8f)
                lineTo(39.12f, 207.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.76f, 16.14f)
                lineToRelative(55.31f, -60.84f)
                lineToRelative(37.69f, 59.21f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 228.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.12f, -18.44f)
                close()
                moveTo(166.59f, 204.0f)
                lineTo(69.86f, 52.0f)
                horizontalLineTo(89.41f)
                lineToRelative(96.73f, 152.0f)
                close()
            }
        }
        .build()
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
