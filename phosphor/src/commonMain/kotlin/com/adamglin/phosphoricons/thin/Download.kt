package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 136.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(32.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(20.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(72.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(32.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(228.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(184.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 136.0f)
                close()
                moveTo(125.17f, 130.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(132.0f, 118.34f)
                lineTo(132.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(94.34f)
                lineTo(82.83f, 77.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                close()
                moveTo(196.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 196.0f, 168.0f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
