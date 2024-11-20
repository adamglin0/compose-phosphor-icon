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

public val RegularGroup.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(204.94f)
                lineToRelative(-37.78f, 75.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 216.0f)
                horizontalLineToRelative(-0.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.08f, -5.14f)
                lineTo(95.35f, 60.76f)
                lineTo(63.28f, 131.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 136.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(50.85f)
                lineTo(88.72f, 36.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.76f, 0.46f)
                lineToRelative(57.51f, 151.0f)
                lineToRelative(31.85f, -63.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 120.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 128.0f)
                close()
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
