package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.ThreeD: ImageVector
    get() {
        if (_threeD != null) {
            return _threeD!!
        }
        _threeD = Builder(name = "ThreeD", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.0f, 148.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.92f, -9.44f)
                lineTo(92.48f, 86.0f)
                lineTo(56.0f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.92f, 9.44f)
                lineTo(86.39f, 115.62f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, -34.68f, 56.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.58f, -8.39f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 98.0f, 148.0f)
                close()
                moveTo(160.0f, 74.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, 0.0f, 108.0f)
                lineTo(136.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(130.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                close()
                moveTo(160.0f, 86.0f)
                lineTo(142.0f, 86.0f)
                verticalLineToRelative(84.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 0.0f, -84.0f)
                close()
                moveTo(32.0f, 54.0f)
                lineTo(224.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(32.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(224.0f, 202.0f)
                lineTo(32.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(224.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _threeD!!
    }

private var _threeD: ImageVector? = null
