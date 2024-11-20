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

public val RegularGroup.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.0f, 50.25f)
                arcTo(87.46f, 87.46f, 0.0f, false, false, 144.6f, 24.0f)
                horizontalLineToRelative(-0.33f)
                arcTo(87.48f, 87.48f, 0.0f, false, false, 82.0f, 49.81f)
                lineTo(20.61f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.06f, 22.56f)
                lineToRelative(28.66f, 28.66f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, 11.32f, 4.69f)
                horizontalLineToRelative(0.09f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.36f, -4.82f)
                lineTo(133.0f, 100.69f)
                arcToRelative(16.08f, 16.08f, 0.0f, false, true, 22.41f, -0.21f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 4.73f, 11.19f)
                arcToRelative(16.89f, 16.89f, 0.0f, false, true, -4.85f, 12.0f)
                lineTo(93.0f, 183.88f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.17f, 22.79f)
                lineToRelative(28.66f, 28.66f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, false, 22.52f, 0.12f)
                lineTo(205.81f, 175.0f)
                curveTo(240.26f, 140.5f, 240.79f, 84.56f, 207.0f, 50.25f)
                close()
                moveTo(60.65f, 151.89f)
                lineTo(32.0f, 123.24f)
                lineTo(55.8f, 99.12f)
                lineToRelative(28.52f, 28.52f)
                close()
                moveTo(132.79f, 224.0f)
                lineToRelative(-28.68f, -28.65f)
                lineToRelative(24.38f, -23.57f)
                lineTo(157.0f, 200.32f)
                close()
                moveTo(194.55f, 163.56f)
                lineTo(168.44f, 189.1f)
                lineTo(140.0f, 160.68f)
                lineToRelative(26.44f, -25.57f)
                lineToRelative(0.1f, -0.09f)
                arcToRelative(33.0f, 33.0f, 0.0f, false, false, 9.57f, -23.5f)
                arcTo(31.44f, 31.44f, 0.0f, false, false, 166.47f, 89.0f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, -44.9f, 0.5f)
                lineTo(95.49f, 116.18f)
                lineTo(67.0f, 87.74f)
                lineTo(93.35f, 61.09f)
                arcTo(71.51f, 71.51f, 0.0f, false, true, 144.27f, 40.0f)
                horizontalLineToRelative(0.27f)
                arcToRelative(71.55f, 71.55f, 0.0f, false, true, 51.05f, 21.48f)
                curveTo(223.25f, 89.55f, 222.75f, 135.38f, 194.55f, 163.58f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
