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

public val BoldGroup.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.11f, 31.92f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 128.0f, 31.87f)
                lineToRelative(-70.12f, 69.3f)
                arcTo(19.91f, 19.91f, 0.0f, false, false, 52.0f, 115.31f)
                lineTo(52.0f, 187.0f)
                lineTo(23.52f, 215.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineTo(69.0f, 204.0f)
                lineTo(140.7f, 204.0f)
                arcToRelative(19.87f, 19.87f, 0.0f, false, false, 14.15f, -5.86f)
                lineToRelative(0.05f, 0.0f)
                lineToRelative(69.21f, -70.0f)
                arcTo(68.06f, 68.06f, 0.0f, false, false, 224.11f, 31.92f)
                close()
                moveTo(144.9f, 48.92f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 210.0f, 108.0f)
                lineTo(165.0f, 108.0f)
                lineToRelative(27.52f, -27.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(124.0f, 115.0f)
                lineTo(124.0f, 69.54f)
                close()
                moveTo(76.0f, 117.0f)
                lineToRelative(24.0f, -23.72f)
                lineTo(100.0f, 139.0f)
                lineTo(76.0f, 163.0f)
                close()
                moveTo(139.0f, 180.0f)
                lineTo(93.0f, 180.0f)
                lineToRelative(48.0f, -48.0f)
                horizontalLineToRelative(45.5f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
