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

public val FillGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(204.28f, 156.28f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -56.4f, 0.17f)
                lineTo(97.29f, 111.34f)
                lineTo(97.0f, 111.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 97.0f, 145.0f)
                curveToRelative(0.36f, -0.36f, 0.71f, -0.73f, 1.0f, -1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.0f, 10.6f)
                curveToRelative(-0.55f, 0.62f, -1.13f, 1.23f, -1.71f, 1.81f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -0.17f, -56.73f)
                lineToRelative(50.58f, 45.11f)
                lineToRelative(0.33f, 0.31f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 159.0f, 111.0f)
                curveToRelative(-0.36f, 0.36f, -0.7f, 0.72f, -1.0f, 1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.0f, -10.59f)
                curveToRelative(0.54f, -0.62f, 1.12f, -1.24f, 1.71f, -1.82f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 56.57f, 56.56f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
