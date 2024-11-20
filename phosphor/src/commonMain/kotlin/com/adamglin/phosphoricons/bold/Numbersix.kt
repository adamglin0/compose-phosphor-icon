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

public val BoldGroup.NumberSix: ImageVector
    get() {
        if (_numberSix != null) {
            return _numberSix!!
        }
        _numberSix = Builder(name = "NumberSix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 100.0f)
                arcToRelative(59.21f, 59.21f, 0.0f, false, false, -7.81f, 0.53f)
                lineToRelative(26.27f, -46.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.92f, -11.78f)
                lineTo(76.0f, 130.13f)
                arcTo(60.0f, 60.0f, 0.0f, true, false, 128.0f, 100.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 196.0f)
                close()
            }
        }
        .build()
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
