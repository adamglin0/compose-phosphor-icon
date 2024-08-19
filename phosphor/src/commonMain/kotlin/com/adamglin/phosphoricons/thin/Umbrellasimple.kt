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

public val ThinGroup.Umbrellasimple: ImageVector
    get() {
        if (_umbrellasimple != null) {
            return _umbrellasimple!!
        }
        _umbrellasimple = Builder(name = "Umbrellasimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 127.0f)
                arcTo(108.44f, 108.44f, 0.0f, false, false, 54.46f, 56.69f)
                arcTo(107.53f, 107.53f, 0.0f, false, false, 20.0f, 127.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 13.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineTo(132.0f, 140.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -13.0f)
                close()
                moveTo(227.0f, 130.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 1.3f)
                lineTo(32.0f, 132.04f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.38f)
                arcToRelative(100.43f, 100.43f, 0.0f, false, true, 168.1f, -65.0f)
                arcToRelative(99.53f, 99.53f, 0.0f, false, true, 31.88f, 65.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.93f, 130.7f)
                close()
            }
        }
        .build()
        return _umbrellasimple!!
    }

private var _umbrellasimple: ImageVector? = null
