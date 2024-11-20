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

public val RegularGroup.NumberFive: ImageVector
    get() {
        if (_numberFive != null) {
            return _numberFive!!
        }
        _numberFive = Builder(name = "NumberFive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 160.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -93.33f, 41.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.66f, -11.92f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.77f, -60.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.0f, -7.66f)
                lineTo(96.16f, 46.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 40.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(110.56f)
                lineToRelative(-10.32f, 51.6f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 176.0f, 160.0f)
                close()
            }
        }
        .build()
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
