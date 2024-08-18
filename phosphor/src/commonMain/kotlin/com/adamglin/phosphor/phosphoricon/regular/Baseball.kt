package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(72.09f, 195.91f)
                curveToRelative(0.82f, -1.0f, 1.64f, -1.93f, 2.42f, -2.91f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 62.0f, 183.0f)
                lineToRelative(-1.34f, 1.62f)
                arcToRelative(87.82f, 87.82f, 0.0f, false, true, 0.0f, -113.24f)
                lineTo(62.0f, 73.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 74.51f, 63.0f)
                curveToRelative(-0.78f, -1.0f, -1.6f, -2.0f, -2.42f, -2.91f)
                arcToRelative(87.84f, 87.84f, 0.0f, false, true, 111.82f, 0.0f)
                curveToRelative(-0.82f, 1.0f, -1.64f, 1.92f, -2.42f, 2.91f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 194.0f, 73.0f)
                lineToRelative(1.34f, -1.62f)
                arcToRelative(87.82f, 87.82f, 0.0f, false, true, 0.0f, 113.24f)
                lineTo(194.0f, 183.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.48f, 10.0f)
                curveToRelative(0.78f, 1.0f, 1.6f, 1.95f, 2.42f, 2.91f)
                arcToRelative(87.84f, 87.84f, 0.0f, false, true, -111.82f, 0.0f)
                close()
                moveTo(95.89f, 145.32f)
                arcToRelative(104.5f, 104.5f, 0.0f, false, true, -4.48f, 17.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.09f, -5.34f)
                arcToRelative(87.1f, 87.1f, 0.0f, false, false, 3.79f, -14.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.78f, 2.64f)
                close()
                moveTo(95.89f, 110.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.57f, 9.21f)
                arcTo(8.52f, 8.52f, 0.0f, false, true, 88.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.88f, -6.68f)
                arcToRelative(87.1f, 87.1f, 0.0f, false, false, -3.79f, -14.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.09f, -5.34f)
                arcTo(104.5f, 104.5f, 0.0f, false, true, 95.89f, 110.68f)
                close()
                moveTo(174.8f, 167.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.21f, -4.87f)
                arcToRelative(104.5f, 104.5f, 0.0f, false, true, -4.48f, -17.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.78f, -2.64f)
                arcToRelative(87.1f, 87.1f, 0.0f, false, false, 3.79f, 14.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 174.8f, 167.54f)
                close()
                moveTo(160.11f, 110.68f)
                arcToRelative(104.5f, 104.5f, 0.0f, false, true, 4.48f, -17.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.09f, 5.34f)
                arcToRelative(87.1f, 87.1f, 0.0f, false, false, -3.79f, 14.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 120.0f)
                arcToRelative(8.52f, 8.52f, 0.0f, false, true, -1.33f, -0.11f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.11f, 110.68f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
