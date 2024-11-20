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

public val RegularGroup.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) {
            return _numberSquareTwo!!
        }
        _numberSquareTwo = Builder(name = "NumberSquareTwo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 48.0f)
                lineTo(208.0f, 48.0f)
                lineTo(208.0f, 208.0f)
                close()
                moveTo(160.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(104.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f)
                lineToRelative(43.17f, -57.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -27.86f, -15.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.09f, -5.34f)
                arcToRelative(32.43f, 32.43f, 0.0f, false, true, 4.62f, -8.59f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 51.11f, 38.52f)
                lineTo(120.0f, 168.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 176.0f)
                close()
            }
        }
        .build()
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
