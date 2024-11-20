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

public val BoldGroup.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.29f, 182.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.47f, 4.12f)
                lineTo(140.0f, 149.19f)
                verticalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(149.19f)
                lineToRelative(-61.82f, 37.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.35f, -20.58f)
                lineTo(104.68f, 128.0f)
                lineTo(41.83f, 90.29f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 54.18f, 69.71f)
                lineTo(116.0f, 106.81f)
                verticalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(66.81f)
                lineToRelative(61.82f, -37.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.35f, 20.58f)
                lineTo(151.32f, 128.0f)
                lineToRelative(62.85f, 37.71f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 218.29f, 182.17f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
