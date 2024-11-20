package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                arcToRelative(15.74f, 15.74f, 0.0f, false, true, -7.6f, 13.51f)
                lineTo(88.32f, 229.65f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.2f, 0.3f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 64.0f, 216.13f)
                verticalLineTo(39.87f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, true, 8.12f, -13.82f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.2f, 0.3f)
                lineTo(232.4f, 114.49f)
                arcTo(15.74f, 15.74f, 0.0f, false, true, 240.0f, 128.0f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
