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

public val ThinGroup.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.85f, 61.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.18f, 0.39f)
                lineTo(124.0f, 116.43f)
                lineTo(124.0f, 71.84f)
                arcToRelative(11.66f, 11.66f, 0.0f, false, false, -6.15f, -10.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.18f, 0.39f)
                lineTo(17.48f, 118.0f)
                arcToRelative(11.81f, 11.81f, 0.0f, false, false, 0.0f, 19.94f)
                lineToRelative(88.19f, 56.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.18f, 0.39f)
                arcTo(11.66f, 11.66f, 0.0f, false, false, 124.0f, 184.16f)
                lineTo(124.0f, 139.57f)
                lineToRelative(85.67f, 54.56f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.18f, 0.39f)
                arcTo(11.66f, 11.66f, 0.0f, false, false, 228.0f, 184.16f)
                lineTo(228.0f, 71.84f)
                arcTo(11.66f, 11.66f, 0.0f, false, false, 221.85f, 61.48f)
                close()
                moveTo(116.0f, 184.16f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, -2.0f, 3.35f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -4.0f, -0.13f)
                lineTo(21.78f, 131.22f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.0f, -6.44f)
                lineTo(110.0f, 68.62f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 2.13f, -0.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.91f, 0.5f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, 2.0f, 3.35f)
                close()
                moveTo(220.0f, 184.16f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, -2.0f, 3.35f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -4.0f, -0.13f)
                lineToRelative(-88.18f, -56.16f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.0f, -6.44f)
                lineTo(214.0f, 68.62f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 2.13f, -0.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.91f, 0.5f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, true, 2.0f, 3.35f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
