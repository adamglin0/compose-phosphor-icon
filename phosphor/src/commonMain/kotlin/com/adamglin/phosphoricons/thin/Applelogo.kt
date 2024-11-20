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

public val ThinGroup.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) {
            return _appleLogo!!
        }
        _appleLogo = Builder(name = "AppleLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.27f, 169.49f)
                curveTo(199.86f, 156.84f, 196.0f, 135.6f, 196.0f, 120.0f)
                curveToRelative(0.0f, -19.17f, 14.25f, -35.53f, 22.75f, -43.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.81f)
                curveTo(207.0f, 59.48f, 186.59f, 52.0f, 168.0f, 52.0f)
                arcToRelative(68.3f, 68.3f, 0.0f, false, false, -40.0f, 13.0f)
                arcToRelative(67.61f, 67.61f, 0.0f, false, false, -87.88f, 7.0f)
                arcTo(70.65f, 70.65f, 0.0f, false, false, 20.0f, 123.3f)
                arcToRelative(123.11f, 123.11f, 0.0f, false, false, 38.9f, 86.92f)
                arcTo(35.81f, 35.81f, 0.0f, false, false, 83.6f, 220.0f)
                horizontalLineToRelative(87.7f)
                arcToRelative(35.84f, 35.84f, 0.0f, false, false, 26.19f, -11.3f)
                arcToRelative(119.93f, 119.93f, 0.0f, false, false, 17.24f, -23.79f)
                curveToRelative(6.08f, -11.1f, 5.42f, -12.62f, 4.94f, -13.72f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 218.27f, 169.49f)
                close()
                moveTo(191.63f, 203.26f)
                arcTo(27.83f, 27.83f, 0.0f, false, true, 171.3f, 212.0f)
                lineTo(83.6f, 212.0f)
                arcToRelative(27.84f, 27.84f, 0.0f, false, true, -19.19f, -7.6f)
                arcTo(115.15f, 115.15f, 0.0f, false, true, 28.0f, 123.09f)
                arcTo(62.55f, 62.55f, 0.0f, false, true, 45.81f, 77.66f)
                arcTo(58.78f, 58.78f, 0.0f, false, true, 88.0f, 60.0f)
                horizontalLineToRelative(0.84f)
                arcToRelative(59.37f, 59.37f, 0.0f, false, true, 36.66f, 13.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, 0.0f)
                arcTo(59.35f, 59.35f, 0.0f, false, true, 168.0f, 60.0f)
                curveToRelative(15.12f, 0.0f, 31.45f, 5.41f, 42.11f, 13.73f)
                curveTo(200.68f, 83.42f, 188.0f, 100.16f, 188.0f, 120.0f)
                curveToRelative(0.0f, 23.79f, 8.0f, 42.44f, 23.12f, 54.17f)
                arcTo(107.64f, 107.64f, 0.0f, false, true, 191.63f, 203.26f)
                close()
                moveTo(132.13f, 31.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 167.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -27.12f, 21.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 136.0f, 36.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.0f, -0.13f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 132.13f, 31.0f)
                close()
            }
        }
        .build()
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
