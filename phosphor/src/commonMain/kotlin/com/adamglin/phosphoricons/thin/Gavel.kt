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

public val ThinGroup.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = Builder(name = "Gavel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.49f, 119.52f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-1.17f, 1.17f)
                lineToRelative(-55.0f, -55.0f)
                lineToRelative(1.18f, -1.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(1.17f, -1.18f)
                lineTo(102.34f, 124.0f)
                lineToRelative(-68.2f, 68.21f)
                arcTo(21.0f, 21.0f, 0.0f, false, false, 63.8f, 221.87f)
                lineTo(132.0f, 153.66f)
                lineToRelative(12.69f, 12.69f)
                lineToRelative(-1.18f, 1.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(77.17f, 106.83f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(64.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.65f)
                lineToRelative(-64.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 77.17f, 106.83f)
                close()
                moveTo(58.17f, 216.21f)
                arcTo(13.0f, 13.0f, 0.0f, true, true, 39.8f, 197.87f)
                lineTo(108.0f, 129.66f)
                lineTo(126.34f, 148.0f)
                close()
                moveTo(95.31f, 105.66f)
                lineToRelative(50.35f, -50.35f)
                lineToRelative(55.0f, 55.0f)
                lineToRelative(-50.35f, 50.35f)
                close()
                moveTo(234.83f, 130.83f)
                lineTo(170.83f, 194.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.65f)
                lineToRelative(64.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
