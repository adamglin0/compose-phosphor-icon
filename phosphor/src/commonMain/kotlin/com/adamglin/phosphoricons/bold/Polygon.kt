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

public val BoldGroup.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.47f, 97.45f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.92f, -50.92f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.18f, 36.18f, 0.0f, false, false, -4.12f, 4.95f)
                lineToRelative(-22.55f, -6.15f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -61.34f, -22.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.05f, 36.05f, 0.0f, false, false, -7.8f, 39.24f)
                lineTo(57.19f, 88.37f)
                arcToRelative(36.08f, 36.08f, 0.0f, false, false, -42.66f, 6.17f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 45.73f, 55.21f)
                lineToRelative(65.28f, 47.87f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 182.62f, 180.0f)
                lineTo(208.0f, 108.0f)
                arcTo(35.91f, 35.91f, 0.0f, false, false, 233.47f, 97.45f)
                close()
                moveTo(139.73f, 178.26f)
                lineTo(74.45f, 130.39f)
                arcToRelative(36.19f, 36.19f, 0.0f, false, false, -1.21f, -24.17f)
                lineTo(102.8f, 79.61f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 42.66f, -6.16f)
                arcToRelative(35.47f, 35.47f, 0.0f, false, false, 4.12f, -5.0f)
                lineToRelative(22.55f, 6.15f)
                arcToRelative(35.86f, 35.86f, 0.0f, false, false, 10.42f, 22.8f)
                arcTo(38.06f, 38.06f, 0.0f, false, false, 185.4f, 100.0f)
                lineTo(160.0f, 172.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 139.73f, 178.26f)
                close()
                moveTo(216.5f, 63.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.5f, 63.5f)
                close()
                moveTo(111.5f, 39.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, 17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 111.51f, 39.5f)
                close()
                moveTo(31.5f, 128.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 31.5f, 128.49f)
                close()
                moveTo(168.5f, 216.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.49f, 216.5f)
                close()
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null
