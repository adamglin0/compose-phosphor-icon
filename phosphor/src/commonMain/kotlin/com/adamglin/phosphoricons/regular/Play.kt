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

public val RegularGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.4f, 114.49f)
                lineTo(88.32f, 26.35f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.2f, -0.3f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 64.0f, 39.87f)
                verticalLineTo(216.13f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 80.0f, 232.0f)
                arcToRelative(16.07f, 16.07f, 0.0f, false, false, 8.36f, -2.35f)
                lineTo(232.4f, 141.51f)
                arcToRelative(15.81f, 15.81f, 0.0f, false, false, 0.0f, -27.0f)
                close()
                moveTo(80.0f, 215.94f)
                verticalLineTo(40.0f)
                lineToRelative(143.83f, 88.0f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
