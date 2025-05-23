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

public val RegularGroup.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = Builder(name = "Avocado", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 112.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 128.0f, 112.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 192.0f)
                close()
                moveTo(211.0f, 130.66f)
                lineTo(181.2f, 46.47f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -106.0f, -1.14f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-29.51f, 83.5f)
                arcTo(88.0f, 88.0f, 0.0f, true, false, 211.0f, 130.66f)
                close()
                moveTo(128.0f, 232.0f)
                arcToRelative(72.05f, 72.05f, 0.0f, false, true, -67.33f, -97.57f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, true, 0.07f, -0.18f)
                lineTo(90.28f, 50.66f)
                horizontalLineToRelative(0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 75.74f, 0.88f)
                lineToRelative(0.06f, 0.18f)
                lineTo(195.9f, 136.0f)
                arcTo(72.05f, 72.05f, 0.0f, false, true, 128.0f, 232.0f)
                close()
            }
        }
        .build()
        return _avocado!!
    }

private var _avocado: ImageVector? = null
