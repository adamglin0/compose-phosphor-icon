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

public val ThinGroup.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) {
            return _closedCaptioning!!
        }
        _closedCaptioning = Builder(name = "ClosedCaptioning", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 52.0f)
                lineTo(32.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 52.0f)
                close()
                moveTo(228.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(32.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(224.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(115.46f, 153.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.46f, 5.47f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 0.0f, -62.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 6.92f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 0.0f, 48.52f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 115.46f, 153.71f)
                close()
                moveTo(195.46f, 153.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.46f, 5.47f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 0.0f, -62.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 6.92f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 0.0f, 48.52f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 195.46f, 153.71f)
                close()
            }
        }
        .build()
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
