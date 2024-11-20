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

public val BoldGroup.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.84f, 47.44f)
                arcTo(91.42f, 91.42f, 0.0f, false, false, 144.62f, 20.0f)
                horizontalLineToRelative(-0.35f)
                arcTo(91.44f, 91.44f, 0.0f, false, false, 79.15f, 47.0f)
                lineTo(17.76f, 109.17f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.08f, 28.21f)
                lineTo(46.5f, 166.0f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 14.15f, 5.86f)
                horizontalLineToRelative(0.11f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.2f, -6.0f)
                lineToRelative(60.87f, -62.39f)
                arcToRelative(12.07f, 12.07f, 0.0f, false, true, 16.77f, -0.12f)
                arcToRelative(11.63f, 11.63f, 0.0f, false, true, 3.5f, 8.35f)
                arcToRelative(12.85f, 12.85f, 0.0f, false, true, -3.66f, 9.11f)
                lineTo(90.19f, 181.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.21f, 28.5f)
                lineToRelative(28.66f, 28.66f)
                arcToRelative(20.08f, 20.08f, 0.0f, false, false, 28.15f, 0.14f)
                lineToRelative(61.76f, -60.44f)
                lineToRelative(0.09f, -0.09f)
                curveTo(244.65f, 141.78f, 245.18f, 83.31f, 209.84f, 47.44f)
                close()
                moveTo(60.62f, 146.21f)
                lineToRelative(-23.0f, -23.0f)
                lineTo(55.81f, 104.8f)
                lineToRelative(22.88f, 22.88f)
                close()
                moveTo(132.82f, 218.39f)
                lineTo(109.82f, 195.39f)
                lineTo(128.43f, 177.39f)
                lineTo(151.31f, 200.26f)
                close()
                moveTo(191.71f, 160.77f)
                lineTo(168.48f, 183.5f)
                lineTo(145.7f, 160.73f)
                lineTo(169.21f, 138.0f)
                lineToRelative(0.15f, -0.14f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, false, 10.74f, -26.37f)
                arcToRelative(35.44f, 35.44f, 0.0f, false, false, -10.85f, -25.41f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, -50.44f, 0.48f)
                lineToRelative(-0.1f, 0.11f)
                lineTo(95.46f, 110.49f)
                lineTo(72.68f, 87.72f)
                lineToRelative(23.5f, -23.8f)
                arcTo(67.55f, 67.55f, 0.0f, false, true, 144.27f, 44.0f)
                horizontalLineToRelative(0.26f)
                arcToRelative(67.62f, 67.62f, 0.0f, false, true, 48.21f, 20.29f)
                curveTo(218.85f, 90.78f, 218.38f, 134.05f, 191.71f, 160.77f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
