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

public val ThinGroup.Drophalf: ImageVector
    get() {
        if (_drophalf != null) {
            return _drophalf!!
        }
        _drophalf = Builder(name = "Drophalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.0f, 50.37f)
                arcToRelative(250.18f, 250.18f, 0.0f, false, false, -40.73f, -37.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.58f, 0.0f)
                arcTo(250.18f, 250.18f, 0.0f, false, false, 85.0f, 50.37f)
                curveTo(58.17f, 81.21f, 44.0f, 113.58f, 44.0f, 144.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 113.58f, 197.83f, 81.21f, 171.0f, 50.37f)
                close()
                moveTo(204.0f, 144.0f)
                arcToRelative(75.41f, 75.41f, 0.0f, false, true, -1.0f, 12.0f)
                lineTo(132.0f, 156.0f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(71.21f)
                arcTo(93.38f, 93.38f, 0.0f, false, true, 204.0f, 144.0f)
                close()
                moveTo(190.14f, 92.0f)
                lineTo(132.0f, 92.0f)
                lineTo(132.0f, 68.0f)
                horizontalLineToRelative(43.0f)
                arcTo(176.56f, 176.56f, 0.0f, false, true, 190.14f, 92.0f)
                close()
                moveTo(132.0f, 164.0f)
                horizontalLineToRelative(69.31f)
                arcToRelative(75.63f, 75.63f, 0.0f, false, true, -11.4f, 24.0f)
                lineTo(132.0f, 188.0f)
                close()
                moveTo(132.0f, 124.0f)
                lineTo(132.0f, 100.0f)
                horizontalLineToRelative(62.0f)
                arcToRelative(120.07f, 120.07f, 0.0f, false, true, 7.88f, 24.0f)
                close()
                moveTo(165.1f, 55.77f)
                quadToRelative(1.77f, 2.0f, 3.59f, 4.23f)
                lineTo(132.0f, 60.0f)
                lineTo(132.0f, 24.07f)
                arcTo(256.44f, 256.44f, 0.0f, false, true, 165.1f, 55.77f)
                close()
                moveTo(52.0f, 144.0f)
                curveToRelative(0.0f, -35.9f, 21.15f, -67.8f, 38.9f, -88.23f)
                arcTo(256.44f, 256.44f, 0.0f, false, true, 124.0f, 24.07f)
                lineTo(124.0f, 219.89f)
                arcTo(76.09f, 76.09f, 0.0f, false, true, 52.0f, 144.0f)
                close()
                moveTo(132.0f, 219.89f)
                lineTo(132.0f, 196.0f)
                horizontalLineToRelative(51.35f)
                arcTo(75.79f, 75.79f, 0.0f, false, true, 132.0f, 219.89f)
                close()
            }
        }
        .build()
        return _drophalf!!
    }

private var _drophalf: ImageVector? = null
