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

public val FillGroup.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) {
            return _numberTwo!!
        }
        _numberTwo = Builder(name = "NumberTwo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                horizontalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(160.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.79f, -13.52f)
                lineTo(145.9f, 120.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -35.73f, -32.0f)
                arcTo(23.33f, 23.33f, 0.0f, false, false, 107.0f, 92.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.0f, -7.77f)
                arcToRelative(40.22f, 40.22f, 0.0f, false, true, 5.28f, -7.38f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 59.45f, 53.54f)
                lineToRelative(-0.16f, 0.16f)
                lineTo(114.66f, 176.0f)
                close()
            }
        }
        .build()
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
