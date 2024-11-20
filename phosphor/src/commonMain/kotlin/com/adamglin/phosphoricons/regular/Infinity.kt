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

public val RegularGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -95.6f, 39.6f)
                lineToRelative(-0.33f, -0.35f)
                lineTo(92.12f, 99.55f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 56.9f)
                lineToRelative(8.52f, -9.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.0f, 10.61f)
                lineToRelative(-8.69f, 9.81f)
                lineToRelative(-0.33f, 0.35f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -79.2f)
                lineToRelative(0.33f, 0.35f)
                lineToRelative(59.95f, 67.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -56.9f)
                lineToRelative(-8.52f, 9.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.0f, -10.61f)
                lineToRelative(8.69f, -9.81f)
                lineToRelative(0.33f, -0.35f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 248.0f, 128.0f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
