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

public val ThinGroup.Unitesquare: ImageVector
    get() {
        if (_unitesquare != null) {
            return _unitesquare!!
        }
        _unitesquare = Builder(name = "Unitesquare", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 92.0f)
                lineTo(164.0f, 92.0f)
                lineTo(164.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(40.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(92.0f, 164.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(220.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 92.0f)
                close()
                moveTo(153.66f, 212.0f)
                lineTo(44.0f, 102.34f)
                lineTo(44.0f, 49.66f)
                lineTo(206.34f, 212.0f)
                close()
                moveTo(49.66f, 44.0f)
                horizontalLineToRelative(52.68f)
                lineTo(212.0f, 153.66f)
                verticalLineToRelative(52.68f)
                close()
                moveTo(212.0f, 142.34f)
                lineTo(169.66f, 100.0f)
                lineTo(212.0f, 100.0f)
                close()
                moveTo(156.0f, 86.34f)
                lineTo(113.66f, 44.0f)
                lineTo(156.0f, 44.0f)
                close()
                moveTo(44.0f, 113.66f)
                lineTo(86.34f, 156.0f)
                lineTo(44.0f, 156.0f)
                close()
                moveTo(100.0f, 169.66f)
                lineTo(142.34f, 212.0f)
                lineTo(100.0f, 212.0f)
                close()
            }
        }
        .build()
        return _unitesquare!!
    }

private var _unitesquare: ImageVector? = null
