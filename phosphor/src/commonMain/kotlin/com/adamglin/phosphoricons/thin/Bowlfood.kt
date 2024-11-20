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

public val ThinGroup.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) {
            return _bowlFood!!
        }
        _bowlFood = Builder(name = "BowlFood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 108.0f)
                lineTo(211.9f, 108.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -167.8f, 0.0f)
                lineTo(32.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(100.32f, 100.32f, 0.0f, false, false, 56.0f, 89.82f)
                lineTo(84.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineToRelative(-6.18f)
                arcTo(100.32f, 100.32f, 0.0f, false, false, 228.0f, 112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 108.0f)
                close()
                moveTo(203.89f, 108.0f)
                lineTo(141.05f, 108.0f)
                arcToRelative(75.92f, 75.92f, 0.0f, false, true, 50.16f, -38.14f)
                arcTo(75.45f, 75.45f, 0.0f, false, true, 203.89f, 108.0f)
                close()
                moveTo(186.0f, 62.93f)
                arcTo(83.92f, 83.92f, 0.0f, false, false, 132.08f, 108.0f)
                lineTo(94.68f, 108.0f)
                arcTo(76.22f, 76.22f, 0.0f, false, true, 168.0f, 52.0f)
                curveToRelative(2.33f, 0.0f, 4.68f, 0.13f, 7.0f, 0.34f)
                arcTo(76.81f, 76.81f, 0.0f, false, true, 186.0f, 62.93f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(75.48f, 75.48f, 0.0f, false, true, 34.3f, 8.21f)
                arcTo(84.26f, 84.26f, 0.0f, false, false, 86.41f, 108.0f)
                lineTo(52.11f, 108.0f)
                arcTo(76.09f, 76.09f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(166.33f, 195.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 199.3f)
                lineTo(164.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineToRelative(-8.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.33f, -3.64f)
                arcTo(92.33f, 92.33f, 0.0f, false, true, 36.09f, 116.0f)
                lineTo(219.91f, 116.0f)
                arcTo(92.33f, 92.33f, 0.0f, false, true, 166.33f, 195.66f)
                close()
            }
        }
        .build()
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
