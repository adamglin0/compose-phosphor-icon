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

public val FillGroup.Filezip: ImageVector
    get() {
        if (_filezip != null) {
            return _filezip!!
        }
        _filezip = Builder(name = "Filezip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 144.0f)
                lineTo(168.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(55.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(7.4f)
                curveToRelative(15.24f, 0.0f, 28.14f, -11.92f, 28.59f, -27.15f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 184.0f, 144.0f)
                close()
                moveTo(183.65f, 184.0f)
                lineTo(176.0f, 184.0f)
                lineTo(176.0f, 160.0f)
                horizontalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 196.0f, 173.16f)
                arcTo(12.25f, 12.25f, 0.0f, false, true, 183.65f, 184.0f)
                close()
                moveTo(136.0f, 152.0f)
                verticalLineToRelative(55.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f)
                lineTo(120.0f, 152.27f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 7.47f, -8.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 152.0f)
                close()
                moveTo(96.0f, 208.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 87.73f, 216.0f)
                lineTo(56.23f, 216.0f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, true, -6.0f, -2.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 49.05f, 204.0f)
                lineToRelative(25.16f, -44.0f)
                lineTo(56.27f, 160.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 48.0f, 152.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 144.0f)
                lineTo(87.77f, 144.0f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, true, 6.0f, 2.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 95.0f, 156.0f)
                lineTo(69.79f, 200.0f)
                lineTo(88.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 208.53f)
                close()
                moveTo(213.66f, 82.34f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(212.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(216.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f)
                close()
                moveTo(152.0f, 88.0f)
                lineTo(152.0f, 44.0f)
                lineToRelative(44.0f, 44.0f)
                close()
            }
        }
        .build()
        return _filezip!!
    }

private var _filezip: ImageVector? = null
