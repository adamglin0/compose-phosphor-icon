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

public val BoldGroup.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) {
            return _circleHalf!!
        }
        _circleHalf = Builder(name = "CircleHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(140.0f, 44.87f)
                arcToRelative(83.53f, 83.53f, 0.0f, false, true, 24.0f, 7.25f)
                lineTo(164.0f, 203.88f)
                arcToRelative(83.53f, 83.53f, 0.0f, false, true, -24.0f, 7.25f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(84.12f, 84.12f, 0.0f, false, true, 72.0f, -83.13f)
                lineTo(116.0f, 211.13f)
                arcTo(84.12f, 84.12f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(188.0f, 186.71f)
                lineTo(188.0f, 69.29f)
                arcToRelative(83.81f, 83.81f, 0.0f, false, true, 0.0f, 117.42f)
                close()
            }
        }
        .build()
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
