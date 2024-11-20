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

public val LightGroup.Bathtub: ImageVector
    get() {
        if (_bathtub != null) {
            return _bathtub!!
        }
        _bathtub = Builder(name = "Bathtub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 98.0f)
                lineTo(206.0f, 98.0f)
                lineTo(206.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(136.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(2.0f)
                lineTo(62.0f, 98.0f)
                lineTo(62.0f, 52.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 76.0f, 38.0f)
                arcTo(14.47f, 14.47f, 0.0f, false, true, 90.12f, 49.19f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.76f, -2.38f)
                arcTo(26.32f, 26.32f, 0.0f, false, false, 76.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 50.0f, 52.0f)
                lineTo(50.0f, 98.0f)
                lineTo(16.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, 54.0f, 54.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(78.0f, 198.0f)
                lineTo(178.0f, 198.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(190.0f, 198.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, 54.0f, -54.0f)
                lineTo(246.0f, 104.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 240.0f, 98.0f)
                close()
                moveTo(142.0f, 102.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(36.0f)
                lineTo(142.0f, 138.0f)
                close()
                moveTo(234.0f, 144.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f)
                lineTo(64.0f, 186.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, -42.0f)
                lineTo(22.0f, 110.0f)
                lineTo(130.0f, 110.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(206.0f, 110.0f)
                horizontalLineToRelative(28.0f)
                close()
            }
        }
        .build()
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
