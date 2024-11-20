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

public val BoldGroup.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) {
            return _numberTwo!!
        }
        _numberTwo = Builder(name = "NumberTwo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.6f, -19.2f)
                lineToRelative(71.95f, -95.92f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -48.0f, -28.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.0f, -9.62f)
                arcToRelative(52.32f, 52.32f, 0.0f, false, true, 6.13f, -10.49f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 83.06f, 62.59f)
                lineTo(112.0f, 196.0f)
                horizontalLineToRelative(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 208.0f)
                close()
            }
        }
        .build()
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
