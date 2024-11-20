package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.FileTs: ImageVector
    get() {
        if (_fileTs != null) {
            return _fileTs!!
        }
        _fileTs = Builder(name = "FileTs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.66f, 82.34f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(164.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(168.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f)
                close()
                moveTo(152.0f, 88.0f)
                lineTo(152.0f, 44.0f)
                lineToRelative(44.0f, 44.0f)
                close()
                moveTo(147.81f, 196.31f)
                arcToRelative(20.82f, 20.82f, 0.0f, false, true, -9.19f, 15.23f)
                curveTo(133.43f, 215.0f, 127.0f, 216.0f, 121.13f, 216.0f)
                arcTo(61.14f, 61.14f, 0.0f, false, true, 106.0f, 214.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.3f, -15.41f)
                curveToRelative(4.38f, 1.2f, 15.0f, 2.7f, 19.55f, -0.36f)
                curveToRelative(0.88f, -0.59f, 1.83f, -1.52f, 2.14f, -3.93f)
                curveToRelative(0.35f, -2.67f, -0.71f, -4.1f, -12.78f, -7.59f)
                curveToRelative(-9.35f, -2.7f, -25.0f, -7.23f, -23.0f, -23.11f)
                arcToRelative(20.56f, 20.56f, 0.0f, false, true, 9.0f, -14.95f)
                curveToRelative(11.84f, -8.0f, 30.71f, -3.31f, 32.83f, -2.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.07f, 15.48f)
                curveToRelative(-4.49f, -1.17f, -15.23f, -2.56f, -19.83f, 0.56f)
                arcToRelative(4.54f, 4.54f, 0.0f, false, false, -2.0f, 3.67f)
                curveToRelative(-0.12f, 0.9f, -0.14f, 1.09f, 1.11f, 1.9f)
                curveToRelative(2.31f, 1.49f, 6.45f, 2.68f, 10.45f, 3.84f)
                curveTo(133.49f, 174.17f, 150.05f, 179.0f, 147.81f, 196.31f)
                close()
                moveTo(88.0f, 152.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 79.73f, 160.0f)
                lineTo(68.0f, 160.0f)
                verticalLineToRelative(47.73f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 60.53f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 52.0f, 208.0f)
                lineTo(52.0f, 160.0f)
                lineTo(40.27f, 160.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 32.0f, 152.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 144.0f)
                lineTo(80.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 152.53f)
                close()
            }
        }
        .build()
        return _fileTs!!
    }

private var _fileTs: ImageVector? = null
