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

public val ThinGroup.Thumbsup: ImageVector
    get() {
        if (_thumbsup != null) {
            return _thumbsup!!
        }
        _thumbsup = Builder(name = "Thumbsup", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.0f, 82.76f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 76.0f)
                horizontalLineTo(156.0f)
                verticalLineTo(56.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 2.21f)
                lineTo(77.53f, 100.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.85f, -17.52f)
                lineToRelative(12.0f, -96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 231.0f, 82.76f)
                close()
                moveTo(76.0f, 204.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(76.0f)
                close()
                moveTo(227.91f, 97.49f)
                lineToRelative(-12.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 204.0f)
                horizontalLineTo(84.0f)
                verticalLineTo(104.94f)
                lineTo(122.42f, 28.1f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 148.0f, 56.0f)
                verticalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.91f, 13.49f)
                close()
            }
        }
        .build()
        return _thumbsup!!
    }

private var _thumbsup: ImageVector? = null
