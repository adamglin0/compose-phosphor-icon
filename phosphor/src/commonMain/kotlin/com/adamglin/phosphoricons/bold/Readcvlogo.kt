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

public val BoldGroup.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) {
            return _readCvLogo!!
        }
        _readCvLogo = Builder(name = "ReadCvLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.48f, 35.32f)
                lineToRelative(-130.25f, -23.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 58.05f, 28.54f)
                lineToRelative(-29.75f, 169.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.22f, 23.16f)
                lineToRelative(130.25f, 23.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 3.52f, 0.31f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 198.0f, 227.46f)
                lineToRelative(29.75f, -169.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 211.48f, 35.32f)
                close()
                moveTo(175.0f, 219.36f)
                lineTo(52.63f, 197.75f)
                lineTo(81.0f, 36.64f)
                lineTo(203.37f, 58.25f)
                close()
                moveTo(91.9f, 67.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.9f, -9.73f)
                lineTo(173.0f, 69.14f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 171.0f, 93.0f)
                arcToRelative(12.59f, 12.59f, 0.0f, false, true, -2.1f, -0.18f)
                lineTo(101.63f, 80.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 91.9f, 67.0f)
                close()
                moveTo(85.0f, 106.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.91f, -9.73f)
                lineToRelative(67.22f, 11.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 132.35f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -2.1f, -0.18f)
                lineTo(94.69f, 120.29f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 85.0f, 106.39f)
                close()
                moveTo(78.0f, 145.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.9f, -9.73f)
                lineTo(125.54f, 142.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.07f, 23.82f)
                arcToRelative(11.63f, 11.63f, 0.0f, false, true, -2.1f, -0.19f)
                lineToRelative(-33.61f, -5.93f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 78.0f, 145.78f)
                close()
            }
        }
        .build()
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
