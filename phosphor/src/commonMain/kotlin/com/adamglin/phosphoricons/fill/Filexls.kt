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

public val FillGroup.FileXls: ImageVector
    get() {
        if (_fileXls != null) {
            return _fileXls!!
        }
        _fileXls = Builder(name = "FileXls", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 120.0f)
                lineTo(212.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 120.0f)
                close()
                moveTo(152.0f, 44.0f)
                lineToRelative(44.0f, 44.0f)
                lineTo(152.0f, 88.0f)
                close()
                moveTo(156.0f, 208.53f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -8.25f, 7.47f)
                lineTo(120.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(112.0f, 152.27f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 156.0f, 208.53f)
                close()
                moveTo(94.51f, 156.65f)
                lineTo(77.83f, 180.0f)
                lineToRelative(16.68f, 23.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.0f, 9.3f)
                lineTo(68.0f, 193.76f)
                lineTo(54.51f, 212.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.0f, -9.3f)
                lineTo(58.17f, 180.0f)
                lineTo(41.49f, 156.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.3f, -11.46f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, 10.88f, 2.38f)
                lineTo(68.0f, 166.24f)
                lineToRelative(13.49f, -18.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.0f, 9.3f)
                close()
                moveTo(215.79f, 196.31f)
                arcToRelative(20.81f, 20.81f, 0.0f, false, true, -9.18f, 15.23f)
                curveTo(201.42f, 215.0f, 194.94f, 216.0f, 189.12f, 216.0f)
                arcToRelative(60.63f, 60.63f, 0.0f, false, true, -15.19f, -2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.31f, -15.41f)
                curveToRelative(4.38f, 1.21f, 14.94f, 2.71f, 19.54f, -0.35f)
                curveToRelative(0.89f, -0.6f, 1.84f, -1.52f, 2.15f, -3.93f)
                curveToRelative(0.34f, -2.67f, -0.72f, -4.1f, -12.78f, -7.59f)
                curveToRelative(-9.35f, -2.7f, -25.0f, -7.23f, -23.0f, -23.12f)
                arcToRelative(20.58f, 20.58f, 0.0f, false, true, 8.95f, -14.94f)
                curveToRelative(11.84f, -8.0f, 30.72f, -3.31f, 32.83f, -2.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.07f, 15.48f)
                curveToRelative(-4.48f, -1.17f, -15.22f, -2.56f, -19.82f, 0.56f)
                arcToRelative(4.54f, 4.54f, 0.0f, false, false, -2.0f, 3.67f)
                curveToRelative(-0.11f, 0.9f, -0.13f, 1.08f, 1.12f, 1.9f)
                curveToRelative(2.31f, 1.49f, 6.45f, 2.68f, 10.45f, 3.84f)
                curveTo(201.48f, 174.17f, 218.0f, 179.0f, 215.79f, 196.31f)
                close()
            }
        }
        .build()
        return _fileXls!!
    }

private var _fileXls: ImageVector? = null
