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

public val FillGroup.NumberFive: ImageVector
    get() {
        if (_numberFive != null) {
            return _numberFive!!
        }
        _numberFive = Builder(name = "NumberFive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(124.0f, 104.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -34.22f, 71.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.44f, -10.06f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 0.35f, -35.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.0f, -6.29f)
                lineToRelative(7.55f, -52.82f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 64.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(110.94f, 80.0f)
                lineTo(107.0f, 107.4f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 124.0f, 104.0f)
                close()
            }
        }
        .build()
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
