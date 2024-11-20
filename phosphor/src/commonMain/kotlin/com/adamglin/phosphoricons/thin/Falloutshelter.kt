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

public val ThinGroup.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) {
            return _falloutShelter!!
        }
        _falloutShelter = Builder(name = "FalloutShelter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(195.53f, 126.11f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 124.0f)
                lineTo(135.47f, 124.0f)
                lineToRelative(27.86f, -41.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 76.0f)
                lineTo(96.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.33f, 6.22f)
                lineTo(120.53f, 124.0f)
                lineTo(64.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.33f, 6.22f)
                lineToRelative(32.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.66f, 0.0f)
                lineToRelative(28.67f, -43.0f)
                lineToRelative(28.67f, 43.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.66f, 0.0f)
                lineToRelative(32.0f, -48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 195.53f, 126.11f)
                close()
                moveTo(152.53f, 84.0f)
                lineTo(128.0f, 120.79f)
                lineTo(103.47f, 84.0f)
                close()
                moveTo(96.0f, 168.79f)
                lineTo(71.47f, 132.0f)
                horizontalLineToRelative(49.06f)
                close()
                moveTo(160.0f, 168.79f)
                lineTo(135.47f, 132.0f)
                horizontalLineToRelative(49.06f)
                close()
            }
        }
        .build()
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
