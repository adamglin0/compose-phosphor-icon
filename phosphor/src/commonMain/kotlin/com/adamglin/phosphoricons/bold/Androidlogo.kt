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

public val BoldGroup.Androidlogo: ImageVector
    get() {
        if (_androidlogo != null) {
            return _androidlogo!!
        }
        _androidlogo = Builder(name = "Androidlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 148.0f)
                close()
                moveTo(92.0f, 132.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 92.0f, 132.0f)
                close()
                moveTo(244.0f, 160.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(12.0f, 161.13f)
                arcTo(117.35f, 117.35f, 0.0f, false, true, 45.72f, 78.69f)
                lineTo(23.51f, 56.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(64.3f, 63.33f)
                arcTo(114.35f, 114.35f, 0.0f, false, true, 127.59f, 44.0f)
                lineTo(128.0f, 44.0f)
                arcToRelative(115.15f, 115.15f, 0.0f, false, true, 63.89f, 19.14f)
                lineToRelative(23.62f, -23.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-22.0f, 22.0f)
                arcTo(115.18f, 115.18f, 0.0f, false, true, 244.0f, 160.0f)
                close()
                moveTo(220.0f, 160.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, -92.33f, -92.0f)
                curveTo(77.12f, 68.18f, 36.0f, 110.0f, 36.0f, 161.13f)
                lineTo(36.0f, 180.0f)
                lineTo(220.0f, 180.0f)
                close()
            }
        }
        .build()
        return _androidlogo!!
    }

private var _androidlogo: ImageVector? = null
