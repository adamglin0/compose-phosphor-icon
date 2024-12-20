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

public val BoldGroup.NumberFive: ImageVector
    get() {
        if (_numberFive != null) {
            return _numberFive!!
        }
        _numberFive = Builder(name = "NumberFive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 160.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 80.0f, 204.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.0f, -17.88f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.69f, -54.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.54f, -11.49f)
                lineTo(92.23f, 45.65f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 36.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(113.84f)
                lineToRelative(-8.36f, 41.79f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 180.0f, 160.0f)
                close()
            }
        }
        .build()
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
