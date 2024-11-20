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

public val RegularGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.54f, 142.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -2.0f)
                arcToRelative(88.08f, 88.08f, 0.0f, false, true, -109.8f, -109.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, -10.0f)
                arcToRelative(104.84f, 104.84f, 0.0f, false, false, -52.91f, 37.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 136.0f, 224.0f)
                arcToRelative(103.09f, 103.09f, 0.0f, false, false, 62.52f, -20.88f)
                arcToRelative(104.84f, 104.84f, 0.0f, false, false, 37.0f, -52.91f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 233.54f, 142.23f)
                close()
                moveTo(188.9f, 190.34f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 65.66f, 67.11f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, true, 31.4f, -26.0f)
                arcTo(106.0f, 106.0f, 0.0f, false, false, 96.0f, 56.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 200.0f, 160.0f)
                arcToRelative(106.0f, 106.0f, 0.0f, false, false, 14.92f, -1.06f)
                arcTo(89.0f, 89.0f, 0.0f, false, true, 188.9f, 190.34f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
