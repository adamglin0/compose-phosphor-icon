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

public val RegularGroup.Televisionsimple: ImageVector
    get() {
        if (_televisionsimple != null) {
            return _televisionsimple!!
        }
        _televisionsimple = Builder(name = "Televisionsimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 64.0f)
                lineTo(147.31f, 64.0f)
                lineToRelative(34.35f, -34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.32f, -11.32f)
                lineTo(128.0f, 60.69f)
                lineTo(85.66f, 18.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 74.34f, 29.66f)
                lineTo(108.69f, 64.0f)
                lineTo(40.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 64.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 80.0f)
                lineTo(216.0f, 80.0f)
                lineTo(216.0f, 200.0f)
                close()
            }
        }
        .build()
        return _televisionsimple!!
    }

private var _televisionsimple: ImageVector? = null
