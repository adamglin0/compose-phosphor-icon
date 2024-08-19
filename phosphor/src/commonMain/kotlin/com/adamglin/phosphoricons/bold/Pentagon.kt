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

public val BoldGroup.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 84.38f)
                lineToRelative(-87.9f, -68.29f)
                lineToRelative(-0.26f, -0.2f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, -23.66f, 0.0f)
                lineToRelative(-0.26f, 0.2f)
                lineTo(28.0f, 84.38f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -7.09f, 22.0f)
                lineToRelative(32.0f, 107.51f)
                lineToRelative(0.08f, 0.26f)
                arcTo(19.93f, 19.93f, 0.0f, false, false, 72.0f, 228.0f)
                horizontalLineTo(184.0f)
                arcToRelative(19.93f, 19.93f, 0.0f, false, false, 19.0f, -13.87f)
                lineToRelative(0.08f, -0.26f)
                lineToRelative(32.0f, -107.51f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 228.0f, 84.38f)
                close()
                moveTo(181.0f, 204.0f)
                horizontalLineTo(75.0f)
                lineTo(44.62f, 101.87f)
                lineTo(128.0f, 37.09f)
                lineToRelative(83.38f, 64.78f)
                close()
            }
        }
        .build()
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
