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

public val BoldGroup.Radioactive: ImageVector
    get() {
        if (_radioactive != null) {
            return _radioactive!!
        }
        _radioactive = Builder(name = "Radioactive", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 112.0f)
                close()
                moveTo(96.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(44.47f, 116.0f)
                arcToRelative(83.88f, 83.88f, 0.0f, false, true, 31.2f, -54.11f)
                lineTo(95.38f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.78f, -12.0f)
                lineToRelative(-22.0f, -38.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.87f, -6.34f)
                arcToRelative(107.85f, 107.85f, 0.0f, false, false, -45.26f, 78.4f)
                arcToRelative(20.22f, 20.22f, 0.0f, false, false, 5.21f, 15.43f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 40.0f, 140.0f)
                lineTo(84.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 128.0f)
                close()
                moveTo(235.92f, 118.06f)
                arcToRelative(107.81f, 107.81f, 0.0f, false, false, -45.26f, -78.39f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 161.79f, 46.0f)
                lineTo(139.84f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.78f, 12.0f)
                lineToRelative(19.71f, -34.13f)
                arcTo(83.88f, 83.88f, 0.0f, false, true, 211.53f, 116.0f)
                lineTo(172.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.71f, -6.51f)
                arcTo(20.22f, 20.22f, 0.0f, false, false, 235.92f, 118.06f)
                close()
                moveTo(160.4f, 160.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.79f, 12.0f)
                lineTo(159.19f, 206.0f)
                arcToRelative(84.33f, 84.33f, 0.0f, false, true, -62.38f, 0.0f)
                lineToRelative(19.58f, -33.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.79f, -12.0f)
                lineToRelative(-21.82f, 37.8f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 8.91f, 28.15f)
                arcToRelative(108.24f, 108.24f, 0.0f, false, false, 90.62f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 8.91f, -28.15f)
                close()
            }
        }
        .build()
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
