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

public val ThinGroup.Moped: ImageVector
    get() {
        if (_moped != null) {
            return _moped!!
        }
        _moped = Builder(name = "Moped", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 132.0f)
                arcToRelative(35.7f, 35.7f, 0.0f, false, false, -8.82f, 1.1f)
                lineTo(171.75f, 38.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 168.0f, 36.0f)
                lineTo(136.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(29.23f)
                lineToRelative(34.47f, 91.92f)
                arcTo(36.06f, 36.06f, 0.0f, false, false, 180.23f, 164.0f)
                lineTo(133.77f, 164.0f)
                lineToRelative(-26.0f, -69.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 92.0f)
                lineTo(24.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(36.0f, 100.0f)
                verticalLineToRelative(20.0f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 4.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(20.23f, 172.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 71.54f, 0.0f)
                horizontalLineToRelative(88.46f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 216.0f, 132.0f)
                close()
                moveTo(41.33f, 126.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 122.73f)
                lineTo(44.0f, 100.0f)
                horizontalLineToRelative(57.23f)
                lineToRelative(24.0f, 64.0f)
                horizontalLineToRelative(-113.0f)
                arcTo(44.1f, 44.1f, 0.0f, false, true, 41.33f, 126.5f)
                close()
                moveTo(56.0f, 196.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -27.71f, -24.0f)
                lineTo(83.71f, 172.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 56.0f, 196.0f)
                close()
                moveTo(216.0f, 196.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -13.47f, -52.54f)
                lineToRelative(9.72f, 25.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.5f, -2.8f)
                lineTo(210.0f, 140.65f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 216.0f, 196.0f)
                close()
            }
        }
        .build()
        return _moped!!
    }

private var _moped: ImageVector? = null
