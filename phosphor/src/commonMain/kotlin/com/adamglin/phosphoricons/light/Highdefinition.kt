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

public val LightGroup.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) {
            return _highDefinition!!
        }
        _highDefinition = Builder(name = "HighDefinition", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 74.0f)
                lineTo(152.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 0.0f, -108.0f)
                close()
                moveTo(176.0f, 170.0f)
                lineTo(158.0f, 170.0f)
                lineTo(158.0f, 86.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 0.0f, 84.0f)
                close()
                moveTo(114.0f, 176.0f)
                lineTo(114.0f, 134.0f)
                lineTo(54.0f, 134.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(42.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(42.0f)
                horizontalLineToRelative(60.0f)
                lineTo(114.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(26.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(224.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(32.0f, 54.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 26.0f, 48.0f)
                close()
                moveTo(230.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(32.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(224.0f, 202.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 208.0f)
                close()
            }
        }
        .build()
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
