package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.NumberSquareTwo: ImageVector
    get() {
        if (_numberSquareTwo != null) {
            return _numberSquareTwo!!
        }
        _numberSquareTwo = Builder(name = "NumberSquareTwo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(156.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(104.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -6.4f)
                lineTo(144.0f, 116.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 140.0f, 88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 112.0f, 92.0f)
                arcToRelative(20.23f, 20.23f, 0.0f, false, false, -2.89f, 5.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.55f, -2.66f)
                arcToRelative(28.34f, 28.34f, 0.0f, false, true, 4.0f, -7.52f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 44.72f, 33.7f)
                lineTo(112.0f, 172.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 176.0f)
                close()
            }
        }
        .build()
        return _numberSquareTwo!!
    }

private var _numberSquareTwo: ImageVector? = null
