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

public val FillGroup.Filepdf: ImageVector
    get() {
        if (_filepdf != null) {
            return _filepdf!!
        }
        _filepdf = Builder(name = "Filepdf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
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
                moveTo(224.0f, 152.53f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -8.25f, 7.47f)
                lineTo(192.0f, 160.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(15.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 8.25f, 7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.53f)
                lineTo(192.0f, 192.0f)
                verticalLineToRelative(15.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f)
                lineTo(176.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 152.53f)
                close()
                moveTo(64.0f, 144.0f)
                lineTo(48.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(55.73f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 47.47f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 208.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(7.4f)
                curveToRelative(15.24f, 0.0f, 28.14f, -11.92f, 28.59f, -27.15f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 64.0f, 144.0f)
                close()
                moveTo(63.65f, 184.0f)
                lineTo(56.0f, 184.0f)
                lineTo(56.0f, 160.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 13.16f)
                arcTo(12.25f, 12.25f, 0.0f, false, true, 63.65f, 184.0f)
                close()
                moveTo(128.0f, 144.0f)
                lineTo(112.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(15.32f)
                curveToRelative(19.66f, 0.0f, 36.21f, -15.48f, 36.67f, -35.13f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 144.0f)
                close()
                moveTo(127.51f, 200.0f)
                lineTo(120.0f, 200.0f)
                lineTo(120.0f, 160.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.77f)
                curveTo(147.58f, 191.59f, 138.34f, 200.0f, 127.51f, 200.0f)
                close()
            }
        }
        .build()
        return _filepdf!!
    }

private var _filepdf: ImageVector? = null
